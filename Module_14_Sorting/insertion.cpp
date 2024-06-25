#include <iostream>
#include <vector>
using namespace std;

void insertion(vector<int> a){
    int n = a.size();

    for(int i=1;i<n;i++){
        int curr = a[i];
        int pre = i-1;
        
        while(pre>=0 && a[pre]>curr){
            a[pre+1] = a[pre];
            pre--;
        }
        a[pre+1] = curr;
    }
    cout<<"Sorted array is:";

    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    
}

int main(){
    vector<int> a = {5,10,2,3,6,8,7};
    insertion(a);
    return 0;
}