import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingLists {
    public FindingLists() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition. Time to catalog everything you found,");

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);
        System.out.println("Wait a second, that last on is not a rock, delete that from the list.");

        rockList.remove("not rock");

        System.out.println(rockList);
        System.out.println("Perfect");


        Thread.sleep(500);

        HashMap<String, String> fossilDirectory = new HashMap<>();
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil.");

        System.out.println("Which fossil would you like to learn more about (spelling and spacing is important)?");

        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        else {
            System.out.println("No choice them.");
        }


        Thread.sleep(500);

        HashSet<String> suppliesBought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();

        suppliesBought.add("food");
        suppliesBought.add("water");
        suppliesBought.add("Medicine");

        suppliesUsed.add("water");
        suppliesBought.remove("water");

        suppliesUsed.add("food");
        suppliesBought.remove("food");

        System.out.println("Supplies Left: " + suppliesBought);

        input.close();
    }
}