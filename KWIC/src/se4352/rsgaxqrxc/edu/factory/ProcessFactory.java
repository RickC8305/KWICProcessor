package se4352.rsgaxqrxc.edu.factory;
/**
 * This file creates process
 */
import se4352.rsgaxqrxc.edu.helpers.ProcessLines;
import se4352.rsgaxqrxc.edu.helpers.SortLines;
import se4352.rsgaxqrxc.edu.interfaces.IProcess;
import se4352.rsgaxqrxc.edu.interfaces.IProcessFactory;
import se4352.rsgaxqrxc.edu.interfaces.ISubProcess;
import se4352.rsgaxqrxc.edu.kwicprocess.KWICProcess;

public class ProcessFactory implements IProcessFactory{
	private static ISubProcess lineProcessor = null;
	private static ISubProcess sortProcessor = null;
	private static IProcessFactory instance = null;
	private static IProcess kwicProcess = null;
	private ProcessFactory() {
		
	}
	/**
	 * This function creates KWICProcess
	 * @return kwicProcess
	 */
	public IProcess getKWICProcess() {
		if(ProcessFactory.kwicProcess == null) {
			ProcessFactory.kwicProcess = new KWICProcess();
		}
		return kwicProcess;
	}
	/**
	 * This function gets an instance of itself
	 * @return instance
	 */
	public static IProcessFactory getInstance() {
		if(ProcessFactory.instance == null) {
			ProcessFactory.instance = new ProcessFactory();
		}
		return ProcessFactory.instance;
	}
	/**
	 * this function gets processor which will do circular shift
	 * @return lineProcessor
	 */
	@Override
	public ISubProcess getLineProcessor() {
		// TODO Auto-generated method stub
		if(ProcessFactory.lineProcessor == null) {
			ProcessFactory.lineProcessor = new ProcessLines();
		}
		return ProcessFactory.lineProcessor;
	}
	/**
	 * this function gets the line sorter which will sort the lines for input
	 * no return
	 */
	@Override
	public ISubProcess getLineSorter() {
		// TODO Auto-generated method stub
		if(ProcessFactory.sortProcessor == null) {
			ProcessFactory.sortProcessor = new SortLines();
		}
		return null;
	}

}
