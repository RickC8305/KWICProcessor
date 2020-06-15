package se4352.rsgaxqrxc.edu;
/**
 * creates main process, runs everything, gets result
 */
import java.util.ArrayList;
import java.util.List;

import se4352.rsgaxqrxc.edu.factory.ProcessFactory;
import se4352.rsgaxqrxc.edu.interfaces.ILine;
import se4352.rsgaxqrxc.edu.interfaces.IProcess;
import se4352.rsgaxqrxc.edu.interfaces.IProcessFactory;

public class Main {
	public static void main(String[] args) {
		IProcessFactory factory = ProcessFactory.getInstance();
		List<ILine> lines = new ArrayList<>();
		IProcess process = factory.getKWICProcess();
		process.init(lines);
		process.runProcess();
		List<ILine> output = process.getResults();
	}
	

}
