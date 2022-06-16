package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void test1() {
        System.out.println("this is test1");
    }

    public boolean catDog(String str) {
        int countCat = 0;
        while (str.contains("cat")) {
            str = str.replaceFirst("cat", "");
            countCat++;
        }

        int countDog = 0;
        while (str.contains("dog")) {
            str = str.replaceFirst("dog", "");
            countDog++;
        }
        if (countCat == countDog) {
            return true;
        } else {
            return false;
        }
    }


    @Test
    public void testCatDog() {
        String str1 = "catxxdogxxxdog";
        boolean expectedValue1 = false;
        String str2 = "catcat";
        boolean expectedValue2 = false;
        String str3 = "1cat1cadodog";
        boolean expectedValue3 = true;

        Assertions.assertEquals(expectedValue1, catDog(str1));
        Assertions.assertEquals(expectedValue2, catDog(str2));
        Assertions.assertEquals(expectedValue3, catDog(str3));
    }


}
