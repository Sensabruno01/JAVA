public class SearchInRange {
//Linear Search in Range
    public static void main(String[] args){
        int[] arr={12,34,56,78,56,790};
//        int target = 56;
//        int start =1;
//        int end = 2;
        int result = range(arr,56,1,2);
        System.out.println(result);

    }

    static int range(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index = start;index<=end;index++){
            if(arr[index]==target){
                return index;
            }

        }
        return -1;
    }
}
