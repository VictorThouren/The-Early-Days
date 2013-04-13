//euler 1

#include <iostream>
using namespace std;

int main(){
    int number = 0;
    int sum = 0;
    int mod3 = 0;
    int mod5 = 0;

    while(number < 1000){
        mod3 = number % 3;
        mod5 = number % 5;

        if(mod3 == 0 || mod5 == 0){
            sum = sum + number;
        }
        number++;
    }
    cout << sum;
}







