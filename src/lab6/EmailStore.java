package lab6;

import java.util.HashSet;
import java.util.Set;


public class EmailStore {
	// Attribute to store email addresses in a Set (unique values only)
    private Set<String> emailAddresses;

    // Constructor to initialise the Set
    public EmailStore() {
        emailAddresses = new HashSet<>();
    }

    // Method to add an email to the set, returns true if email is added, false if it's a duplicate
    public boolean addEmail(String email) {
        // If the email is not already in the set, add it
        if (emailAddresses.add(email)) {
            return true;
        }
        // If the email is already in the set, return false
        return false;
    }

    // Method to check if an email exists in the set
    public boolean hasEmail(String email) {
        return emailAddresses.contains(email);
    }

    // Method to display all stored email addresses
    public void displayEmails() {
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        EmailStore store = new EmailStore();
        
        // Add some emails
        System.out.println(store.addEmail("test1@example.com"));  // Expected: true
        System.out.println(store.addEmail("test2@example.com"));  // Expected: true
        System.out.println(store.addEmail("test1@example.com"));  // Expected: false (duplicate)

        // Check if certain emails exist
        System.out.println(store.hasEmail("test1@example.com"));  // Expected: true
        System.out.println(store.hasEmail("test3@example.com"));  // Expected: false

        // Display all stored emails
        store.displayEmails();  // Expected: test1@example.com, test2@example.com
    }
}