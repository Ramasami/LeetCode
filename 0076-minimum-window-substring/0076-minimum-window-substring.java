class Solution {
    public String minWindow(String t, String s) {
       Map<Character, Integer> map = new HashMap<>();
        int l=0,r=0,n=t.length();
        for(char c:s.toCharArray())
            map.compute(c, (k,v)->v==null?1:v+1);
        int charLeft = map.size();
        int minL=0,minR=Integer.MAX_VALUE;
        while(r<n) {
            char cr = t.charAt(r);
            if(map.containsKey(cr)) {
                if(map.get(cr)==1)
                    charLeft--;
                    map.compute(cr, (k,v)->v-1);
                if (charLeft==0) {
                    while(l<r) {
                        char cl = t.charAt(l);
                        if(map.containsKey(cl)) {
                            if(map.get(cl)==0)
                                break;
                            map.compute(cl, (k,v)->v+1);
                            l++;
                        } else {
                            l++;
                        }
                    }
                    if(minR-minL > r-l) {
                        minR = r;
                        minL = l;
                    }
                }
            } 
            r++;
        }
        if(minR == Integer.MAX_VALUE)
            return "";
        else
            return t.substring(minL,minR+1);
    }
}