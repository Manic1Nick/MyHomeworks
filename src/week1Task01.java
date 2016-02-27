import java.util.Scanner;

public class week1Task01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input time in range 0-24");
		int time = scanner.nextInt();
	
		if (time < 0 || time > 24) {
			System.out.print("Time must be from 0 to 24 !!!");
			
		} else {		
			if (time >= 9 && time <= 18) {
				System.out.println("I'm on the work!");
				} else {
					System.out.println("I'm relax!");	
				}
		}
		

	}

}
