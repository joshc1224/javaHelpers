package soundMask;

import java.io.*;
import javax.sound.sampled.*;

public class Sounder {
	
	
	public static void sounder(File file1, File file2, File file3, File file4, File file5, File file6) {
		 
		try {
		    //File yourFile, yourFile2, yourFile3, yourFile4, yourFile5, yourFile6;
		    AudioInputStream stream, stream2, stream3, stream4, stream5, stream6;
		    AudioFormat format, format2, format3, format4, format5, format6;
		    DataLine.Info info, info2, info3, info4, info5, info6;
		    Clip clip, clip2, clip3, clip4, clip5, clip6;

		   /* yourFile = file1;//new File("C:\\Users\\j\\Downloads\\sword1.wav");
		    yourFile2 = file2;//new File("C:\\Users\\j\\eclipse-workspace\\workCode\\sounds\\Scream+11.wav");
		    yourFile3 = file3;
		    yourFile4 = file4;
		    yourFile5 = file5;
		    yourFile6 = file6;
		    */
		    
		    stream = AudioSystem.getAudioInputStream(file1);
		    stream2 = AudioSystem.getAudioInputStream(file2);
		    stream3 = AudioSystem.getAudioInputStream(file3);
		    stream4 = AudioSystem.getAudioInputStream(file4);
		    stream5 = AudioSystem.getAudioInputStream(file5);
		    stream6 = AudioSystem.getAudioInputStream(file6);
		    
		    
		    format = stream.getFormat();
		    format2 = stream2.getFormat();
		    format3 = stream3.getFormat();
		    format4 = stream4.getFormat();
		    format5 = stream5.getFormat();
		    format6 = stream6.getFormat();
		    
		    info = new DataLine.Info(Clip.class, format);
		    info2 = new DataLine.Info(Clip.class, format2);
		    info3 = new DataLine.Info(Clip.class, format3);
		    info4 = new DataLine.Info(Clip.class, format4);
		    info5 = new DataLine.Info(Clip.class, format5);
		    info6 = new DataLine.Info(Clip.class, format6);
		    
		    clip = (Clip) AudioSystem.getLine(info);
		    clip2 = (Clip) AudioSystem.getLine(info2);
		    clip3 = (Clip) AudioSystem.getLine(info3);
		    clip4 = (Clip) AudioSystem.getLine(info4);
		    clip5 = (Clip) AudioSystem.getLine(info5);
		    clip6 = (Clip) AudioSystem.getLine(info6);
		    
		    clip.open(stream);
			clip2.open(stream2);
			clip3.open(stream3);
			clip4.open(stream4);
			clip5.open(stream5);
			clip6.open(stream6);
		    clip.start();
			clip2.start();
			clip3.start();
			clip4.start();
			clip5.start();
			clip6.start();
			Thread.sleep(1000);
		//clip.close();
		//clip2.close();
		}
		
		catch (Exception e) {
		    System.out.println("Broke "+file1+" "+file2+" Sounder1");
		    
		}
		 
	}



}
