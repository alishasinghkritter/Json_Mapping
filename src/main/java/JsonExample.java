
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONValue;

public class JsonExample {
    public static void main(String args[]) throws IOException {
        //create a jsonobject
        JSONObject obj = new JSONObject();
        obj.put("name", "sonoo");
        obj.put("age", new Integer(27));
        obj.put("salary", new Double(600000));
        System.out.println(obj);

        //JSON Encode using Map
        Map obj1 = new HashMap();
        obj1.put("name", "demo");
        obj1.put("age", new Integer(25));
        obj1.put("salary", new Double(350000));
        String jsonText = JSONValue.toJSONString(obj1);      //convert object to value
        System.out.println(jsonText);

        //JSON Array Encode
        JSONArray arr = new JSONArray();
        arr.add("Nikki");
        arr.add(new Integer(30));
        arr.add(new Double(35200));
        System.out.println(arr);

        //JSON Array Encode using List
        List arr1 = new ArrayList();
        arr1.add("Jasmin");
        arr1.add(new Integer(20));
        arr1.add(new Double(400000));
        String jsonText1 = JSONValue.toJSONString(arr1);
        System.out.println(jsonText1);

    }
}