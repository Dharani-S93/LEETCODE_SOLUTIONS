class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int a[]=new int[n];
        a[0]=arr[0];
        for(int i=1;i<n;i++){
            a[i]=a[i-1]^arr[i];
        }

        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
                if(l==0){
                    res[i]=a[r];
                }
                else{
                    res[i]=a[r]^a[l-1];
                }
            }
        
        return res;
    }
}