package se4352.rsgaxqrxc.edu.helpers;

import java.util.Comparator;

import se4352.rsgaxqrxc.edu.interfaces.ILine;

public class LineSorter implements Comparator<ILine> {

	@Override
	public int compare(ILine o1, ILine o2) {
		// TODO Auto-generated method stub
		return o1.getLine().compareTo(o2.getLine());
	}
	

}
