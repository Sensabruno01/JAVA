public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};//sorted array
        int target =345;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }

    //Return the index
    //Return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            //Find the middle element
         //   int mid=start+end/2; might be possible that the start + end exceeds thr range of integer in java--> in this case we will get an error.
            int mid=start+(end-start)/2;
            if( target < arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;

            }else{
                return mid;//ans
            }
        }
        return -1;
    }
}
