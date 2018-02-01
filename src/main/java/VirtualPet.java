
public class VirtualPet {

	private int hunger = 30;

	private int thirst = 30;

	private int waste = 30;

	private int boredom = 30;

	private int sickness = 30;
	boolean petIsAlive = true;

	public VirtualPet() {

	}

	// constructors
	public VirtualPet(int hunger, int thirst, int waste, int boredom, int sickness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
		this.sickness = sickness;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getSickness() {
		return sickness;
	}

	// Class behavior method
	public void tick() {
		this.hunger++;
		this.boredom++;
		this.waste++;
		this.sickness++;
		this.thirst++;

		if (this.hunger > 100 || this.boredom > 100)
			;
		this.petIsAlive = false;

		if (this.waste > 100 || this.sickness > 100)
			;
		this.petIsAlive = false;

		if (this.thirst > 100)
			;
		this.petIsAlive = false;
	}

	public void feedPet() {
		this.hunger -= 20;
	}

	public void waterPet() {
		this.thirst -= 20;
	}

	public void playWithPet() {
		this.boredom -= 20;
	}

	public void takePetToBathroom() {
		this.waste -= 20;
	}

	public void healPet() {
		this.sickness -= 20;
	}
}
