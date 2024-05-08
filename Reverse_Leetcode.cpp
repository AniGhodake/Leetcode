#include<iostream>
#include<climits>
using namespace std;
int reverse(int num){
    int remainder=0;
    int rev = 0;
    bool isNegative = false;
    if(num <=INT_MIN || num>= INT_MAX){
        return 0;
    }
    if(num<0){
        isNegative = true;
        num = -num;
    }
    while(num>0){
        remainder = num%10;
        rev = rev *10+remainder;
        num = num/10;
    }
    return isNegative ? -rev: rev;

}
int main(){
    int num;
    cout<<INT_MIN<<endl;
    cout<<INT_MAX;
    cout<<"Enter the Number"<<endl;
    cin>>num;
    int rev = reverse(num);
    cout<<"Reverse Number of "<<num<<" is "<<rev<<endl;
}