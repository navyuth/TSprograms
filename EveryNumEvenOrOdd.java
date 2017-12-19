package myprograms;

public class EveryNumEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3597;
		int count =0;
		while(num>0){
			
			int dig =num%10;
			num = num/10;
		
         if(dig %2 ==0) {
             count++;
         }
         else {
        	 
         	count=0;
          
          }
         
		}
		
         if(count == 0) {
        	 System.out.println("All digits are odd");
        
         }
         
         else {
        	 System.out.println("All digits are not odd");
         
         }
	}

}

