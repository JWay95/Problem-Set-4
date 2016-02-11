
public class Problem04 {

	public static void main(String[] args) {
		System.out.println(decimalToBinary(18));
	}
	
	public static String decimalToBinary(int n) {
		return decimalToBinary(n, "");
	}
	
	private static String decimalToBinary(int n, String x) {
		if (n == 0)
			return x;
		else {
			int T = n % 2;
			n = n / 2;
			x = decimalToBinary(n, x);
			x = x.concat(Integer.toString(T));
			return x;
		}
	}			
}