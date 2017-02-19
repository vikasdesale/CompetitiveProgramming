#include<iostream>
using namespace std;
int main(){
 int i,j,k=0,rows;

 cout<<"Enter Rows:";
 cin>>rows;
 for(i=1;i<=rows;i++){
    for(j=1;j<=rows-i;j++){
        cout<<"  ";

        }
        while(k!=2*i-1)
        {
            cout<<"* ";
            ++k;
        }
        k=0;
        cout<<"\n";

    }

return 0;
}
