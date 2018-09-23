package com.inRhythm;

import com.inRhythm.pojo.SentenceObject;

public class Sentence {
	
	public SentenceObject wordLength(String s){
		String [] sentence = s.split(" ");
		String longestWord ="";
		SentenceObject senObject = new SentenceObject();

		for(String str : sentence)
		{
			if(str.length()>= longestWord.length())
			{
				longestWord = str;
				
				senObject.setWord(longestWord);
				senObject.setWordLength(longestWord.length());
			}
		}
		return senObject;
	}
}
