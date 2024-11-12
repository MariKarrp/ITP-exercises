abstract class Creature {
    abstract void born();
    abstract void die();
    String name = null;
    boolean isAlive = false;
    void shoutName() {
        if (name != null){
            System.out.println(name);
        } else {
            System.out.println("error");
        }
    }

}
