//subarrays    max and min sum Brutforce
#include <iostream>
#include <vector>
using namespace std;

int sub(vector<int>& num){
    int ns=0;
    int sum=0;
    int largest=INT16_MIN;
    int minimum=INT16_MAX;
    for(int i=0;i<num.size();i++){
        for(int j=i;j<num.size();j++){
            sum=0;
            for(int k=i;k<=j;k++){
                cout<<num[k]<<" "; 
                sum+= num[k];  
         
            }
            if(sum>largest){
        largest=sum;
        }
    if(sum<minimum){
        minimum=sum;
        
    } 
            
            ns++;
            cout<<endl;
        }

        cout<<endl;
        
    }
    
    cout<<"Largest sum is: "<<largest<<endl;
    cout<<"Minimum sum is: "<<minimum<<endl;
    return ns;
}

int main(){

vector<int> num = {2,4,6,8,10,-12};

int res = sub(num);
cout<<"No of subarray is: "<<res<<endl;
return 0;
}