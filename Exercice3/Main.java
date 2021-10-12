package Exercice3;

/**

On cherche `a ´evaluer une expression arithmetique simple, representé par un arbre.
On veut un type commun Expr représentant des expressions arithmétiques, pouvant être
soit de valeur réelle (Value) soit une opération d’addition (Add), permettant l’addition
entre deux expressions. On veut pouvoir évaluer la valeur d’une expression au moyen
d’une méthode eval().


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
