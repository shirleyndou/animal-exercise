package com.company;


public class Animal {

    private String name;

    void setName(String name){

        if(name == "Stormy" || name=="Rax")
        {
            this.name=name;
        }


    }


    void eat()
    {
        System.out.println(name + " eats");
    }

    public void sounds()
    {
        System.out.println("sounds... ");
    }
}
