class Solution {
    public int titleToNumber(String ct) {

        int result = 0;
        for(int i=0;i<ct.length();i++){
            char ch = ct.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
       
    }
}