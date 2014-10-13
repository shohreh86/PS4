package MainPackage;

import javax.swing.JTextField;

public class calculator {
	

	public double returnFutureValue1(double starting, double years, double rate) {
		
		return (int)(starting * Math.pow((1 + rate/100), years));
		
	}

	public double returnFutureValue(double starting, double rate, JTextField years) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}