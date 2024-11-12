class Dog extends Creature {
    @Override
    void born(){
        this.name = "Sharik";
        this.isAlive = true;
        System.out.println("The Dog "+ name+" born");
    }
    void die(){
        this.isAlive = false;
        System.out.println("The Dog "+name+ " has died");
    }
    public void bark(){
        if (isAlive){
            System.out.println("The Dog "+name+" bark bark bark");
        } else {
            System.out.println("so sorry..");
        }
    }
}
