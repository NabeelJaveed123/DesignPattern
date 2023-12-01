public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("VTI Oriel");
        Car ob = new Car("2007" , "Honda City " , engine);

        ob.carStart();
    }
}