import java.awt.Dimension;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    public void initialize(){
        String Title = new String("THE NEW WINDOW");
        setTitle(Title);
        int width, height;
        width  = 500;
         height = 700;
        setSize(width, height);
        setMinimumSize(new Dimension(width/2, height/2));


    }
}
 