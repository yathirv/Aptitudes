import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("/Users/yathi/eclipse-workspace/Aptitude/src/resources/data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos =new FileOutputStream("/Users/yathi/eclipse-workspace/Aptitude/src/resources/data.properties");
		prop.store(fos, null);
		
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
	}

}
