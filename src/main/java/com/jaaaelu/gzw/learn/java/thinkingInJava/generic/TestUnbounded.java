package com.jaaaelu.gzw.learn.java.thinkingInJava.generic;

import java.util.Map;

public class TestUnbounded {
    Map<?, ?> map;
    Map<String, ?> stringMap;

    public void setMap(Map<?, ?> map) {
        this.map = map;
    }

    public void setStringMap(Map<String, ?> stringMap) {
        this.stringMap = stringMap;
    }
}
