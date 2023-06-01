import org.junit.Test;
import static org.junit.Assert.*;

    public class MakeAbbaTest {

        @Test
        public void testMakeAbba() {
            MakeAbba makeAbba = new MakeAbba();

            // Test case: a = "Hi", b = "Bye"
            assertEquals("HiByeByeHi", makeAbba.makeAbba("Hi", "Bye"));

            // Test case: a = "Yo", b = "Alice"
            assertEquals("YoAliceAliceYo", makeAbba.makeAbba("Yo", "Alice"));

            // Test case: a = "What", b = "Up"
            assertEquals("WhatUpUpWhat", makeAbba.makeAbba("What", "Up"));

            // Test case: a = "", b = ""
            assertEquals("", makeAbba.makeAbba("", ""));
        }
    }

