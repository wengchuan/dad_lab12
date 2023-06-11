package dailyrainfall;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DailyRainfallReader {
	public static void main(String[] args) {
		// 1. Declare output file
		String sourceFile = "rainfall.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {
			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
			// Variables for processing byte-based data
			int rainfall = 0;
			int totalRainfall =0;
			double averageRainfall =0;
			int noOfRecords = 0;

			// 3. Process data until end-of-file
			while (dis.available() > 0) {

				// Read data
				
				rainfall = dis.read();
				System.out.println(rainfall);

				// Calculate total rainfall
				totalRainfall += rainfall;
				noOfRecords++;
			}

			// 4. Close stream
			dis.close();
			
			//calculate average rainfall
			averageRainfall = totalRainfall /noOfRecords;
			System.out.println("\nAverage Rainfall is "+averageRainfall);
			

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
	}
}
