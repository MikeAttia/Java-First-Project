package OOPConcepts;

//import constructurStyle.employee;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Person person1=new Person("Tom Smith",34,'M');
		Person person2=new Person("Michael Attia",41,'M');
		Person person3=new Person("Christina",33,'F');
		Person person4=new Person();
		
		
		person1.display();
		person2.display();
		person3.display();
		person4.display();*/
		
		
		//*************************************************************************
		//the Starter.java of set get method.
		
		//first create the new reference object"person1" .
		//Person1 person1=new Person1();
		
		//using set the instance variable"pname" to set the property of the reference object.
		//person1.setPname("Sonia");
		//person1.setPgender('F');
		
//		now after it was set,it goes for get that return it,as in next it can be"return"
//		in print or you can use for example the next line just to restore the properties
//		that was returned from "get"
//		ex: person1(reference object).getPname();
		
		//System.out.println(person1.getPname());
		
		//this to see the total objects created
		
		//Person.totalPerson();
		//****************************end of getter setter Starter*****************
		
		
		
		
		
//		Employee emp1=new Employee(707,"Franky",'M',41,90000);
//		Employee emp2=new Employee(201,"Cesar",'F',36,90000);
//		Employee emp3=new Employee(505,"Caroline",'F',21,65000);
//
//
//
//
//
//		emp1.display();
//		System.out.println("Net Salary for this employee is :"+emp1.calculate(2000));
//		
//		emp2.display();
//		System.out.println("Net Salary for this emloyee is:"+ emp2.calculate(700));
//		
//		emp3.display();
//		System.out.println("Net Salary for this employee is:"+emp3.calculate(2000));
		
		//****************end of Employee*********************************************
		
		
		
		Student stud1=new Student(545,"Mark",14,'M',95.7,88.5,78.7);
		Student stud2=new Student(545,"Ann",14,'F',85.1,66.5,91);
		Student stud3=new Student(545,"Dina",14,'F',92.4,99,62.4);
		Student stud4=new Student(545,"Sam",14,'M',79.9,75,69.9);
		
		stud1.display();
		double avg=stud1.calculate(3);
		System.out.println("Average score is:"+String.format("%.2f",avg));
		stud2.display();
		double avg2=stud2.calculate(3);
		System.out.println("Average score is:"+String.format("%.2f",avg2));
		stud3.display();
		double avg3=stud3.calculate(3);
		System.out.println("Average score is:"+String.format("%.2f",avg3));
		stud4.display();
		double avg4=stud4.calculate(3);
		System.out.println("Average score is:"+String.format("%.2f",avg4));
		
		

	}

}
