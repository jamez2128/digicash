package _6_Week_6_Final_Project;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LifestyleServices {

	public static boolean movies() {
		double amount = 0;
		String service = "";
		
		String[] moviesMainMenu = {
				"Disney+",
				"Hulu",
				"Netflix"
		};

		double[] disneyPlusPrices = {
				445.51,
				625.54,
				4560
		};
		
		String[] disneyPlusChoices = {
			"P" + disneyPlusPrices[0] + " for a month with ad-supported version",
			"P" + disneyPlusPrices[1] + " for a month ad free version",
			"P" + disneyPlusPrices[2] + " for a year"
		};
		
		double[] huluPrices = {
				3990,
				4332
		};
		
		String[] huluChoices = {
				"P" + huluPrices[0] + " Hulu + Live Tv",
				"P" + huluPrices[1] + " Hulu no Ad + Live Tv"
		};
		
		double[] netflixPrices = {
				569.53,
				883.08,
				1139
		};
		
		String[] netflixChoices = {
			"P" + netflixPrices[0] + " Monthly Plan offering 480P Streaming",
			"P" + netflixPrices[1] + " Monthy Plan Plan for 1080P Streaming",
			"P" + netflixPrices[2] + " Monthly Plan for for 4k Streaming "
		};
		
		int choice = JOptionPane.showOptionDialog(null, "************Movie Monthly Payment**********", "Movies", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, moviesMainMenu, 0);
		
		switch (choice) {
		case -1:
			return false;
		case 0:
			int disneyPlusChoice = JOptionPane.showOptionDialog(null, "Disney+", "Movies", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, disneyPlusChoices, 0);
			service = "Disney+ subscription";
			switch (disneyPlusChoice) {
			case -1:
				return false;
			case 0:
				service += " with ad-supported version";
				amount = disneyPlusPrices[0];
				break;
			case 1:
				service += " ad free version";
				amount = disneyPlusPrices[1];
				break;
			case 2:
			    service += " annual";
				amount = disneyPlusPrices[2];
				break;
			}
			break;
		case 1:
			int huluChoice = JOptionPane.showOptionDialog(null, "Hulu", "Movies", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, huluChoices, 0);
			service = "Hulu subscription";
			switch (huluChoice) {
			case -1:
				return false;
			case 0:
				service += " + Live TV";
				amount = huluPrices[0];
				break;
			case 1:
				service += " + no Ad + Live TV";
				amount = huluPrices[1];
				break;
			}
			break;
		case 2:
			int netflixChoice = JOptionPane.showOptionDialog(null, "Netflix", "Movies", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, netflixChoices, 0);
			service = "Netflix subscription";
			switch (netflixChoice) {
			case -1:
				return false;
			case 0:
				service += " for 480P streaming";
				amount = netflixPrices[0];
				break;
			case 1:
				service += " for 1080P streaming";
				amount = netflixPrices[1];
				break;
			case 2:
				service += " for 4K streaming";
				amount = netflixPrices[2];
				break;
			}
			break;
		}

		if (GUI.askPINCode() == false) {
			return false;
		}
			
		if (GUI.isBalanceSufficient(amount) == false) {
			return false;
		}

		if (GUI.paymentPortal(amount) == false) {
			return false;
		}

		GUI.currentUser.transact(amount, service + " subscription service");
		return true;
	}
	
	public static boolean Games() {
		String service = "";
		double amount = 0;

		String[] gamesMenu = {
			"Xbox Game Pass Ultimate",
			"PlayStation Plus",
			"Nintendo Switch Online"
		};
		
		double[] xboxPrices = {
			560.53,
			1424.68,
			2279.83,
			3420.03
		};
		
		String[] xboxMenu = {
			"P" + xboxPrices[0] + " for a month",
			"P" + xboxPrices[1] + " for 3 Months",
			"P" + xboxPrices[2] + " for 6 Months",
			"P" + xboxPrices[3] + " for 12 Months"
		};
		
		double[] playstationPrices = {
				1424.68,
				569.53,
				3420.03
		};
		
		String[] playstationMenu = {
			"P" + playstationPrices[0] + " for 4 months",
			"P" + playstationPrices[1] + " for a month",
			"P" + playstationPrices[2]  +" for a year"
		};
		
		double[] nintendoPrices = {
			227.47,
			455.51,
			1139.63
		};
		
		String[] nintendoMenu = {
			"P" + nintendoPrices[0] + " for a month",
			"P" + nintendoPrices[1] + " for 3 months",
			"P" + nintendoPrices[2] + " for a year"
		};
		
		int choice = JOptionPane.showOptionDialog(null, "************Games Monthly Payment**********", "Games", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, gamesMenu, 0);
		switch (choice) {
		case -1:
			return false;
		case 0:
			service = "Xbox Game Pass subscription";
			int xboxChoice = JOptionPane.showOptionDialog(null, "Xbox Game Pass", "Games", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, xboxMenu, 0);
			switch (xboxChoice) {
			case -1:
				return false;
			case 0:
				service += " for a month";
				amount = xboxPrices[0];
				break;
			case 1:
				service += " for 3 months";
				amount = xboxPrices[1];
				break;
			case 2:
				service += " for 6 months";
				amount = xboxPrices[2];
				break;
			case 3:
				service += " for 12 months";
				amount = xboxPrices[3];
				break;
			}
			break;
		case 1:
			service = "PlayStation Plus subscription";
			int playstationChoice = JOptionPane.showOptionDialog(null, "PlayStation Plus", "Games", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, playstationMenu, 0);
			switch (playstationChoice) {
			case -1:
				return false;
			case 0:
				service += " for 4 months";
				amount = playstationPrices[0];
				break;
			case 1:
				service += " for a month";
				amount = playstationPrices[1];
				break;
			case 2:
				service += " for a year";
				amount = playstationPrices[2];
				break;
			}
			break;
		case 2:
			service = "Nintendo Switch online subscription";
			int nintendoChoice = JOptionPane.showOptionDialog(null, "Nintendo Switch Online", "Games", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, nintendoMenu, 0);
			switch (nintendoChoice) {
			case -1:
				return false;
			case 0:
				service += " for a month";
				amount = nintendoPrices[0];
				break;
			case 1:
				service += " for 3 months";
				amount = nintendoPrices[1];
				break;
			case 2:
				service += " for a year";
				amount = nintendoPrices[2];
				break;
			}
			break;
		}
		
		if (GUI.askPINCode() == false) {
			return false;
		}
			
		if (GUI.isBalanceSufficient(amount) == false) {
			return false;
		}

		if (GUI.paymentPortal(amount) == false) {
			return false;
		}

		GUI.currentUser.transact(amount, service);
		
		return true;
	}
	
	public static boolean payBills() {
		JTextField billerNameField = new JTextField();
		JTextField accountNameField = new JTextField();
		JTextField accountNumberField = new JTextField();
		JTextField amountField = new JTextField();
		String billerName = "";
		String accountName = "";
		String accountNumber = "";
		double amount = 0;
		
		Object[] payBillElements = {
			"Biller:", billerNameField,
			"Account name:", accountNameField,
			"Account number:", accountNumberField,
			"Amount:", amountField
		};
		
		int response = JOptionPane.showConfirmDialog(null, payBillElements, "Pay Bills", JOptionPane.OK_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION);
		switch (response) {
		case -1:
		case 2:
			return false;
		case 0:
			if (billerNameField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Biller field is empty", "Pay Bills", JOptionPane.ERROR_MESSAGE);
				return false;
			} else {
				billerName = billerNameField.getText();
			}

			if (accountNameField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Account name field is empty", "Pay Bills", JOptionPane.ERROR_MESSAGE);
				return false;
			} else {
				accountName = accountNameField.getText();
			}
			
			if (accountNumberField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Account number field is empty", "Pay Bills", JOptionPane.ERROR_MESSAGE);
				return false;
			} else {
				accountNumber = accountNumberField.getText();
			}
			
			if (accountNumber.matches("\\D+")) {
				JOptionPane.showMessageDialog(null, "Account number field is invalid", "Pay Bills", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			
			if (amountField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Amount field is empty", "Pay Bills", JOptionPane.ERROR_MESSAGE);
				return false;
			}
				
			if (amountField.getText().matches("\\D+")) {
				JOptionPane.showMessageDialog(null, "Amount field is invalid", "Pay Bills", JOptionPane.ERROR_MESSAGE);
				return false;

			} else {
				amount = Double.parseDouble(amountField.getText());
			}
			
			if (amount <= 0) {
				JOptionPane.showMessageDialog(null, "Amount field is invalid", "Pay Bills", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			break;
		}

		if (GUI.askPINCode() == false) {
			return false;
		}
			
		if (GUI.isBalanceSufficient(amount) == false) {
			return false;
		}

		if (GUI.paymentPortal(amount) == false) {
			return false;
		}
		GUI.currentUser.transact(amount, "Paid " + billerName + " bill for " + accountName + " with the account number " + accountNumber);
		
		return true;
	}
	
	public static boolean sendMoneyGift() {
		JTextField phoneNumberField = new JTextField();
		JTextField amountField = new JTextField();
		JTextField messageField = new JTextField();
		String phoneNumber = "";
		double amount = 0;
		String message = "";
		
		Object[] sendMoneyGiftElements = {
			"Send Money to another registered DigiCash user and send them a lovely message",
			"Phone number:", phoneNumberField,
			"Amount:", amountField,
			"Message:", messageField
		};
		
		int response = JOptionPane.showConfirmDialog(null, sendMoneyGiftElements, "Send Money/Gift", JOptionPane.OK_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION);
		switch (response) {
		case -1:
		case 2:
			return false;
		case 0:
			if (phoneNumberField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Phone number field is empty", "Send Money/Gift", JOptionPane.ERROR_MESSAGE);
				return false;
			} else {
				phoneNumber = phoneNumberField.getText();
			}

			if (phoneNumber.substring(0, 2).equals("09") && phoneNumber.length() == 11) {
				phoneNumber = phoneNumber.substring(1, 11);
			} else if (phoneNumber.substring(0, 4).equals("+639") && phoneNumber.length() == 13) {
				phoneNumber = phoneNumber.substring(3, 13);
			} else if (phoneNumber.substring(0, 1).equals("9") && phoneNumber.length() == 10) {
			} else {
				JOptionPane.showMessageDialog(null, "Phone number field is invalid", "Send Money/Gift", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			
			if (amountField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Amount field is empty", "Send Money/Gift", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			
			if (amountField.getText().matches("\\D+")) {
				JOptionPane.showMessageDialog(null, "Amount field is invalid", "Send Money/Gift", JOptionPane.ERROR_MESSAGE);
				return false;
			} else {
				amount =  Double.parseDouble(amountField.getText());
			}
			
			if (amount <= 0) {
				JOptionPane.showMessageDialog(null, "Amount field is invalid", "Send Money/Gift", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			
			message = messageField.getText();
			if (message.length() >= 255) {
				JOptionPane.showMessageDialog(null, "Message is too long", "Send Money/Gift", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			break;
		}
		if (Account.isAccountExists(phoneNumber) == false) {
			JOptionPane.showMessageDialog(null, "Account doesn't exist", "Send Money/Gift", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		if (GUI.askPINCode() == false) {
			return false;
		}
			
		if (GUI.isBalanceSufficient(amount) == false) {
			return false;
		}

		if (GUI.paymentPortal(amount) == false) {
			return false;
		}
		
		GUI.currentUser.sendMoneyToAnotherUser(phoneNumber, message, amount);

		return true;
	}
	
}