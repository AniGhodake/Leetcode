//  ------------------------------------LEETCODE 26 --------------------------------------------



#include<iostream>
using namespace std;
#include<vector>

int removeDuplicates(vector<int>& nums) {
    int k = 0;
    int i = 0;
    int j = i + 1;

    while(j< nums.size()){
        if(nums[i] == nums[j]){
            j++;
        }
        else{
            i++;
            swap(nums[i],nums[j]);
            j++;
        }
    }

    cout<<" unique with Duplicates : "<<endl;
    for(int i = 0; i < nums.size(); i++){
        cout<<nums[i]<<" ";
    }
    cout<<endl;


    return i+1;
}

int main(){
    vector<int>nums = {0,0,1,1,1,2,2,3,3,4};

    cout<<"vector elements are : "<<endl;
    for(int i = 0; i < nums.size(); i++){
        cout<<nums[i]<<" ";
    }
    cout<<endl;

    int unique = removeDuplicates(nums);
    cout<<"total unique elements in vector is : "<<unique<<endl;
}