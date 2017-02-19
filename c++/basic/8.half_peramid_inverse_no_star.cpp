#include<iostream>
using namespace std;
int main(){
 int i,j,k=0,rows,count=1;

 cout<<"Enter Rows:";
 cin>>rows;

 for(i=rows;i>=1;i--){



    for(int j = 1; j <= i; j++)
        {

            cout << "*   ";
        }

        cout<<"\n";

    }

return 0;
}
