package _06_notDip;


class Dog {
	@Override
	public String toString() {
		return "강아지";
	}
}


class Cat {
	@Override
	public String toString() {
		return "고양이";
	}
}

class Hamster {
	@Override
	public String toString() {
		return "쥐새끼";
	}
}
public class Pet {
	Dog dog;
	Cat cat;
	Hamster ham;
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	public void setHam(Hamster ham) {
		this.ham = ham;
	}
	

}
