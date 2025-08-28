package _07_dip;

class Pet{
	PetInterface petInter;
	void setPetinter(PetInterface petInter) {
		this.petInter = petInter;
	}
	
	void play() {
		System.out.println(petInter);
	}
}

class Dog implements PetInterface{
	@Override
	public String toString() {
		return "개쇄끼@@@@!";
	}
}

class Cat implements PetInterface{
	@Override
	public String toString() {
		return "고양이련@@@@!";
	}
}

class Hamster implements PetInterface{
	@Override
	public String toString() {
		return "쥐새기@쥐새기@쥐새기@쥐새기@쥐새기@쥐새기@쥐새기@";
	}
}
public class PetRun {

	public static void main(String[] args) {
		Pet pet = new Pet();
		
		pet.setPetinter(new Dog());
		
		pet.play();
		
		pet.setPetinter(new Cat());
		
		pet.play();

		pet.setPetinter(new Hamster());
		
		pet.play();
	}

}
