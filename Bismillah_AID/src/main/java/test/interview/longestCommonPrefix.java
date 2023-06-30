package test.interview;

public class longestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Your code goes here

		String s[] = {"flower", "flow", "flight"};
		System.out.println(longestCommonPrefix(s));

	}
	
	public static String longestCommonPrefix(String[] S) {
		if (S.length == 0) return "";
		String prefix = S[0];
		for (int i = 1; i < S.length; i++)
			while (S[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}        
		return prefix;
	}

}



