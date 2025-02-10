class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int zeros = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        int last = length - 1;
        int New = length - 1 + zeros;
        while (last >= 0) {
            if (New < length) {
                arr[New] = arr[last];
            }
            if (arr[last] == 0) {
                New--;
                if (New < length) {
                    arr[New] = 0;
                }
            }
            last--;
            New--;
        }
    }
}