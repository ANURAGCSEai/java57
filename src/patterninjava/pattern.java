//package patterninjava;
//
//public class pattern {
//    public static void main(String[] args) {
//        int n  = 4;
//        int  m = 5;
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= m; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}



//Holo rectangle

//package patterninjava;
//
//public class pattern {
//    public static void main(String[] args) {
//
//        int n = 4;
//        int m = 5;
//        //outer loop
//        for(int i = 1;i<=n;i++){
//            //inner loop
//            for(int j = 1;j<=m;j++){
//                if(i==1||i==n||j==1||j==m){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//
//    }
//
//}
//
//


//half pramid question

//package patterninjava;

//public class pattern {
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//    }
//}


//public class pattern {
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//    }
//}

//inverted half pramid


//package patterninjava;
//public class pattern {
//    public static void main(String[] args) {
//    int n =5;
//    for(int i=1;i<=n;i++){
//        for(int j = 1;j<=n-i+1;j++){
//            System.out.print(j);
//        }
//        System.out.println();
//    }
//    }
//}


//floyd's Triangle

//package patterninjava;
//public class pattern {
//    public static void main(String[] args) {
//        int n =5;
//        int number = 1;
//        for(int i=1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }
//    }
//}

//0-1 Triangle

//package patterninjava;
//public class pattern {
//    public static void main(String[] args) {
//        int n =5;
//       for(int i=1;i<=n;i++){
//           for(int j = 1;j<=i;j++){
//               int sum = i+j;
//               if(sum%2==0){
//                   System.out.print("1");
//               }
//               else {
//                   System.out.print("0");
//               }
//
//           }
//           System.out.println(" ");
//       }
//    }
//}


//{ ADVANCE PATTERN PROBLEM }

//package patterninjava;
//public class pattern {
//    public static void main(String[] args) {
//                int n = 4;
//
//
//                //upper part
//                for(int i=1; i<=n; i++) {
//                    for(int j=1; j<=i; j++) {
//                        System.out.print("*");
//                    }
//
//
//                    int spaces = 2 * (n-i);
//                    for(int j=1; j<=spaces; j++) {
//                        System.out.print(" ");
//                    }
//
//
//                    for(int j=1; j<=i; j++) {
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//
//            }
//}
////lower part
// for(int i=n; i>=1; i--) {
//        for(int j=1; j<=i; j++) {
//        System.out.print("*");
//           }
//
//
//int spaces = 2 * (n-i);
//           for(int j=1; j<=spaces; j++) {
//        System.out.print(" ");
//           }
//
//
//                   for(int j=1; j<=i; j++) {
//        System.out.print("*");
//           }
//                   System.out.println();
//       }
//               }
//               }
//
//


// SOLID RHOMBUS

//package patterninjava;
//public class pattern {
//    public static void main(String[] args) {
//        int n = 5;
//
//
//        //upper part
//        for (int i = 1; i <= n; i++) {
//            //spaces
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            //star
//            for(int j= 1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}


//NUMBER PRAYMID

package patterninjava;
public class pattern {
    public static void main(String[] args) {
        int n = 5;
//

        //upper part
        for (int i = 1; i <= n; i++) {
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j= 1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }

    }
}
