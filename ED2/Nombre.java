
/**
 * Write a description of class Nombre here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nombre implements Exp
{
    private int n;

    public Nombre() {
        n = 0;
    
    }
    
    public Nombre(int n){
        this.n=n;
    }
    
    @Override
    public int eval() {
        return n;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

}
