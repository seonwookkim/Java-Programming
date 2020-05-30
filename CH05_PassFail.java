import java.util.Scanner ;

public class CH05_PassFail {
	
	
	public static void main(String[]args) {
		System.out.println("Before copying\n") ;
		String name = "Hongkildong" ;
		CH05_PassFail student1 = new CH05_PassFail() ;
		CH05_PassFail student2 = new CH05_PassFail() ;
		
		student1.setdata(name, 80) ;
		student2.setdata("KimChulSoo", 40) ;
		CH05_PassFail.identifyOrSameValue(student1, student2) ;
		student1.writeoutput() ;
		student2.writeoutput() ;
		System.out.println("Hashcode of student1 : " + student1.toString()) ;
		System.out.println("Hashcode of student2 : " + student2.toString()) ;
		
		student1.copyFrom(student2) ;
		
		System.out.println("\nAfter copying\n") ;
		CH05_PassFail.identifyOrSameValue(student1, student2) ;
		
		student1.writeoutput() ;
		student2.writeoutput() ;
		System.out.println("Hashcode of student1 : " + student1.toString()) ;
		System.out.println("Hashcode of student2 : " + student2.toString()) ;
		
		System.out.println("\n\nAfter assigning the valiable\n") ;

		student1.setdata("HongKingDong", 80) ;
		student2.setdata("KimChulSoo", 40) ;
		student1 = student2 ;
		CH05_PassFail.identifyOrSameValue(student1, student2) ;

		student1.writeoutput() ;
		student2.writeoutput() ;
		System.out.println("Hashcode of student1 : " + student1.toString()) ;
		System.out.println("Hashcode of student2 : " + student2.toString()) ;
	}
	
	private String name ;
	private int score ;
	
	public void writeoutput() {
		String grade ;
		if(score>50) grade = "pass" ;
		else grade = "fail" ;
		System.out.println(name + ": " + score + ": " + grade) ;
	}
	public String getName() {
		return name ;
	}
	public int getScore() {
		return score ;
	}
	public void setdata(String s_name, int s_score) {
		name = s_name ;
		score = s_score ;
	}
	public boolean equals(CH05_PassFail student2) {
		return (name.equalsIgnoreCase(student2.name) || toString().equalsIgnoreCase(student2.name)) ; 
	}
	public void copyFrom(CH05_PassFail student2) {
		name = student2.name ;
		score = student2.score ;
	}
	public static void identifyOrSameValue(CH05_PassFail student1, CH05_PassFail student2) {
		if(student1.name.equals(student2.name)) 
			System.out.printf("Student1 and Student2 are Same object,") ;
		else
			System.out.printf("Student1 and Student2 are different object,") ;
		
		if(student1.toString().equals(student2.toString()))
			System.out.println(" Same Harshcode,") ;
		else
			System.out.println(" different Harshcode,") ;
		
		if(student1.score == student2.score) 
			System.out.printf("Student1 and Student2 have Same state, Same value of instance variable\n") ;
		else
			System.out.printf("Student1 and Student2 have differen value of instance variables\n") ;
	}
}

