public class SearchInString {

    public  static void main(String[] args){
        String str = "Bruno";
        char target = 'u';
        boolean result = search(str,target);
        System.out.println(result);

    }

    static boolean search(String str,char target){

        if (str.length() == 0){
            return false;
        }

        for( int i = 0;i<str.length();i++){

            if(str.charAt(i) == target)
            {
                return true;
            }
        }
//        for( char ch: str.toCharArray())
//        {  //This is for each loop where we convert the string into a character array and check for each character
//             if(ch == target)
//             {
//                return true;
//             }
//        }
        return false;//if none of the conditions work,to return false
    }
}
