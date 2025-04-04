package midi.factory;

/**
 * Abstract factory for creating LegatoMidiEventFactory instances
 */
public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	
	@Override
	public MidiEventFactory createFactory() {
		return new LegatoMidiEventFactory();
	}

}