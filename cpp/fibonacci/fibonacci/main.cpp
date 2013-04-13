/*
The purpose of this program is to generate
the first thousand numbers in the fibonacci
sequence
*/
#include <iostream>
using namespace std;

int main(){
    double long sequence[1001]= {0,1, 2};
    int counter = 2;
    double long number = 0;
    int arrayCeiling = 2;

    /*TEST CODE
    number = sequence[arrayCeiling - 1] + sequence[arrayCeiling];
    cout << number;
    arrayCeiling++;
    sequence[arrayCeiling] = number;
    number = sequence[arrayCeiling - 1] + sequence[arrayCeiling];
    cout << number;
    TEST CODE*/

    while(counter <= 1000){
    number = sequence[arrayCeiling - 1] + sequence[arrayCeiling];

    cout << number;
    cout << "\n";

    arrayCeiling++;
    sequence[arrayCeiling] = number;

    counter++;

    }//End of first while loop

    cout << "This shit has been generated, mission acomplished!";

}//End of main method





