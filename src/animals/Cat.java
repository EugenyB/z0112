package animals;

public class Cat extends Animal {

    public Cat(String name) {
        setName(name);
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
