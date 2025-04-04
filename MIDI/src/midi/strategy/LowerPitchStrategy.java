package midi.strategy;

public class LowerPitchStrategy {
//adding 2 more note 
@Override
	public int modifyPitch(int note) 
	{
		return note + 2;
	}
}
