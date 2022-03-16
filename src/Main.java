import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println(timeConversion("12:05:45AM"));
    }

    /*
     * Method to convert 12-hour formatted string time to 24-hour format.
     */
    public static String timeConversion(String s) {
        String[] t = s.substring(0,s.length()-2).split(":");
        List<Integer> time = new ArrayList<>();

        for(String str : t)
            time.add(Integer.parseInt(str));

        char ap = s.toLowerCase().charAt(s.length()-2);

        if(ap == 'a')
        {
            if(time.get(0) == 12)
            {
                time.set(0, 0);
            }
        }
        else
        {
            if(time.get(0) != 12)
            {
                time.set(0, time.get(0)+12);
            }
        }

        return String.format("%02d:%02d:%02d",time.get(0), time.get(1), time.get(2));
    }
}
