
public class VirtualPet {

	private int hunger= 30;

	private int thirst= 30;

	private int waste= 30;

	private int boredom= 30;

	private int sickness=30;

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
}
