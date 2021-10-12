package Exercice3;

public class Value extends Expr {

	public double val ;
	public Value(double expr) {
		this.val = expr ;
	}
	
	public double eval() {
		return val;
	}
}
