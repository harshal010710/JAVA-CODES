import java.io.*;
class CreateFile
{
    public static void main(String[] args) 
    {
        
        File fobj = new File("PPA.txt");
        fobj.createNewFile();
    }   
}
