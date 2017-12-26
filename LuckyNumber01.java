
public class LuckyNumber01 {
    public static void main(String[] args) {
        String date = "27-august-1994";
        System.out.println(getLuckyNumber(date));
    }

    public static int getLuckyNumber(String date) 
    {
    	String dateParts[] = date.split("-");
    	int dd = Integer.parseInt(dateParts[0]);
    	int mm = convertMMMtoMM(dateParts[1]);
    	int yyyy = Integer.parseInt(dateParts[2]);
    	
    	
    	int SumOfDigits = getSumOfDigits(dd);
    	 SumOfDigits = SumOfDigits +  getSumOfDigits(mm);
    	 SumOfDigits = SumOfDigits +  getSumOfDigits(yyyy);
    	
    	while(SumOfDigits > 10)
    	{
    		SumOfDigits = getSumOfDigits(SumOfDigits);
    	}
    	return SumOfDigits;
    }

    public static int convertMMMtoMM(String mon) 
    {
        
        String months = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
        mon = mon.substring(0,3);
        mon = mon.toUpperCase();
      return (months.indexOf(mon)/3 + 1);
    }
    
    public static int getSumOfDigits(int num) 
    {
      int sum = 0;
      
      while(num > 0)
      {
    	  int digit = num %10;
    	  num = num/10;
    	  sum = digit + sum;
      }
      return sum;
      
    }
}