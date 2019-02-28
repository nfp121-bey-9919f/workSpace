
/**
 * Write a description of class CompteurInstanceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompteurInstanceTest extends junit.framework.TestCase
{

    /**
     * Constructeur de la classe-test CompteurInstanceTest
     */
    public CompteurInstanceTest()
    {
    }

    public void testCptInstances()
    {
        CompteurInstance compteur1 = new CompteurInstance();
        CompteurInstance compteur2 = new CompteurInstance();
        assertEquals(2, CompteurInstance.statVoirNbInstances());
        assertEquals(2, compteur2.voirNbInstances());
        assertEquals(2, compteur1.voirNbInstances());
        assertEquals(compteur1.voirNbInstances(), CompteurInstance.statVoirNbInstances());
        CompteurInstance compteur3 = new CompteurInstance();
        assertEquals(compteur2.voirNbInstances(), CompteurInstance.statVoirNbInstances());
    }
}