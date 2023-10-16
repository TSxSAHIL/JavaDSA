
int find(vector<int> arr) {
    int n = arr.size();
    int min_val = *min_element(arr.begin(), arr.end()); 
    int max_val = *max_element(arr.begin(), arr.end()); 
    int min_cost = INT_MAX;
    for(int i=min_val; i<=max_val; i++) { 
        int cost = 0;
        for(int j=0; j<n; j++) {
            cost += abs(arr[j]-i); 
        }
        min_cost = min(min_cost, cost); 
    }
    return min_cost;
}