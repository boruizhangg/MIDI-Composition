package midi.strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy{
private static final int ACOUSTIC_GRAND_PIANO = 0;
	@Override
	public void applyInstrument(Track track, int channel) 
	{
		try
		{
			ShortMessage instrumentChange = new ShortMessage();
			instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, ACOUSTIC_GRAND_PIANO, 0);
			track.add(new MidiEvent(instrumentChange, 0));
		}
		catch(InvalidMidiDataException e)
		{
			System.err.println("Erro setting Acoustic Grand Piano: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}
