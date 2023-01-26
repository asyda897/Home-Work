package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();// constructor is initialized
		// variable is initialized.
		aboutMe.name = "Syeda";
		aboutMe.myYearlySalary = 244780;
		aboutMe.myGrade = 3.125;
		aboutMe.sex = 'F';
		aboutMe.usCitizen = true;
		aboutMe.myBankAccount = 13236655648798755l;
		aboutMe.myApatmentRent = 3250;
		aboutMe.myHeight = 1.783659f;
		aboutMe.aboutMe();// method is initialized.

		System.out.println("\n...............................................................\n");
		// variable is initialized.
		AboutMe aboutFnd = new AboutMe();// constructor is initialized
		aboutFnd.name = "Alex";
		aboutFnd.myYearlySalary = 244780;
		aboutFnd.myGrade = 3.125;
		aboutFnd.sex = 'F';
		aboutFnd.usCitizen = true;
		aboutFnd.myBankAccount = 13236655648798755l;
		aboutFnd.myApatmentRent = 3250;
		aboutFnd.myHeight = 1.783659f;
		aboutFnd.aboutMe();// method is initialized.

	}

}
