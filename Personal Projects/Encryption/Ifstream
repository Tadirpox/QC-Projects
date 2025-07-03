#include <iostream>
#include <fstream>
using namespace std;

int main(){
    string filename="text.txt";
    ifstream sin(filename);

    if(!sin.is_open()){
        cout<<"error";
        exit(0);
    }
    cout<<"You entered: "<<endl;
    while(!sin.eof()){
        string line;
        getline(sin,line);
        cout<<line<<endl;
    }

    sin.close();

    return 0;
}
