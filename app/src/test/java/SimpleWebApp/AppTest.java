/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SimpleWebApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test 
    public void testFound()
    {
        //Girilen dizide en büyük değer doğru bulundu.Bu fonksiyon true dönmeli.
        int dizi[] = {1,5,9,7,0,3,2,4,6,8};
        assertTrue(App.EnBuyukElemaniBulma(dizi, 9));
    }

    @Test 
    public void testNotFound()
    {
        //Girilen dizide en büyük değer yanlış bulundu.Bu fonksiyon false dönmeli.
        int dizi[] = {1,5,9,7,0,3,2,4,6,8};
        assertFalse(App.EnBuyukElemaniBulma(dizi, 5));
    }
    @Test 
    public void testEmptyArray()
    {
        int array [] = new int[10];
        assertFalse(App.EnBuyukElemaniBulma(array, 1));
    }

    @Test 
    public void testNull()
    {
        assertFalse(App.EnBuyukElemaniBulma(null, 0));
    }

}
