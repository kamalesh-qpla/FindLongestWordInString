package com.inRhythm.pojo;

import java.util.ArrayList;
import java.util.List;

public class SentenceObject {

	private List<String> word;
	private int wordLength;
	
	public List<String> getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word.add(word);// = new ArrayList<String>().add(word);
	}
	public int getWordLength() {
		return wordLength;
	}
	public void setWordLength(int wordLength) {
		this.wordLength = wordLength;
	}
	
}
