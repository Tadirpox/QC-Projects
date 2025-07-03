#include <iostream>
#include <fstream>
using namespace std;

int main(){
    string filename="text.txt";
    ofstream sout(filename);

    if(!sout.is_open()){
        cout<<"error";
        exit(0);
    }

    for(int i=0;i<=0;){
        string words;
        cout<<"Enter what you would like to encrypt (Enter end to stop): "<<endl;
        getline(cin,words);
        if(words=="end") break;
        sout<<words<<endl;
    }
    sout.close();

    return 0;
}
