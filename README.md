# Sell_Cars
 
 ## This is a  Java Desktop Application which used to sell Cars

It run on command line

It started by asking the use the type of car he/she want to buy and the bugdet their have ofcourse in order to know what 
kind of car which match the need of customer

![image](https://user-images.githubusercontent.com/103323625/192791423-dfa8404d-10a3-4802-8aed-ec09817bb8ee.png)

After receiving the need of customer we give them the feedback 
For example here the need of customer don't match our store and we decide to show him/her what we have
in our store so he/she can decide what to do after

![image](https://user-images.githubusercontent.com/103323625/192792312-e922ad8d-02c1-4a9a-abee-4c40af704475.png)

After getting our feedback a client decide to buy what we have in our store
and we give him/her a possibility of buying it if he/she really interested 

![image](https://user-images.githubusercontent.com/103323625/192793026-59eab4b2-ff85-457d-a018-1b19eb8b40ae.png)

After getting a yes from a client means that he/she is interested to buy a car ,,so we sell it to him/her

![image](https://user-images.githubusercontent.com/103323625/192793645-97ca0d33-2650-4b7d-b806-41780a04b862.png)




```java
  import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make,double price,int year,String color, String[] parts){
        this.make = make ;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);

    }
    //copy constructor

    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake(){
        return this.make;
    }

    public double getPrice(){
        return this.price;
    }

    public int getYear(){
        return this.year;
    }

    public String getColor(){
        return this.color;
    }

    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }



    public void setMake(String make){
        this.make = make;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }
    
    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive(){
        System.out.println("\nYou bought a beautiful  "+this.year+" "+this.color
        +" "+this.make+" for "+this.price+".");
        System.out.println("Please drive your car to the nearest exit. \n");
    }

    public String toString(){
        return "Make: " + this.make + ".\n"
          +    "Price: " + this.price + ".\n"
          +    "Year: " + this.year + ".\n"
          +    "Color: " + this.color + ".\n"
          +    "Parts: " + Arrays.toString(parts) + ".\n";
    }
}


```
