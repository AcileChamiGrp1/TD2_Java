package exercice1;

	class Fille extends Mere {
		public int meth() {
			return 24;
		}
	}
	class Main {
		public static void main(String[] args) {
			Mere mere = new Mere();
			System.out.println(mere.meth()); // affiche 42 (Q1)
			mere.printMeth();                // affiche 42 (Q1)
			
			Fille fille = new Fille();
			System.out.println(fille.meth()); // affiche 24 (Q1)
			fille.printMeth();                // affiche 24 (Q1)
			
			Mere mereFille = new Fille();
			System.out.println(mereFille.meth()); // affiche 24 (Q1)
			mereFille.printMeth();                // affiche 24 (Q1)
		}
	}
	
	// 2. S'il est dans Fille, � combien de m�thodes meth() un objet de type Fille � acc�s (et comment il y acc�de)? Et s'il est dans Main?


	// 3. Si les m�thodes meth() sont statiques : 
	//1 --> affiche 42
	//2 --> affiche 42
	//3 --> affiche 24
	//4 --> affiche 42
	//5 --> affiche 42
	//6 --> affiche 42

	// 4. Et si meth sont maintenant des champs ? Pourquoi ?
	// Ce sera la m�me chose que dans la question 3
	//1 --> affiche 42
	//2 --> affiche 42
	//3 --> affiche 24
	//4 --> affiche 42
	//5 --> affiche 42
	//6 --> affiche 42