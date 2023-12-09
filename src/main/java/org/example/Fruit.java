package org.example;

public class Fruit {
    String colour;
    String taste;
    String name;
    public Fruit(String  colour, String taste,String name)
        {this.colour=colour;
        this.taste=taste;
         this.name=name;
        }
        public boolean isTasty(){
        return taste.equals("sweet");
        }
       static public Fruit copy(Fruit oldFruit){
        return new Fruit(oldFruit.colour,oldFruit.taste);
        }
}
