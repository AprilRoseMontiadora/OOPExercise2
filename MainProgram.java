public class MainProgram{
	public static void main(String[] args) {
		Animal animal;
		Cat cat = new Cat ("Snow",7, " Siberian");
		Sheep sheep=new Sheep("Bob", 1, "Harri"); 

		animal=cat;
		System.out.println(animal.makeSound()+ " " + "My name is "+ animal.getName());

		animal=sheep;
		System.out.println(animal.makeSound()+ " " + "My name is "+ animal.getName());
	}
}
