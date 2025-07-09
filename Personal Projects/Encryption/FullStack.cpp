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

    ifstream sin(filename);

    if(!sin.is_open()){
        cout<<"error";
        exit(0);
    }
    cout<<endl<<"You entered: "<<endl;
    while(!sin.eof()){
        string line;
        getline(sin,line);
        cout<<line<<endl;
    }

    sin.close();

    ifstream sin2(filename);
    ofstream sout2(filename2);


    if(!sin2.is_open() || !sout2.is_open()){
        cout<<"error";
        exit(0);
    }

    int linenum=0;
    
    cout<<"Your encrypted text will be:"<<endl;
    while(!sin2.eof()){
        getline(sin2,line);
        encode(line, linenum);
        linenum+=1;
        sout2<<line<<endl;
        cout<<line<<endl;
    }

    sin2.close();
    sout2.close();

    return 0;
}
