package model;

public class MyPerson {
   private String  firstName;
   private String  lastName;
   private String address;

   public MyPerson() {
   }

   public MyPerson(String firstName, String lastName, String a) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = a;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }
   
   public String getAddress() {
	   return address;
   }
   
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   public void setAddress(String a) {
	   this.address = a;
   }

   @Override
   public String toString() {
      return firstName + " " + lastName;
   }
}
