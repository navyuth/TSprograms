
public class Test4 {

	public static void main(String[] args)
	{
		String str = "talentsprint2017@";
		String s1 = "";
		String s2 = "";
		String s = "";
		for(int i = 1; i<=str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isLetter(ch))
			{
				s1 = s1 + str.toUpperCase();
			}
			else
			{
				s2 = s2 + str.charAt(i);
			}
		}
		System.out.println(s);

	}

}
