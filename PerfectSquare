#include <iostream>
using namespace std;

//Perfect Square such that last 2 digits are both odd

int main(){
    int i=4;
    int square=0;

    while(true){
        square=i*i;
        if(square%10%2 !=0 && square%100/10%2 !=0){
            if(square<0){
                cout<<"Not possible";
                break;
            }
            cout<<"true "<<square<<" "<<i;
            break;
        }
        i++;
    }

    return 0;
}
