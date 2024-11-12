class Human extends Creature {
    @Override
    void born() {
        this.name = "Jack";
        this.isAlive = true;
        System.out.println("The Human " + name + " was born");
    }
    @Override
    void die() {
        this.isAlive = false;
        System.out.println("The Human " + name + " has died");
    }
}