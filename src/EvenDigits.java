public class EvenDigits {
    public static void main(String[] args) {
       int[]nums={18,124,9,1768,8,1};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){

            if(even(num)){
                count++;
            }
        }

        return count;
    }
      //Function to check whether the number contains even digits or not.
     static boolean even(int num) {
         int numberOfDigits = digit(num);
         if (numberOfDigits % 2 == 0) {
             return true;
         }
         return false;
     }

    static int digit(int num){
       //For negative elements in the array
       if(num<0){
           num=num*-1;
       }
       if(num==0){
           return  1;
       }
      int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
