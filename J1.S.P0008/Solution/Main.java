import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your content: ");
		String content_1 = sc.nextLine();

		StringTokenizer letters = new StringTokenizer(content_1, " ");		
		putIntoHasMap(letters);

		content_1.replaceAll(" ","");		
		String content_2 = "";
		for(int i = 0; i < content_1.length(); ++i) {
			content_2 += content_1.substring(i, i + 1) + " ";
		}

		StringTokenizer character = new StringTokenizer(content_2, " "); 
		putIntoHasMap(character);
	}

	public static void putIntoHasMap(StringTokenizer Object){
		HashMap<String, Integer> counter = new HashMap<>();
		while(Object.hasMoreTokens()){
			String key = Object.nextToken();
			if(counter.get(key) == null){
				counter.put(key, 1);
			} else {
				counter.put(key, counter.get(key) + 1);
			}				
		}
		System.out.println(counter);
	}
}