#include<iostream>
using namespace std;
int main(){
 int i,j,k=0,rows,coef;

 cout<<"Enter Rows:";
 cin>>rows;

 for(i=0;i<=rows;i++){

        for(k=1;k<=rows-i;k++)
            cout<<"  ";

    for(int j = 0; j <= i; j++)
        {
            if (j == 0 || i == 0)
                coef = 1;
            else
                coef = coef*(i-j+1)/j;

            cout << coef << "   ";
        }

        cout<<"\n";

    }

return 0;
}
