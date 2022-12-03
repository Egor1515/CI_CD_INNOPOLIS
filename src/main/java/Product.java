public class Product {
    private int age;
    private int weight;

    public int getAge() {
        return age;
    }

    public Product() {
    }

    public Product(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}