import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
    public static void main(String args[]) {

        ObjectMapper mapper = new ObjectMapper();                   //create a object of Objectmapper class
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";        //json string

        //map json to student
        try {
            Student student = mapper.readValue(jsonString, Student.class);      //Object to JSON Conversion by getting the Object from the JSON

            System.out.println(student);

            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);       //to pretty print the JSON output
            // Use writeValueAsString() method to get the JSON string representation of an object
            System.out.println(jsonString);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [ name: " + name + ", age: " + age + " ]";
    }
}