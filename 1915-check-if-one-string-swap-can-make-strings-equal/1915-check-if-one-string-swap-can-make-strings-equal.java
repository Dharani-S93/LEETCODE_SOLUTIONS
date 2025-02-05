class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char miss1 = ' ', miss2 = ' ';
        int c = 0;
        boolean flag = true;
        int n = s1.length();
        for(int i = 0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(c==0){
                    miss1 = s1.charAt(i);
                    miss2 = s2.charAt(i);
                    flag = false;
                    c++;
                }
                else if(c==1){
                    if(s2.charAt(i) == miss1 && s1.charAt(i) == miss2){
                        flag = true;
                    }
                    c++;
                }
                else{
                    return false;
                }
            }
        }
        return flag;
    }
}