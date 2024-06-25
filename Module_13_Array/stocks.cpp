//stocks
#include <iostream>
#include <vector>
using namespace std;

int kadans(vector<int>& num){
    int bp=INT16_MAX;
    int maxpro=0;
    for(int i=0;i<num.size();i++){
        if(bp<num[i]){
            int pro=num[i]-bp;
            maxpro=max(maxpro,pro);
        }
        else{
            bp=num[i];
        }
    }
    return maxpro;
}

int main(){

vector<int> num = {7,1,5,3,6,4};
int tr=0;

   tr= kadans(num);
   cout<<tr;
return 0;
}