package findGreatestCommonFactor;

public class findCFactor {

	public static int findmin(int a, int b, int c) {
		int min;
		
		if(a<b) {
			if(a<c) min = a;
			else min=c;
		}
		else { //a>b
			if(b<c) min = b;
			else min =c;
		}
		
		return min;
	}
	
	public static int findCP(int min, int a, int b, int c) {
		for(int i = min;i>0;i--) {
			if(a%i==0&&b%i==0&&c%i==0) {
				return i;
			}
		}
		return -1;
	}
	
	
}
