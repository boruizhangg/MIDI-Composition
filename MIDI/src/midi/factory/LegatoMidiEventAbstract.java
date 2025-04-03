package midi.factory;

/**
 * Abstract factory for creating LegatoMidiEventFactory instances
 */
public class LegatoMidiEventAbstract implements MidiEventFactoryAbstract{
	
	@Override
	public MidiEventFactory createFactory() {
		return new LegatoMidiEventFactory();
	}

}