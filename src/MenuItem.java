public class MenuItem {

    // 속성
    private String name;
    private double price;
    private String description;

    //생성자
    public MenuItem (String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //기능
    @Override
    public String toString() {
        return name + " | w " + price + " | " + description;
    }

    //게터
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
