 

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Interface de liste immutable
 * cons, cdr, créer une nouvelle liste sans modifié la liste courante
 * @author Pascal Fares
 */
public interface ListInt {
    

    //Les 3 méthode de bases
    public ListInt cons(Object o);
    
    public ListInt cdr();
    
    public Object car();
    //Les méthodes qui seront basée uniquement sur car,cdr,cons
    public boolean membre(Object a);
    /**
     * Nouvelle liste fusionnée de this et lst
     * ou ajouter un element a la fin de la liste
     * @param lst
     * @return 
     */
    public ListInt conc(ListInt lst);
    public ListInt conc(Object o);
    /**
     * Nouvelle liste inversé
     * @return 
     */
    public ListInt renverse();
    /**
     * 
     * @return 
     */
    public boolean listeVide();
    /**
     * retourne le nombre d'éléments dans la liste
     * @return 
     */
    public int longueur();
}
