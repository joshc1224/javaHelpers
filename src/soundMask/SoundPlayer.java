package soundMask;
import java.applet.*;
import java.io.IOException;
import java.net.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.UnsupportedAudioFileException;


public class SoundPlayer{
	
	public static Mixer mixer;
	public static Clip clip, clip2, clip3, clip4;
	
	public static void run(URL url, URL url2, URL url3, URL url4) {
		Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
		/*
		for(Mixer.Info info : mixInfos){
			System.out.println(info.getName() +"---"+info.getDescription());
		}
		*/
		mixer = AudioSystem.getMixer(mixInfos[0]);
		
		DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
		try {
			clip = (Clip)mixer.getLine(dataInfo);
			clip2 = (Clip)mixer.getLine(dataInfo);
			clip3 = (Clip)mixer.getLine(dataInfo);
			clip4 = (Clip)mixer.getLine(dataInfo);
		}
		catch(LineUnavailableException ex) {
			ex.printStackTrace();
		}
		//for(int i=0;i<10;i++) {
			try {
				//URL soundURL = Main.class.getResource("/soundMask/cartoon-telephone_daniel_simion.wav");
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
				clip.open(audioStream);
				//URL soundURL2 = Main.class.getResource("/soundMask/cartoon-telephone_daniel_simion.wav");
				AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(url2);
				clip2.open(audioStream2);
				AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(url3);
				clip3.open(audioStream3);
				AudioInputStream audioStream4 = AudioSystem.getAudioInputStream(url4);
				clip4.open(audioStream4);
			}
			catch(LineUnavailableException ex) {
				System.out.println("Line");
			}
			catch(UnsupportedAudioFileException exw) {
				System.out.println("usupported");
			}
			catch(IOException edx) {
				System.out.println("IO");
			}
			clip.start();
			clip2.start();
			clip3.start();
			clip4.start();
			do {
				try {Thread.sleep(50);}
				catch(InterruptedException ie){ ie.printStackTrace();}
			}while (clip.isActive());
			clip.close();
			clip2.close();
			clip3.close();
			clip4.close();
			
		}
		
	//}
	
	
}