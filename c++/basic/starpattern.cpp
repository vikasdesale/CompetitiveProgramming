#include<iostream>
using namespace std;
int main(){
 int i,j,k=0;

 for(i=1;i<=3;i++){
    for(j=1;j<=3-i;j++){
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
