package org.redlich.unit.hello;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHelloSpock {
    private HelloSpock hellospock;
    private String spock;
    private String kirk;
    private String scotty;

    public TestHelloSpock() {
        }

    @Before
    public void setup() {
        hellospock = new HelloSpock();
        spock = hellospock.getSpock();
        kirk = hellospock.getKirk();
        scotty = hellospock.getScotty();
        }

    @Test
    public void testStringLength() {
        assertEquals(spock.length(),5);
        assertEquals(kirk.length(),4);
        assertEquals(scotty.length(),6);
        }
    }
