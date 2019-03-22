
/**
 * Write a description of class ListeTAB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListeTAB implements ListePointInterface
{

    Object tab[];
    int nbElem=0;

    public ListeTAB() {
        tab = new Object[100];
        nbElem=0;
    }

    /**
     * retourne la valeur du premier élément (la tête) de la liste sans destruction
     * simple lecture...
     * remarque :  on ne peut pas obtenir la tête d'une liste vide
     */ 
    public Object car() {

        return tab[nbElem - 1];

    }

    /**
     * supprime la tete de la liste
     * remarque :  on ne peut pas supprimer la tête d'une liste vide
     */
    public ListePointInterface cdr() {
    
    }

    /**
     * procédure : ajoute 'obj' au début de la liste;
     * la longueur de la liste est augmentée de 1
     */
    public ListePointInterface cons(Object objet) {
        tab[nbElem]= objet;
        nbElem++;
    }

    public ListePointInterface conc(ListePointInterface l1, ListePointInterface l2) {
    if (l1.listeVide()){
    return l2;
    }

    else {
    conc(l1.cdr(),l2).cons(l1.car());
    }

}
    
    /**
     * procédure : concatène la liste 'lst' à 'this'
     */
    public ListePointInterface conc(ListePointInterface lst ) {

    }

    /**
     * procédure : retourne la liste sur elle même
     */
    public ListePointInterface renverse(Object object) {
        for(int i=0; i=nbElem; i++){
            Object obj = Object[i];
            Object[i] = Object[nbElem];
            Object[nbElem] = obj;
        }
    }

    /**
     * prédicat : 'objet' appartient-il à la liste ?
     */ 
    public boolean membre(Object objet) {

    }

    /**
     * prédicat : 'this est-il une liste vide ?
     */
    public boolean listeVide() {
        return (nbElem==0);
    }

    /**
     * retourne le nombre d'éléments dans la liste
     */
    public int longueur() {
        return nbElem;
    }
}