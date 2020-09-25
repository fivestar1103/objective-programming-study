package calculator;

public class number {
	private int ret = 0;
	
	// setter
	public void setNumber(double tmp) {
		double currentNumber = (int)tmp;
		if(currentNumber != tmp) {
			System.out.println("enter an integer!");
		}
		else {
			this.ret = this.ret * 10 + (int)currentNumber;
			System.out.println(this.ret);
		}
	}
}
