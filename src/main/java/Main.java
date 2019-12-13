public class Main {

        public static void main(String[] args) {
            // write your code here

            Dog dog = new Dog();
            dog.setName("Rax");
            dog.eat("food");
            dog.sounds("Barks");

            Cat cat = new Cat();
            cat.setName("Stormy");
            cat.eat("Food");
            cat.sounds("Meows");

            System.out.println("");

            Home home = new Home();
            //Dog dog1 = new Dog();
            //Dog dog2 = new Dog();

            home.makeAllSounds(); // this doesn't do anything
            home.adoptPet(dog);
            home.makeAllSounds();

            System.out.println("");
            home.adoptPet(cat);
            home.makeAllSounds();

            //System.out.println("------------------");
            home.adoptPet(dog);
            home.makeAllSounds();
        }
    }

