package secondStep;
import firstStep.Method;

public class learn2 {
    public static void main(String[] args) {
        System.out.println(number(5,8));
        
        Method s = new Method();
        int numPlus = s.numberSum(5,100);
        System.out.println (numPlus);

        System.out.println(Method.number(5, 10));

    }

    public static int number (int x, int y){
        return x+y;

    }

}
