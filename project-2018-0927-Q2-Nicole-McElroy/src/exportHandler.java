 

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import model.MyPerson;
import model.MyPersonModelProvider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class exportHandler {
	@Execute
	public void execute(Shell shell) {
	
	List<MyPerson> persons = MyPersonModelProvider.INSTANCE.getPersons();

	List<String> contents = new ArrayList<>();

	
	for (MyPerson p : persons) {
        String iFirstName = p.getFirstName();
        String iLastName = p.getLastName();
        String iPhoneNumber = p.getPhoneNumber();
        String iAddress = p.getAddress();
        
        String data = (iFirstName + "," + iLastName + "," + iPhoneNumber + "," + iAddress);
        contents.add(data);
     }
	 

   		String workDir = System.getProperty("user.dir");
   		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("/Users/nicolemcelroy/workspaceCSCI4980/workspaceCSCI4980McElroy/project-2018-0927-Q2-Nicole-McElroy/src/" + "output-q2-0927-Nicole-McElroy.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		PrintWriter printWriter = new PrintWriter(fileWriter);
   		for (String str : contents) {
   		printWriter.print(str + System.lineSeparator());
   		}
   		printWriter.close();
   		
		MessageDialog.openInformation(shell, "Title", "Saved output-q2-0927-Nicole-McElroy.csv");
     }
}
