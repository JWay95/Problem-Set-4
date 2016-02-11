
public class Problem03 {

	public static void main(String[] args) {
		reverseDisplay(123456);
		reverseDisplay(18616918);
		reverseDisplay(1134);
	}
	
	public static void reverseDisplay(int n) {
		if (n == 0)
			System.out.println("");
		else {
			System.out.print(n % 10);
			reverseDisplay(n / 10);
		}
	}
}