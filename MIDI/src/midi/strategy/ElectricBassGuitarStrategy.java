package midi.strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class ElectricBassGuitarStrategy implements InstrumentStrategy{
	/*
	 * assign the MIDI number to Electric Bass Guitar Strategy
	 * assign 33 to Electric Bass Guitar Strategy
	 */
  private static final int ELECTRIC_BASS_GUITAR = 33;
	/*
	 * Making the Electric Bass Guitar to specific track and channel
	 * instrument change will make the instrument to the beginning of track at position 0
	 */
	@Override
	public void applyInstrument(Track track, int channel) 
	{
		try
		{
			ShortMessage instrumentChange = new ShortMessage();
			//@param track the track is changing it to like changing the instrument
			instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, ELECTRIC_BASS_GUITAR, 0);
			//@param to add the change to the track 
			track.add(new MidiEvent(instrumentChange, 0));
		}
			//@param to check if the pass in value is null
		catch(InvalidMidiDataException e)
		{
			System.err.println("Erro setting Electric Bass Guitar instrument: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
