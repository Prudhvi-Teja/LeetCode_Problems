class Solution {
    public boolean halvesAreAlike(String s) {
        
        int fh = 0,lh=0;
        int n = s.length();
        char[] ch = s.toCharArray();
        
        fh = count(ch,0,n/2);
        lh = count(ch,n/2,n);
        
       return fh == lh;
    }
    
   public int count(char[] ch, int i, int j){
        int c=0;
        for(int k=i; k<j; k++){
            if("aeiouAEIOU".indexOf(ch[k])!=-1)
                c++;
        }
        return c;
    }
}