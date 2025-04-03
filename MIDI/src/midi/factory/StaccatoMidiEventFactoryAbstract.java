package midi.factory;

/**
 * Abstract factory for creating StaccatoMidiEventFactory instances
 */
public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	
	@Override
	public MidiEventFactory createFactory() {
		return new StaccatoMidiEventFactory();
	}

}
