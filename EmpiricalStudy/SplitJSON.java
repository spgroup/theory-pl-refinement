import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SplitJSON {

	public static void getMessages(JSONParser parser){
		JSONObject obj;
		try {
			obj = (JSONObject) parser.parse(new FileReader("/home/gabriela/Documents/neo4j-community-2.2.8/changeasset.json"));
			Iterator it = obj.values().iterator();
			JSONArray a = (JSONArray) it.next();

			int index = 1;
			for (Object o : a)
			{
				JSONObject c = (JSONObject) o;
				JSONArray commit = (JSONArray) c.get("row");
				JSONObject line = (JSONObject) commit.get(0);
				String message = line.get("message").toString();
				PrintWriter writer = new PrintWriter("messages/message"+index+".txt", "UTF-8");
				writer.println(message);
				writer.close();
				index++;
			}
			System.out.println("Created "+(index-1)+" files");

		}catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[]args){
		JSONParser parser = new JSONParser();
		getMessages(parser);
		
	}
}
