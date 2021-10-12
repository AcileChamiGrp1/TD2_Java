package Exercice3;

public class Add extends Expr {

	public double number1 ;
	public double number2 ;
	public double result ;
	
	public Add(number1, number2) {
		this.number1 = expr ;
		this.number2 = expr ;
		
		this.result = number1.eval() + number2.eval();
	}
	
	public double eval() {
		
		return this.result;
	}
	
}
