
/**
 * Abstract class ListeAbstract - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ListeAbstract extends ListeTAB
{
    /**
     * retourne la valeur du premier élément (la tête) de la liste sans destruction
     * simple lecture...
     * remarque :  on ne peut pas obtenir la tête d'une liste vide
     */ 
    public abstract Object car();

    /**
     * supprime la tete de la liste
     * remarque :  on ne peut pas supprimer la tête d'une liste vide
     */
    public abstract ListePointInterface cdr(); 

    /**
     * procédure : ajoute 'obj' au début de la liste;
     * la longueur de la liste est augmentée de 1
     */
    public abstract ListePointInterface cons(Object objet);

    /**
     * procédure : concatène la liste 'lst' à 'this'
     */
    public ListePointInterface conc(ListePointInterface lst );

    /**
     * procédure : retourne la liste sur elle même
     */
    public ListePointInterface renverse();

    /**
     * prédicat : 'objet' appartient-il à la liste ?
     */ 
    public boolean membre(Object objet);

    /**
     * prédicat : 'this est-il une liste vide ?
     */
    public boolean listeVide();

    /**
     * retourne le nombre d'éléments dans la liste
     */
    public int longueur();  
}

