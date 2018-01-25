package soundMask;

import java.io.*;
import java.util.ArrayList;
import javax.sound.sampled.*;

public class Sounder2 {
	
	
	public static void sounder(ArrayList<File> files) {
		 
		try {
		    ArrayList<AudioInputStream> streams = new ArrayList<>();
		    ArrayList<AudioFormat> formats = new ArrayList<>();
		    ArrayList<DataLine.Info> infos = new ArrayList<>();
		    ArrayList<Clip> clips= new ArrayList<>();
		    //uncomment to preview files
		    for(int i=0;i<files.size();i++) {
		    	//System.out.println("Files "+files.get(i));
		    }
		    //creates the streams
		    for(int i=0;i<files.size();i++) {
		    	streams.add(AudioSystem.getAudioInputStream(files.get(i)));
		    }
		    //uncomment to preview streams
		    for(int i=0;i<streams.size();i++) {
		    	//System.out.println("Streams "+streams.get(i));
		    }
		    //fetches formats
		    for(int i=0;i<streams.size();i++) {
		    	formats.add(streams.get(i).getFormat());
		    	//System.out.println("Formats "+formats.get(i));
		    }
		    //gets info
		    for (int i=0;i<formats.size();i++) {
		    	infos.add(new DataLine.Info(Clip.class, formats.get(i)));
		    	//System.out.println("Infos "+infos.get(i));
		    }
		    //creates clips
		    for(int i=0;i<infos.size();i++) {
		    	clips.add((Clip) AudioSystem.getLine(infos.get(i)));
		    	//System.out.println("Clips "+clips.get(i));
		    }
		    //opens clips for playing
		    for(int i=0;i<clips.size();i++) {
		    	clips.get(i).open(streams.get(i));	
		    }
		   //plays clips using the play method
		   play(clips);  	
		}//end try
		catch (Exception e) {
		    System.out.println("Broke Sounder2"); 
		}//end catch
	}//end sounder()
	
	/**
	 * selects six random clips and plays them
	 * @param list of clips to choose from
	 * @throws InterruptedException if thread is interrupted
	 */
	public static void play(ArrayList<Clip> list)throws InterruptedException {
		ArrayList<Integer> randos = new ArrayList<>();
		for(int i=0;i<6;i++) {
			randomList(randos, list.size());
		}
		list.get(randos.get(0)).start();
		list.get(randos.get(1)).start();
		list.get(randos.get(2)).start();
		list.get(randos.get(3)).start();
		list.get(randos.get(4)).start();
		list.get(randos.get(5)).start();
		Thread.sleep(600);
	}//end play
	
	/**
	 * fill a list with random integers from 0 to max without repeats
	 * @param list to be filled
	 * @param max highgest number in the list
	 */
	private static void randomList(ArrayList<Integer> list, int max) {
		int temp = (int)(Math.random()*(max));
		if (!list.contains(temp)) {
			list.add(temp);
		}else{randomList(list, max);}
	}//end randomList()
}//end class
