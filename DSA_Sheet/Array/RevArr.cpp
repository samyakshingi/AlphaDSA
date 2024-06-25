#include <bits/stdc++.h>
using namespace std;

void RevArr(vector<int>& num){
    int start=0;
    int end=num.size()-1;

    while(start<end){
        int temp = num[start];
        num[start]=num[end];
        num[end] =temp;
        start++;
        end--;
    }
    
}

int main(){
    
    vector<int> num = {5,9,4,5,8,66,8,5,44};

    RevArr(num);
    for(int i=0;i<num.size();i++){
        cout<<num[i]<<" ";
    }
    return 0;
}