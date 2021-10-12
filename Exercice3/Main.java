package Exercice3;

/**

On cherche `a �evaluer une expression arithmetique simple, represent� par un arbre.
On veut un type commun Expr repr�sentant des expressions arithm�tiques, pouvant �tre
soit de valeur r�elle (Value) soit une op�ration d�addition (Add), permettant l�addition
entre deux expressions. On veut pouvoir �valuer la valeur d�une expression au moyen
d�une m�thode eval().


*/

public class Main {

	public static void main(String[] args) {
		
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //affiche 1337.0
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //affiche 1664.0
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		
	}
}
