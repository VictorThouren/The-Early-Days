#include <iostream>
using namespace std;

int main(){
    float sequence[4000001]= {0,1, 2};
    float counter = 2;
    float number = 0;
    float arrayCeiling = 2;
    float sum = 0;


    while(counter <= 4000000){
    number = sequence[arrayCeiling - 1] + sequence[arrayCeiling];



    arrayCeiling++;
    sequence[arrayCeiling] = number;

    sum = sum + number;

    counter++;

    }//End of first while loop

    cout << "Completed";

}//End of main method
