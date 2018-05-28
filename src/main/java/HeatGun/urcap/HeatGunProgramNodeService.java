package HeatGun.urcap;

import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.contribution.ProgramNodeService;
import com.ur.urcap.api.domain.URCapAPI;
import com.ur.urcap.api.domain.data.DataModel;

import java.io.InputStream;

public class HeatGunProgramNodeService implements ProgramNodeService {

	public HeatGunProgramNodeService() {
	}

	@Override
	public String getId() {
		return "HeatGun";
	}

	@Override
	public String getTitle() {
		return "HeatGun";
	}

	@Override
	public InputStream getHTML() {
		InputStream is = this.getClass().getResourceAsStream("/programnode.html");
		return is;
	}

	@Override
	public boolean isDeprecated() {
		return false;
	}

	@Override
	public boolean isChildrenAllowed() {
		return false;
	}

	@Override
	public ProgramNodeContribution createNode(URCapAPI api, DataModel model) {
		return new HeatGunProgramNodeContribution(api, model);
	}
}
