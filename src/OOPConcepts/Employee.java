package OOPConcepts;

//import constructurStyle.Person;

//we extend the child class from the parent class(inheritence).add the instance variable that belongs 
//to the inherited class only.
public class Employee extends Person implements Personinterface  {
	int emp_id;
	double emp_salary;
	
	//this is the sub-class constructer;parameterized.
	Employee(int id,String name,char gender,int age,double salary){
		
		//inheriting from the super class.calling the super class constructor.
		super(name,age,gender);
		
		//now use"this" operator we add the local refrence objects.
		this.emp_id=id;
		this.emp_salary=salary;
	}
	
	//void no return display method.
	public void display() {
		
		System.out.println(ORGANIZATION);
		System.out.println("**************");
		
		super.display();
		System.out.println("id is:"+this.emp_id);
		
		System.out.println("Salary is:"+this.emp_salary);
	}
	
	
	public double calculate(int bonus) {
		double netsalary=bonus+emp_salary;
		return netsalary;
		
	}
	
	

}
