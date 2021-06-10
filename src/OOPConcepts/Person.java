package OOPConcepts;

public class Person {
	//the static are class variables.this is a state of the object.
	static int count=0;

	//the non-static are object or instance variables.variables are the state of the object.
	 public String pname;
	 public int page;
	 public char pgender;
	 
	 /*the constructor is to construct an object,the next are the objects=> .
	 this is an empty object, or call it object with no parameters.the non parametrized 
	  is not passing an argument*/
	 public Person() {
		 
	 }
	 
	 
	 /*this is object with parameters.the parameters on this object we make it equal to
	 the instance variables(object variables).*/
	 
	 public Person (String name,int age,char gender) {
		 pname=name;
		 page=age;
		 pgender=gender;
		 count++;
	 }
	 
	 
	 
	 /*next will use the display method,notice that the display method will go for
	   every object when you call the display on the Starter file,notice also that void is 
	   mean there is no (return) on this method*/
	 
	 
	  public void display() {
		  
		  System.out.println("Name is:"+this.pname);
		  //using (this.)it make it return to the object Person,not the instance variable(pname)
		  //if not using (this.)the compiler will bring it to the instance variable and it will be empty.
		  System.out.println("Age is:"+this.page);
		  System.out.println("Gender is:"+this.pgender);
		 // System.out.println(count);
	  }
	  
	  public static void totalPerson() {
		  System.out.println("Total person objects are :"+count);
	  }
	  
	  
}
