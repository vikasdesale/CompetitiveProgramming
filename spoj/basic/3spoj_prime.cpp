#include<iostream>
using namespace std;
int isPrime(int l){
    int flag=0;
for(int g=2;g<=l/2;g++){
    if(l%g!=0)
        flag=1;


}
if(flag==1)
return l;
}
int main(){
 double i[1000],j[1000],isprime[100][1000];
 int c,z=0;

 cin>>c;

 for(int l=0;l<c;l++)
 cin>>i[l]>>j[l];


 for(int l=0;l<c;l++)
 if(i[l]<=j[l]){
    for(int p=i[l];p<=j[l];p++){
                   int d=isPrime(p);
        if(d==l){
        isprime[z][l]=d;}
    }
    z++;
 }

 for(int l=0;l<c;l++){
    for(int p=0;p<1000;p++){
                  cout<<isprime[l][p];

 }
 }

return 0;
}
