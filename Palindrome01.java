
public class Palindrome01 {
    public static void main(String[] args) {
        int num = -878;
        System.out.println(isPalindrome(num));
    }

    public static int isPalindrome(int num)
    {
    	if(num>=100 && num <=999) {
    	
        int digit1 = num%10;
        int digit2 = num/100;
        
        if(digit1 == digit2) 
        {
        	return 1;
        }
        else 
        {
        	return 0;
        }
    	
    		
    }
    	
    	else {
    		return -1;
    	
    	}	
    	
    }
}
