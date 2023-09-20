package firstStep;

public class wtfofOOP {
     int x = 5;
     int y = 6;
     String name01 = "Jack";
     String name02 = "Momo";
     String name03 = "Kokiro";

     public void trueName(){
          System.out.print("Harumi ");
          System.out.print("Konoha ");
          System.out.println("Misuru");
     }

     public void gameCalling(){
          System.out.println("Fighting Dog Cat");
          System.out.println("Run into the end");
     }

     public void gameSetting(int numSold,int numFix){
          System.out.println("Sold : " + numSold);
          System.out.println("Fix : " + numFix);
     }

     public static void main(String[] args) {
          wtfofOOP list = new wtfofOOP();
          System.out.println("Name = " + list.name01 + " : Age = " + list.x);
          System.out.println("Name = " + list.name02 + " : Age = " + list.y);
          
          wtfofOOP callName = new wtfofOOP();
          callName.trueName();
          
          wtfofOOP game = new wtfofOOP();
          game.gameCalling();
          game.gameSetting(50, 100);
     }

          
          


}
