import java.awt.*;
 
class GUI2
{
    public static void main(String[] args) {
        MarvellousFrame monj = new MarvellousFrame("PPA49");
    }
}

class MarvellousFrame
{
        MarvellousFrame(String title)
        {
            Frame fobj = new Frame(title);
            fobj.setSize(600,600);                // (W, H)
            fobj.setVisible(true);
            Color cl = new Color(134455);  
            fobj.setBackground(cl);
        }

}