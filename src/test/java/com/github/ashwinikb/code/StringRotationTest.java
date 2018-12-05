package com.github.ashwinikb.code;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringRotationTest {

    @Test
    public void test(){
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";

        Boolean result = StringRotation.rotation(s1,s2);
        assertTrue(result);
    }

    @Test
    public void test1(){
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernatePython";

        Boolean result = StringRotation.rotation(s1,s2);
        assertFalse(result);
    }
}
