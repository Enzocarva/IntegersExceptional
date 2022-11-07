//======================================================================================================================
import java.util.*;
//----------------------------------------------------------------------------------------------------------------------
public class ExceptionalIntegers {
//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int index;

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (index = 0; index < args.length; index++) {
            try {
                int inum = Integer.parseInt(args[index]);
                al.add(inum);
                System.out.println("Converter method says integer OK - " + args[index]);
            }
            catch(Exception e) {
                System.out.println("Catch block says the argument " + '"' + args[index] + '"' + " is ignored because " + args[index]);
            }
        }

        System.out.println("\nVectors contents are:");
        for (index = 0; index < al.size(); index++) {
            System.out.println("Item " + index + " is " + al.get(index));
        }
    }
//----------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================