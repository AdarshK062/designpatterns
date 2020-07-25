package Adarsh.designpatterns.design;

import Adarsh.designpatterns.abstractfactory.*;
import Adarsh.designpatterns.builderpattern.House;
import Adarsh.designpatterns.chainofresponsibility.Login;
import Adarsh.designpatterns.proxypattern.Client;
import Adarsh.designpatterns.srp.CalorieTracker;
import Adarsh.designpatterns.srpstatepattern.Phone;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
    	System.out.println("\n***** Design Principles *****");
        System.out.println("\n***** Single Responsibility Principle *****");
        CalorieTracker calorieTracker = new CalorieTracker(1000);
        calorieTracker.trackCalories(3000);
        calorieTracker.trackCalories(4000);
        System.out.println("\n***** Abstract Factory Pattern *****");
        System.out.println("\nLion and Cow implements Animals");
        Lion lion = new Lion();
        lion.eats();
        lion.makeSound();
        lion.sleeps();
        Cow cow = new Cow();
        cow.eats();
        cow.makeSound();
        cow.sleeps();
        System.out.println("\n***** Builder Pattern *****");
        House house = new House(true, true, true, false, false, true);
        house.detailsOfHouse();
        System.out.println("\n***** -State Pattern *****");
        Phone phone = new Phone();
        phone.makeCallTo("1234567890");
        System.out.println("\n***** Proxy Pattern *****");
        Client client = new Client();
        client.connectTo("instagram.com");
        client.connectTo("geeksforgeeks.com");
        System.out.println("\n***** Chain Of Responsibilites Pattern *****");
        Login login = new Login("ak","ak123");
        login = new Login("admin","admin");
    }
}
