package StarterPack_testOOP.DogSystem;

    public class Dog {
        private String name;
        private int age;
        private String breed;

        //constructor
        public Dog(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }
        //getter setter
        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String getBreed() {
            return this.breed;
        }   

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void bark() {
            System.out.println(this.name + " is barking.");
        }

        public void run() {
            System.out.println(this.name + " is running.");
        }
    }

