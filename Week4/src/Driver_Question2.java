
public class Driver_Question2 
{
	public static void main(String[] args)
	{
		Menu menu = new Menu();
		
		try 
		{
             menu.displayMenuOption(1);
			 menu.displayMenuOption(2);
		     menu.displayMenuOption(3);
		     menu.displayMenuOption(4); // This should throw an exception
		 } catch (InvalidOptionException e) {
		     System.out.println(e.getMessage());
		}
		
	}
	
}
