package se4352.rsgaxqrxc.edu.helpers;
import java.util.ArrayList;
/**
 * implements KWICProcess(does the circular shift for the line)
 */
import java.util.List;

import se4352.rsgaxqrxc.edu.interfaces.ILine;
import se4352.rsgaxqrxc.edu.interfaces.ISubProcess;
import se4352.rsgaxqrxc.edu.interfaces.IWord;
import se4352.rsgaxqrxc.edu.models.Line;

public class ProcessLine implements ISubProcess{
	private List<ILine> lines;
	private List<ILine> output;
	/**
	 * this function runs subprocess which runs each part of the KWIC Process
	 */

	@Override
	public void RunSubProcess(List<ILine> lines) {
		// TODO Auto-generated method stub
		this.lines = lines;
		output = new ArrayList<>();
		ILine line = this.lines.get(0);
		line.tokenize();
		List<IWord> words = line.getWords();
		int index = 0;
		for(IWord word: words)
		{
			if(word.isStopWord())
			{
				index++;
				continue;
			}
			
			StringBuilder sb1 = new StringBuilder("/");
			for(int i = 0; i < index;i++)
			{
				
			  String w = words.get(i).getWord();
			  sb1.append(w);
			  sb1.append(" ");
			  
			}
			
			StringBuilder sb2 = new StringBuilder(" ");
			for(int i = index+1 ; i < words.size();i++)
			{
				
			  String w = words.get(i).getWord();
			  sb2.append(w);
			  sb2.append(" ");
			  
			}
			ILine pline  = new Line(word + sb2.toString()+sb1.toString());
			output.add(pline);
			
		}
		
		
		
	}
	/**
	 * this one gets the result of the circular shift
	 */
	@Override
	public List<ILine> getResult() {
		// TODO Auto-generated method stub
		return output;
	}

}
