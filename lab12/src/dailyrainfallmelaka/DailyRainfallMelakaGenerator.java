package dailyrainfallmelaka;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DailyRainfallMelakaGenerator {
	public static void main(String[] args) {
		// 1. Declare output file
		String outFile = "dailyrainfallmelaka.txt";

		// Data declaration
		String stationId[] = { "2421003", "2322006", "2324032", "2324033", "0300061RF", "2223023" };
		String stationName[] = { "Simpang Ampat", "Melaka Pindah", "Ldg. Sing Lian di Bkt. Senggeh Melaka",
				"Hospital Jasin", "Bukit Katil, Sg. Duyong", "Sg. Duyong" };
		String district[] = { "Alor Gajah", "Jasin", "Melaka Tengah	" };
		int[][] rainfall = { { 1, 0, 6, 19, 1, 0 }, { 0, 0, 2, 18, 2, 0 }, { 0, 0, 0, 4, 0, 0 },
				{ 14, 0, 11, 15, 31, 0 }, { 0, 0, 37, 23, 57, 0 }, { 3, 0, 43, 26, 26, 0 } };

		try {
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));

			// Process data
			for (int index = 0,i=-1; index < stationId.length; index++) {
				
				// 3. Write data into data stream
				dos.writeUTF(stationId[index]);
				dos.writeUTF(stationName[index]);
				//every two station has one district
				if(index%2==0) {
					i++;
				}
				dos.writeUTF(district[i]);
				
				//loop for writing the rainfall 
				for (int column = 0; column < 6; column++) {
					dos.write(rainfall[index][column]);
				}
				// 4. Flush for each writing
				dos.flush();
			}
			// 5. Close stream
			dos.close();
		} catch (Exception ex) {

			ex.printStackTrace();
		}
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}

}
