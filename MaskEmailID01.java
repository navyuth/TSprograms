
public class MaskEmailID01 {

	 public static void main(String[] args) {
	        String email = "testmail@.mailme.com";
	        System.out.println(maskMailID(email));
	    }

	    public static String maskMailID(String email)
	    {
	    	
	    	int index = email.indexOf("@");
	    	String maskEmail = "";
	    	
	    	for(int i=0;i<email.length();i++)
	    	{
	    		if(i>=2 && i< email.indexOf("@"))
	    		{
	    			maskEmail = maskEmail + "X";
	    		}
	    		else
	    		{
	    			maskEmail = maskEmail + email.charAt(i);
	    			
	    		}
	    		
	    	}
	    	return maskEmail;

	}

}
