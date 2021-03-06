package com.sromku.mysampleapp;

import android.util.Log;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isFall() {
        try {
            assertEquals(5, 2 + 3);
        } catch (Exception e) {
            Log.d("Error: ", e.getMessage());
        }

    }
}