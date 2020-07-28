package se4352.rsgaxqrxc.edu.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import se4352.rsgaxqrxc.edu.interfaces.IWord;

public class Word implements IWord {
	private String word;
	private static String [] stopWords = { "a", "an", "the", "of", "in"};
	private static List<String> stopList = new ArrayList<>(); 
	private static boolean initialized = false;
	private static void init()
	{
		if(initialized)
			return;
		
		initialized = true;
		
		stopList = Arrays.asList(stopWords);
	}
	
	public Word(String word)
	{
		init();
		this.word = word;
		
	}
	@Override
	public boolean isStopWord() {
		// TODO Auto-generated method stub
		if(stopList.contains(this.word))
			return true;
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.word);
	}

	@Override
	public String getWord() {
		// TODO Auto-generated method stub
		return this.word;
	}

}
