package week1day4;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int sum=0,rem;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;	
		}
		System.out.println(sum);

	}

}
