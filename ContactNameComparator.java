package phoneBookApp;
import java.util.*;

// Implements the interface comparator by Strategy Design Pattern
public class ContactNameComparator implements Comparator<Contact> {

	// Override compare to compare between two Contact by their name 
	@Override
	public int compare(Contact c1, Contact c2) {
		 
		if (c1.getName().equalsIgnoreCase(c2.getName()) == true) {
			
			// If they have the same name, compare by Bigger numeric Phone number
			Long c1PhoneInt = Long.parseLong(c1.getPhoneNumber());
			Long c2PhoneInt = Long.parseLong(c2.getPhoneNumber());
			return c2PhoneInt.compareTo(c1PhoneInt);
		}
		else {
			// Else - compare by Alphabetic order
			return c1.getName().compareTo(c2.getName());
		}
	}

}


