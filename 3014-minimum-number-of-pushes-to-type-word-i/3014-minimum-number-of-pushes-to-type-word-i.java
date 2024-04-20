class Solution {
    public int minimumPushes(String word) {
     int push =0;
     for(int i=0;i<word.length();i++){
         if(i/8==0){
             push++;
         }
         else if(i/8==1){
             push+=2;
         }
         else if(i/8==2){
             push+=3;
         }
         else{
             push+=4;
         }
     }  
     return push; 
    }
}