
import java.io.BufferedReader;
import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
public class CSVReader {

	static String path="C:\\Users\\HP\\eclipse-workspace\\CSvFIle\\day.csv";

	public static List<String[]> readCSV(String filePath) {
        List<String[]> csvData = new ArrayList<>();
        String line;
        String splitBy = ",";  // You can change the delimiter if needed

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Read each line of the CSV
        	br.readLine();
            while ((line = br.readLine()) != null) {
                // Split the line by the delimiter (e.g., comma)
                String[] data = line.split(splitBy);
                csvData.add(data);  // Add each line's data to the list


              //this is new line added in AtulX

                //this is new line added by atulY 


                 //hi this is master
               //hey this is in master again newly added 

            }
        } catch (IOException e) {
            e.printStackTrace();;
        }

        return csvData;  // Return the list containing CSV data
    }

    public static void main(String[] args) {
        // File path to the CSV file
        
        // Read the CSV file
        List<String[]> csvData = readCSV(path);

        // Print the CSV data
        for (String[] row : csvData) {
           
        	  String userName=row[0];
        	  String pass=row[2];        	//System.out.println(String.join(", ", row));  // Print each row
        System.out.println(userName+"   "+pass);
        }
    }
	    }
	

	
	
	


