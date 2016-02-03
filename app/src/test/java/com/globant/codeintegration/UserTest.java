package com.globant.codeintegration;

import org.junit.Test;

import static org.junit.Assert.*;
import org.robolectric.*;
/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */

//@Config(emulateSdk = 18, reportSdk = 18)
//@RunWith(RobolectricTestRunner.class)
public class UserTest {
    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");


        assertEquals("foo", u.getName());
    }

//    @Test
//    public void failingTest() {
//        assertFalse(true);
//    }
}