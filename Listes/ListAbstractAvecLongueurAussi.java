 

/**
 *
 * @author ppfar
 */
public abstract class ListAbstractAvecLongueurAussi implements ListInt {



    @Override
    public boolean membre(Object a) {
        /*
        if (car().equals(a)) return true;
        else return cdr().membre(a);
        */
        // dans l'expression a || b java verifie si a est vraie si c'est le cas n'essaye pas d'évaluer b puisque la réponse sera tjs vraie
        //ainsi membre devien
        return (car().equals(a) ||  cdr().membre(a));
    }

    @Override
    public ListInt conc(ListInt lst) {
       // si l1 non nil conc l1 l2 = cons (car l1) (conc (cdr l1) l2)
       if (listeVide()) return lst;
       else return cdr().conc(lst).cons(car()); // cons (car l1) (conc (cdr l1) lst)
    }

    @Override
    public ListInt renverse() {
       // renverse l = conc (renverse (cdr l)) (car l)) 
       if (listeVide()) return this;
       else return cdr().renverse().conc(car());
    }

    @Override
    public boolean listeVide() {
        return (longueur()==0);
    }
    
    /**
     * retourne le nombre d'éléments dans la liste
     * @return 
     */
    @Override
    public int longueur() {
        return (listeVide() ? 0 : cdr().longueur() + 1);
    }
    
}
