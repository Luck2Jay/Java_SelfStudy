import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1:Banana || 2 :Peach");
		int input = sc.nextInt();
		Fruit fruit;

		if (input == 1) {
			fruit = new Peach(); // Peach라는 자식의 인스턴스를 부모 클래스 타입의 변수에 할당
			fruit.show();
		} else {
			fruit = new Banana(); // Banana라는 자식의 인스턴스를 부모 클래스 타입의 변수에 할당
			fruit.show();
		}
	}

}
