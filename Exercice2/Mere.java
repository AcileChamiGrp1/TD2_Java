package Exercice2;

import java.io.IOException;

/**REGLES A CONNAITRE POUR L'EXERCICE
* redefinition : dans la classe fille, s'il y a des modificateurs public, alors dans la classe mere on pourra utiliser public, protected, private ou même "sans modificateur"
* Mais si dans la classe fille il y a protected, on pourra utiliser private et protected; 
* donc, en résumé, on utilise soit le même mode acces ou alors ce qui est en dessosu.
* si dans la classe fille on a pas de modificateur, on pourra utiliser tout sauf public
* si il y  a private, on pourra juste utiliser private
* si on fait autre chose, il y aura erreur de compil
* si la methode dans la classe mere va returner une exception (ex : thow exceptionn),alors dans la classe fille il doit retourner qqch du même niveau (throw exception)
* si la methode dans la classe mere va returner thow IO exception) alors dans la classe fille il doit retourner qqch du même niveau,càdire thow IO exception
* si type primitif alors dans redefinition le même type
* si type objet alors dans refinition le meme type OU sous type
*/

class Mere {

	public void a() {System.out.println("Mere_a"); }
	void b(Fille fille) {System.out.println("Mere_b(Fille)");}
	
	void c() {System.out.println("Mere_c");}                            // Ici, on a une surcharge pour la méthode c().
	void c(Mere mere) {System.out.println("Mere_c(Mere)"); }
	
	static void d() {System.out.println("static Mere_d");}
	
	
	private void f() {System.out.println("Mere_f");}
	public void printF() { f(); }
	
	Object g() {System.out.println("Mere_g"); return 2;}
    
	 }

/** 
 
1. Quelles sont les erreurs de compilation et pourquoi ?

Dans la classe Fille, pour la méthode "b", le modificateur utilisé est Protected. Or, dans la classe Mère, il n'y a pas de modificateur : il devrait y en avoir un (soit Protected, soit Private).
Et pour la méthode "l", dans la classe Fille, celle-ci ne retourne pas d'exception, or que dans la classe Mère si. Si l'une retourne une exception, alors l'autre doit la retourner aussi.
Dans la classe Mère,la methode "j" retourne Exception. Or, celle dans la classe Fille retourne IOException. Elles doivent retourner la même chose cependant. 
Il est en de même pour les méthodes "k", "l", "m".
En ce qui concerne les méthodes i et h, elles ont des signatures différentes (dans la classe Mère et dans la classe Fille).
Il n'y a pas de méthode MIAGE dans la classe Mère alors qu'il y en a une dans la classe Fille.

2. Retirer les méthodes provoquant des erreurs.

On retire donc les méthodes suivantes : b, l, k, m, i et h. On retire la méthode MIAGE également apparaissant dans la classe Fille et Main.

3. Rappeler ce qu'est une redéfinition et une surcharge. Et indiquer où sont les surcharges et où sont les redéfinitions ici.

Une surcharge : En programmation orientée objet, la surcharge, aussi appelée « overloading », consiste à déclarer, dans une même classe, deux méthodes de même nom mais avec des sémantiques différentes :
Même nom de méthode,
Paramètres différents (soit sur le nombre ou le/les type(s)),
Le type de retour n’est pas pris en compte.

Une redéfinition : Aussi appelée « overriding », consiste à définir le comportement d’une méthode selon le type de l’objet qui l’invoque, i.e., 
elle consiste à donner une nouvelle implémentation à une méthode héritée sans changer sa signature :
Le même nom de méthode
Même type de retour
Même paramètre (nombre et type)

--> Voir commentaires dans le code pour voir où sont les surcharges et les rédefinitions.

4. Expliquer chaque affichage

*/

 
