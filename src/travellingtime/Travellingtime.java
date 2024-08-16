
package travellingtime;

public class Travellingtime {

       public static void main(String[] args) {
        int totalDistance = 10000; // in km
        int speed = 250; // in km/h
        int passengerStopDistance = 150; // in km
        int refuelStopDistance = 200; // in km
        int stopTimeMinutes = 5; // time per stop in minutes

        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;

        int totalStops = passengerStops + refuelStops;

        double travelTimeHours = (double) totalDistance / speed; // travel time in hours
        double stopTimeHours = (double) totalStops * stopTimeMinutes / 60; // stop time in hours

        double totalTimeHours = travelTimeHours + stopTimeHours;

        System.out.println("The total time taken to travel from Kampala to Kabale is " + totalTimeHours + " hours.");
    }
}

       
           

