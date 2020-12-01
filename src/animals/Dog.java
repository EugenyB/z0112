package animals;

public class Dog extends Animal {

    public Dog(String name) {
        setName(name);
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }
}
