public class Menu {
	public void displayManuOption(int opt) throws InvalidOptionException 
	{
		if (opt < 1 || opt > 3) {
			throw new InvalidOptionException("Invalid menu option: " + opt);
		}
		System.out.println("Menu option " + opt + "selected");
	}

}
