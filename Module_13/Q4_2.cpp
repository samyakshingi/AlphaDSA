//subarrays    max and min sum prefix_sum
#include <iostream>
#include <vector>
using namespace std;

int sub(vector<int>& num){
    int ns=0;
    int sum=0;
    int largest=INT16_MIN;
    int minimum=INT16_MAX;
    int pref[num.size()];
    pref[0]=num[0];
    for (int i = 1; i < num.size(); i++){
        pref[i] = pref[i-1] + num[i];
    }

    for(int i=0;i<num.size();i++){
        for(int j=i;j<num.size();j++){
            sum=0;
            sum= i==0 ? pref[j]: pref[j]-pref[i-1];
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

void kadans(vector<int>& num){
    int currsum=0;
    int maxsum=INT16_MIN;
    bool an=true;
    for (int i = 0; i < num.size(); i++){
        if(num[i]>=0){
            an=false;
        }
    }
    if(an){
        int max=INT16_MIN;
        for(int i = 0; i < num.size(); i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        cout<<max;
    }else{
    for (int i = 0; i < num.size(); i++){
        currsum+=num[i];
        if(currsum<0){
            currsum=0;
        }
        maxsum= max(maxsum,currsum);
        
    }
    cout << "Maximum sum of a subarray is : " << maxsum ;
    }
}

int main(){

vector<int> num = {-2,-3,-4,-2,-5,-3};

//int res = sub(num);
//cout<<"No of subarray is: "<<res<<endl;
        kadans(num);
return 0;
}