public class LinearSearch {
    public static void main(String args[]){
       int[] arr ={12,13,45,67,89};
       int target = 45;
       int ans= linearSearch(arr,target);
        System.out.println(ans);

    }
    //Search in the array:return index if item is found
    //-->of item is not found return -1
    static int linearSearch(int[] arr,int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        //run for loop
        for(int index=0;index<arr.length;index++){
            //Checkimg for element at every index
            if(arr[index] == target)
            {
                return index; //if you want to return the target element itself-->qw can write the return statement as return arr[index]; or the below enhanced for loop.

            }
//            for (int element : arr) { //For every element in the array if the element is equal to tne target,then return the target
//                if (element == target) {
//                    return element;
//
//                }

            }
      //This statement will work if none of the above statements are executed,hence the target not found.
        return -1;
    }
}
