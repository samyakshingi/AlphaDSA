#include <bits/stdc++.h>
using namespace std;

void MinMax(vector<int> num){
    int  min = INT_MAX; 
    int  max = INT_MIN;

    for(int i=0;i<num.size();i++){
        if(max<num[i]){
            max=num[i];
        }
        if(min>num[i]){
            min=num[i];
        }
    }  
    cout<<"Max number is: "<<max<<endl;
    cout<<"Min number is: "<<min<<endl;
}

int main(){
    
    vector<int> num = {5,9,4,5,8,66,8,5,44};

    MinMax(num);
    return 0;
}