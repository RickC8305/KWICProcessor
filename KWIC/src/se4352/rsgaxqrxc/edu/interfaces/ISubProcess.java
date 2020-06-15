package se4352.rsgaxqrxc.edu.interfaces;

import java.util.List;

/**
 * implements a subprocess
 * @author rickc
 *
 */
public interface ISubProcess {
	public void RunSubProcess(List<ILine> lines);
	public List<ILine> getResult();
}
