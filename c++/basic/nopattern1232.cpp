#include<iostream>
using namespace std;
int main(){
 int i,j,k=0,rows,count=0,count1=0;

 cout<<"Enter Rows:";
 cin>>rows;

 for(i=1;i<=rows;i++){
    for(j=1;j<=rows-i;j++){
        cout<<"  ";
           count++;
        }
        while(k!=2*i-1)
        {
             if (count <= rows-1)
            {
                cout << i+k << " ";
                ++count;
            }
          else
            {
                ++count1;
                cout << i+k-2*count1 << " ";
            }
            ++k;
        }
        count=count1=k=0;
        cout<<"\n";

    }

return 0;
}
