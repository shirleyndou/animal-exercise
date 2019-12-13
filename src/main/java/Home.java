import java.util.Arrays;

public class Home {
    private Animal[] animals = new Animal[0];
    private int i= 0;

    void adoptPet(Animal myAni) {

        animals = Arrays.copyOf(animals, animals.length+1);
        animals[animals.length-1] = myAni;

        if(i<animals.length)
        {
            animals[i]=myAni;
            String animal = "";
            if(myAni.getClass() == Dog.class) {
                animal = "dog";
            }else{
                animal ="cat";}

            System.out.println("adopted a " + animal);
            i++;
        }
    }

    void makeAllSounds() {

        for (Animal animal : animals) {
            animal.sounds();
        }
    }

}
