package midi.factory;

public class LegatoMidiEventAbstract implements MidiEventFactoryAbstract{
	
	@Override
	public MidiEventFactory createFactory() {
		return new LegatoMidiEventFactory();
	}

}