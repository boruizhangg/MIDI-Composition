package midi.strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy{
	/*
	 * assign the MIDI number to ACOUSTIC GRAND PIANO 
	 * 0 is always the piano
	 */
private static final int ACOUSTIC_GRAND_PIANO = 0;
	/*
	 * Making the Acoustic piano to specific track and channel
	 * instrument change will make the instrument to the beginning of track at position 0
	 */
	public void applyInstrument(Track track, int channel) 
	{
		try
		{
			ShortMessage instrumentChange = new ShortMessage();
			//@param track the track is changing it to like changing the instrument from guitar to paino
			instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, ACOUSTIC_GRAND_PIANO, 0);
			//@param to add the change to the very start of the track
			track.add(new MidiEvent(instrumentChange, 0));
		}
		//@param to check if the pass in value is null
		catch(InvalidMidiDataException e)
		{
			System.err.println("Erro setting Acoustic Grand Piano: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}
