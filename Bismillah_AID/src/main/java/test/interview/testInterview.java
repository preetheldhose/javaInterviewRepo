package test.interview;

import java.util.List;
import java.util.*;
import java.io.*;
import org.apache.commons.*;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Map;
import java.util.Map.Entry;

public class testInterview {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("Hello World");
		 * 
		 * //prime numbers: int number = 5; System.out.println("The value : " + number +
		 * " : is = " + isPrime(number));
		 * 
		 * //fibonacco series int count = 10; printFibonaccoSequence(10);
		 * 
		 * //onlyOddNumber List<Integer> newList = new ArrayList<Integer>(); for(int i =
		 * 0; i <= count; i++) { newList.add(i); }
		 * 
		 * System.out.println("Value of the newList : " + newList);
		 * onlyOddNumber(newList);
		 * 
		 * //Types of array String[] populateStrg = {"one", "two", "three", "four",
		 * "five"}; String[] strg = new String[5]; for(int x = 0; x < strg.length; x++)
		 * {
		 * 
		 * strg[x] = populateStrg[x];
		 * 
		 * }
		 * 
		 * Integer[] intg = new Integer[5]; for(int y = 0; y < intg.length; y++) {
		 * 
		 * intg[y] = y;
		 * 
		 * }
		 * 
		 * Float[] flt = new Float[5]; for(float z = 1; z < flt.length; z++) {
		 * 
		 * flt[(int) z] = z;
		 * 
		 * }
		 * 
		 * String newStrg = "Hello";
		 * 
		 * 
		 * char[] chr = new char[5]; chr = newStrg.toCharArray();
		 * 
		 * for(int a = 0; a < chr.length; a++) {
		 * System.out.println("Values as follows : " + chr[a]); }
		 */

		/*
		 * fileReader("/Users/preetheldhose/test_all/readThisFile.txt");
		 * fileReaderUsingScanner("/Users/preetheldhose/test_all/readThisFile.txt",
		 * "Welcome");
		 * fileReaderNCheckString("/Users/preetheldhose/test_all/readThisFile.txt",
		 * "Welcome"); printFile("/Users/preetheldhose/test_all/readThisFile.txt",
		 * "Welcome"); reverseAnArray("none"); swapUsing3rd(0, 1, 2);
		 * swapWithUsing3rd(0, 1); countWordsUsingHashMap(); iterateHashMap();
		 * printArrayList(); findDuplicates(); findOutTheSecondLargest();
		 * removeBlankSpacesInString(); replaceWhiteSpaces(); checkVowels();
		 * checkIfOdd(); javaStringMethods(); checkArrayWithSameElements();
		 * findStringInFile("/Users/preetheldhose/test_all/readThisFile.txt",
		 * "Welcome"); printSinglePatterns(); printDoublePattern();
		 */
		
		//Split the word into 2 part and find the sum of position of the character(s) present in both parts of the word. If A=1 and B=2 ...Z=26
		//EX : Fr a given Word "Venkat" split it into 2 equal parts and find the sum of the postions VEN / KAT 22+5+14= 41/ 11+1+20 =3
		//Part Final
		
		//numberGame("String");
		//numberGame("String=");
				
		//Create a program that converts a phone number with letters to one with only numbers. 
		//Part Final
		
		//splitStrNCallAlphabet("ABC");
		//String str = "123-647-EYES";
		
		//checkStr("123-647-EYES");
		
		//Split the given word into 2 parts. Find the characters present in both parts of the string
		//Part final
		//partsOfStringCompared("HelloWorld");
		
		//maxOccuranceOfStr
		//maxOccuranceOfStr();
		//maxOccuranceCharArray();
		maxOccuranceCharacterArrayList();
		
		//printHashMapViaArrayList();

	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}

		if (n == 2) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void printFibonaccoSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i < count; i++) {
			System.out.println(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}

	}

	public static boolean onlyOddNumber(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0) {
				return false;
			}
		}

		return true;
	}

	public static void fileReader(String filePath) throws IOException {
		File fileP = new File(filePath);
		FileReader fr = null;
		FileWriter fw = new FileWriter("/Users/preetheldhose/test_all/writeToThisFile.txt");
		int i = 1;
		String strAll = "";
		if (fileP.exists()) {
			System.out.println("FileP : " + filePath + " : exists : ");
			if (fileP.isFile()) {
				System.out.println("FileP : " + filePath + " : is a file");
				fr = new FileReader(filePath);
				while ((i = fr.read()) != -1) {
					System.out.println("Value of the file are as follows : " + (char) i);
					strAll += (char) i;
				}
				System.out.println("StrAll : ");
				System.out.println(strAll);
				System.out.println("About to write to a file :");
				fw.write(strAll);
			} else {
				System.out.println("FileP : " + filePath + " : is a not a file");
			}
		} else {
			System.out.println("FileP : " + filePath + " does not exists : ");
		}
		fr.close();
		fw.close();
	}

	public static void fileReaderUsingScanner(String filePath, String validateText) {
		File FilePth = new File(filePath);
		Scanner sC = new Scanner(filePath);
		String currentLine = "";
		while (sC.hasNextLine()) {
			String line = sC.nextLine();
			System.out.println("line value is as follows : " + line);
		}
	}

	public static void fileReaderNCheckString(String filePath, String validateText) throws IOException {
		// list that holds strings of a file
		List<String> listOfStrings = new ArrayList<String>();
		// load data from file
		BufferedReader bf = new BufferedReader(new FileReader(filePath));
		// read entire line as string
		String line = bf.readLine();
		// checking for end of file
		while (line != null) {
			listOfStrings.add(line);
			line = bf.readLine();
		}
		// closing bufferreader object
		bf.close();
		// storing the data in arraylist to array
		String[] array = listOfStrings.toArray(new String[0]);
		// printing each line of file
		// which is stored in array
		for (String str : array) {
			System.out.println(str);
		}
	}

	public static void printFile(String filePath, String validateString) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println("Execute : " + line);
				if (line.contains(validateString)) {
					System.out.println("Found it");
				} else {
					System.out.println("Didn't find it");
				}
			}
		} catch (Exception E) {
		}
	}

	// reverse a string
	public static void reverseAnArray(String strg) {
		String str = "This is an array";
		char[] ch = str.toCharArray();
		int len = ch.length;
		StringBuffer strBuf = new StringBuffer();
		for (int i = len - 1; i >= 0; i--) {
			// System.out.println(ch[i]);
			strBuf.append(ch[i]);
		}
		System.out.println(strBuf);
	}

	// swap using three variables.
	public static void swapUsing3rd(int x, int y, int temp) {
		x = 0;
		y = 0;
		temp = 0;
		System.out.println("Enter values for x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		temp = x;
		x = y;
		y = temp;
		System.out.println("value of x : " + x + "\n" + "value of y : " + y);
	}

	// swap using two variables
	public static void swapWithUsing3rd(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("value of x : " + x + "\n" + "value of y : " + y);

	}

	// count words using hashMap
	public static void countWordsUsingHashMap() {
		String[] str = { "one", "two", "three", "one", "fourth" };
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		// Map<String, Integer> hs = new TreeMap<String, Integer>();
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (hs.containsKey(str[i])) {
				hs.put(str[i], count++);
			} else {
				hs.put(str[i], 1);
			}
		}
		for (Map.Entry<String, Integer> loadMP : hs.entrySet()) {
			System.out.println("Keys is : " + loadMP.getKey() + " " + "Values are as follows : " + loadMP.getKey());
		}
	}

	// print hashMap using iterator
	public static void iterateHashMap() {
		HashMap<String, Integer> hsMap = new HashMap<String, Integer>();
		for (int i = 0; i < 15; i++) {
			hsMap.put(passString(), randInt());
		}
		Iterator itr = hsMap.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println("Values of itr are as follows : " + itr.next());
		}
		for (Map.Entry<String, Integer> lhsMap : hsMap.entrySet()) {
			System.out.println("Keys : " + lhsMap.getKey());
			System.out.println("Value : " + lhsMap.getValue());
		}
	}

	// print array list
	public static void printArrayList() {
		List<String> ltArry = new ArrayList<String>();
		for (int i = 0; i < 100; i++) {
			ltArry.add(passString());
		}
		for (int i = 0; i < ltArry.size(); i++) {
			System.out.println(ltArry.get(i));
		}
		Iterator iArry = ltArry.iterator();
		while (iArry.hasNext()) {
			System.out.println("values : " + iArry.next());
		}
	}

	// find duplicates
	public static void findDuplicates() {
		String[] str = { "a", "a", "b", "c", "d", "e", "e", "f" };
		HashMap<String, Integer> dupHSMap = new HashMap<String, Integer>();
		int count = 0;
		int checkValue = 0;
		for (int i = 0; i < str.length; i++) {
			if (dupHSMap.containsKey(str[i])) {
				dupHSMap.put(str[i], (dupHSMap.get(str[i]) + 1));
				System.out.println("Type B : " + dupHSMap);
			} else {
				dupHSMap.put(str[i], 1);
				System.out.println("Type C : " + dupHSMap);
			}
		}
		System.out.println("Printing the values D : " + dupHSMap);
		for (Map.Entry<String, Integer> preDup : dupHSMap.entrySet()) {
			if ((checkValue = preDup.getValue()) > 1) {
				System.out.println("Printing duplicates : " + preDup.getKey());
			}
		}
	}

	// find the second largest number
	public static void findOutTheSecondLargest() {
		// Algorithm:
		// 1/ define a int array
		// 2/ define an int variable "high", then equate the 1st element of the array to
		// "high",
		//// then equate the 2nd element to high if 2nd element is greater "high" then
		// assign "highest" to "high"
		int[] numbers = { 1, 2, 3, 4, 5, 200, 10000, 100000, 1000000000 };
		int highest = 0;
		int secondHighest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= highest) {
				secondHighest = highest;
				highest = numbers[i];
			} else {
				secondHighest = numbers[i];
			}
		}
		System.out.println("secondHighest : " + secondHighest);
	}

	// remove all white spaces from the string.
	public static void removeBlankSpacesInString() {
		String[] strg = { "abc", "def", "ghi", "", "123" };
		StringBuffer blanksRemoved = new StringBuffer();
		for (String str : strg) {
			if (str.isEmpty()) {
				System.out.println("Empty");
			} else {
				blanksRemoved.append(str);
			}
		}
		System.out.println("Final value : " + blanksRemoved);
		StringBuffer secondBlanksRemoved = new StringBuffer();
		for (int i = 0; i < strg.length; i++) {
			if (strg[i].isEmpty()) {
				System.out.println("Empty");
			} else {
				secondBlanksRemoved.append(strg[i]);
			}
		}
		System.out.println("secondBlanksRemoved value : " + secondBlanksRemoved);
	}

	// replace white spaces in a string using replace() method.
	public static void replaceWhiteSpaces() {
		String[] strg = { "abc", "def", "ghi", "", "123" };
		StringBuffer thisIsIt = new StringBuffer();
		for (String str : strg) {
			if (str.isEmpty()) {
				thisIsIt.append(str.replace(str, "replaced"));
				thisIsIt.append("$$$$$");
			} else {
				thisIsIt.append(str);
				thisIsIt.append("*****");
			}
		}
		System.out.println("This is all : " + thisIsIt);
	}

	// check if vowels are present
	public static void checkVowels() {
		String sentence = "This a sentence of a time";
		char[] chrS = sentence.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int sent = 0; sent < chrS.length; sent++) {
			for (int vow = 0; vow < vowels.length; vow++) {
				if (chrS[sent] == vowels[vow]) {
					System.out.println("Alphabet : " + chrS[sent] + " is a vowel");
				} else {
					System.out.println("Alphabet : " + chrS[sent] + " is NOT a vowel");
				}
			}
		}
	}

	// use charAt() within string array and to check with if()
	public static void charAtWithString() {
		String sentence = "This a sentence of a time";
		char[] chrS = sentence.toCharArray();
		String[] vowels = { "a", "e", "i", "o", "u" };
		for (int sent = 0; sent < chrS.length; sent++) {
			for (int vow = 0; vow < vowels.length; vow++) {
				// https://stackoverflow.com/questions/50887989/cannot-invoke-charatint-on-the-array-type-string
				// char b = a[i].charAt(i);
				if (chrS[sent] == vowels[vow].charAt(vow)) {
					System.out.println("Alphabet : " + chrS[sent] + " is a vowel");
				} else {
					System.out.println("Alphabet : " + chrS[sent] + " is NOT a vowel");
				}
			}
		}
	}

	// check if the int array has only odd numbers.
	public static void checkIfOdd() {
		int[] inty = new int[10];
		for (int i = 0; i < inty.length; i++) {
			inty[i] = i;
			if (inty[i] % 2 == 0) {
				System.out.println("uhmmm");
			} else {
				System.out.println("Odd number : " + inty[i]);
			}
		}
	}

	// Write Java program that checks if two arrays contain the same elements.
	public static void checkArrayWithSameElements() {
		Integer[] a1 = { 1, 2, 3, 2, 1 };
		Integer[] a2 = { 1, 2, 3 };
		Integer[] a3 = { 1, 2, 3, 4 };
		System.out.println(sameElement(a1, a2));
		System.out.println(sameElement(a1, a3));
	}

	public static boolean sameElement(Object array1, Object array2) {
		Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
		Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array1));
		if (uniqueElements1.size() != uniqueElements2.size()) {
			return false;
		}
		for (Object obj : uniqueElements1) {
			if (!uniqueElements2.contains(obj)) {
				return false;
			}
		}
		return true;
	}

	// working file open
	static boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		// read the file line by line
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println("All values are as follows : " + line);
			if (line.contains(str)) {
				System.out.println("Found  : " + line + " " + str);
				scanner.close();
				return true;
			}
		}
		scanner.close();
		return false;
	}

	public static void printSinglePatterns() {
		Scanner sc = new Scanner(System.in);
		// Taking rows value from the user
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// Close the resources
		sc.close();
	}

	public static void printDoublePattern() {
		Scanner sc = new Scanner(System.in);
		// Taking rows value from the user
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		// Printing upper half of the pattern
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// Printing lower half of the pattern
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// Closing the resources
		sc.close();
	}

	//Split the word into 2 part and find the sum of position of the character(s) present in both parts of the word. If A=1 and B=2 ...Z=26
	//EX : Fr a given Word "Venkat" split it into 2 equal parts and find the sum of the postions VEN / KAT 22+5+14= 41/ 11+1+20 =3
	//Part A	
	public static void numberGame(String str) {
		int len = str.length();
		int preCount = 0;
		int postCount = 0;
		if (len % 2 == 0) {
			System.out.println("string " + str + " is divisible by 2");
			char[] ch = str.toCharArray();
			int chLen = ch.length;
			System.out.println("value of chLen : " + chLen);
			for (int i = 0; i < ch.length / 2; i++) {
				System.out.println("Values of char (1st half) : " + ch[i]);
				preCount++;
			}
			for (int j = len - 1; j >= ch.length / 2; j--) {
				System.out.println("Values of char (2nd half) : " + ch[j]);
				postCount++;
			}
		} else {
			System.out.println("string " + str + " is not divisible by 2");
		}
		System.out.println("preCount : " + preCount + " " + "postCount " + postCount + " " + " also final sum is as follows : " + (preCount + postCount));
	}
	
	//Create a program that converts a phone number with letters to one with only numbers. 
	//Part A
	public static void checkStr(String str) {
		//String str = "123-647-EYES";
		char[] chOther = str.toCharArray();
		StringBuffer strA = new StringBuffer();
		StringBuffer strB = new StringBuffer();
		StringBuffer strF = new StringBuffer();
		
		for(int i = 0; i < chOther.length; i++) {
			if(chOther[i] >= 'A' && chOther[i] <= 'Z') {
				Character passValue = new Character(chOther[i]);
				strB.append(splitStrNCallAlphabet(passValue.toString()));
			} else if( (chOther[i] >= '0' && chOther[i] <= '9') || (chOther[i] == '-')) {
				strA.append(chOther[i]);
			} else {
				System.out.println("Ayy0 ayyo");
			}
		}
		
		strF.append(strA);
		strF.append(strB);
		
		System.out.println("string BufferA's value : " + strA);
		System.out.println("string BufferB's value : " + strB);
		System.out.println("string Buffer Final's value : " + strF);
		
	}
	
	//Create a program that converts a phone number with letters to one with only numbers. 
	//Part B
	public static int splitStrNCallAlphabet(String callStr) {
		char[] callStrCh = callStr.toCharArray();
		int number = 0;
		for(int i = 0; i < callStrCh.length; i++) {
			System.out.println("Values of character is as follows :  " + callStrCh[i]);
			if( 	   (callStrCh[i] == ('A')) 
					|| (callStrCh[i] == ('B')) 
					|| (callStrCh[i] == ('C'))
					|| (callStrCh[i] == ('D'))
					|| (callStrCh[i] == ('E'))
					|| (callStrCh[i] == ('F'))
					|| (callStrCh[i] == ('G'))
					|| (callStrCh[i] == ('H'))
					|| (callStrCh[i] == ('I'))
					|| (callStrCh[i] == ('J'))
					|| (callStrCh[i] == ('K'))
					|| (callStrCh[i] == ('L'))
					|| (callStrCh[i] == ('M'))
					|| (callStrCh[i] == ('N'))
					|| (callStrCh[i] == ('O'))
					|| (callStrCh[i] == ('P'))
					|| (callStrCh[i] == ('Q'))
					|| (callStrCh[i] == ('R'))
					|| (callStrCh[i] == ('S'))
					|| (callStrCh[i] == ('T'))
					|| (callStrCh[i] == ('U'))
					|| (callStrCh[i] == ('V'))
					|| (callStrCh[i] == ('W'))
					|| (callStrCh[i] == ('X'))
					|| (callStrCh[i] == ('Y'))
					|| (callStrCh[i] == ('Z'))
			) {
				@SuppressWarnings("removal")
				Character sampleChar = new Character(callStrCh[i]);
				number = giveNumberForAlphabet(sampleChar.toString());
				System.out.println("Value is as follows : " + number);
			}
		}		
		return number;		
	}
	
	//Create a program that converts a phone number with letters to one with only numbers. 
	//Part C
	public static int giveNumberForAlphabet(String str) {
		int num = 100;	
		if(str.equals("")) {
			 num = 0;
		}		
		if(str.equals("none")) {
			 num = 1;
		}		
		if((str.equals("A")) || (str.equals("B")) || (str.equals("C"))) {
			 num = 2;
		}		
		if((str.equals("D")) || (str.equals("E")) || (str.equals("F"))) {
			 num = 3;
		}		
		if((str.equals("G")) || (str.equals("H")) || (str.equals("I"))) {
			 num = 4;
		}		
		if((str.equals("J")) || (str.equals("K")) || (str.equals("L"))) {
			 num = 5;
		}		
		if((str.equals("M")) || (str.equals("N")) || (str.equals("O"))) {
			 num = 6;
		}		
		if((str.equals("P")) || (str.equals("Q")) || (str.equals("R")) || (str.equals("S"))) {
			 num = 7;
		}		
		if((str.equals("T")) || (str.equals("U")) || (str.equals("V")) ) {
			 num = 8;
		}		
		if((str.equals("W")) || (str.equals("X")) || (str.equals("Y")) || (str.equals("Z"))) {
			 num = 9;
		}		
		return num;
	}
	
	//A string divided by two and left to center is compared against right to center and the count generated and added.
	public static void partsOfStringCompared(String str) {
		
		char[] ch = str.toCharArray();
		int lenCh = ch.length;
		logger("Value of lenCh is as follows : ", Integer.toString(lenCh));
		StringBuffer finalChStrBuf = new StringBuffer();
		
		//HelloWorld
		logger("","");
		logger("","");
	
		for(int left = 0; left < lenCh/2; left++) {
			Character nCh = new Character(ch[left]);
			logger("Left value : ", nCh.toString());
		}

		logger("","");
		logger("","");
		
		for(int right = lenCh-1; right >= lenCh/2; right--) {
			Character nCh = new Character(ch[right]);
			logger("Left value : ", nCh.toString());
		}
		
		for(int left = 0; left < lenCh/2; left++) {
			logger("","");
			logger("","");
			logger(ch[left],"is the value of left");
			logger("","");
			logger("","");
			for(int right = lenCh-1; right >= lenCh/2; right--) {
				logger(ch[right],"is the value of right");
				if(ch[left] == ch[right]) {
					logger("match found : ", ch[left]);
					finalChStrBuf.append(ch[left]);					
				} 
			}
		}
		
		logger("StringBuffer value : ", finalChStrBuf);
		
	}
	
