class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length>arr2.length){
            return 1;
        }else if(arr1.length<arr2.length){
            return -1;
        }else{
            int arr1_sum=0;
            int arr2_sum=0;
            for(int i=0;i<arr1.length;i++){
                arr1_sum+=arr1[i];
                arr2_sum+=arr2[i];
            }
            if(arr1_sum>arr2_sum){
                return 1;
            }else if(arr1_sum<arr2_sum){
                return -1;
            }else{
                return 0;
            }
        }
    }
}