class StringIterator {
public:
    
    string compressedString;
    char ch;
    int ptr,count,size;
    
    StringIterator(string compressedString) {
        this->compressedString = compressedString;
        size = compressedString.length();
        ptr = 0;
        getNext();
    }
    
    void getNext() {
        if(ptr == size) {
            count == 0;
            ch = ' ';
        } else {
            ch = compressedString[ptr];
            ptr++;
            count = 0;
            for(int r=ptr;r<size;r++,ptr++) {
                if(!isdigit(compressedString[r]))
                    break;
                else {
                    count = count*10+compressedString[r]-'0';
                }
            }
            count = max(count, 1);
        }
    }
    
    char next() {
        if(!hasNext()) {
            return ' ';
        } else {
            char c = ch;
            count--;
            if(count == 0)
                getNext();
            return c;
        }
    }
    
    
    
    bool hasNext() {
        return count != 0;
    }
};

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator* obj = new StringIterator(compressedString);
 * char param_1 = obj->next();
 * bool param_2 = obj->hasNext();
 */