////	//How to find the maximum occurring character in a given String?
	public static void maxOccuranceOfStr() {
		String str = "HelloWorld";
		char[] ch = str.toCharArray();
		int len = ch.length;
		int count = 0;
		int valueAdd = 0;
		Map<Character, Integer> mHS = new HashMap<Character, Integer>();
		
		for(int leftToRight = 0; leftToRight < len; leftToRight++) {
		//	for(int rightToLeft = len-1; rightToLeft >= 0; rightToLeft--) {
		//		if(ch[leftToRight] == ch[rightToLeft]) {
					if(mHS.containsKey(ch[leftToRight])) {
						//Character ncTr = new Character(ch[leftToRight]);
						//String nStr = String.valueOf(ch[leftToRight]);
						//int nInt = Integer.parseInt(nStr);
						//Map.Entry<Character, Integer> gMHS = (Entry<Character, Integer>) mHS.entrySet();
						//mHS.put(ch[leftToRight], mHS.get(gMHS.getValue()+1));
						if(mHS.get(ch[leftToRight]) == null) {
							valueAdd++;
						} else {
							valueAdd = mHS.get(ch[leftToRight]) + 1;
						}			
						mHS.put(ch[leftToRight], valueAdd);
					} else {
						mHS.put(ch[leftToRight], 1);
					}
		//		}
		//	}
		}
		logger("value of hashMap key & respective values are as follows : ", mHS);
	}
	
	public static void maxOccuranceCharArray() {
		String str = "This is a string";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hMS = new HashMap<Character, Integer>();
		Integer nullValueAdd = 0;
		for(int i = 0; i < ch.length; i++) {
			if(hMS.get(ch[i]) == null) {
				nullValueAdd++;
			} else {
				nullValueAdd = hMS.get(ch[i])+1;
			}
			//if(hMS.putIfAbsent(ch[i], nullValueAdd) != null) {
			if(hMS.containsKey(ch[i])) {
				hMS.put(ch[i], nullValueAdd);
			} else {
				hMS.put(ch[i], 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> mHSM : hMS.entrySet()) {
			System.out.println("Keys and values are : " + mHSM.getKey() + " " + mHSM.getValue());
		}
	}
	
	public static void maxOccuranceCharacterArrayList() {
		String str = "This is a string";
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i = 0; i < al.size(); i++) {
			al.add(str.charAt(i));
		}
		System.out.println("ArrayList : " + al);
	}
	
	public static void printHashMapViaArrayList() {
		
		String str = "This is a string";
		ArrayList<Character> lAL = new ArrayList<Character>();
		for(int i = 0; i < str.length(); i++) {
			lAL.add(str.charAt(i));
		}
		
		logger("Print the value of Character list", lAL);
		
		HashMap<Character, Integer> hSM = new HashMap<Character, Integer>();
		for(int j = 0; j < str.length(); j++) {
			hSM.putIfAbsent(lAL.get(j),Collections.frequency(lAL,lAL.get(j)));
		}
		
		for (Map.Entry<Character, Integer> mHSM : hSM.entrySet()) {
			System.out.println("Character is :"+mHSM.getKey()+ " and its count is string is "+ mHSM.getValue());
		}
		

	}

	// java string methods:
	public static void javaStringMethods() {
		String str = "  This is a string  ";
		System.out.println("Before Trim() :::::" + str + ":::::");
		System.out.println("Removing leading and trailing spaces :::::" + str.trim() + ":::::");
	}

	// pass/return randomString
	public static String passString() {
		int length = 10;
		boolean useLetters = true;
		boolean useNumbers = false;
		String passString = RandomStringUtils.random(length, useLetters, useNumbers);
		return passString;
	}

	// pass/return randomIntegers
	public static Integer randInt() {
		Random rd = new Random();
		Integer passInteger = rd.nextInt();
		return passInteger;
	}
	
	public static void logger(String strA, String strB) {
		System.out.println(strA + " " + strB);
	}
	
	public static void logger(String strA, int strB) {
		System.out.println(strA + " " + strB);
	}
	
	public static void logger(int strA, String strB) {
		System.out.println(strA + " " + strB);
	}
	
	public static void logger(int strA, int strB) {
		System.out.println(strA + " " + strB);
	}
	
	public static void logger(char strA, String strB) {
		System.out.println(strA + " " + strB);
	}
	
	public static void logger(String strA, char strB) {
		System.out.println(strA + " " + strB);
	}
	
	public static void logger(char strA, char strB) {
		System.out.println(strA + " " + strB);
	}
	
	public static void logger(String strA, StringBuffer strB) {
		System.out.println(strA + " " + strB);
	}
	
//	public static void logger(String strA, Map<String, Integer> strB) {
//		System.out.println(strA + " " + strB);
//	}
	
	public static void logger(String strX, Map<Character, Integer> strB) {
		System.out.println(strX + " " + strB);
	}
	
	public static void logger(String strX, List<Character> strB) {
		System.out.println(strX + " " + strB);
	}
	

}
