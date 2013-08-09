import java.util.Scanner;


public class TicketNumbers {

	public static void main(String[] args) {
			int ticketNumber, stem, checkDigit;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please enter a ticket number: ");
			ticketNumber = sc.nextInt();
			stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;
			
			if (checkDigit == stem % 7) {
				System.out.println("That is a valid ticket number, good job!");
			} else {
				System.out.println("That's not a valid ticket number, what do you think you are doing?!");
			}
	}

}
