public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        Car passerati = new Car("VW", "Passat");
        passerati.millage = 80000.0;

        System.out.println(passerati.producer);
        System.out.println(passerati.model);
        System.out.println(passerati);
    }
}