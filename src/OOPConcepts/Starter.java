package OOPConcepts;
import java.util.Scanner;


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
		
		
		Scanner scan=new Scanner(System.in);
		int empId;
		String empName;
		char empGender;
		int empAge;
		double empSalary;
		
		System.out.println("Enter Employee Id:");
		empId=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Employee name:");
		empName=scan.nextLine();
		System.out.println("Enter Employee gender:");
		empGender=scan.next().charAt(0);
		System.out.println("Enter Employee age:");
		empAge=scan.nextInt();
		System.out.println("Enter Employee salary:");
		empSalary=scan.nextDouble();
		
		
		
		
		Employee emp1=new Employee(empId,empName,empGender,empAge,empSalary);
		
		//****the next two line are examples for the hard coded *****
//		Employee emp2=new Employee(201,"Cesar",'F',36,90000);
//		Employee emp3=new Employee(505,"Caroline",'F',21,65000);
//
//
//
//
//
		emp1.display();
		System.out.println("Net Salary for this employee is :"+emp1.calculate(2000));
//		
//		emp2.display();
//		System.out.println("Net Salary for this emloyee is:"+ emp2.calculate(700));
//		
//		emp3.display();
//		System.out.println("Net Salary for this employee is:"+emp3.calculate(2000));
		
		//****************end of Employee*********************************************
		
		
//		Scanner scan = new Scanner(System.in);
//	    int studId;
//	    String studName;
//	    int studAge;
//	    char studGender;
//	    double subject1;
//	    double subject2;
//	    double subject3;
//	    
//	    System.out.println("Enter Student Id"); 
//	    studId = scan.nextInt();
//	    scan.nextLine();
//	    System.out.println("Enter Student Name");
//	    studName = scan.nextLine();
//	    System.out.println("Enter Student Age");
//	    studAge = scan.nextInt();
//	    System.out.println("Enter Student Gender");
//	    studGender = scan.next().charAt(0);
//	    System.out.println("Enter Math score");
//	    subject1 = scan.nextDouble();
//	    System.out.println("Enter Student English score");
//		subject2 = scan.nextDouble();
//	    System.out.println("Enter Student Biology score");
//	    subject3 = scan.nextDouble();
//	   
//	            
//		
//		Student stud1=new Student(studId,studName,studAge,studGender,subject1,subject2,subject3);
//		
//	    stud1.display();
//		double avg=stud1.calculate(3);
//		System.out.println("Average score is:"+String.format("%.2f",avg));
//		
//		
//**********************************End of Student************************************************
		
		
      scan.close();
	}

}
