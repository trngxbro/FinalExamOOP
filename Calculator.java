
		public class Calculator	{
			public static boolean checkPrime(int n) {
				int count = 0;
				for (int i = 2; i<n/2; i++){
					if (n%i==0) {
						count++;
					}
				}
				if (n<=1)
					return false;
				if (count!=0)
					return false;
				return true;
			}
			
			public static int calSumPrime(int n) {
				int sum = 0;
				for (int i = 2; i<=n; i++){
					int count = 0;
					for (int j = 1; j<=i/2; j++) {
						if (i%j==0) {
							count++;
						}
					}
					if (count==1){
						sum += i;
					}
				}
				if (n<=1)
					return 0;
				return sum;
			}
			
			public static void main (String [] args) {
				System.out.println(checkPrime(11));
				System.out.println(calSumPrime(11));
			}
		}
		