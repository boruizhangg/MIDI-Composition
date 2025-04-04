package midi.util;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.ShortMessage;
import midi.model.MidiEventData;
import java.io.IOException;


//I am making the assumption that the format of csv files to parse are following the conventions of the initial file provided
//so that means they are separated with commas, have 6 items per line and all data is populated. 
public class MidiCsvParser {
	
	/**parses the csv file and gets the data and put them in the list of MidiEventData objs. 
	 * @param path of the csv file, needs to be leading with // ! 
	 * @return the list containing the midi events 
	 * @throws IOException 
	 */
	public static List<MidiEventData> parseCsv(String path) throws IOException
	{
		List<MidiEventData> midiEvents = new ArrayList<MidiEventData>();
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line = reader.readLine();
		
		while (line != null)
		{
				String[] data = line.split(",");
				
				int noteOnOff;
				int startEndTick = grabData(data[0]);
				//random space in the file so thats why trim
				String onOff = data[1].trim();
				int channel = grabData(data[2]);
				int note = grabData(data[3]);
				int velocity = grabData(data[4]);
				int instrument = grabData(data[5]);
				
				if(onOff.equals("Note_on_c"))
				{
					noteOnOff = ShortMessage.NOTE_ON;
				}
				else
				{
					noteOnOff = ShortMessage.NOTE_OFF;
				}
				
				MidiEventData event = new MidiEventData(startEndTick, velocity, note, channel, instrument, noteOnOff);
				midiEvents.add(event);
			
			line = reader.readLine();
		}
	
		reader.close();
		return midiEvents;
}

	/**this is very stupid and inefficient but gets the job done. Turns the string to ints
	 * @param str is going to be converted to an int
	 * @return the int value
	 */
	private static int grabData(String str)
	{
		Scanner scanner = new Scanner(str.trim());
		int data = 0;
		if(scanner.hasNextInt())
		{
			data = scanner.nextInt();
		}
		scanner.close();
		return data;
	}	
}