package hw4JavaVariables;

public class AboutMe {
	//variable declared 
	public String name;
	public int myYearlySalary;
	public double myGrade;
	public char sex = 'F';
	public boolean usCitizen;
	public long myBankAccount;
	public short myApatmentRent;
	public float myHeight;
	public byte age;

	public AboutMe() {
		System.out.println("This is all about us:");// constructor is declared
	}

	// method is implemented
	public void aboutMe() {
		System.out.println("My Name: " + name + "\nYearly Salary: " + myYearlySalary + "\nGrade: " + myGrade + "\nSex: "
				+ sex + "\nUs Citizen: " + usCitizen + "\nBank Account: " + myBankAccount + "\nApatment Rent: "
				+ myApatmentRent + "\nMy Height: " + myHeight);
	}
}
