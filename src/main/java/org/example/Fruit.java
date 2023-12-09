package org.example;

public class Fruit {
    String colour;
    String taste;
    public Fruit(String  colour, String taste)
        {this.colour=colour;
        this.taste=taste;
        }
        public boolean isTasty(){
        return taste.equals("sweet");
        }
       static public Fruit copy(Fruit oldFruit){
        return new Fruit(oldFruit.colour,oldFruit.taste);
        }
}
