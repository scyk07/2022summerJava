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
        Taxi taxi = new Taxi();

        taxi.prtName();
        taxi.move(17.5);
    }
}

class Taxi extends Car{
    Taxi(){
        super("Taxi", 4);
    }
}