package se4352.rsgaxqrxc.edu.models;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import se4352.rsgaxqrxc.edu.interfaces.ILine;
import se4352.rsgaxqrxc.edu.interfaces.IWord;

public class Line implements ILine {
	private String line;
	private List<IWord> words;
	public Line (String line) {
		this.line = line;
		words = new ArrayList<>();
	}
	@Override
	public void tokenize() {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(this.line);
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			IWord word = new Word(token);
			words.add(word);
		}
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.line);
	}
	@Override
	public List<IWord> getWords() {
		// TODO Auto-generated method stub
		return this.words;
	}
	@Override
	public String getLine() {
		// TODO Auto-generated method stub
		return this.line;
	}

}
