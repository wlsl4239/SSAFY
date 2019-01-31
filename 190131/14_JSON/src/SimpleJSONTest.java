import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class SimpleJSONTest {
	public static void main(String[] args) {
		String jsonData = "{\"customerName\":\"홍길동\"}";
		System.out.println(jsonData);
		JsonParser p = new JsonParser();
		JsonElement je = p.parse(jsonData);
		
		JsonObject jo = (JsonObject)je;		// je.getAsJsonObject();
		JsonElement cust = jo.get("customerName");
		
		
		System.out.println(jo);
		System.out.println(cust);
	}

}
