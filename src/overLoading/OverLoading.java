package overLoading;

public class OverLoading {
	
	/* over loading happens when a class has two or more methods with the same name"add", 
	  but different signature"signature is the first line"
	 this is an example of static over load.Notice over load works because first parameters
	 are "int" and the second are"float",otherwise the compiler will give error
	 */
	
	static void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	static void add(float num1,float num2) {
		System.out.println(num1+num2);
	}
	
	
	public static void main(String[] args) {
		
		add(30,50);
		add(20.522f,30.25f);
	}
	

}
