package kunde.fetter;

import core.AbstractMessageComposer;

public class FetterMessageComposer extends AbstractMessageComposer {
	
	@Override
	public String composeMessage() {
		return "Fetter-Nachricht: " + super.composeMessage();
	}
}
