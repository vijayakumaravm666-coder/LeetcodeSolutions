class Solution {
    public int mirrorDistance(int n) {
        String s=n + "";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            s1=s1+ch;
        }
        int num=Integer.parseInt(s1);
        return(Math.abs(n-num));
    }
}