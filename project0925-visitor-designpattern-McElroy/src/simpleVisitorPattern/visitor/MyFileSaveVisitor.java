package simpleVisitorPattern.visitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import simpleVisitorPattern.part.Body;
import simpleVisitorPattern.part.Engine;
import simpleVisitorPattern.part.Wheel;
import simpleVisitorPattern.part.Brake;

public class MyFileSaveVisitor extends CarPartVisitor {

	private List<String> contents = new ArrayList<>();

   @Override
   public void visit(Wheel part) {
	  String partString = part.getName() + "," + part.getModelNumberWheel() + "," + part.getModelYearWheel();
	  
      contents.add(partString); 
   }

   @Override
   public void visit(Engine part) {
	   String partString = part.getName() + "," + part.getModelNumberEngine() + "," + part.getModelYearEngine();
	   contents.add(partString); 
   }

   @Override
   public void visit(Body part) {
	   String partString = part.getName() + "," + part.getModelNumberBody() + "," + part.getModelYearBody();
	   contents.add(partString); 
   }
   
   @Override
   public void visit(Brake part) {
	   String partString = part.getName() + "," + part.getModelNumberBrake() + "," + part.getModelYearBrake();
	   contents.add(partString); 
   }
   	
   	public void saveFile() throws IOException {
   		String workDir = System.getProperty("user.dir");
   		FileWriter fileWriter = new FileWriter(workDir + File.separator + "outputdata.csv");
   		PrintWriter printWriter = new PrintWriter(fileWriter);
   		for (String str : this.contents) {
   		printWriter.print(str + System.lineSeparator());
   		}
   		printWriter.close();
     }
}
