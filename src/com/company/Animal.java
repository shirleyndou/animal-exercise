package com.company;


public class Animal {

    private String name;

    void setName(String name){

        if(name == "Stormy" || name =="Rax")
        {
            this.name=name;
        }


    }


   public String eat(String Food)
    {
        System.out.println(name + " eats " + Food);
        return Food;
       // System.out.println(name + " eats");
    }

    public String sounds()
    {
        System.out.println("sounds... ");
        return null;
    }
}
