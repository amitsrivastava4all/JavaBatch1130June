
public class CommonUtil {
	public String getProperCase(String name){
		String names[] = name.split(" ");
		String properName = "";
		for(String n: names){
			properName  += String.valueOf(n.charAt(0)).toUpperCase() 
			+ n.substring(1).toLowerCase()+" ";
		}
		return properName;
	}
}
