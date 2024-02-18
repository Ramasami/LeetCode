class Solution {
public:
    string intToRoman(int num) {
        string sb;
        handleM(num,sb);
        return sb;
    }
    
    void handleM(int num,string &sb) {
        switch(num/1000) {
            case 3: sb+="M";
            case 2: sb+="M";
            case 1: sb+="M";
        }
        handleC(num%1000,sb);

    }
    
     void handleC(int num,string &sb) {
         if (num >=500 && num <900)
             sb+="D";
        switch(num/100) {
            case 9: sb+="CM";break;
            case 8: sb+="C";
            case 7: sb+="C";
            case 6: sb+="C";break;
            case 4: sb+="CD";break;
            case 3: sb+="C";
            case 2: sb+="C";
            case 1: sb+="C";
        }
         handleX(num%100,sb);
    }
    
    void handleX(int num,string &sb) {
         if (num >=50 && num <90)
             sb+="L";
        switch(num/10) {
            case 9: sb+="XC";break;
            case 8: sb+="X";
            case 7: sb+="X";
            case 6: sb+="X";break;
            case 4: sb+="XL";break;
            case 3: sb+="X";
            case 2: sb+="X";
            case 1: sb+="X";
        }  
        handleI(num%10,sb);
    }
    
    void handleI(int num,string &sb) {
         if (num >=5 && num <9)
             sb+="V";
        switch(num) {
            case 9: sb+="IX";break;
            case 8: sb+="I";
            case 7: sb+="I";
            case 6: sb+="I";break;
            case 4: sb+="IV";break;
            case 3: sb+="I";
            case 2: sb+="I";
            case 1: sb+="I";
        }
    }
};