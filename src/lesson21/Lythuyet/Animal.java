package lesson21.Lythuyet;

public class Animal {
    public void move() {
        System.out.println("Animal is moving...");
    }
}


class dog extends Animal {
    @Override
    public void move() {
        System.out.println("Fish is moving by swimming...");
    }
}

class cat extends Animal {
    @Override
    public void move() {
        System.out.println("Cat is running...");
    }
}

class bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}