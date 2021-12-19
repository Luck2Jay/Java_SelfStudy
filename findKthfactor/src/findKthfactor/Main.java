package findKthfactor;

public class Main {

	public static int findKthfac(int num, int k) {
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				k--;
				if(k==0) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(findKthfac(50,1));
	}

}
