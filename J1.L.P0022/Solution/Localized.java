import java.util.*; 

interface Localized {
	Scanner sc = new Scanner(System.in);
	String[] all_candidatesType = {"0","1","2"};

	int length_birthDate = 4;
	int year_birthDate = 1900;
	int expInYear_Min = 0;
	int expInYear_Max = 100;
	String birthDateException = "";
	String[] domainEmail = {"@fpt.edu.vn", "@gmail.com"};
	String[] rankOfGraduation = {"Excellence", "Good", "Fair", "Poor"};
}