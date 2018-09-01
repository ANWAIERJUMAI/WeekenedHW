package ds;

import java.util.HashMap;
import java.util.Map;


public class UseMap {
	public static void main(String[] args) {
		Map<String, String> cityNCountry =new HashMap<String, String>();
		cityNCountry.put("USA", "NY");
		cityNCountry.put("UK", "London");
		cityNCountry.put("Canada", "Monterial");
		
		
		for(Map.Entry<String,String>state:cityNCountry.entrySet()) {
			System.out.println(state.getKey()+"--->"+ state.getValue());
			System.out.println(cityNCountry);
		}
	}

}
