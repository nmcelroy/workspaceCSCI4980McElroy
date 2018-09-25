package simpleVisitorPattern.visitor;

import simpleVisitorPattern.part.Body;
import simpleVisitorPattern.part.Engine;
import simpleVisitorPattern.part.Wheel;
import simpleVisitorPattern.part.Brake;



public class MyReverseVisitor extends CarPartVisitor {
   public void visit(Wheel part) {
	   	part.setName(reverse(part.getName()));
	   	part.setModelNumberWheel(reverse(part.getModelNumberWheel()));
	   	part.setModelYearWheel(reverse(part.getModelYearWheel()));
   }

   public void visit(Engine part) {
	      part.setName(reverse(part.getName()));
	      part.setModelNumberEngine(reverse(part.getModelNumberEngine()));
	      part.setModelYearEngine(reverse(part.getModelYearEngine()));
   }

   public void visit(Body part) {
	      part.setName(reverse(part.getName()));
	      part.setModelNumberBody(reverse(part.getModelNumberBody()));
	      part.setModelYearBody(reverse(part.getModelYearBody()));
   }
   
   public void visit(Brake part) {
	      part.setName(reverse(part.getName()));
	      part.setModelNumberBrake(reverse(part.getModelNumberBrake()));
	      part.setModelYearBrake(reverse(part.getModelYearBrake()));
   }
   
   private String reverse (String partName) {
	   String reversed = "";
	   for (String part : partName.split(" ")) {
		   reversed += new StringBuilder(part).reverse().toString();
		   reversed += " ";
	   }
	   return reversed;
   }

}