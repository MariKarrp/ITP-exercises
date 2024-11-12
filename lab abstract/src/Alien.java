class Alien extends Creature {
    @Override
    void born(){
        this.name = "Xyster";
        this.isAlive = true;
        System.out.println("The Alien "+ name+" born");
    }
    void die(){
        this.isAlive = false;
        System.out.println("The Alien "+name+ " has died");
    }
}
