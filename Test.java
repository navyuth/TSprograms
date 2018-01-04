
public class Test {

	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println("SBI ROI: " +b.getROI());
		
		b = new ICICI();
		System.out.println("ICICI ROI: " +b.getROI());
		
		b = new HDFC();
		System.out.println("HDFC ROI: " +b.getROI());

	}

}
