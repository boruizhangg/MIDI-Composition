package midi.factory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

/**
 * Interface for creating MIDI events
 */
public interface MidiEventFactory {
	
	/**
	 * Creates a Note On MIDI event
	 * 
	 * @param tick
	 * 		Tick position of the event
	 * @param note
	 * 		MIDI note number
	 * @param velocity
	 * 		Velocity of the note
	 * @param channel
	 * 		MIDI channel number
	 * @return MidiEvent object
	 * @throws InvalidMidiDataException
	 * 		If MIDI data is invalid
	 */
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	
	/**
	 * Creates a Note Off MIDI event
	 * 
	 * @param tick
	 * 		Tick position of the event
	 * @param note
	 * 		MIDI note number
	 * @param channel
	 * 		MIDI channel number
	 * @return MidiEvent object
	 * @throws InvalidMidiDataException
	 * 		If MIDI data is invalid
	 */
	MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;

}