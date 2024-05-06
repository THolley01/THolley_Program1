/*
 * Class: CMSC201 
 * Instructor: Kash
 * Description: (Give a brief description for each Program)
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ____Trevor Holley______
*/


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class THolley_Project6 {

    @Test
    public void testLength() {
        String str = "Hello";
        assertEquals(5, str.length());
    }

    @Test
    public void testCharAt() {
        String str = "Hello";
        assertEquals('H', str.charAt(0));
        assertEquals('e', str.charAt(1));
        assertEquals('l', str.charAt(2));
        assertEquals('l', str.charAt(3));
        assertEquals('o', str.charAt(4));
    }

    @Test
    public void testSubstring() {
        String str = "Hello There";
        assertEquals("Hello", str.substring(0, 5));
        assertEquals("There", str.substring(6));
    }

    @Test
    public void testIndexOf() {
        String str = "Hello There";
        assertEquals(0, str.indexOf('H'));
        assertEquals(6, str.indexOf('T'));
        assertEquals(6, str.indexOf("There"));
    }
}