
/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class HelloWorld {
    public String bonjour(){ 
        return "Bonjour tout le monde...";
    } 
    // pour être présentée sur la sortie courante toute classe contiendra une méthode de signature  
    // public String toString(){...} qui surcharge cette même méthode de la classe "Object"
    public String toString() { 
        return bonjour();
    } 
}