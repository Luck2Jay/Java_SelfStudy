package findLastString;

public class findLastString {

	public static void findLS(String a) {
		int len = a.length();
		System.out.println("last String :  " + a.substring(len-1,len) );
		//return a.charAt(a.length()-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLS("Hello World");
	}

}
