#include <bits/stdc++.h>
using namespace std;

int MaxSubArrSum(vector<int>& num){
    int currSum = 0;
    int maxSum = INT16_MIN;

    for(int i=0;i<num.size();i++){
        currSum += num[i];
        if(currSum<0){
            currSum=0;
        }
        maxSum = max(currSum,maxSum);
    }
    return maxSum;
}

int main(){
    
    vector<int> num = {5,4,-1,7,8};

    int res = MaxSubArrSum(num);
    cout<<res<<endl;
    return 0;
}