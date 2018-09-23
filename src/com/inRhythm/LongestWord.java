package com.inRhythm;
import java.util.*;
class LongestWord{
	private static List<String> word=new ArrayList<String>();
	String str = "but Ram is a boy but not a girls";
	String stringArray[] = str.split("\\s");
	LongestWord() {
		int maxLen=0;       
		for (int i = 0; i < stringArray.length; i++) {
			if(maxLen < stringArray[i].length()){
				maxLen=stringArray[i].length();
			}		
		}		
		for (int i = 0; i < stringArray.length; i++){
			if(stringArray[i].length()==maxLen){
				LongestWord.word.add(stringArray[i]);
			}
		}
		System.out.println("Longest word lenght = " + maxLen);
	}
	public static void main(String[] args) {
		new LongestWord();
		Set<String> largestWord = new HashSet<String>(word);
		System.out.println("Longest word = " + largestWord);

	}
}
