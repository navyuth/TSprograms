import java.util.*;
public class Test5 {

	public static void main(String[] args)
	{
		String input = "NAVYUTH";
		int Sum = 0;
		
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		hm.put(alphabets.charAt(0),0 );
		hm.put(alphabets.charAt(1),1 );

		System.out.println(hm);
		
		
		for(int i=2; i<alphabets.length(); i++)
		{
			int val = hm.get(alphabets.charAt(i-1)) +hm.get(alphabets.charAt(i-2));
			hm.put(alphabets.charAt(i),val);
			
		}
		for(int i = 0; i< input.length();i++)
		{
			if(hm.containsKey(input.charAt(i)))
			{
				Sum = Sum + hm.get(input.charAt(i));
			}
		}
		
		System.out.println(Sum);
	}

}
