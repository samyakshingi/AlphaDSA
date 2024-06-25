#include <iostream>
#include <vector>
using namespace std;

void selection(vector<int> a){
    int n = a.size();
    

    for(int i=0;i<n-1;i++){
        int min = i;
        for(int j=i+1;j<n;j++){
            if(a[j] < a[min]) {
                min = j;
            }
        }
        int temp = a[min];
        a[min] = a[i];
        a[i] = temp;
    }

    
    cout<<"Sorted array is:";

    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    
}

int main(){
    vector<int> a = {5,10,2,3,6,8,7};
    selection(a);
    return 0;
}