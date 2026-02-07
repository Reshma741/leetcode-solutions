class Solution {
    public int[] twoSum(int[] nums, int target) {
HashMap<Integer,Integer> map= new HashMap<>();
for(int i=0;i<nums.length;i++){
    int compliment=target-nums[i];
    if(map.containsKey(compliment)){
        return new int[]{map.get(compliment),i};
    }
    else{
        map.put(nums[i],i);
    }
   
}
 return new int[]{};
    }  
}
    




//        for(int i=0;i<nums.length;i++){
//         for(int j=1;j<nums.length;j++){
//             if(nums[i]+nums[j]==target){
                
//                 return new int[]{i,j};
//             }
//         }
//        }
//        return new int[]{};
        
    
// }
// }