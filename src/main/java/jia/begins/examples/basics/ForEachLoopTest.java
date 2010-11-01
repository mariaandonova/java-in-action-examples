package jia.begins.examples.basics;

/**
 * @author <a href="mailto:bozhidar@drow.bg">Bozhidar Batsov</a>
 */
public class ForEachLoopTest {
    public static void main(String[] args) {
        for (String name : new String[]{"Bozhidar", "Ivan", "Ana", "Iva", "Andrey"}) {
            System.out.printf("%s is a really cool name!%n", name);
        }
    }
}
