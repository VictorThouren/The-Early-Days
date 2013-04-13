package periodicelements.Elements;

public class Helium {

    /*
     * All data gathered from http://en.wikipedia.org/wiki/Helium
     */

    //General Properties
    String name = "Helium";
    String elementCategory = "noble gases";
    int group = 18;
    int period = 1;
    double weight = 4.002602;//Atomic mass units
    int electronsPerShell = 2;

    //Physical Properties
    String color = "colorless";
    String phase = "gas";
    double meltingPoint = -272.20;//Celsius
    double boilingPoint = -268.93;//Celsius
    double triplePoint = 0;//Celsius //****NO DATA****
    double heatOfFusion = 0.0138;//Kilojoule per Mole
    double heatOfVaporization = 0.0829;//Kilojoule per Mole

    //Atomic Properties
    double electronegativity = 0;//Pauling Scale //****NO DATA***
    double ionizationEnergies = 2372.3; //Kilojoule per Mole
    double vanDerWaalsRadius = 140;//pm

    //Miscellanea
    String crystalStructure = "hexagonal close-packed";
    String magneticOrdering = "diamagnetic";
    double CAS = 7440-59-7;//CAS registry number
}
