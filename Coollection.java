import java.util.*;

class Coollection 
{
        public static void main(String[] args) 
        {
            LinkedList <Integer> lobj = new LinkedList<Integer>();

            lobj.add(10);
            lobj.add(20);
            lobj.add(30);
            lobj.add(40);

            System.out.println(lobj);

            lobj.addFirst(5);

            System.out.println(lobj);

            System.out.println(lobj.contains(40));

            Iterator iobj = lobj.iterator();

            while (iobj.hasNext()) 
            {
                System.out.println(iobj.next());    
            }
        }
}
