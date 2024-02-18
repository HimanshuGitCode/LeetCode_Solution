class Solution {
public:
    void reverseString(vector<char>& s) {
    int st=0; // string name is st in input
        int e = s.size()-1; // string start form 0 and s.size for calculate lenght or string
    while(st<e){
        swap(s[st++], s[e--]);
    }
        
    }
};