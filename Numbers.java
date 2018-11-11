package chapter09;

public class Numbers {
	public Numbers(double number1, double number2, String calculationwanted) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.calculationwanted = calculationwanted;
	}
	private int number1,number2;
	private String calculationwanted;
	public int getNumber1() {
		return number1;
	}
	public int getNumber2() {
		return number2;
	}
	public String getCalculationwanted() {
		return calculationwanted;
	}

	

}
