class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k %= nums.size();  //if k > modules % that's why we use this 
        reverse(nums.begin(), nums.end()); // reversing the whole array 
        reverse(nums.begin(), nums.begin()+k); // reversing the k array
        reverse(nums.begin()+k, nums.end()); // reversing the k-1 array
    }
};