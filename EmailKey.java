public class EmailKey{

   private String email;
/** Constructor  EmailKey constructs the EmailKey  
  * @param Email - the string that uniquely defines the email */
   public EmailKey(String Email){ 
      email = Email;
   }
/** equalsKey is a method which compares this EmailKey with another for equality
  * @param s the other email 
  * If they are equal it returns true,
  * else returns false. */
   public boolean equalsKey(EmailKey s){
      return (email.equals(s.getKey()));
   }
   
   /** getKey return the string held by this EmailKey */
   public String getKey(){
      return email;
   }
   
}