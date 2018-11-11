package chapter09;

public class MultiplyNumbers implements  Chain{
	
	private Chain nextChain;
	
	public void setNextChain(Chain nextChain) {
		
		this.nextChain = nextChain;

	}

	public void calculate(Numbers requests) {
		if(requests.getCalculationwanted()== "sub")
		{
			System.out.println(requests.getNumber1() + " - " + getNumber2() + " = "  + (requests.getNumber1() - getNumber2()));
		}
		else
		{
			nextChain.calculate(requests);
		}

	}
}


