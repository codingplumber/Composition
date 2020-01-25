package jason.company;

public class CoffeeTable {
    private String color;
    private String material;
    private int length;
    private int height;

    public CoffeeTable(String color, String material, int length, int height) {
        this.color = color;
        this.material = material;
        this.length = length;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
