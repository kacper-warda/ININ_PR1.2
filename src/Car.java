public class Car {
    final String producer;
    final String model;
    Double millage;
    String color;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String toString() {
        return "Producer: " + this.producer
                + " Model: " + this.model;
    }
}
