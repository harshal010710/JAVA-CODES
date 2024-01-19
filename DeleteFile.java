import java.io.File;

class DeleteFile 
{
    public static void main(String[] args) throws Exception
    {
        File fobj = new File("PPA.txt");
        fobj.delete();
    }    
}
