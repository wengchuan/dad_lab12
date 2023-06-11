package dailyrainfallcharacter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class dailyrainfallwriter {
	public static void main(String[] args) {
		// 1. Identify the destination eg. receipt.txt
				String fileName = "dailyrainfallwriter.txt";
				try {
					
					//  2. Construct Writer object
					PrintWriter pwRainfall = new PrintWriter(fileName);
					
					// Data of rainfall
					String date[]= {"04/06/2023","05/06/2023","06/06/2023","07/06/2023","08/06/2023","09/06/2023"};
					int rainfall[] = {1,0,6,19,1,0};

					
					// Print the ordered items
					for (int index = 0; index < rainfall.length; index++) {
						
						pwRainfall.print(date[index] + "\t");
						pwRainfall.println(rainfall[index]);
					}
					
					pwRainfall.close();
					
				} catch (FileNotFoundException e) {
					
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("End of execution. Refer "+ fileName);
				
			
	}
}
