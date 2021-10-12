package Exercice2;

import java.io.IOException;

/**REGLES A CONNAITRE POUR L'EXERCICE
* redefinition : dans la classe fille, s'il y a des modificateurs public, alors dans la classe mere on pourra utiliser public, protected, private ou m�me "sans modificateur"
* Mais si dans la classe fille il y a protected, on pourra utiliser private et protected; 
* donc, en r�sum�, on utilise soit le m�me mode acces ou alors ce qui est en dessosu.
* si dans la classe fille on a pas de modificateur, on pourra utiliser tout sauf public
* si il y  a private, on pourra juste utiliser private
* si on fait autre chose, il y aura erreur de compil
* si la methode dans la classe mere va returner une exception (ex : thow exceptionn),alors dans la classe fille il doit retourner qqch du m�me niveau (throw exception)
* si la methode dans la classe mere va returner thow IO exception) alors dans la classe fille il doit retourner qqch du m�me niveau,c�dire thow IO exception
* si type primitif alors dans redefinition le m�me type
* si type objet alors dans refinition le meme type OU sous type
*/

class Mere {

	public void a() {System.out.println("Mere_a"); }
	void b(Fille fille) {System.out.println("Mere_b(Fille)");}
	
	void c() {System.out.println("Mere_c");}                            // Ici, on a une surcharge pour la m�thode c().
	void c(Mere mere) {System.out.println("Mere_c(Mere)"); }
	
	static void d() {System.out.println("static Mere_d");}
	
	
	private void f() {System.out.println("Mere_f");}
	public void printF() { f(); }
	
	Object g() {System.out.println("Mere_g"); return 2;}
    
	 }

/** 
 
1. Quelles sont les erreurs de compilation et pourquoi ?

Dans la classe Fille, pour la m�thode "b", le modificateur utilis� est Protected. Or, dans la classe M�re, il n'y a pas de modificateur : il devrait y en avoir un (soit Protected, soit Private).
Et pour la m�thode "l", dans la classe Fille, celle-ci ne retourne pas d'exception, or que dans la classe M�re si. Si l'une retourne une exception, alors l'autre doit la retourner aussi.
Dans la classe M�re,la methode "j" retourne Exception. Or, celle dans la classe Fille retourne IOException. Elles doivent retourner la m�me chose cependant. 
Il est en de m�me pour les m�thodes "k", "l", "m".
En ce qui concerne les m�thodes i et h, elles ont des signatures diff�rentes (dans la classe M�re et dans la classe Fille).
Il n'y a pas de m�thode MIAGE dans la classe M�re alors qu'il y en a une dans la classe Fille.

2. Retirer les m�thodes provoquant des erreurs.

On retire donc les m�thodes suivantes : b, l, k, m, i et h. On retire la m�thode MIAGE �galement apparaissant dans la classe Fille et Main.

3. Rappeler ce qu'est une red�finition et une surcharge. Et indiquer o� sont les surcharges et o� sont les red�finitions ici.

Une surcharge : En programmation orient�e objet, la surcharge, aussi appel�e � overloading �, consiste � d�clarer, dans une m�me classe, deux m�thodes de m�me nom mais avec des s�mantiques diff�rentes :
M�me nom de m�thode,
Param�tres diff�rents (soit sur le nombre ou le/les type(s)),
Le type de retour n�est pas pris en compte.

Une red�finition : Aussi appel�e � overriding �, consiste � d�finir le comportement d�une m�thode selon le type de l�objet qui l�invoque, i.e., 
elle consiste � donner une nouvelle impl�mentation � une m�thode h�rit�e sans changer sa signature :
Le m�me nom de m�thode
M�me type de retour
M�me param�tre (nombre et type)

--> Voir commentaires dans le code pour voir o� sont les surcharges et les r�definitions.

4. Expliquer chaque affichage

*/

 
