package lab6;

public class Driver {
	   public static void main(String[] args) {
	        // Create an instance of EmailStore
	        EmailStore store = new EmailStore();

	        // Test adding emails, including duplicates
	        System.out.println("Adding 'test1@example.com': " + store.addEmail("test1@example.com")); // Expected: true
	        System.out.println("Adding 'test2@example.com': " + store.addEmail("test2@example.com")); // Expected: true
	        System.out.println("Adding 'test1@example.com' again: " + store.addEmail("test1@example.com")); // Expected: false (duplicate)
	        System.out.println("Adding 'test3@example.com': " + store.addEmail("test3@example.com")); // Expected: true

	        // Check if certain emails exist in the store
	        System.out.println("Does 'test1@example.com' exist? " + store.hasEmail("test1@example.com")); // Expected: true
	        System.out.println("Does 'test4@example.com' exist? " + store.hasEmail("test4@example.com")); // Expected: false

	        // Display all stored emails
	        System.out.println("\nDisplaying all stored emails:");
	        store.displayEmails();
	    }
	}
