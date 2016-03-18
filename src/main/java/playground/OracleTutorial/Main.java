package playground.OracleTutorial;


public class Main {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(5, 5, 5);
        bicycle.speedUp(10);

        Bicycle mountainBike = new MountainBike(7, 7, 7, 1);


        System.out.println(mountainBike);

    }
}
