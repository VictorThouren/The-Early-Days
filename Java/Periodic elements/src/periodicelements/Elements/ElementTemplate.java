

package periodicelements.Elements;


public class ElementTemplate {

    /*
     * All data gathered from Wikipedia
     */

    //General Properties
    String name = "";
    String elementCategory = "";
    int group = 0;
    int period = 0;
    double weight = 0;//Atomic mass units
    int electronsPerShell = 0;

    //Physical Properties
    String color = "";
    String phase = "";
    double meltingPoint = 0;//Celsius
    double boilingPoint = 0;//Celsius
    double triplePoint = 0;//Celsius
    double heatOfFusion = 0;//MPa
    double heatOfVaporization = 0;//Kilojoule per Mole

    //Atomic Properties
    double electronegativity = 0;//Pauling Scale
    double ionizationEnergies = 0; //Kilojoule per Mole
    double vanDerWaalsRadius = 0;//pm

    //Miscellanea
    String crystalStructure = "";
    String magneticOrdering = "";
    double CAS = 0;//CAS registry number




}
