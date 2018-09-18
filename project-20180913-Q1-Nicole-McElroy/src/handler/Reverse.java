package handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.custom.StyledText;

import view.SimpleView20180913Q1NicoleMcElroy;

public class Reverse {
	@Inject
	private EPartService epartService;

	@Execute
	public void execute() {
		//System.out.println("[DBG] ViewPopupHandler");
		MPart findPart = epartService.findPart(SimpleView20180913Q1NicoleMcElroy.VIEW_ID);
		Object findPartObj = findPart.getObject();
		
		if (findPartObj instanceof SimpleView20180913Q1NicoleMcElroy) {
			SimpleView20180913Q1NicoleMcElroy v = (SimpleView20180913Q1NicoleMcElroy) findPartObj;
			v.setText(reverseString(v.getText()));
		}
	}

	private String reverseString(String text) {
		return new StringBuilder(text).reverse().toString();
	}
}