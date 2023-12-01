public class Car {
    private String make;
    private String model;

    private Engine engine;

    Car(String make , String model , Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public void carStart(){
        System.out.println("Car Started");
        engine.startEngine();
    }
}
