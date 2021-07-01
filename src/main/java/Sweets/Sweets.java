package Sweets;

public abstract class Sweets {
    protected String name;
    protected float weight;
    protected float price;
    protected String unical;

    public Sweets(String name, float weight, float price, String unical) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.unical = unical;
    }

    public String getInfo() {
        return "Название: " + name + ", вес: " + weight + "кг, цена: " + price + "руб, " + unical + "; \n";
    }

    public Sweets() {};
}

