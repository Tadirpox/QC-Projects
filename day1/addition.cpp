#include <iostream>
using namespace std;

//Simulate addition with strings

int main(){
    string one, two;

    cout<<"Enter two numbers for the addition:"<<endl;
    cin>>one>>two;

    string max= one, min= two;

    if(one.length()<two.length()){
        max=two;
        min=one;
    }

    int sum= 0;
    int maxnum[max.length()] ={};
    int minnum[max.length()] ={};

    for(int i=max.length()-1; i>=0; i--){
        maxnum[i]=max[i]-=48;
    }
    cout<<endl;
    int i=max.length()-1;
    for(int r=min.length()-1; r>=0; r--){
        minnum[i]=min[r]-=48;
        i--;
    }

    for(int i=0; i<max.length(); i++){
        sum= (10*sum)+minnum[i]+maxnum[i];
    }
    cout<<"The Sum of these two numbers is "<<sum;

    return 0;
}