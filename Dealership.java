public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars){
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
       }
    }
    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index){
        return new Car(this.cars[index]);
    }
    
    public int getLength(){
        return this.cars.length;
    }





    public void sell(int index){
        if(this.isEmpty()){
            throw new IllegalStateException("Cannot call sell when the dealership is empty.");
        }
        this.cars[index].drive();
        this.cars[index] = null;
    }



    public int search(String make, int budget){
        for (int i = 0; i < this.cars.length; i++) {
            if(this.cars[i]== null){
                continue;
            }else if(this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget){
                System.out.println("\nWe found one in spot " + i + "\n" + cars[i].toString() + " \nIf you are interested, type 'yes' ");
                return i;
            }
        }
        System.out.println("\nYour search didn't match any results.\n");
        return 404;
    }

    public boolean isEmpty(){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] != null){
                return false;
            }
        }
        return true;
    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking spot: "+ i +"\n";
            if(this.cars[i] == null){
                temp += "Empty\n";
            }else{
                temp += this.cars[i].toString() +"\n";
            }
            
        }
        return temp;
    }
}
