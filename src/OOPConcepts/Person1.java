package OOPConcepts;

public class Person1 {
	//static
	static int count=0;
	
	//instance variables,or object variables.
	private String pname;
	private int page;
	private char pgender;
	
	public Person1() {
		count++;
	}
	
	//now we will use Gitter Setter method.
	
	public String getPname () {
		return pname;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page=page;
	}
	
	public char getPgender() {
		return pgender;
	}
	public void setPgender(char pgender) {
		this.pgender=pgender;
	}
	
	public static void totalPerson() {
		System.out.println("total person objects are:"+count);
	}
	
	

}
