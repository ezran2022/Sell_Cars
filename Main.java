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

    //   System.out.print("Welcome! Enter the type of car you're looking for: ");
    //   if(!input.hasNextLine()){
    //     input.nextLine();
    //     System.out.println("invalid input enter any type of car  you're looking for");
    //     continue;
    //   }


    // }
    //pick up make
    String make = input.nextLine();
    System.out.print("Enter your budget: ");
    //pick up budget
    int budget = input.nextInt();

    int index = dealership.search(make, budget);
   
    // switch(index){
    //     case 404: System.out.println("Feel free to browse through our collection of cars.\n");
    //     System.out.println(dealership);
    //     break;

    //     default: input.nextLine();
    //     String decision = input.nextLine();
    //     if(decision.equalsIgnoreCase("yes")){
    //         dealership.sell(index);
    //     }
       
      // while(true){
        int spot;
        if(index == 404){
              System.out.println("Feel free to browse through our collection of cars.\n");
              System.out.println(dealership);
               System.out.print("Enter desired spot according to what we have in store : ");
               spot = input.nextInt();
             while(true){
             if(spot < 0 || spot > dealership.getLength() - 1){
               System.out.println("Invalid Index!!");   
               System.out.print("Enter desired spot according to what we have in store : ");
               spot = input.nextInt();
             }else{
            System.out.println("\nWe found one in spot " + spot + "\n" + cars[spot].toString() + " \nIf you are interested, type 'yes' "); 
            index = spot ; 
            input.nextLine();
            String decision = input.nextLine();
            if(decision.equalsIgnoreCase("yes")){
                    dealership.sell(index);
            }else{
              System.out.println("Are you want to exit?? yes or no ");
              String dec = input.nextLine();
              if (dec.equalsIgnoreCase("yes")){
               break;
              } else if(dec.equalsIgnoreCase("no"))
              continue;
              index = spot ; 
              decision = input.nextLine();
              if(decision.equalsIgnoreCase("yes")){
                      dealership.sell(index);
              }
          }
          
          }
          
            // input.nextLine();
            // String decision = input.nextLine();
            // if(decision.equalsIgnoreCase("yes")){
            //         dealership.sell(spot);
         }
          while(index != 404 ){
            String decision = input.nextLine();
                 if(decision.equalsIgnoreCase("yes")){
                     dealership.sell(index);
              }
              break;
          }

}
}
}