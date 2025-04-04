package midi.strategy;

public class LowerPitchStrategy implements PitchStrategy{
//two more less note for lower pitch
@Override
	public int modifyPitch(int note) 
	{
		return note - 2;
	}
}
