public class Sheep extends Animal{
	private String farm;

	public Sheep (String name, double weight, String farm){
		super(name,weight);
		this.farm=farm;
	}

	@Override
	public String makeSound() {
		return "Baaa!Baaa!";
	}
	public String getBreed() {
		return farm;
	}

	public void setFarm(String farm){
		this.farm=farm;
	}
}
