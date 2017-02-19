#include<iostream>
using namespace std;
int main(){
 int i,j,k=0,rows;

 cout<<"Enter Rows:";
 cin>>rows;

 for(i=rows;i>=1;i--){

        for(k=1;k<=rows-i;k++)
            cout<<"  ";
        for(int j = i; j <= 2*i-1; ++j)
            cout << "* ";
        for(int j = 0; j < i-1; ++j)
            cout << "* ";

        cout<<"\n";

    }

return 0;
}
