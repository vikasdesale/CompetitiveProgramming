#include<iostream>
using namespace std;
int main(){
 int i,j,k=0,rows,count=1;

 cout<<"Enter Rows:";
 cin>>rows;

 for(i=0;i<=rows;i++){

        for(k=1;k<=rows-i;k++)
            cout<<"  ";

    for(int j = 0; j <= i; j++)
        {

            cout << count++ << "   ";
        }

        cout<<"\n";

    }

return 0;
}
