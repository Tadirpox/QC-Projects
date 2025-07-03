#include <iostream>
#include <fstream>
#include <cstdlib>
#include <cctype>
#include <ctime>
using namespace std;

int main(){
    string filename2="encrypted.txt";
    string line;

    ifstream sin(filename2);
    
    if(!sin.is_open()){
        cout<<"error";
        exit(0);
    }

    while(!sin.eof()){
        getline(sin, line);
        cout<<line<<endl;
        //decode();

    }

    return 0;
}
