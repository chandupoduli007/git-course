class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int j=0;j<stones.length();j++){
            char stone = stones.charAt(j);
        
        for(int i=0;i<jewels.length();i++){
              char jewel = jewels.charAt(i);   
                if(stone == jewel){
                    count++;
                }
         }
        
        }
            return count;
        
       
        
    }
}