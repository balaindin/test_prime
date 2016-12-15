
public class VerifyPrimeNumber {

	public static boolean isPrime(int n) {
	    if (n%2==0) return false;

	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Is 3 a prime number : " + isPrime(3));
		System.out.println("Is 4 a prime number : " + isPrime(4));
	}
}
