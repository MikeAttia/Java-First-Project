package OOPConcepts;

public class Student extends Person implements Personinterface {
	
	int stud_id;
	double subject1;
	double subject2;
	double subject3;
	double major;
	
	
	Student(int id,String name, int age, char gender,double math,double english,double biology)
	{
		
		
		
		super(name,age,gender);
		
		this.stud_id=id;
		this.subject1=math;
		this.subject2=english;
		this.subject3=biology;
		
		
		
	}
	
	public void display() {
		System.out.println();
		System.out.println("     Student Information");
		System.out.println("     --------------------");
		System.out.println(ORGANIZATION);
		System.out.println("**************");
		
		super.display();
		System.out.println("id is :"+this.stud_id);
		System.out.println("Math score is:"+this.subject1);
		System.out.println("English score is:"+this.subject2);
		System.out.println("Biology score is:"+this.subject3);
	
		
	}
	
	
	public double calculate (int totalsubjects) {
		
		double average=((this.subject1+this.subject2+this.subject3)/totalsubjects);
		return average;
	};
	
   public int studNumber(int noOfPeople) {
		
		
		return noOfPeople;
		 
	}
	

	}
	
	
	
	


