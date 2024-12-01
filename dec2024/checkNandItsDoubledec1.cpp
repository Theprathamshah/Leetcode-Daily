#include <iostream>
#include <unordered_set>
#include <vector>
using namespace std;

bool checkNAndItsDoubleSolver(const vector<int>& arr) {
    unordered_set<int> set;
    for (int ele : arr) {
        if (ele % 2 == 0) {
            if (set.count(ele * 2) || set.count(ele / 2)) {
                return true;
            }
        }
        set.insert(ele);
    }
    return false;
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    if (checkNAndItsDoubleSolver(arr)) {
        cout << "Number and its double exist" << endl;
    } else {
        cout << "Number and its double doesn't exist" << endl;
    }

    return 0;
}
