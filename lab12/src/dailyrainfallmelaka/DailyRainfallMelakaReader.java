package dailyrainfallmelaka;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

public class DailyRainfallMelakaReader {
	public static void main(String[] args) {
		// 1. Declare output file
		String sourceFile = "dailyrainfallmelaka.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {
			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
			// Variables for processing byte-based data
			String stationId = "";
			String stationName = "";
			List<String> listDistrict = new ArrayList<>();
			String district ="";
			double averageRainfall = 0;
			List<Integer> rainfall= new ArrayList<>();
			int noOfStation = 0;
;
			//3. Process data until end-of-file
			while(dis.available() > 0) {
			
				// Read data
				stationId = dis.readUTF();
				stationName = dis.readUTF();
				district = dis.readUTF();
				if(!listDistrict.contains(district)) {
					listDistrict.add(district);
				}
				for(int index = 0;index<6;index++) {
					rainfall.add( dis.read());
					averageRainfall +=rainfall.get(index);
				}
				
				System.out.println(stationId + "\t" + stationName+ "\t"+district+"\t"+rainfall+"\tAverage rainfall: "+averageRainfall/rainfall.size());
				rainfall.clear();
				averageRainfall=0;
				noOfStation++;
			}
			dis.close();
			//total number of  station
			System.out.println("Total number of station: "+noOfStation);
			System.out.println("Total number of district : "+listDistrict.size());
		} catch (Exception ex) {

			ex.printStackTrace();
		}
	
		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");

	}
}
