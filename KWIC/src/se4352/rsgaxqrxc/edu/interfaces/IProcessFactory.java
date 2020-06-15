package se4352.rsgaxqrxc.edu.interfaces;
/**
 * this file creates a process
 * @author rickc
 *
 */
public interface IProcessFactory {
	ISubProcess getLineProcessor();
	ISubProcess getLineSorter();
	IProcess getKWICProcess();
}
