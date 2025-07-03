#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

double option1(double &amount);
double option2a(double amount);
double option2b(double amount);
double option2c(double amount);
void option5();

int main(){
    srand(time(0));
    double amount;
    int option = 0;
    string optionb;

    cout<<"Enter a Bank account amount: $";
    cin>> amount;
    cout<<endl;
    while(amount<=0){
        cout<<"Please enter a new Bank account amount thats positive: ";
        cin>>amount;
        cout<<endl;
    }
    cout<<"Welcome to the Online Banking budget program"<<endl;

    

    while(option !=5){
        if(option>=1 && option<=4){
            cout<<"Your new Bank account amount is now $"<<amount<<endl;
        }else{
            cout<<"Your current Bank account amount is $"<<amount<<endl;
        }
        cout<<"Please choose a option you would like to do"<<endl;
        cout<<"(1) Reenter a new bank account amount "<<endl;
        cout<<"(2) Budget Informmation"<<endl;
        cout<<"(3) Investment Information"<<endl;
        cout<<"(4) Information"<<endl;
        cout<<"(5) Exit the program"<<endl;
        cout<<"You chose option: ";
        cin>>option;
        cout<<endl;

        if(option<=0 || option>5){
            cout<<"↓↓↓Please Enter a option value listed below↓↓↓"<<endl;
        }
        if(option==2){
            cout<<"Please choose a option you would like to do"<<endl;
            cout<<"(2a)Give me a LOW budget(1%-10%)"<<endl;
            cout<<"(2b)Give me a MEDIUM budget(11%-20%)"<<endl;
            cout<<"(2c)Give me a HIGH budget(21%-30%)"<<endl;
            cin>>optionb;
        }
        
        // if(option == 1){
        //     cin>>optionb;
        // }
        // if(optionb=="1a"){
        //     cout<<"hi";
        // }

        if(option==1){
            option1(amount);
        }
        
        if(optionb=="2a"){
            amount = option2a(amount);
        }else if(optionb=="2b"){
            amount = option2b(amount);
        }else if(optionb=="2c"){
            amount = option2c(amount);
        }
        
        if(option==5){
            option5();
        }
    }
    

    return 0;
}




//cout<<"(2) Budget Informmation";
//cout<<"(3) Investment Information";
//cout<<"(4) Information";
//if(option==2){
//  cout<<"(2a)";
//  cout<<"(2b)";
//  cout<<"(2c)"
//}else if(option==3)
//  cout<<"(3a)";
//  cout<<"(3b)";
//  cout<<"(3c)";
//}else if(option==4)
//  cout<<"(4a)";
//  cout<<"(4b)";
//  cout<<"(4c)";

double option1(double &amount){
    cout<<"Please enter your new Bank account amount: ";
        cin>>amount;
        cout<<endl;
        return amount;
}
double option2a(double amount){
    cout<<"You chose a LOW budget"<<endl;
    int n=rand()%(10-1+1)+1;
    cout<<"Your budget amount is "<<n<<"%, or $"<<(0.01*n)*amount<<endl<<endl;
    return amount-((0.01*n)*amount);
}
double option2b(double amount){
    cout<<"You chose a MEDIUM budget"<<endl;
    int n=rand()%(20-11+1)+10;
    cout<<"Your budget amount is "<<n<<"%, or $"<<(0.01*n)*amount<<endl<<endl;
    return amount=amount-((0.01*n)*amount);
}
double option2c(double amount){
    cout<<"You chose a HIGH budget"<<endl;
    int n=rand()%(30-21+1)+21;
    cout<<"Your budget amount is "<<n<<"%, or $"<<(0.01*n)*amount<<endl<<endl;
    return (amount-((0.01*n)*amount));
}
void option5(){
    cout<<"Thank you, Have a Good Day"<<endl;
    exit(1);
}
