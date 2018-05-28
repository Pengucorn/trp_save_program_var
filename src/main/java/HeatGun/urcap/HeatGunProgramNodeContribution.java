package HeatGun.urcap;

import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.domain.URCapAPI;
import com.ur.urcap.api.domain.data.DataModel;
import com.ur.urcap.api.domain.script.ScriptWriter;
import com.ur.urcap.api.domain.util.Filter;
import com.ur.urcap.api.domain.variable.Variable;
import com.ur.urcap.api.ui.annotation.Input;
import com.ur.urcap.api.ui.annotation.Label;
import com.ur.urcap.api.ui.component.InputEvent;
import com.ur.urcap.api.ui.component.InputTextField;
import com.ur.urcap.api.ui.component.LabelComponent;

public class HeatGunProgramNodeContribution implements ProgramNodeContribution {
	private static final String NAME = "name";

	private final DataModel model;
	public static URCapAPI api;
	//private final ScriptWriter writer;

	public HeatGunProgramNodeContribution(URCapAPI api, DataModel model) {
		HeatGunProgramNodeContribution.api = api;
		this.model = model;
	}
	
	@Input(id = "L")
	private InputTextField L;
	@Input(id = "H")
	private InputTextField H;
	@Input(id = "O")
	private InputTextField O;
	@Input(id = "S")
	private InputTextField S;
	@Input(id = "Ol")
	private InputTextField Ol;
	@Input(id = "Or")
	private InputTextField Or;
	

	@Label(id = "titlePreviewLabel")
	private LabelComponent titlePreviewLabel;

	@Label(id = "messagePreviewLabel")
	private LabelComponent messagePreviewLabel;


	@Override
	public String getTitle() {
		return "HeatGun";
		
	}
	
	@Override
	public boolean isDefined() {
		if( L.getText() == "" || L.getText() == null || L.getText().length() == 0) {
			return false;
		}
		if( H.getText() == "" || H.getText() == null || H.getText().length() == 0) {
			return false;
		}
		if( O.getText() == "" || O.getText() == null || O.getText().length() == 0) {
			return false;
		}
		if( S.getText() == "" || S.getText() == null || S.getText().length() == 0) {
			return false;
		}
		if( Ol.getText() == "" || Ol.getText() == null || Ol.getText().length() == 0) {
			return false;
		}
		if( Or.getText() == "" || Or.getText() == null || Or.getText().length() == 0) {
			return false;
		}
		return true;
	}
	
	@Override
	public void generateScript(ScriptWriter writer) {
		writer.appendLine("L ="+L.getText());
		writer.appendLine("H ="+H.getText());
		writer.appendLine("O ="+O.getText());
		writer.appendLine("S ="+S.getText());
		writer.appendLine("Ol ="+Ol.getText());
		writer.appendLine("Or ="+Or.getText());
		
		writer.sync();
		//}
	}

	@Override
	public void openView() {
	}

	@Override
	public void closeView() {
	}
}
