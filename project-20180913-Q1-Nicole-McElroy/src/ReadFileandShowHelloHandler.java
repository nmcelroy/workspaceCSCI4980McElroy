 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.widgets.Shell;

import view.SimpleView20180913Q1NicoleMcElroy;


public class ReadFileandShowHelloHandler {
	@Inject
	private EPartService epartService;

   public static String readFile() {
      List<String> contents = new ArrayList<String>();
      File file = new File("/Users/nicolemcelroy/workspaceCSCI4980/workspaceCSCI4980McElroy/project-20180913-Q1-Nicole-McElroy/src/config.txt");
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
			MPart findPart = epartService.findPart(SimpleView20180913Q1NicoleMcElroy.VIEW_ID);
			Object findPartObj = findPart.getObject();
				
			if (findPartObj instanceof SimpleView20180913Q1NicoleMcElroy) {
					SimpleView20180913Q1NicoleMcElroy v = (SimpleView20180913Q1NicoleMcElroy) findPartObj;
					v.setText("Hello " + readFile());
			}
	}
}

