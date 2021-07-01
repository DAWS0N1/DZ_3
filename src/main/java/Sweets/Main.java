package Sweets;

public class Main {
    public static void main(String[] args) {
        SweetBox sweetBox = new SweetBox();
        sweetBox.add(new Cupcake("Cupcake", 1.0f, 150.2f, "С начинкой"));
        sweetBox.add(new Cake("Cake", 5.3f, 1200.0f, "Шоколадный"));
        sweetBox.add(new Macaroons("Macaroons", 2.5f, 605.3f, "Красненькие"));
        sweetBox.add(new Macaroons("Macaroons", 3.5f, 825.3f, "Зелененькие"));
        System.out.println("Общий вес коробки: " + sweetBox.genWeight());
        System.out.println("Общая цена коробки: " + sweetBox.genPrice() + "руб");
        System.out.println(sweetBox.genInfo());
    }
}
