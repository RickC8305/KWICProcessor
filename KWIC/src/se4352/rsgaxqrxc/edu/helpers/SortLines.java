/**
 * This function sorts lines
 */

package se4352.rsgaxqrxc.edu.helpers;

import java.util.Collections;
import java.util.List;

import se4352.rsgaxqrxc.edu.interfaces.ILine;
import se4352.rsgaxqrxc.edu.interfaces.ISubProcess;

public class SortLines implements ISubProcess{
	private List<ILine> lines;
	@Override
	/**
	 * this one runs subprocesses for KWICProcess
	 */
	public void RunSubProcess(List<ILine> lines) {
		// TODO Auto-generated method stub
		this.lines = lines;
		lines.sort(new LineSorter());;
	}
	/**
	 * gets the sorted lines as input
	 */
	@Override
	public List<ILine> getResult() {
		// TODO Auto-generated method stub
		return lines;
	}

}
