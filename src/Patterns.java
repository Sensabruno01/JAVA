public class Patterns {

    public static void main(String args[]) {
//Print the following pattern-Hollow triangle
//   *****
//   *   *
//   *   *
//   *****
//        int n = 4;
//        int m = 5;
//        //outer loop
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//
//                if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//Print the pattern -half pyramid

//*
//**
//***
//****
//        int n =4;
//        for(int i=1;i<=n;i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//Print the pattern-inverted half pyramid
//        ****
//        ***
//        **
//        *
//        int n = 4;
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//Print the pattern-inverted half pyramid rotated 180 deg

//          *
//         **
//        ***
//       ****

//        int n=4;
//
//        for(int i=1;i<=n;i++){
//                for(int j=1;j<=n-i;j++){
//                    System.out.print(" ");
//                }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//                System.out.println();
//        }


//Print half pyramid with numbers

//1
//12
//123
//1234

//        int n=4;
//        for(int i=1; i<=n;i++){
//
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//Print the pattern-inverted half pyramid with numbers

        int n=5;
        for (int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
                   System.out.println();
        }




    }
}