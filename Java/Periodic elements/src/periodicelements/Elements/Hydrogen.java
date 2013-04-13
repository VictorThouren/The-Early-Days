package periodicelements.Elements;

public class Hydrogen {

    /*
     * All data gathered from http://en.wikipedia.org/wiki/Hydrogen
     */

    //General Properties
    String name = "hydrogen";
    String elementCategory = "nonmetal";
    int group = 1;
    int period = 1;
    double weight = 1.00794;//Atomic mass units
    int electronsPerShell = 1;

    //Physical Properties
    String color = "colorless";
    String phase = "gas";
    double meltingPoint = -259.14;//Celsius
    double boilingPoint = -252.87;//Celsius
    double triplePoint = -259;//Celsius
    double heatOfFusion = 0.117;//MPa
    double heatOfVaporization = 0.904;//Kilojoule per Mole

    //Atomic Properties
    double electronegativity = 2.20;//Pauling Scale
    double ionizationEnergies = 1312.0; //Kilojoule per Mole
    double vanDerWaalsRadius = 120;//pm

    //Miscellanea
    String crystalStructure = "hexagonal";
    String magneticOrdering = "diamagnetic";
    double CAS = 1333-74-0;//CAS registry number
}
