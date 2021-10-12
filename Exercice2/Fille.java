package Exercice2;

    class Fille extends Mere {
   
    	public void a() {System.out.println("Fille_a"); }
    	
    	protected void b(Fille fille) {System.out.println("Fille_b(Fille)");}
    
    	public void c(Mere mere) {System.out.println("Fille_c(Mere)");}  // Ici on a une surcharge pour la méthode c()
    	void c(Fille b) {System.out.println("Fille_c(Fille)"); }
    	
    	static void d() {System.out.println("static Fille_d");}          // Ici on a une surcharge pour la méthode d()
    	static void d(Mere mere) {System.out.println("Fille_d(Mere)");}
    	
    	
    	protected void f() {System.out.println("Fille_f");}
    	
    	String g() {System.out.println("Fille_g"); return "c";}
    	
    	
}
