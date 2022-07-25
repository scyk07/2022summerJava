public class Car {
    String name;
    int seat;
    Car(){
        name = new String();
        seat = 0;
    }
    Car(String name, int seat){
        name = new String(name);
        seat = seat;
    }

    public void move(double distance){

    }
    public String getName(){
        return name;
    }
    public void prtName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Car taxi = new Car("Taxi", 4);

        taxi.prtName();
    }
}
