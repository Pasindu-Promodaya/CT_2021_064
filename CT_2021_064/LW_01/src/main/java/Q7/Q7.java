package Q7;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");

        String title = sdf.format(date);

        frame.setSize(600, 300);
        frame.setTitle(title);
        frame.setVisible(true);

    }
}
