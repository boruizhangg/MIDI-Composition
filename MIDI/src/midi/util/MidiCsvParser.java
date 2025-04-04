package midi.util;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.ShortMessage;
import midi.model.MidiEventData;



public class MidiCsvParser {
	
	public static List<MidiEventData> parseCsv(String path) 
	{
		List<MidiEventData> midiEvents = new ArrayList<MidiEventData>();
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line = reader.readLine();
		
		while (line != null)
		{
				String[] data = line.split(",");
				int startEndTick = grabData(data[0]);
				String noteCommand = data[1].trim();
				int channel = grabData(data[2]);
				int note = grabData(data[3]);
				int velocity = grabData(data[4]);
				int instrument = grabData(data[5]);
		}
			
		}
	}
	reader.close();
	return //needs to create event in the parser
}
