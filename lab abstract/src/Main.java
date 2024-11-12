public class Main {
    public static void main(String[] args) {
        Creature h = new Human();
        h.born();
        h.die();
        Creature a = new Alien();
        a.born();
        a.die();
        Dog d = new Dog();
        d.born();
        d.die();
        d.bark();
    }
}