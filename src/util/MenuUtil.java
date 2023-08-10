package util;


import static util.InputUtil.inputByte;
import static util.InputUtil.inputString;

public class MenuUtil {
    public static byte entry(){
        System.out.println(
                "[0] - > System Exit\n"+
                "[1] - > Register\n"+
                "[2] - > Show\n"+
                "[3] - > Search\n"+
                "[4] - > Update\n"+
                "[5] - > Delete\n"+
                "[6] - > StorageToStock\n"

        );
        return inputByte("Enter the option:");
    }

    public static byte entryShow(){
        System.out.println(
                "[1] - > Storage\n"+
                "[2] - > Stocks\n"
        );
     return inputByte("Enter the option:");
    }

    public static String entryDetails(){
        System.out.println("Details for the book");
        return inputString("Enter the book name");
    }

    public static byte entrySearch(){
        System.out.println(
                "[1] - > Name\n"+
                "[2] - > Author\n"+
                "[3] - > Genre\n"
        );
        return inputByte("Enter the search");
    }

}
