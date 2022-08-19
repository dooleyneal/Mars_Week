public class Mars {
    public static void main(String[] args) throws InterruptedException {

        String name = "Dooleytopia";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        //Landing Process
        ShipFood -= ShipPopulation*0.75;
        ShipFood -= ShipPopulation*0.75;

        System.out.println(ShipFood);

        //Food was found
        ShipFood = 1.5*ShipFood;

        //births
        ShipPopulation += 5;




        String LandingLocation = "The Plain";

        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("“Bbzzz Landing on the Plain”");
        }
        else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        Landing = LandingCheck(100);

        new GuessingGame();
        new MarsExpedition();
        new FindingLists();

    }

    public static boolean LandingCheck(int Loops) throws InterruptedException {
        for (int i = 0; i <= Loops; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Keep Center");
            }
            else if (i % 5 == 0) {
                System.out.println("Right");
            }
            else if (i % 3 == 0) {
                System.out.println("Left");
            }
            else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}