package soundMask;

import java.io.*;
import java.util.ArrayList;
import javax.sound.sampled.*;

public class ClipTester {
	public static void run() {
		for (int i=0;i<10;i++) {
			try {
				File f = new File("C:\\Users\\j\\eclipse-workspace\\workCode\\voices\\counting.wav");
				File g = new File("C:\\Users\\j\\eclipse-workspace\\workCode\\voices\\counting.wav");
					AudioInputStream stream = AudioSystem.getAudioInputStream(f);
					AudioFormat format = stream.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, format);
					Clip clip = (Clip) AudioSystem.getLine(info);
					clip.open(stream);
					
					AudioInputStream stream2 = AudioSystem.getAudioInputStream(g);
					AudioFormat format2 = stream2.getFormat();
					DataLine.Info info2 = new DataLine.Info(Clip.class, format2);
					Clip clip2 = (Clip) AudioSystem.getLine(info2);
					clip2.open(stream2);
					int frameLength = clip.getFrameLength();
					long clipLength = clip.getMicrosecondLength();
					System.out.println(clipLength+" "+frameLength);
					clip.setMicrosecondPosition(clipLength/2);
					clip2.setMicrosecondPosition(clipLength/10);
					clip.start();
					clip2.start();
					Thread.sleep((int)((clipLength*(Math.pow(10, -3))/2)));
					clip.stop();
					clip2.stop();
				}
				catch(Exception ex) {
					System.out.println("Exception");
					System.exit(-1);
				}
		}
		
	}
	
	
	
}
