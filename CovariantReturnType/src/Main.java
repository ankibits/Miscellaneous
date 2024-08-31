public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();  // Outputs: Animal makes a sound

        Dog d = new Dog();
        d.makeSound();  // Outputs: Dog barks

        Animal ad = new Dog();
        ad.makeSound();  // Outputs: Dog barks
    }
}