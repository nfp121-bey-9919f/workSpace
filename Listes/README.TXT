------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:


public interface ListePointInterface{
    /**
     * retourne la valeur du premier élément (la tête) de la liste sans destruction
     * simple lecture...
     * remarque :  on ne peut pas obtenir la tête d'une liste vide
     */ 
     Object car();
    /**
     * supprime la tete de la liste
     * remarque :  on ne peut pas supprimer la tête d'une liste vide
     */
     void cdr(); 
    /**
     * procédure : ajoute 'obj' au début de la liste;
     * la longueur de la liste est augmentée de 1
     */
    public void cons(Object objet);
    /**
     * procédure : concatène la liste 'lst' à 'this'
     */
    public void conc(ListePointInterface lst );
    /**
     * procédure : retourne la liste sur elle même
     */
    public void renverse();
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
