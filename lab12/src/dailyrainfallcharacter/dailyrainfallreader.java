package dailyrainfallcharacter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class dailyrainfallreader {
	public static void main(String[] args) {
		// 1. Identify the source
		String inputFile = "dailyrainfallwriter.txt";
try {
			
			// 2. Construct the Reader object
			BufferedReader brRainfall = 
					new BufferedReader(new FileReader(inputFile));
			
			// 3. Read the data
			String line = "";
			line = brRainfall.readLine();
			System.out.println("Date \t\tRainfall");
			while (line != null) {
				
				System.out.println(line);
				
				// Read the next line
				line =  brRainfall.readLine();
			}
			
			
			// 4. Close the Reader
			brRainfall.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
