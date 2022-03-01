class InputProcess implements Localized {
	
	public static boolean check_String_All_Is_Letter(String String_Need_Check) {
        for (int i = 0; i < String_Need_Check.length(); ++i) {
            if (!Character.isLetter(String_Need_Check.charAt(i)) && String_Need_Check.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean check_String_All_Is_Number(String string_Need_Check) {
        final String all_Number = "0123456789";
        for (int i = 0; i < string_Need_Check.length(); ++i) {
            if (!all_Number.contains(String.valueOf(string_Need_Check.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}