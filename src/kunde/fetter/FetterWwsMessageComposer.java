package kunde.fetter;

import wws.WwsMessageComposer;

public class FetterWwsMessageComposer extends WwsMessageComposer {
	
	@Override
	public String composeMessage() {
		return "Nachricht von " + getClass().getSimpleName() + " und " + super.composeMessage();
	}
}
