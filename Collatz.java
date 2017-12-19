package myprograms;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=27;
		while(num>1){
			if(num%2 ==0){
				num = num/2;
			
			System.out.println(num);
		}
		
		else {
			num = num*3+1;
			System.out.println(num);
		}
	}

}
}
