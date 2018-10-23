package model;

public class MyPerson {
   private String  firstName;
   private String  lastName;
   private String phoneNumber;
   private String address;

   public MyPerson() {
   }

   public MyPerson(String firstName, String lastName, String phoneNumber, String a) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumber = phoneNumber;
      this.address = a;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }
   
   public String getPhoneNumber() {
	   return phoneNumber;
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
   
   public void setPhoneNumber(String phoneNumber) {
	   this.phoneNumber = phoneNumber;
   }
   
   public void setAddress(String a) {
	   this.address = a;
   }

   @Override
   public String toString() {
      return firstName + " " + lastName;
   }
}
