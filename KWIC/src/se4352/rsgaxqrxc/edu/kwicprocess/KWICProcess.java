package se4352.rsgaxqrxc.edu.kwicprocess;

import java.util.ArrayList;
import java.util.List;

import se4352.rsgaxqrxc.edu.factory.ProcessFactory;
import se4352.rsgaxqrxc.edu.interfaces.ILine;
import se4352.rsgaxqrxc.edu.interfaces.IProcess;
import se4352.rsgaxqrxc.edu.interfaces.IProcessFactory;
import se4352.rsgaxqrxc.edu.interfaces.ISubProcess;

/**
 * implements main KWIC process
 * @author rickc
 *
 */
public class KWICProcess implements IProcess{
	private List<ILine> lines; 
	private IProcessFactory factory;
	
	
	/**
	 * this function takes a list of lines and initializes the process
	 * @param lines
	 */
	@Override
	public void init(List<ILine> lines) {
		// TODO Auto-generated method stub
		this.lines = lines;
		this.factory = ProcessFactory.getInstance();
		
	}
	/**
	 * this function creates and runs the process
	 */
	@Override
	public void runProcess() {
		// TODO Auto-generated method stub
		ISubProcess processLines = this.factory.getLineProcessor();
		for(ILine line : lines) {
			List<ILine> pline = new ArrayList<>();
			pline.add(line);
			processLines.RunSubProcess(pline);
			List<ILine> rlines = processLines.getResult();
			for(ILine oline :rlines)
			{
				oline.print();
			}
			ISubProcess sortLines = this.factory.getLineSorter();
			sortLines.RunSubProcess(rlines);
			List<ILine> output = sortLines.getResult();
			for(ILine oline : output)
			{
				oline.print();
			}

			
		}
			
		
	}
	/**
	 * this functions gets results from the process
	 * @return output
	 */
	@Override
	public List<ILine> getResults() {
		// TODO Auto-generated method stub
		return null;
	}

}
