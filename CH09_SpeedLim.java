import java.util.Scanner ;

public class CH09_SpeedLim {
	public CH09_SpeedLim(int limit, int speed) {
		try {
			if(limit < speed) {
				throw new Exception("Speed Limit " + limit + "km exceeded!") ;
			}
			System.out.println("You are a law abiding ") ;
			System.out.println("citizen!") ;
			System.out.println("Your current speed : " + speed) ;
			System.exit(0) ;
		}
		catch(Exception e) {
			System.out.println(e.getMessage()) ;
			SpeedWarning() ;
			System.out.println("Your current speed " + speed) ;
			System.exit(0) ;
		}
	}
	
	public void SpeedWarning() {
		System.out.println("You are being fined.") ;
	}
	
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in) ;
		int limit = 0 , speed = 0 ;
		
		System.out.print("Input the speed limit : ");
		limit = kb.nextInt() ;
		
		System.out.print("Input the current speed : ");
		speed = kb.nextInt() ;
		
		CH09_SpeedLim lim = new CH09_SpeedLim(limit, speed) ;
		lim.SpeedWarning() ;
		kb.close() ;
	}
}

