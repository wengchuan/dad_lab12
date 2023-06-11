package dailyrainfall;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DailyRainfallGenerator {
	public static void main(String[] args) {
	

			// 1. Declare output file 
			String outFile = "rainfall.txt";
			
			// Data declaration
		
			int rainfall[] = {1,0,6,19,1,0};
			
			try {
				
				// 2. Create stream to read data
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
				
				// Process data
				for (int index = 0; index < rainfall.length; index++) {
					
					// 3. Write data into data stream
					
					dos.write(rainfall[index]);
					
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

