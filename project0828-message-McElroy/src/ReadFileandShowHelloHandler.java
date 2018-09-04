
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;


public class ReadFileandShowHelloHandler {
   public static String readFile() {
      List<String> contents = new ArrayList<String>();
      File file = new File("/Users/nicolemcelroy/workspaceCSCI4980/workspaceCSCI4980McElroy/project0828-message-McElroy/src/config.txt");
      Scanner scanner = null;
      try {
         scanner = new Scanner(file);
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            contents.add(line);
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } finally {
         if (scanner != null)
            scanner.close();
      }
      String name = null;
      for (int i = 0; i < contents.size(); i++) {
	         String line = contents.get(i);
	         name = line.split(":")[1].trim();
      }
	return name;
   }
   
	@Execute
   public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "Title", "Hello " + readFile());
	}
}

