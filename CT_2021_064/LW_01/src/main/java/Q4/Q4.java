package Q4;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q4 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Date today = new Date();
        System.out.println(dateFormat.format(today));
    }
}
