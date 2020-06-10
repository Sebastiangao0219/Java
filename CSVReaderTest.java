import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：Apr 3, 2020 1:30:52 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class CSVReaderTest {
	public static final String delimiter = ",";
	   public static void read(String csvFile) {
	      try {
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	            	tempArr[1] = ' ' + tempArr[1];
	               //System.out.println(tempArr[1]);
	               System.out.print(tempStr + ", ");
	            }
	            System.out.println();
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
	   public static void main(String[] args) {
	      // csv file to read
	      String csvFile = "/Users/g-sebastian/Desktop/Courses/453/HW/HW/Loan.csv";
	       CSVReaderTest.read(csvFile);
	   }
}
