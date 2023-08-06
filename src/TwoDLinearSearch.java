import java.util.Arrays;
public class TwoDLinearSearch {

    //Searching in 2d array
//    public static void main(String[] args){
//
//        int[][] arr = {
//                {1,2,3,4},
//                {34,56},
//                {100,0,99,200}
//        };
//
//        int target = 40;
//        int[]ans=searchIn2D(arr,target);
//        System.out.println(Arrays.toString(ans));
//    }
//
//
//    static int[] searchIn2D(int[][] arr, int target){
//
//       for(int row = 0; row <arr.length;row++){
//
//           for(int col = 0;col <arr[row].length ;col++){
//
//               if(arr[row][col] == target){
//
//                   return new int[]{row,col};
//               }
//           }
//       }
//
//
//        return new int[]{-1,-1};
//    }

    public static void main(String[] args) {
        int arr[][]={
                {1,4,5,9},
                {8900, 45, 12, 45},
                {333,46,79}
        };
        System.out.println(max(arr));

    }

    static int max(int arr[][]){
//        int max=arr[0][0]; or the below format
        int max= Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] > max){
                    max=arr[row][col];

                }
            }
        }
        return max;
    }
}
