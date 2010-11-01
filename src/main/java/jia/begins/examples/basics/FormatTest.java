package jia.begins.examples.basics;

import java.util.Date;

/**
 * @author <a href="mailto:bozhidar@drow.bg">Bozhidar Batsov</a>
 */
public class FormatTest {
    public static void main(String[] args) {
        System.out.printf("%s has %d beers.%n", "Vasko", 20);

        System.out.printf("Today is %tc %n", new Date());

        System.out.printf("%10.2f%n", 333.444);

        System.out.println(String.format("%5d", 20));
    }
}
