package exercice1;

	class Main1 {
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
	
	// 2. S'il est dans Fille, à combien de méthodes meth() un objet de type Fille à accès (et comment il y accède)? Et s'il est dans Main?
    // Voir réponses à coté des écritures.
	// La classe Fille n'a accès seulement à sa méthode meth et pas à celle de la mère car elle a réécrit cette méthode dans sa classe.
    // Si elle avait pas la méthode elle aurait eu accès à celle de la classe mère.

	// 3. Si les méthodes meth() sont statiques : 
	//1 --> affiche 42
	//2 --> affiche 42
	//3 --> affiche 24
	//4 --> affiche 42
	//5 --> affiche 42
	//6 --> affiche 42

	// 4. Et si meth sont maintenant des champs ? Pourquoi ?
	// Ce sera la même chose que dans la question 3
	// Car quand une methodé invoque un champs, elle va appeler le champs qui est propre a sa classe, meme si c'est la classe fille qui appelle la methode.
	//1 --> affiche 42
	//2 --> affiche 42
	//3 --> affiche 24
	//4 --> affiche 42
	//5 --> affiche 42
	//6 --> affiche 42
}


