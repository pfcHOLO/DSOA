import java.util.Scanner;
import java.util.Random;

public class RandomRundown {

    public RandomRundown() {
        rand();
    }

    public void rand() {
        while (true) {
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            if (choice.equals("q")) {
                break;
            } else {
                Random random = new Random();
                int randomNr = random.nextInt(100) + 1;
                System.out.println(randomNr);
            }
        }

    }
}