package midi.factory;

/**
 * Abstract factory interface for creating MIDI event factories
 */
public interface MidiEventFactoryAbstract {
	
	/**
	 * Creates a specific MIDI event factory
	 * 
	 * @return A concrete MidiEventFactory implementation
	 */
	MidiEventFactory createFactory();

}