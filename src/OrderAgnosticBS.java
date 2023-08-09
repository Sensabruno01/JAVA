public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={89,45,22,18,16,15,4,3,2,0,-4,-12,-18};descending order array
        int [] arr={1,4,5,6,7,8,14,56,78,89};//ascending order array
        int target=7;
        int ans= orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[]arr, int target){

        int start=0;
        int end=arr.length-1;

        //Checking whether the array is ascending or descending
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }

        while(start<=end){

            int mid= start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
               if(target<arr[mid]){
                end = mid-1;
              }else{
                start =mid+1;
              }

           }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
        }

 return -1;
    }
}
