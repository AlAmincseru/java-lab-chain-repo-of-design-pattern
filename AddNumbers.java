package chapter09;

public class AddNumbers implements Chain {

	private Chain nextInChain;
	public void setNextChain(Chain NextChain) {
		this.nextInChain = NextChain;

	}

	public void calculate(Numbers requests) {
		if(requests.getCalculationwanted()== "add")
		{
			System.out.println(requests.getNumber1() +" + "+ getNumber2() + " = " +(requests.getNumber1() + getNumber2()));
		}
		else
		{
			nextInChain.calculate(requests);
		}

	}

}
