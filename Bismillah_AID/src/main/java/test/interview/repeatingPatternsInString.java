package test.interview;

public class repeatingPatternsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "acbdfghybdf";
		String string2 = "acbdfghybdfghabcd";
		System.out.println("Max length repeating pattern in string1: " + maxRepeat(string1));
		System.out.println("Max length repeating pattern in string2: " + maxRepeat(string2));
	}

	public static String maxRepeat(String string) {
		String string1 = "";
		int n = string.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String x = repeating(string.substring(i, n), string.substring(j, n));
				if (x.length() > string1.length()) {
					string1 = x;
				}
			}
		}
		return string1;
	}

	private static String repeating(String str, String str1) {
		int n = Math.min(str.length(), str1.length());
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != str1.charAt(i)) {
				return str.substring(0, i);
			}
		}
		return str.substring(0, n);
	}

}
