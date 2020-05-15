import java.util.*;

public class TestEmailDatabase{
   public static void main(String[] a){
   
      System.out.println("Enter the initial length of database:");
      Scanner in = new Scanner(System.in);
      String len = in.nextLine();
      int length;
      try {
         length = Integer.parseInt(len);
      }
      catch (NumberFormatException e)
      {
         length = 0;
      }
   
      
      DatabaseEmail b = new DatabaseEmail(length);
     /*
      EmailKey email = new EmailKey("vesa.ternava14@hotmail.com");
      RecordEmail r1 = new RecordEmail("Vesa", "Ternava", email);
      System.out.println("Insert: " + b.insert(r1)); //inserting a record into the database
      
      System.out.println(r1.getEmail().getKey());  //testing getEmail and getKey
      System.out.println(r1.getName()); //testing getName
      
      EmailKey email1 = new EmailKey("vesa.ternava14@hotmailllll.com");
      RecordEmail r2 = new RecordEmail("Vesa", "Ternava", email1);
      System.out.println("Insert: " + b.insert(r2)); //inserting another record
      
      EmailKey email9 = new EmailKey("vesa.ternava14@hotmailll.com");
      RecordEmail r9 = new RecordEmail("Vesa", "Ternava", email9);
      System.out.println("Insert: " + b.insert(r9)); 
      System.out.println("Delete: " + b.delete(email9));//testing delete method
      
    
      System.out.println(r2.getEmail().getKey());  //testing getEmail and getKey again
      System.out.println(r2.getName());//testing getName again
   
     
      System.out.println(r1.getEmail().equalsKey(r2.getEmail())); //testing equals method
      
      System.out.println("Te gjitha rekordet me emrin Vesa: ");
      System.out.println(b.findName("Vesa")); //testing findName
    
      EmailKey email3 = new EmailKey("");
      System.out.println(" Rekordi me email " + email3.getKey());
      System.out.println(b.findEmail(email3) + "\n"); //testing findEmail
      
      System.out.println(" Rekordi me email " + email.getKey());
      System.out.println(b.findEmail(email)); //testing findEmail again
      
      System.out.println(b.findName("Vesa11")); //testing findName again
       
      EmailKey email2 = new EmailKey("");
      RecordEmail r3 = new RecordEmail("Vesa", "", email2);
      System.out.println("Insert: " + b.insert(r3));
     
      EmailKey email4 = new EmailKey("");
      RecordEmail r4 = new RecordEmail("Vesa", "", email4);
      System.out.println("Insert: " + b.insert(r4));
      System.out.print("Rekordi me index 1:");
      System.out.println(b.record(1)); //testing the record method
      System.out.println("Databaza:" );
   
      for(int i = 0; i<b.length(); i++){ 
         if(b.record(i) != null){
            System.out.println(i +" "+ b.record(i));}
      }
    */
   
    
      //System.out.println(b.table()); //testing the table method
      //te gjitha testimet(funksionet ose komandat) nga rreshti 21 deri 75 mund te kryhen permes komandes me poshte
      new ViewDatabaseEmail(b, 2); //testing ViewDatabaseEmail class
      
   }
}