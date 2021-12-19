import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*100);
			}
		} catch (FileNotFoundException e) {
			System.out.println("읽어오는 도중 오류 발생");
		}
	}

}
