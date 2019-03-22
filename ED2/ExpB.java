
/**
 * Write a description of class ExpB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExpB implements Exp
{
    private Exp e1;
    private Exp e2;
    private char op;

    public ExpB(){
        e1=null;
        e2=null;
        op='@';
    }
    
    public ExpB(Exp e1, Exp e2, char op){
        this.e1=e1;
        this.e2=e2;
        this.op=op;
    }
    
    @Override
    public int eval() throws Exception {
        if (op == '+'   ) {
            return e1.eval() + e2.eval();
        } else if (op == '-'){
            return e1.eval() - e2.eval();
        } else if (op == '/'){
            return e1.eval() / e2.eval();
        } else if (op == '*'){
            return e1.eval() * e2.eval();
        } else {
            throw new Exception("pas le bon operateur");
        }
    }

    /**
     * @return the e1
     */
    public Exp getE1() {
        return e1;
    }

    /**
     * @param e1 the e1 to set
     */
    public void setE1(Exp e1) {
        this.e1 = e1;
    }

    /**
     * @return the e2
     */
    public Exp getE2() {
        return e2;
    }

    /**
     * @param e2 the e2 to set
     */
    public void setE2(Exp e2) {
        this.e2 = e2;
    }

    /**
     * @return the op
     */
    public char getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(char op) {
        this.op = op;
    }
}
