package getstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;
import javax.xml.transform.Result;

public class GetStream {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, SQLException {
        StartingView a = new StartingView();
        a.setVisible(true);

    }
  /*  public static void liveRtmpFeed() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("ffmpeg.exe","-y", "-i",
                "http://www.sunofm.pk/", "-ss", "00:00:00",
                "-t", "00:00:20", "-c", "copy", "D:/7th Semester/FYP/Test/GetStream/sunolive.aac");
        Process process = processBuilder.start();
        InputStream stderr = process.getErrorStream();
        InputStreamReader isr = new InputStreamReader(stderr);
        BufferedReader br = new BufferedReader(isr);
        while ((br.readLine()) != null)
            ;
        process.waitFor();

        try {
            process.destroy();
            isr.close();
            stderr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
    /*    GetStream obj = new GetStream();

		//String domainName = "google.com";

		
		//Yeh command wala part hai yahan commands likhni
                String command = "ping google.com";

		String output = obj.executeCommand(command);

		System.out.println(output);
*/

    

 /*   private String executeCommand(String command) {
        StringBuilder output = new StringBuilder();

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

	}*/

    
}
