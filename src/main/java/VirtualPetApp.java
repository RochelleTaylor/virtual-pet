import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet name = new VirtualPet();

		System.out.println("What do you want to name your pet?");
		String enterName = input.nextLine();

		String optionsEntered = "";
		do {
			System.out.println(enterName);
			System.out.println("Hunger:" + name.getHunger());
			System.out.println("Thirst:" + name.getThirst());
			System.out.println("Bathroom:" + name.getWaste());
			System.out.println("Boredom:" + name.getBoredom());
			System.out.println("Health:" + name.getSickness());
			System.out.println();
			System.out.println();
			System.out.println("What do you wan to to do with your pet?");

			System.out.println("Press 1 to feed " + enterName);
			System.out.println("Press 2 to give " + enterName + " water");
			System.out.println("Press 3 to take " + enterName + " to bathroom");
			System.out.println("Press 4 to play with " + enterName);
			System.out.println("Press 5 to to give " + enterName + " medicine");
			optionsEntered = input.nextLine();

			switch (optionsEntered) {
			case "1": {
				name.feedPet();
				System.out.println("You fed " + enterName);
				break;
			}
			case "2": {
				name.waterPet();
				System.out.println("You watered " + enterName);
				break;
			}
			case "3": {
				name.playWithPet();
				System.out.println("You played with " + enterName);
				break;
			}
			case "4": {
				name.takePetToBathroom();
				System.out.println("You took " + enterName + " to the bathroom");
				break;
			}
			case "5": {
				name.healPet();
				System.out.println("You made " + enterName + " feel better!");
				break;
			}
			}
			name.tick();
		} while (true);
	}
}
