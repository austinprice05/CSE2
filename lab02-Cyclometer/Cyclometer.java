/*
Austin Price
CSE 2
Lab 2
9/5/2014

Cyclometer Java Program

first compile program
    javac Cyclometer.java
run program
    java Cyclometer
*/
// define class
public class Cyclometer {
    // add method
    public static void main(String[] args) {
        int secsTrip1=480; //time for trip 1
        int secsTrip2=3220; //time for trip 2
        int countsTrip1=1561; //counts for trip 1
        int countsTrip2=9037; //counts for trip 2
        double wheelDiameter=27.0, //Wheel Diameter
        PI=3.14159, //number use for PI
        feetPerMile=5280, // conversion from mile to feet
        inchesPerFoot=12, // conversion from feet to inches
        secondsPerMinute=60; // conversion from minute to secs
        double distanceTrip1, distanceTrip2,totalDistance; //
        //Print time it took for trip and number of counts
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute) +" minutes and had "+ (countsTrip1)+ " counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute) +" minutes and had "+ (countsTrip2)+ " counts.");
        //run the calculations; store the values. 
        //Document calculations here. calculating distance of trip in miles
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        // (for each count, a rotation of the wheel travels the diameter in inches * PI
        distanceTrip1/=inchesPerFoot/feetPerMile; // distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // distance in miles
        totalDistance=distanceTrip1+distanceTrip2;
        // Print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
    }
}