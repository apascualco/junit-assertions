package apascualco.blog.test.assertions;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNull;


public class AssertTest {

    @Test
    @Ignore
    public void assertArrayEqualsTestFail() {
        assertArrayEquals("Not equals", new int[]{},new int[]{1});
    }

    @Test
    public void assertArrayEqualsTest() {
        assertArrayEquals("Not equals", new int[]{3,2,3},new int[]{3,2,3});
        assertArrayEquals("Not equals", new int[]{},new int[]{});
    }

    @Test
    public void assertEqualsTest() {
        assertEquals("Not equals", 1L, 1L);
        Object reference = new Object();
        assertEquals("Not equals", reference, reference);
        assertEquals("Not equals", "hello world", "hello world");
    }

    @Test
    public void assertFalseTest() {
        assertFalse("Not false", "hello world".equals("world hello"));
    }

    @Test
    public void assertTrueTest() {
        assertTrue("Not false", true);
    }

    @Test
    public void assertNotNullTest() {
        assertNotNull("Is null", new Object());
    }

    @Test
    public void assertNotSameTest() {
        assertNotSame("Same", new Object(), new Object());
    }

    @Test
    public void assertSameTest() {
        Double doubleObject = 0.0;
        assertSame("Not same", doubleObject, doubleObject);
    }

    @Test
    public void assertNullTest() {
        assertNull("Is not null", null);
    }


}
