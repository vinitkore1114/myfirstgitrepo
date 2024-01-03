package core_java_topics.exceptionHandling.customException.atmProject;

import java.util.Scanner;

public class BankOperations {

	public static void main(String[] args) throws InvalidAmountException,InsufficientAmountException{
		int option = 0;
		String nextoption = null;
		double amount = 0.0d;
		double withdrawAmount = 0.0d;
		String debitCard = null;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please insert your debit card");
			debitCard = scanner.next();
			try {
			IATMService dcard = new SBIDebitCard();
			start :
					while(true) {
						System.out.println("Please select the option you want to perform");
						System.out.println("1. Deposit");
						System.out.println("2. Withdraw");
						System.out.println("3. Check Balance");
						System.out.println("4. Exit");
						option = scanner.nextInt();
						try {
							switch(option) {
							case 1:
								System.out.println("Please enter the amount to deposi");
								amount = scanner.nextDouble();
								dcard.depositAmount(amount);
								System.out.println("Amount : " + amount + "credited into your account");
								break;
							case 2:
								System.out.println("Please enter amount to withdraw");
								withdrawAmount = scanner.nextDouble();
								dcard.withdrawAmount(withdrawAmount);
								System.out.println("Amount : " + withdrawAmount + "debited from your account");
								break;
							case 3:
								System.out.println("Your current balance is : " + dcard.checkBalance());
								break;
							case 4:
								break start;
							default :
								System.out.println("Invalid operation...");
							}
							System.out.println("Do you want to continue...");
							System.out.println("Press 'Y' for Yes or Press 'N' for No");
							nextoption = scanner.next();
							if ("N".equalsIgnoreCase(nextoption)) {
								break start;
							}
						}catch(InvalidAmountException iae) {
							System.out.println(iae.getMessage());
						}catch(InsufficientAmountException ise) {
							System.out.println(ise.getMessage());
							
						}
					}
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
				
			}
			System.out.println("==========================================================================");

		}

	}

}
