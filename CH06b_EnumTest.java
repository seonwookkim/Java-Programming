import java.util.* ;

enum Date
{
	MON("red"), TUE("orange"), WED("yellow"), THU("green"), FRI("blue"), SAT("indigo"), SUN("purple") ;
	
	private final String color ;
	
	private Date(String dateColor) {
		color = dateColor ;
	}
	
	public String getColor() {
		return color ;
	}
}

public class CH06b_EnumTest {
	public static void main(String[]args) {
		Date e = Date.FRI ;
		System.out.println("e.ordinal()= " + e.ordinal());
		System.out.println("e.compareTo(Date.WED)= " + e.compareTo(Date.WED)) ;
		System.out.println("e.toStirng()= " + e.toString()) ;
		System.out.println("e.getColor()= " + e.getColor()) ;

		Date a = Date.MON ;
		System.out.println(a.toString() + "  " + a.getColor()) ;
		Date b = Date.TUE ;
		System.out.println(b.toString() + "  " + b.getColor()) ;
		Date c = Date.WED ;
		System.out.println(c.toString() + "  " + c.getColor()) ;
		Date d = Date.THU ;
		System.out.println(d.toString() + "  " + d.getColor()) ;
		System.out.println(e.toString() + "  " + e.getColor()) ;
		Date f = Date.SAT ;
		System.out.println(f.toString() + "  " + f.getColor()) ;
		Date g = Date.SUN ;
		System.out.println(g.toString() + "  " + g.getColor()) ;
	}
}
