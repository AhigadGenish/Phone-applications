package diaryApp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public abstract class Event 
{
	// Data members
	// Immutable classes
	protected LocalDateTime dateTime;
	protected Duration meetingDuration;
	
	// Constructors
	public Event(LocalDateTime anyDateTime, Duration anyDuration) {
		this.dateTime = anyDateTime;
		this.meetingDuration = anyDuration;
	}
	
	public Event(Event anyEvent) {
		this(anyEvent.dateTime, anyEvent.meetingDuration);
	}
	
	// Getters:
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public Duration getMeetingDuration() {
		return meetingDuration;
	}
	
	// Setters:
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public void setMeetingDuration(Duration meetingDuration) {
		this.meetingDuration = meetingDuration;
	}

	private String getTimeInFormat() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MM - yyyy HH:mm");
		return this.getDateTime().format(formatter);
	}
	
	@Override
	public String toString () {
		return "Date: " + this.getTimeInFormat() + " Duration: " + this.getMeetingDuration().toMinutes() + " Minutes"+ "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// Check if obj is Event
		if(obj instanceof Event == true) {
			// Casting
			Event o = (Event)obj;
			// Compare dateTime
			return this.dateTime.equals(o.getDateTime());
		}
		return false;
	}

}
