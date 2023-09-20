package StarterPack_testOOP.DogSystem;
public class TestDog {
     
          public static void main(String[] args) {
               Dog dog1 = new Dog("Ken", 10, "Temple");
               dog1.bark();
               System.out.println(dog1.getName());
               System.out.println(dog1.getAge());
               System.out.println(dog1.getBreed());
               dog1.run();
          }
     }

