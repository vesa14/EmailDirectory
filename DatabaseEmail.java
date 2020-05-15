/** DatabaseEmail  implements a database of email records */
public class DatabaseEmail
{ 
   private RecordEmail[] base;   // the collection of records
   private int NOT_FOUND = -1;   // int used to denote when a record not found
   // private String name = "";  
  /** Constructor  DatabaseEmail  initializes the database of emails
    * @param initial_size - the size of the database */
   public DatabaseEmail(int initial_size)
   { 
      if ( initial_size > 0 )
      { base = new RecordEmail[initial_size]; }
      else { base = new RecordEmail[1]; }
   }

  /** findLocation  is a helper method that searches  base  for a record
    *  whose email is  e.   If found, the index of the record is returned,
    *  else  NOT_FOUND  is returned.  */
   private int findLocation(EmailKey e)
   { int result = NOT_FOUND;
      boolean found = false;
      int i = 0;
      while ( !found  &&  i != base.length )
      { 
         if ( base[i] != null  &&  base[i].getEmail().equalsKey(e))
         { found = true;
            result = i;
         }
         else { i = i + 1; }
      }
      return result;
   } 
   
   /** length - returns the length of the sdatabase at the time */
   public int length(){
      return base.length;
   }
   
   /** record is a method that shows the record at a index
     * @param i - the index 
     * returns the record at index i as a String */
   public String record(int i){
      String s = "";
      if(base[i] != null){
         s = base[i].getName() + "  " + base[i].getLastName() + "  " + base[i].getEmail().getKey(); 
      }
      
      return s;
   }
   
   /** tabel - returns all the records in the database */
   public String table(){
      String s = "";
      for(int i = 0; i<base.length;i++){
         if ( base[i] != null)
         { 
            s = s + base[i].getName() + "  " + base[i].getLastName() +  "  " + base[i].getEmail().getKey() + "\n"; 
         }
      }
      
      return s;
   }
       
  /** insert inserts a new record into the database.
    * @param r - the record
    * @return true, if record added; return false if record not added because
    *   another record with the same key already exists in the database */
   public boolean insert(RecordEmail r)
   { boolean success = false;
      if ( findLocation(r.getEmail()) == NOT_FOUND )  // r  not already in  base?
      { // find an empty element in  base  for insertion of  r:
         boolean found_empty_place = false;
         int i = 0;
         while ( !found_empty_place  &&  i != base.length )
               // so far, all of  base[0]..base[i-1]  are occupied
         { 
            if ( base[i] == null )   // is this element empty?
            { found_empty_place = true; }
            else { i = i + 1; }
         }
         if ( found_empty_place )
         { base[i] = r; }
         else { // array is full!  So, create a new one to hold more records:
            RecordEmail[] temp = new RecordEmail[base.length * 2];
            for ( int j = 0;  j != base.length;  j = j + 1 )
            { temp[j] = base[j]; } // copy  base  into  temp
            temp[base.length] = r;   // insert  r  in first free element
            base = temp;   // change  base  to hold address of  temp
         }
         success = true;
      }
      return success;
   }
   
  /** delete removes a record in the database based on a email
    * @param key - the record's email (identification)
    * @return true, if record is found and deleted; return false otherwise  */
   public boolean delete(EmailKey k)
   { boolean result = false;
      int index = findLocation(k);
      if ( index != NOT_FOUND )
      { base[index] = null;
         result = true;
      }
      return result;
   }
   
   /** findName locates all the records in the database with the first name k
     * @paramnamek - the first name of the desired records
     * returns as a string all the records with name k, returns null if none
     * of the records have the first name k */
   public String findName(String name)
   { 
      String s = "";
      for(int i = 0; i<base.length;i++){
         if ( base[i] != null  &&  base[i].getName().equals(name))
         { 
            s = s + base[i].getName() + "  " + base[i].getLastName() +  "  " + base[i].getEmail().getKey() + "\n"; 
         }
      }
      return s;
   } 

  
   
   /** find  locates a record in the database based on a email
    * @param email - the email of the desired record
    * @return the full(first name, last name, email) desired record;
    *  return  null if record not found.  */
   public String findEmail(EmailKey email)
   { RecordEmail answer = null;
      String s = "";
      int index = findLocation(email);
      if ( index != NOT_FOUND )
      { answer = base[index]; 
         s = s + answer.getName() + "  " + answer.getLastName() + "  " + email.getKey();
      }
      return s;
   }
   
}