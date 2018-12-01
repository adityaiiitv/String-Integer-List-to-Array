import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    ArrayList<Integer> list = new ArrayList<Integer>();
    while ((line = in.readLine()) != null) {
      for(int i=0; i <line.length();i++)
      {
        if(line.charAt(i) != ' ')
        {
          int num = Character.getNumericValue(line.charAt(i));
          list.add(num);
        }
      }
    }
    int num = list.get(list.size()-1);
    list.remove(list.size()-1);
    
  }
}
