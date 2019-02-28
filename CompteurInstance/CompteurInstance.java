
/**
 * une classe de nom “CompteurInstance” qui contient une méthode qui retourne
 * le nombre d’instances de la classe à tout moment d’une session Java.
 *
 * @author (Elie Keserwany)
 * @version (28-02-2019-01)
 */
public class CompteurInstance
{
    // variables d'instance 
    private static int nbInstances=0;

    /**
     * Constructeur d'objets de classe CompteurInstance
     */
    public CompteurInstance()
    {
        // initialisation des variables d'instance
        nbInstances = nbInstances + 1;
    }

    public int voirNbInstances()
    {
        return nbInstances;
    }

    public static int statVoirNbInstances()
    {
        // Ins&eacute;rez votre code ici
        return nbInstances;
    }
}
