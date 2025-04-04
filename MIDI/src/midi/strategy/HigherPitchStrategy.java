package midi.strategy;

public class HigherPitchStrategy implements PitchStrategy{
  // adding two note for higher pitch
@Override
	public int modifyPitch(int note) 
	{
		return note + 2;
	}
}
