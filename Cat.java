public class Cat extends Animal{
	private String breed;

	public Cat (String name, double weight, String breed){
		super(name,weight);
		this.breed=breed;
	}

	@Override
	public String makeSound() {
		return "Meow!Meow!";
	}
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed){
		this.breed=breed;
	}
}
