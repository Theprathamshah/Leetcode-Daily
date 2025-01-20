#include <iostream>
using namespace std;
vector<int> minOperations(string boxes) {
        vector<int>res;
        int n = boxes.size();
        for(int i = 0;i<n;i++) {
            int sum = 0;
            for(int j = 0;j<n;j++) {
                if(i!=j and boxes[j]=='1') {
                    sum+=abs(i-j);
                }
            }
            res.push_back(sum);
        }
        return res;
    }
int main(int argc, char const *argv[])
{
    /* code */
    string s;
    cin>>s;
    vector<int> res = minOperations(s);
    for(int i = 0;i<res.size();i++) {
        cout<<res[i]<<" ";
    }
    
    return 0;
}
