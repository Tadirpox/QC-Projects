#include <iostream>
#include <cstdlib>
#include <fstream>
#include <cctype>
#include <ctime>
using namespace std;

void memory(int n, int i, string line, int linenum){
    int nums[linenum][line.length()];
    nums[linenum][i]=n;
    //return nums[r][i];
}

void encode(string &line, int linenum){
    srand(time(0));
    for(int i=0; i<line.length(); i++){
        int n;
        if(islower(line[i])){
            n=rand()%26-25;    
        }else{
            n=rand()%26+1;
        }
        memory(n, i, line, linenum);
        line[i]+=n;
    }
}

int main(){
    string filename="text.txt";
    string filename2="encrypted.txt";

    string line;
    
    ifstream sin(filename);
    ofstream sout(filename2);


    if(!sin.is_open() || !sout.is_open()){
        cout<<"error";
        exit(0);
    }

    int linenum=0;
    
    while(!sin.eof()){
        getline(sin,line);
        encode(line, linenum);
        linenum+=1;
        sout<<line<<endl;
        cout<<line<<endl;
    }

    cout<<"Is this correct?"<<endl;

    sin.close();

    return 0;
}
