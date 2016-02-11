
public class Problem01 {

	public static void main(String[] args) {
		String j = "civic";
		System.out.println(j + (pal(j) ? " is" : " is not") + " a palindrome.");
		String q = "rotator";
		System.out.println(q + (pal(q) ? " is" : " is not") + " a palindrome.");
		String t = "panda";
		System.out.println(t + (pal(t) ? " is" : " is not") + " a palindrome.");
	}
	
	public static boolean pal(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		else {
			if (s.charAt(0) != s.charAt(s.length() - 1))
				return false;
			else
				return pal(s.substring(1, s.length() - 1));
		}
	}
}