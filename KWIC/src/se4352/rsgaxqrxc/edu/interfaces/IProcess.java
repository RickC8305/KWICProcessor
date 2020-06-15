package se4352.rsgaxqrxc.edu.interfaces;

import java.util.List;

/**
 * This will be used to represent a process
 * @author rickc
 *
 */
public interface IProcess {
	public void init(List<ILine> lines);
	public void runProcess();
	public List<ILine> getResults();
	
}
