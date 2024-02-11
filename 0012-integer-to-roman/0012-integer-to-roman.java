class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        handleM(num,sb);
        return sb.toString();
    }
    
    private void handleM(int num,StringBuilder sb) {
        switch(num/1000) {
            case 3: sb.append("M");
            case 2: sb.append("M");
            case 1: sb.append("M");
        }
        handleC(num%1000,sb);

    }
    
     private void handleC(int num,StringBuilder sb) {
         if (num >=500 && num <900)
             sb.append("D");
        switch(num/100) {
            case 9: sb.append("CM");break;
            case 8: sb.append("C");
            case 7: sb.append("C");
            case 6: sb.append("C");break;
            case 4: sb.append("CD");break;
            case 3: sb.append("C");
            case 2: sb.append("C");
            case 1: sb.append("C");
        }
         handleX(num%100,sb);
    }
    
    private void handleX(int num,StringBuilder sb) {
         if (num >=50 && num <90)
             sb.append("L");
        switch(num/10) {
            case 9: sb.append("XC");break;
            case 8: sb.append("X");
            case 7: sb.append("X");
            case 6: sb.append("X");break;
            case 4: sb.append("XL");break;
            case 3: sb.append("X");
            case 2: sb.append("X");
            case 1: sb.append("X");
        }  
        handleI(num%10,sb);
    }
    
    private void handleI(int num,StringBuilder sb) {
         if (num >=5 && num <9)
             sb.append("V");
        switch(num) {
            case 9: sb.append("IX");break;
            case 8: sb.append("I");
            case 7: sb.append("I");
            case 6: sb.append("I");break;
            case 4: sb.append("IV");break;
            case 3: sb.append("I");
            case 2: sb.append("I");
            case 1: sb.append("I");
        }  
    }
    
    
}