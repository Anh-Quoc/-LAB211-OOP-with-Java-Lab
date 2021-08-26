import java.util.Scanner;
import java.util.HashMap;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose type of input: ");
		String typeOfInput = getNumber(sc);
		System.out.println("Choose type of output: ");
		String typeOfOutput = getNumber(sc);
		System.out.print("Value need to convert: ");
		String value = sc.nextLine();
		
		System.out.print("Value output: ");
		switch(typeOfInput + typeOfOutput){
			case "12":
				System.out.print(BIN_to_DEC(value));
				break;
			case "13":
				System.out.print(BIN_to_HEX(value));
				break;
			case "21":
				System.out.print(DEC_to_BIN(value));
				break;
			case "23":
				System.out.print(DEC_to_HEX(value));
				break;
			case "31":
				System.out.print(HEX_to_BIN(value));
				break;
			case "32":
				System.out.print(HEX_to_DEC(value));
		}	
	}
	public static String getNumber(Scanner sc){
		System.out.println("(1) Binary");
		System.out.println("(2) Decimal");
		System.out.println("(3) Hexadecimal");

		return sc.nextLine();
	}

	public static String BIN_to_HEX(String BIN){
		return DEC_to_HEX(BIN_to_DEC(BIN));
	}

	public static String HEX_to_BIN(String HEX){
		return DEC_to_BIN(HEX_to_DEC(HEX));
	}

	static final String arrHEX = "0123456789ABCDEF";
	public static String DEC_to_HEX(String DEC){	
		int value = Integer.parseInt(DEC);
		String HEX = "";
		while(value > 0){
			HEX = arrHEX.charAt(value % 16) + HEX;
			value /= 16;
		}
		return HEX;
	}
	
	public static String HEX_to_DEC(String HEX){
		int DEC = 0;
		for(int i = 0; i < HEX.length(); ++i){
			DEC += arrHEX.indexOf(HEX.charAt(i)) * Math.pow(16, HEX.length() - 1 - i);
		}
		return String.valueOf(DEC);
	}		

	public static String DEC_to_BIN(String DEC) {
		int value = Integer.parseInt(DEC);
		String BIN = "";
		while(value > 0){
			BIN = String.valueOf(value % 2) + BIN;
			value = value / 2;
		}
		return BIN;
	}

	public static String BIN_to_DEC(String BIN) {
		int DEC = 0;
		for(int i = 0; i < BIN.length(); ++i) {
			DEC += Integer.parseInt(String.valueOf(BIN.charAt(i))) * Math.pow(2, BIN.length() - 1 - i);
		}
		return String.valueOf(DEC);
	}
}