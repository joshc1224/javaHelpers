package dvr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExecuteShellCommand {

	public ArrayList<String> Execute(String command) {

		//String domainName = "google.com";

		//in mac oxs
		//String command = "ping -c 3 " + domainName;

		//in windows
		//String commands = "c:/users/j/desktop/hello_world.bat " ;

		String output = this.executeCommand(command);

		//System.out.println(output);
		
		String[] outputArr = output.split("\n");
		ArrayList<String> finalOutput = new ArrayList<String>();
		for (int i =0; i<outputArr.length;i++) {
			if (!outputArr[i].equals("")&&!outputArr[i].substring(0, 3).equalsIgnoreCase("c:\\"))
			finalOutput.add(outputArr[i]);
		}

		return finalOutput;
	}

	private String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader =
                            new BufferedReader(new InputStreamReader(p.getInputStream()));

                        String line = "";
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();

	}

}