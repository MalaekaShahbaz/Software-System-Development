
public class Driver {
	public static void main(String[] args) { 
		ArrayProcessor ap = new ArrayProcessor();
		int len = ap.getArrayLength(new String[] {"one", "two", "three"});
		System.out.println("Array lentgh is " +len);
		
		}
}