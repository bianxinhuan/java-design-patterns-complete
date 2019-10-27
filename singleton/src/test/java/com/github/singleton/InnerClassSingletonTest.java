package com.github.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * -
 *
 * @author bianxinhuan
 */
public class InnerClassSingletonTest {

    @Test
    public void getInstance() {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        assertEquals(instance, instance2);
    }
}