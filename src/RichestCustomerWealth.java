public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(richest(accounts));

    }

    static int richest(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int row = 0;row< accounts.length;row++){
            int sum=0;
            for(int col = 0;col<accounts[row].length;col++){
                sum+=accounts[row][col];
            }
            //Now we have sum of columns of row
            //Check the overall ans
            if(sum> ans){
                ans=sum;
            }
        }
        return ans;
    }
}
