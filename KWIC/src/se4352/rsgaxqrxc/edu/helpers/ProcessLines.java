package se4352.rsgaxqrxc.edu.helpers;
/**
 * implements KWICProcess(does the circular shift for the line)
 */
import java.util.List;

import se4352.rsgaxqrxc.edu.interfaces.ILine;
import se4352.rsgaxqrxc.edu.interfaces.ISubProcess;

public class ProcessLines implements ISubProcess{
	private List<ILine> lines;
	/**
	 * this function runs subprocess which runs each part of the KWIC Process
	 */
	@Override
	public void RunSubProcess(List<ILine> lines) {
		// TODO Auto-generated method stub
		this.lines = lines;
		
	}
	/**
	 * this one gets the result of the circular shift
	 */
	@Override
	public List<ILine> getResult() {
		// TODO Auto-generated method stub
		return lines;
	}

}
