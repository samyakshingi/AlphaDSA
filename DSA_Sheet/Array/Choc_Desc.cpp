// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
#include <bits/stdc++.h>
using namespace std;

int Choc(vector<int>& num, int m){
    sort(num.begin(),num.end());
    int min=INT16_MAX;
    for(int i=0;i+m-1<num.size();i++){
        int diff = num[i+m-1] - num[i];
        if(diff<min) min=diff;
    }
    return min;
}

int main(){
    
    vector<int> num = {12, 4,  7,  9,  2,  23, 25, 41, 30,
                  40, 28, 42, 30, 44, 48, 43, 50};
    int m=7;

    int res = Choc(num,m);
    cout<<res<<endl;
    return 0;
}