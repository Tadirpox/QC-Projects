#include <iostream>
#include <string>
using namespace std;

//Simulate addition with strings
string add(string num1, string num2){
    string result;
    int sum=0;
    int carry =0;
    string maxnum= num1;
    string minnum= num2;
    int max= num1.length()-1;
    int min= num2.length()-1;
    if(min>max){
        max=num2.length()-1;
        maxnum= num2;
        minnum= num1;
        min=num1.length()-1;
    }
    for(int i= max; i>=0; i--){
        
        sum= sum+maxnum[i]-48+carry;
        carry=0;
        if(min>=0){
            sum+=minnum[min]-48;
            min--;
        }
        carry= sum/10;
        char single=(sum%10)+'0';
        sum=0;
        
        result.insert(0,1,single);
    }
    if(carry>0){
        result.insert(0,1,'1');
    }
    return result;
}

int main(){

    char x[100];
    char y[100];

    cout<<"Enter two numbers for the addition:"<<endl;
    cin>>x>>y;

    string result= add(x,y);
    cout<<result;

}
