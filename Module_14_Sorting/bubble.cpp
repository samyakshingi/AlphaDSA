#include <iostream>
#include <vector>
using namespace std;

void bubble(vector<int> a){
    int n = a.size();

    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j] > a[j+1]){
                int temp = a[j+1];
                a[j+1]=a[j];
                a[j] = temp;
            }
        }
    }
    cout<<"Sorted array is:";

    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
}

int main(){
    vector<int> a = {5,10,2,3,6,8,7};
    bubble(a);
    return 0;
}