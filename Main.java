import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Car[] cars = new Car[]{
        new Car("RAV4",10000,2010,"BLUE",new String[] {"tires", "keys"}),
        new Car("VXW",50000,2021,"JET BLACK",new String[] {"tires", "keys"}),
        new Car("RAV4",10000,2007,"YELLOW",new String[] {"Lola","Nunu"}),
        new Car("HONDA",90000,2003,"GRAY",new String[] {"Lola","Nunu"}),
        new Car("MERCEDES",18000,2009,"RED",new String[] {"Lola","Nunu","transmission"})
      };


    Dealership dealership = new Dealership(cars);  

    System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
    System.out.print("Welcome! Enter the type of car you're looking for: ");
    //pick up make
    String make = input.nextLine();
    System.out.print("Enter your budget: ");
    //pick up budget
    int budget = input.nextInt();

    int index = dealership.search(make, budget);

    switch(index){
        case 404: System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        break;

        default: input.nextLine();
        String decision = input.nextLine();
        if(decision.equalsIgnoreCase("yes")){
            dealership.sell(index);
        }
    }
  }


}
