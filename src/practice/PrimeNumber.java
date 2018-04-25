package practice;

public class PrimeNumber {

	
	public void prime(int number) {
		boolean flag = false;
		for (int i = 2; i < number/2; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println(number + " is not prime number");
		} else {
			System.out.println(number + "  is prime number");
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber pr = new PrimeNumber();
		for(int number  =5;number<100;number++) {
			pr.prime(number);
		}
	}
}
