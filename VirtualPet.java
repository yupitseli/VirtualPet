import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("Your pet's name is Mokun");

      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
      while (happiness < 15 && hunger < 10 && energy > 0){
         // TODO 2:
         // Display happiness, hunger, and energy.
         System.out.println("Mokun's happiness is at" + happiness);
         System.out.println("Mokun's hunger is at" + hunger);
         System.out.println("Mokun's energy is at" + energy);
        
         
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         choice = input.nextInt();
         
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.
         if (choice==1){
            happiness++;
            hunger= hunger - 1;
            System.out.println("Mmmm, yum yum, Mokun loves tasty goy slop");
            }
          else if (choice==2) {
            happiness = happiness + 3;
            hunger = hunger + 2;
            energy = energy - 2;
            System.out.println("Yayyy, Mokun loves to fetch the stick");
            }
          else if (choice==3) {
            happiness = happiness - 1;
            hunger = hunger + 1;
            energy = energy + 3;
            System.out.println("");  
            }
          else if (choice==4) {
            happiness = happiness + 2;
            hunger = hunger + 1;
            energy = energy -1;
            }
          else {
          System.out.println("You killed Mokun cause you didn't have strong enough willpower, pathetic *spits");
          }



      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      input.close();
   }
}