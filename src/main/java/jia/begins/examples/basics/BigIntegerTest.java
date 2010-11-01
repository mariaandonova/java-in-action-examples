package jia.begins.examples.basics;

import java.math.BigInteger;

/**
 * @author <a href="mailto:bozhidar@drow.bg">Bozhidar Batsov</a>
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger someNum = BigInteger.valueOf(100);

        someNum = someNum.add(BigInteger.valueOf(50));

        // now this will be one particularly long number
        System.out.println("150 to the power of 150 is: " + someNum.pow(150));
    }
}
