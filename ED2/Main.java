/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elie
 */
public class Main {
    public static void main(String args[]) throws Exception{
        Exp e = new ExpB(new ExpB(new Nombre(2), new Nombre(5), '+'),
                         new ExpB(new Nombre(8), new Nombre(4), '-'),
                         '*');
        
        System.out.println("La valeur de (2+5)*(8-4) est "+ e.eval());
        
        Exp n1 = new Nombre (10);
        Exp n2 = new Nombre (20);
        Exp e1 = new ExpB (n1,n2,'+');
        System.out.printf("n1=%d n2=%d, e1=(n1+n2)=%d", n1.eval(),n2.eval(),e1.eval());
    }
    
}
