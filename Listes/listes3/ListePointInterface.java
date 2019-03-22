
/**
 * D�crivez votre interface LPointeeI ici.
 * 
 * @author  (votre nom) 
 * @version (un num�ro de version ou une date)
 */

public interface ListePointInterface  extends Iterable , Cloneable
{
    /**
     * retourne la valeur du premier �l�ment de la liste sans destruction
     */ 
     Object car() throws  ListeVideException;
    /**
     * supprime la tete de la liste
     * remarque :  on ne peut pas supprimer la t�te d'une liste vide
     */
     void cdr() throws ListeVideException;    
    /**
     * ajoute 'obj' au d�but de la liste;
     * la longueur de la liste est augment�e de 1
     */
    public void cons(Object objet);
    /**
     * ajoute en fin de liste la liste 'liste' : c'est la concat�nation
     */
    public void conc(ListePointInterface liste );
    /**
     * retourne la liste sur elle m�me
     */
    public void renverse();
/**
 * 'objet' appartient-il � la liste ?
 */ 
    public boolean membre(Object objet);
    /**
     * 
     */
    public boolean listeVide();
    /**
     * retourne le nombre d'�l�ments dans la liste
     */
    public int longueur();
    
 
    
    
    /*
     *  toString() , equals(), �  sont "impos�e" par Java => elles ne figurent pas dans cette interface
     */
    
    
    
    
    
    
    
    
    
    //public java.util.Iterator<Object> iterator();
    public java.util.Iterator iterator();

}
