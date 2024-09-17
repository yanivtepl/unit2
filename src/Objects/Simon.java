package Objects;
import java.util.Scanner;
public class Simon {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner console = new Scanner(System.in);
		
		//Ask user for their name
		System.out.println("What is your name?");
		
		//Get their name
		String name = console.nextLine();
		
		//Say good morning
		System.out.println("Good Morning, " + name);
		
		
		console.close();

	}

}
