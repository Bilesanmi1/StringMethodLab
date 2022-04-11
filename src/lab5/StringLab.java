package lab5;

public class StringLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//capitalize("hOOp");
//wheresWaldo("Where the F is Waldo");
//firstThingsFirst("grind","daily");
//reverse("GoodKid");
//soLong("Cleaning", "Crew");
//afterMath("I love math so much i want to me it");
letterize("Rodriguez");
	}
	public static void capitalize(String word) {
		String cap;
		cap = word.substring(0, 1).toUpperCase();
		cap +=  word.substring(1).toLowerCase();
		System.out.println(cap);
	}
	public static void wheresWaldo(String phrase) {
	
		String word = "Waldo";
		int len = word.length();
		int startIndex = 0;
		while ( ! (phrase.substring(startIndex, len).equals(word))) {
			startIndex ++;
			len ++;
			
			
			
		}
		System.out.printf("%s is found at index %d",word,startIndex);
	}
	public static void firstThingsFirst(String a, String b) {
		if(a.compareTo(b) == 0 ) {
			System.out.printf("%s and %s are equal", a, b);
		}else if (a.compareTo(b) < 0) {
			System.out.printf("%s %s", a, b);
		}else if (a.compareTo(b) > 0) {
			System.out.printf("%s %s", b, a);
		}
	}
	public static void reverse(String s) {
		int len = s.length();
		char letter;
		String reverse ="";
		for(int i = len - 1; i >= 0; i--) {
			letter = s.charAt(i);
			reverse += letter;
			
		}
		System.out.println(reverse);
		
	}
	public static void soLong(String a, String b) {
		if(a.length() > b.length()) {
			System.out.println(a);
		}else if (a.length() < b.length()) {
			System.out.println(a);
		}else {
			System.out.printf("%s %s", a, b);
		}
	}
	public static void afterMath(String phrase) {
		String word = "math";
		int len = word.length();
		int startIndex = 0;
		while ( ! (phrase.substring(startIndex, len).equals(word))) {
			startIndex ++;
			len ++;
			
			
			
		}
		System.out.printf("%s",phrase.substring(startIndex,phrase.length()));
	}
	
	public static void letterize(String word) {
		int len = word.length();
		for(int i = 0; i < len; i++) {
			System.out.println(word.charAt(i));
		}
		
	}
	
	

}
