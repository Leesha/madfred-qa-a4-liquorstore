import javax.swing.JOptionPane;


public class AgeChecker {
//this creates the dialog box and prompts information from the user
	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog(null, "What is your first name?");
		String lastName = JOptionPane.showInputDialog(null, "What is your last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "what year were you born?"));
// these are the variables that hold the information		
		boolean oldEnough = verifyLegalAge(yearOfBirth);
		String fullName = concatenateNames(firstName, lastName);
//this verifies the information recieved whehter it is tru or false 	
		if (oldEnough == true){
			JOptionPane.showMessageDialog(null,fullName + " you may proceed with your shopping");
		}
		else{
			JOptionPane.showMessageDialog(null, fullName + "you're not old enough, try disney.com instead!");
		}
		}
// this shows output corresponding to the varification of age
		public static boolean verifyLegalAge(int yob){
			boolean legalAgeStatus = (2013-yob) >= 19;
			return legalAgeStatus;
		}	
// this strings the names together so i dont have to call both variables.		
			public static String concatenateNames(String fn, String ln){
				String fullName = fn + " " + ln;
				return fullName;
		}
	

}
