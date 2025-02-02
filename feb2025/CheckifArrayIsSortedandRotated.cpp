#include<iostream>
using namespace std;

bool solution(vector<int>arr) {
    for(int i = 0;i<arr.size();i++) {
        if(is_sorted(arr.begin(), arr.end())) {
            return true;
        }
        rotate(arr.begin(), arr.begin()+1, arr.end());
    }
    return false;
}

int main() {
    int n;
    cin >> n;
    vector<int>arr(n);
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }
    cout << solution(arr) << endl;
    
}