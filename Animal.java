class animal1 {
	public void makesound() {
	}
	public void eat() {
	}
}
	
	class Dog extends animal1 {
		@Override
		public void makesound() {
			System.out.println("dog makes vau vau sound.");
		}
		@Override
		public void eat() {
			System.out.println("Dog eats Haddi.");
		}
	}
	class Cat extends animal1 {
		@Override
		public void makesound() {
			System.out.println("Cat makes meaw meaw sound.");
		}
		@Override
		public void eat() {
			System.out.println("Cat eats fish.");
	}
	}
	class Bird extends animal1 {
		@Override
		public void makesound() {
			System.out.println("Bird makes kichir michir sound.");
		}
		@Override
		public void eat() {
			System.out.println("Bird eats bugs.");
		}
	}
	public class Animal{
		public static void main(String[] args) {
			animal1 dog = new Dog();
			animal1 cat = new Cat();
			animal1 bird = new Bird();
			dog.makesound();
			dog.eat();
			cat.makesound();
			cat.eat();
			bird.makesound();
			bird.eat();
		}
	}