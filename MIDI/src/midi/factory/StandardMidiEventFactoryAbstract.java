package midi.factory;

/**
 * Abstract factory for creating StandardMidiEventFactory instances
 */
public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	
	@Override
	public MidiEventFactory createFactory() {
		return new StandardMidiEventFactory();
	}

}