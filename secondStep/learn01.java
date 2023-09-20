package secondStep;

public class learn01 {
     public static void main(String[] args) {
          learn01 spacial = new learn01();
          System.out.println(spacial.text() + spacial.tax(5000));

     }

     public double tax(double amount){

          return amount+100;
     }

     public String text() {
          String t1 = "ค่าใช้จ่ายของคุณคือ ";
          return t1;
     }
}
