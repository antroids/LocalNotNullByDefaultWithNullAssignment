package com.example;

import org.eclipse.jdt.annotation.NonNullByDefault;

@NonNullByDefault
public class LocalNull {

    public Object method(boolean b) {
        Integer i = null;
        Integer j = 123;
        Integer k = j;

        i = b ? 1 : null;

        j = i;

        System.out.println(i + "" + j);

        return k;
    }

}
