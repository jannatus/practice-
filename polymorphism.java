class Animal {
    void move() {
        System.out.println("Animal moves");
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal {
    void move() {
        System.out.println("Bird flies in the sky");
    }

    void makeSound() {
        System.out.println("Bird chirps");
    }
}

class Panthera extends Animal {
    void move() {
        System.out.println("Panthera walks silently");
    }

    void makeSound() {
        System.out.println("Panthera roars");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Bird();
        Animal a2 = new Panthera();

        a1.move();
        a1.makeSound();
        a2.move();
        a2.makeSound();
    }
}
