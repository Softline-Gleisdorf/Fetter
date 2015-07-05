package kunde.fetter;

import wws.WwsMessageComposer;

public class FetterWwsMessageComposer extends WwsMessageComposer {
	
	@Override
	public String composeMessage() {
		return "Mixed message from " + getClass().getSimpleName() + " and " + super.composeMessage();
	}
}
