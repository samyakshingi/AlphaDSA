//trapping rain water
#include <iostream>
#include <vector>
using namespace std;

int kadans(vector<int>& num){
    
    int lmax[num.size()];
    
    lmax[0]=num[0];
    
    for(int i =1;i<num.size();i++){
        lmax[i]= max(num[i],lmax[i-1]);
    }
    int rmax[num.size()];
    rmax[num.size()-1]=num[num.size()-1];
    for(int i=num.size()-2;i>=0;i--){
        rmax[i]= max(num[i],rmax[i+1]);
    }
    int tr=0;
    for(int i=0;i<num.size();i++){
        tr+= (min(lmax[i],rmax[i]))-(num[i]);
    } 
    
    return tr;
}

int main(){

vector<int> num = {4,2,0,6,3,2,5};
int tr=0;

   tr= kadans(num);
   cout<<tr;
return 0;
}