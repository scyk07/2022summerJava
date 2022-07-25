public class Car {
    String name;
    int seat;
    Car(){
        name = new String();
        seat = 0;
    }
    Car(String name, int seat){
        this.name = new String(name);
        this.seat = seat;
    }

    public void move(double distance){
        System.out.printf("%s는 %fkm만큼 이동했습니다.\n", this.name, distance);
    }
    public String getName(){
        return name;
    }
    public void prtName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Car taxi = new Taxi("Seokjun"); // Up Casting
        Car notTaxi = new Car("Truck", 3);

        Taxi taxi2 = new Taxi(); // Down Casting

        if(taxi instanceof Taxi)
            taxi2 =(Taxi) taxi;

        if(notTaxi instanceof Taxi)
            taxi2 =(Taxi) notTaxi;

        taxi2.prtName();
        taxi2.prtPassName();
        taxi2.move(17.5);
    }
}

class Taxi extends Car{
    String passenger;

    Taxi(){
        super("Taxi", 4);
        passenger = new String();
    }

    Taxi(String passenger){
        super("Taxi", 4);
        this.passenger = passenger;
    }

    public void prtPassName(){
        System.out.println("Passenger:" + passenger);
    }

    public void prtName(){
        System.out.println("Taxi's name is " + name);
    }


}