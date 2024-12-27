class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";  
        while (columnNumber > 0) { 
            columnNumber--;  
            char digit = (char) ('A' + (columnNumber % 26)); 
            ans = digit + ans;  
            columnNumber /= 26;  
        }
        return ans; 
    }
}