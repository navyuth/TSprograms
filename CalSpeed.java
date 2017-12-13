package assignment1;

public class CalSpeed {

	public static void main(String[] args) {
		
		double disInKm = 25;
		double disInMeters = disInKm * 1000.0;
		double disInMiles = disInKm * 0.62137;
		
		int timeInHrs = 3;
		int timeInMin = 23;
		int timeInSec = 43;
		
		double totalTimeInHrs = timeInHrs + (timeInMin/60.0) + (timeInSec/3600.0);
		double totalTimeInSec = timeInSec + (timeInHrs * 3600.0) + (timeInMin * 60.0);
		
		double speedInMeters =  disInMeters/ totalTimeInSec;
		double speedInKm = disInKm / totalTimeInHrs;
		double speedInMiles = disInMiles / totalTimeInHrs;
		
		System.out.println("Speed in Meters = "+speedInMeters + "\n" +"Speed in KMPH = "+speedInKm + "\n" + "Speed in MPH = "+speedInMiles);

	}

}
