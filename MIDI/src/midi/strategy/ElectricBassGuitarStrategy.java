package midi.strategy;

public class ElectricBassGuitarStrategy {
  private static final int ELECTRIC_BASS_GUITAR = 33;
	
	@Override
	public void applyInstrument(Track track, int channel) 
	{
		try
		{
			ShortMessage instrumentChange = new ShortMessage();
			instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, ELECTRIC_BASS_GUITAR, 0);
			track.add(new MidiEvent(instrumentChange, 0));
		}
		catch(InvalidMidiDataException e)
		{
			System.err.println("Erro setting Electric Bass Guitar instrument: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
