package com.github.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * -
 *
 * @author bianxinhuan
 */
public class EagerlySingletonTest {

    @Test
    public void getInstance() {
        EagerlySingleton instance = EagerlySingleton.getInstance();
        EagerlySingleton instance2 = EagerlySingleton.getInstance();
        assertEquals(instance, instance2);
    }
}