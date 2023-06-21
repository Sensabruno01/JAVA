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

//        int n=5;
//        for (int i=1;i<=n;i++){
//
//            for(int j=1;j<=n-i+1;j++)
//            {
//                System.out.print(j);
//            }
//                   System.out.println();
//        }
//
//Print the pattern-Floyd's Pattern
// 1
// 23
// 456
// 78910
// 1112131415

//        int n=5;
//        int number=1;
//
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=i;j++){
//
//                System.out.print(number + " ");
//                number=number+1;//number++
//            }
//            System.out.println();
//        }

// Print the pattern- 0 1 Triangle
// 1
// 0 1
// 1 0 1
// 0 1 0 1
//1 0 1 0 1

//        int n = 5;
//
//outer loop tells how many rows are there
//        for(int i=1;i<=n;i++)
//        {
//            for( int j=1;j<=i;j++){
//                int sum=i+j;
//                if(sum % 2 == 0) {//even
//                    System.out.print("1 ");
//                }
//                else {
//                    System.out.print("0 ");//odd
//                }
//            }
//            System.out.println();
//        }
    }
}