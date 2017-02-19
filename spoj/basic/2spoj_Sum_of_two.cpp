#include<iostream>
using namespace std;
int main(){
 double i[1000],j[1000];
 int c;

 cin>>c;

 for(int l=0;l<c;l++)
 cin>>i[l]>>j[l];


 for(int l=0;l<c;l++)
 cout<<i[l]+j[l]<<endl;




return 0;
}
