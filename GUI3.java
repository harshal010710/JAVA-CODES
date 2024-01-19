import java.awt.*;
import java.awt.event.*;
 
class GUI3
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
            fobj.setSize(600,300);                      // (W, H)
            fobj.setVisible(true);
            Color cl = new Color(134455);  
            fobj.setBackground(cl);

            fobj.addWindowListener(new MarvellousListener());
                        
        }
}

class MarvellousListener implements WindowListener
{
    public void windowDeactivated(WindowEvent obj) {}
    public void windowActivated(WindowEvent obj) {}
    public void windowDeiconified(WindowEvent obj) {}
    public void windowIconified(WindowEvent obj) {}
    public void windowClosed(WindowEvent obj) {}
    public void windowClosing(WindowEvent obj) 
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj){}
}

