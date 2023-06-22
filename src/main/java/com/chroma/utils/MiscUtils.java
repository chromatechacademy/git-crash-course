package com.chroma.utils;

import java.io.Closeable;
import java.io.IOException;

public class MiscUtils {

    /**
     * 
     * Closes objects that implement Closeable
     * 
     * @param closeable
     * 
     */

    public static void closeQuietly(Closeable... closeable) {

        for (Closeable obj2Close : closeable) {

            if (obj2Close != null) {
                try {
                    obj2Close.close();
                }

                catch (IOException e) {
                    continue;
                }
            }
        }
    }
}