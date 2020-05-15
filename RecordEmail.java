public class RecordEmail
{ 
   private EmailKey email;      // the identification email
   private String f_name;
   private String l_name;
   
   /** Constructor RecordEmail initializes an email record
     * @param first_name - the first name of the user whoes email record is being crated.
     * @param last_name - the last name of the user whoes email record is being crated.
     * @param Email - the users's identification email  */
   public RecordEmail(String first_name, String last_name, EmailKey Email)
   { 
      f_name = first_name;
      l_name = last_name;
      email = Email;
   }
   
   /** getName - returns the first name of the user */
   public String getName(){
      return f_name;
   }
   
   /** getEmail - returns the email of the user */
   public EmailKey getEmail(){
      return email;
   }   
   
   /** getLastName - returns the last name of the user */ 
   public String getLastName(){
      return l_name;
   }

}
