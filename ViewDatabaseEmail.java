import java.util.*;
 
 /** View implements a view for a database */
public class ViewDatabaseEmail{

   private DatabaseEmail b; //the database
   private int number_com; //the number of command to execute
   
   /** Constructor View constructs the view of the database 
     * @param base - the database to be desined. */
   public ViewDatabaseEmail(DatabaseEmail base, int num_commands){
      b = base;
      number_com = num_commands;
      for(int i = 0; i<number_com; i++){
      
         System.out.println("Next: ");
         System.out.println(setCommand());
         if(i == (number_com-1) && setCommand() != null){number_com = 2*number_com;}
      }
   }

/** setCommand provides the user with a choise of command 
  * depending on the command returns the appropriate value. */
   private String setCommand(){
      String s ="";
      System.out.println("What do you want to do?\n0 quit the program\n1 see database\n2 insert a record\n3 delete a record\n4 search by name\n5 search by email");
      Scanner in = new Scanner(System.in);
      String comChoice1 = in.nextLine();
   
      int comChoice;
      try {
         comChoice = Integer.parseInt(comChoice1);
      }
      catch (NumberFormatException e)
      {
         comChoice = 0;
      }
      
      if(comChoice == 0)
      {
         System.exit(0);
      }
      
      if(comChoice == 1)
      {
         s = b.table();
      }
      
      else if(comChoice == 2){
         System.out.print("Enter a name: ");
         Scanner n = new Scanner(System.in);
         String name = n.nextLine();
         
         System.out.print("Enter last name: ");
         Scanner ln = new Scanner(System.in);
         String last_name = ln.nextLine();
         
         System.out.print("Enter an email: ");
         Scanner e = new Scanner(System.in);
         EmailKey email = new EmailKey(e.nextLine());
         RecordEmail r1 = new RecordEmail(name, last_name, email);
         System.out.println("Insert: " + b.insert(r1));
         
      }
      
      else if(comChoice == 3){
         System.out.print("Enter an email to delete: ");
         Scanner e2 = new Scanner(System.in);
         EmailKey email2 = new EmailKey(e2.nextLine());
         System.out.println("Delete: " + b.delete(email2));
      }
      
      
      else if(comChoice == 4)
      {
         System.out.print("Enter a name: ");
         Scanner name1 = new Scanner(System.in);
         s = b.findName(name1.nextLine());
      }
      
      else if(comChoice == 5){
         System.out.print("Enter an email: ");       
         Scanner email1 = new Scanner(System.in);
         EmailKey email11 = new EmailKey(email1.nextLine());
         s = b.findEmail(email11);
        
      }
      
      else if(comChoice1 != null){
         System.out.println("You entered a string(word).Try again: ");
         setCommand();
      }
      else
      {
         System.out.println("You entered a number that is not a command. Try again: ");
         setCommand();
      
      }
      
            
      return s;
      // System.out.println("Next: ");
      // setCommand();
   
   }
   

}