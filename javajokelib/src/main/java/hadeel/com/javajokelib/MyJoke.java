package hadeel.com.javajokelib;

import java.util.Random;

public class MyJoke {
    private String [] jokes = new String[2];
    public String getJoke(){
        jokes[0] = "this is the first joke :)";
        jokes[1] = "this is the second joke :)";

        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
