package com.company;

class Vehicle{
    int releaseDate;
    String name;
    String model;
    String color;

    public Vehicle(int releaseDate, String name, String model, String color) {
        this.releaseDate = releaseDate;
        this.name = name;
        this.model = model;
        this.color = color;
    }

    void display(){
        System.out.println("Release Date: "+releaseDate+" Name: "+name+" Model: "+model+" Color: "+color);
    }
}
//Has_A Relationship with Vehicle
class BMW{
    Vehicle vehicleBMW = new Vehicle(12,"BMW","2013","Red");
    engine BMWengine = new engine();

}
//Is_A Relation with BMW
class engine{
    void start(int speed){
        System.out.println("Engine start at: "+speed+"km/h");
    }
    void stop(int speed){
        System.out.println("Engine stop at: "+speed+"km/h");
    }
    void run(int speed){
        System.out.println("Engine run at : "+speed+"km/h");
    }
}

public class Main {

    public static void main(String[] args) {
        BMW bmw1 = new BMW();
        bmw1.vehicleBMW.display();
        bmw1.BMWengine.start(0);
        bmw1.BMWengine.run(150);
    }
}

/*IS_A relationship defines with extends where child class uses properties of parent class and don't create object in it.
Has_A relationship doesn't extends and create object in own class.*/
