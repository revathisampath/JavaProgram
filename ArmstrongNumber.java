package week1day4;

public class ArmstrongNumber {
 
	public static void main(String[] args) {
		int orig=153;
		int n=orig;
		int cal=0,rem;
		 while(orig>0) {
	    	rem=orig%10;
	    	cal=cal+(rem*rem*rem);
	    	orig=orig/10;
	    }
        if(n==cal) {
    	System.out.println("given number is armstrong");
}
        else {
        	System.out.print("given number is not a armstrong");
        }
	}

}
