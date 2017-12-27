public class OddPalindromes01 {
    public static void main(String[] args) {
        int num1 = 1500;
        int num2 = 2000;
        System.out.println(generateOddPalindromes(num1, num2));
    }

    public static String generateOddPalindromes(int start, int limit) 
    {
    	String result = "";
        if(start <=0 || limit <=0)
        {
        	return "-1";
        }
        if(start >= limit)
        {
        	return "-2";
        }
        for(int i = start; i<=limit;i++)
        {
        	if(isAllDigitsOdd(i) && isPalindrome(i) )
        	{
        		result =result + i + ",";
        	}
        }
        if(result.length() == 0)
        {
        	return "-3";
        }
     

    result = result.substring(0, result.length()-1);
    return result;
}
    
    public static boolean isPalindrome(int num) 
    {
        if (num == reverse(num))
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }

    public static int reverse(int num) 
    {
    	int rev = 0;
        while(num>0)
        	
        {
    	int digit = num % 10;
        num = num/10;
        rev = rev * 10 + digit;
        }
        
        return rev;
    }

    public static boolean isAllDigitsOdd(int num) 
    {
    	int count = 0;
        while(num > 0)
        {
        	int digit = num % 10;
        	num = num /10;
        	if(digit %2 == 0 && digit != 0)
        	{
        		count ++;
        	}
        }
        if(count == 0)
        {
        	return true;
        		
        }
        else 
        {
        	return false;
        }
    }
}
