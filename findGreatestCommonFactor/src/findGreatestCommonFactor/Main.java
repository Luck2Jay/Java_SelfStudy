package findGreatestCommonFactor;

public class Main {

	public static void main(String[] args) {
		findCFactor cf = new findCFactor();
		int min = cf.findmin(44,64,128);
		int cp = cf.findCP(min, 44, 64, 128);
		System.out.println(cp);
	}

}
