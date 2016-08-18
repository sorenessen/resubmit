package math;

public class PrimeNumber {

	public static void main(String[] args) {

		int limit = 1000000;

		System.out.println("Prime numbers between 1 and " + limit);


		for(int i=1; i < 1000000; i++){

			boolean isPrime = true;

			for(int j=2; j < i ; j++){

				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i + " ");
		}
	}
}
