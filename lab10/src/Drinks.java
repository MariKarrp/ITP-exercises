public enum Drinks {
    Cola("Coke", 75),
    Sprite("Sprite", 90),
    Fanta("Fanta", 80);
    final String name;
    final int price;
    Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + "/$" + price;
    }
}
