import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static Map<String,String> readFile(String path){
		 Map<String,String> words_count = new HashMap<String,String>();
			
			try {
				FileInputStream fstream = new FileInputStream(path);
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

				String strLine;
				while ((strLine = br.readLine()) != null)   {
				  
					String sorted=sortLetters(strLine);
				     
					     if(words_count.keySet().contains(sorted))
					     {
					    	 
					         words_count.put(sorted, words_count.get(sorted)+"  "+strLine);
					     }
					     else
					         words_count.put(sorted,strLine);

					}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return words_count;
		
	}
}
