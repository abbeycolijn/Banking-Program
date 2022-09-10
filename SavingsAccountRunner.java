import java.util.Scanner; 
public class SavingsAccountRunner {

	public static void main(String[] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount();
		
		//ask user for input
		System.out.print("Welcome to SavingsAccountRunner. To begin, please enter a nickname: ");
		Scanner input = new Scanner(System.in);
		savingsAccount.setNickname(input.next());
		
		System.out.print("Enter initial balance: ");
		savingsAccount.setBalance(input.nextDouble());
		
		System.out.print("Enter annual interest rate: ");
		savingsAccount.setAnnualInt(input.nextDouble());

		int i = 1;
		while (i > 0) {
			
			//display options
			System.out.println("Please choose a number from the following optins: \n1. Deposit \n2. Check monthly interest rate"
					+ "\n3. Check account details \n4. Exit program");
			int options = input.nextInt();
			System.out.println();
			
			//check input
			if (options < 1 || options > 4) {
				System.out.print("The number you entered is invalid. Please try again.");
				options = input.nextInt();
				System.out.println();
			}
			//deposit
			else if (options == 1) {
				System.out.print("You have chosen to deposit. Please enter deposit amount: ");
				double deposit = input.nextDouble();
			
				if (deposit <= 0){
					System.out.print("Deposit must be a positive number. Please try again: ");
					deposit = input.nextDouble();
				}
				else {
					double newBalance = savingsAccount.setDeposit(deposit);
					System.out.println("Your new balance is: $" + newBalance);
					System.out.println();
				}
				
			}
			//Monthly interest rate
			else if (options == 2) {
				double monthlyInt = savingsAccount.getMonthlyInterestRate();
				System.out.println("Your monthly interest amount is: $" + monthlyInt);
				System.out.println();
				
			}
			else if (options == 3) {
				System.out.println("Account details: ");
				System.out.println(savingsAccount.toString());
				System.out.println();

			}
			else {
				System.out.println("You have exited the program.");
				
				break;
			}
			
			i++;
		}
	}

}
