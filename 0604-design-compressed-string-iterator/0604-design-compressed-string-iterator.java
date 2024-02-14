class StringIterator {
    
    Integer count;
    Character c;
    int l;
    String compressedString;
    int size;

    public StringIterator(String compressedString) {
        this.l=0;
        this.compressedString = compressedString;
        this.size = compressedString.length();
        updateNext();
    }
    
    private void updateNext() {
        if(l>=size) {
            c = null;
            count = null;
        } else {
            this.c = compressedString.charAt(l);
            l++;
            int r;
            for(r = l;r<size;r++)
                if(!(compressedString.charAt(r) >='0' && compressedString.charAt(r)<='9'))
                    break;
            if(r==l)
                count = 1;
            else {
                count = Integer.parseInt(compressedString.substring(l, r));
            }
            l = r;
        }
    }
    
    public char next() {
        if(!hasNext())
            return ' ';
        char next = c;
        if(count==1)
            updateNext();
        else {
            count--;
        }
        return next;
    }
    
    public boolean hasNext() {
        return !(c == null || count == null);
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */