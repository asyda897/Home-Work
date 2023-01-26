package hw3JavaVariables;

public class AboutMe {

	// variable initialized.
	public String name = "Syeda";
	public int myYearlySalary = 244780;
	public double myGrade = 3.125;
	public char sex = 'F';
	public boolean usCitizen = true;
	public long myBankAccount = 13236655648798755l;
	public short myApatmentRent = 3250;
	public float myHeight = 1.783659f;

	// declared
	public byte age;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println(
				"My Name:" + aboutMe.name + "\nSalary:" + aboutMe.myYearlySalary + "\nGrade:" + aboutMe.myGrade);
	}

}
