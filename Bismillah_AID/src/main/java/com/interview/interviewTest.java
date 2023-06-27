package com.interview;

import java.util.*;

public class interviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse a string:
		
		//Method 1:
		
		String str = "Saket Saurav";
		char chars[] = str.toCharArray();
		for(int i = chars.length-1; i >= 0; i--) {
			System.out.println(chars[i]);
		}
		
		//Method 2:
		
		String strA = "second method";
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(strA);
		strBuilder = strBuilder.reverse();
		System.out.println(strBuilder);
		
		//Swap two numbers using 
		int x, y;
		x = 10;
		y = 20;
		
		System.out.println("Print the following values : " + x + " " + y + " ");
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("Print the following values : " + x + " " + y + " ");
		
		/////	List
		
		//ArrayList 
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("knowall");
		list.add("12@#$%");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String strL : list) {
			
			System.out.println("strL : " + strL);
			
		}
		
		//Sorting arrayList
		Collections.sort(list);
		System.out.println("list : " + list);
		
		//LinkedList 
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("linked list 1");
		al.add("linked list 2");
		
		Iterator ll = al.listIterator();
		while(ll.hasNext()) {
			System.out.println(ll.next());
		}
		
		for(String stral : al) {
			System.out.println("stral : " + stral);
		}
		
		list.clear();
		
		/////	Set
		
		//HashSet
		Set<String> mySubject = new HashSet<String>();
		
		mySubject.add("Java");
		mySubject.add("C++");
		mySubject.add("C");
		
		for(String subJect : mySubject) {
			
			System.out.println("subJect : " + subJect);
		}
		
		Iterator itrmySub = mySubject.iterator();
		while(itrmySub.hasNext()) {
			System.out.println("itrmySub : " + itrmySub.next());
		}
		
		
		///// Map
		
		// Map
		
		Map map = new HashMap();
		
		map.put(1, "amit");
		map.put(2, "kumar");
		map.put(3, "welcome");
		
		Set set = map.entrySet();
		Iterator itrW = set.iterator();
		
		while(itrW.hasNext()) {
			Map.Entry entry = (Map.Entry)itrW.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		///// Find repeatable characters in a string.
		
        String strC = "This this is is done by Saket Saket";
        String[] split = strC.split(" ");
         
        HashMap<String,Integer> mapx = new HashMap<String,Integer>();
        
        for (int i=0; i<split.length; i++) {
            if (mapx.containsKey(split[i])) {
                int count = mapx.get(split[i]);
                mapx.put(split[i], count+1);
            }
            else {
            	mapx.put(split[i], 1);
            }
        }
        
        System.out.println(mapx);
        
        
        // Write a hashMap and print it
        
        HashMap<String, Integer> nhM = new HashMap<String, Integer>();
        nhM.put("a", 1);
        nhM.put("b",  2);
        
        Set setx = nhM.entrySet();
        
        Iterator itrnHm = setx.iterator(); 
        while(itrnHm.hasNext()) {
        	Map.Entry entryx = (Map.Entry)itrnHm.next();
        	System.out.println("New values " + entryx.getKey() + " " + entryx.getValue());
        }
        
		Iterator itdrt = nhM.entrySet().iterator();
		Map.Entry tryu = (Map.Entry)itdrt.next();
		System.out.println("New values new " + tryu.getKey() + " " + tryu.getValue());
		
		for(Map.Entry nameMe : nhM.entrySet()) {
			System.out.println(nameMe.getKey());
		}
		
		// write an array list and iterate thro it.
		
		ArrayList<String> altr = new ArrayList<String>();
		altr.add("New values");
		altr.add("12345");
		
		Iterator itrAltr = altr.iterator();
		while(itrAltr.hasNext()) {
			System.out.println(itrAltr.next());
		}
		
		for(int i = 0; i < altr.size(); i++) {
			System.out.println(altr.get(i));
		}
		
		for(Object obt : altr) {
			System.out.println(obt);
		}
		
		// Duplicate character in an array.
		
        String strDup = new String("Sakkett");
        int count = 0;
        char[] charsDup = strDup.toCharArray();
        System.out.println("Duplicate characters are:");
        for (int i=0; i < strDup.length();i++) {
                    for(int j=i+1; j < strDup.length();j++) {
                               if (charsDup[i] == charsDup[j]) {
                                          System.out.println(charsDup[j]);
                                          count++;
                                          break;
                                }
                     }
         }
		
	}

}
