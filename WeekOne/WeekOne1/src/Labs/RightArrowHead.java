package Labs;

import java.util.Scanner;

public class RightArrowHead {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int baseChar;
        int headChar;

        baseChar = scnr.nextInt();
        headChar = scnr.nextInt();

        System.out.printf("\t\t %d\n", headChar);
        System.out.printf("\t\t %d%d\n", headChar, headChar);
        System.out.printf("\t    %d%d%d%d%d%d%d%d\n", baseChar, baseChar, baseChar, baseChar, baseChar, headChar, headChar, headChar);
        System.out.printf("\t    %d%d%d%d%d%d%d%d%d\n", baseChar, baseChar, baseChar, baseChar, baseChar, headChar, headChar, headChar, headChar);
        System.out.printf("\t    %d%d%d%d%d%d%d%d\n", baseChar, baseChar, baseChar, baseChar, baseChar, headChar, headChar, headChar);
        System.out.printf("\t\t %d%d\n", headChar, headChar);
        System.out.printf("\t\t %d\n", headChar);
        

        scnr.close();
        
        /*
          ! Should look like this.
          
               1
               11
          00000111
          000001111
          00000111
               11
               1
          
          
          
         */
    }
}
