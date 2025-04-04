package midi.strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class TrumpetStrategy implements InstrumentStrategy{
	/*
	 * assign the MIDI number to Trumpet
	 * assign 56 to trumpet
	 */
  	private static final int TRUMPET = 56;
	@Override
	public void applyInstrument(Track track, int channel) 
	{
		/*
	 * Making the Trumpet to specific track and channel
	 * instrument change will make the instrument to the beginning of track at position 0 of that instrument should play
	 */
		try
		{
			ShortMessage instrumentChange = new ShortMessage();
			//@param track the track is changing it to like changing the instrument
			instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, TRUMPET, 0);
			//@param to add the change to the very start of the track
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
