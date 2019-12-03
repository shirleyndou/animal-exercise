package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTests{

    @Test
    public void TestDogSound(){
        Dog test1 = new Dog();
        String soundResult = test1.sounds("Barks");
        assertEquals("Barks", soundResult);
    }

    @Test
    public void TestDogEats()
    {
        Animal test2 = new Animal();
        String eatResult = test2.eat("Food");
        assertEquals("Food", eatResult);
        //assertEquals("food","FOOD".toLowerCase()); //BONUS assertion
        assertTrue("food".equalsIgnoreCase("Food"));//BONUS assertion
    }

    @Test
    public void TestCatSound()
    {
        Cat test3 = new Cat();
        String cat = test3.sounds("Meows");
        assertEquals("Meows", cat);
    }

    @Test
    public void TestCatEats()
    {
        Animal test4 = new Animal();
        String eatResult = test4 .eat("Food");
        assertEquals("Food", eatResult);

        assertEquals("food","Food".toLowerCase()); //Bonus assertion
    }
}