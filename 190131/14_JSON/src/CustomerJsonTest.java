
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;

public class CustomerJsonTest {
	public static void main(String[] args) throws IOException {
		
//		System.setOut(new PrintStream("out.json"));
		JsonArray customers = new JsonArray();
		
		JsonObject cust1 = new JsonObject();
		cust1.addProperty("customerNumber", "c001");
		cust1.addProperty("name", "이순신");
		cust1.addProperty("point", 150);
		System.out.println(cust1);
		
		JsonWriter out = new JsonWriter(new FileWriter("out.json", true));
		out.beginObject();
		out.name("customerNumber");
		out.value("Lee");
		out.endObject();
		out.close();	
	}
}
