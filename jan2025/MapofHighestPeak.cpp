#include <iostream>
#include<vector>
#include <queue>

using namespace std;

vector<vector<int>> solution(vector<vector<int>>&arr) {
    int n  = arr.size();
    int m = arr[0].size();
    queue<pair<int,int>>q;
    for(int i = 0;i<n;i++) {
        for(int j = 0;j<m;j++) {
            if(arr[i][j]==1) {
                arr[i][j] = 0;
                q.push({i,j});
            } else {
                arr[i][j] = -1;
            }
        }
    }
    while(!q.empty()) {
        vector<int>dir = {0,1,0,-1,0};
        int i = q.front().first;
        int j = q.front().second;
        q.pop();
        for(int i = 0;i<4;i++) {
            int x = i+dir[i];
            int y = j+dir[i+1];
            if(x>=0 && x<n && y>=0 && y<m && arr[x][y]==-1) {
                arr[x][y] = arr[i][j]+1;
                q.push({x,y});
            }
        }
    }
    return arr;
}

int main(int argc, char const *argv[])
{
    int n,m;
    cin>>n;
    cin>>m;
    vector<vector<int>>arr(n,vector<int>(m,0));
    for(int i = 0;i<n;i++) {
        for(int j = 0;j<n;j++) {
            cin>>arr[i][j];
        }
    }
    vector<vector<int>>res = solution(arr);
    for(int i = 0;i<n;i++) {
        for(int j = 0;j<n;j++) {
            cout<<res[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}
