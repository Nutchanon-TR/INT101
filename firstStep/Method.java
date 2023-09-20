package firstStep;

public class Method {
     public static int number(int x, int y) {
          return 20 + x - y;
     }

     public static int numberSum(int x, int y) {
          return x + y;
     }

     public static int numberStar(int x) {
          if (x >= 0) {
               return x * numberStar(x - 2);
          } else {
               return 3;
          }
     }

     public static void main(String[] args) {
          int num01 = number(5, 6);
          System.out.println("This number is " + num01 + ".");

          int num02 = numberSum(5, 3);
          System.out.println("int = " + num02);

          int star = numberStar(51);
          System.out.println("WTF of this result is " + star);

          System.out.println(numberSum(5, 6));

          
     }

}
