package chapter09;

public class TestCalculation {

	public static void main(String[] args) {
		Chain chaincalc1 = new AddNumbers();
		Chain chaincalc1= new SubNumbers();
		Chain chaincalc1 = new MultiplyNumbers();
		Chain chaincalc1 = new DivideNumbers();
		chaincalc1.setNextChain(chaincalc1);
		Chain chaincalc2;
		chaincalc2.setNextChain(chaincalc2);
		chaincalc3.setNextChain(chaincalc3);
		Numbers requests =new Numbers(4.0 , 2.0, add);
		chaincalc1.calculate(requests); 
	}

}
