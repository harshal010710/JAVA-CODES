import java.io.FileInputStream;

class ReadFile 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream fobj = new FileInputStream("PPA.txt");
            int i = 0;
            
            while ((i = fobj.read()) != -1) 
            {
                System.out.print((char)i);    
            }
            
            System.out.println();
            fobj.close();
        } 
        catch (Exception e) {
            // TODO: handle exception
        }    
    }    
}
