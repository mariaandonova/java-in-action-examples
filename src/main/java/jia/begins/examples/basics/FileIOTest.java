package jia.begins.examples.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Description goes here...
 *
 * @author Bozhidar Batsov
 * @since 3.6
 */
public class FileIOTest {
    public static void main(String[] args) throws FileNotFoundException {
        File someFile = new File("someFile.txt");

        PrintWriter pw = new PrintWriter(someFile);

        pw.write("One\n");
        pw.write("Two\n");
        pw.write("Three\n");

        // force write to file
        pw.flush();

        Scanner in = new Scanner(someFile);

        System.out.println(in.nextLine());
        System.out.println(in.nextLine());
        System.out.println(in.nextLine());
    }
}
