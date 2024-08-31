public class Dog extends Animal{
    @Override
    Dog makeSound() {  // Covariant return type
        System.out.println("Dog barks");
        return new Dog();
    }
}
