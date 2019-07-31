package com.jaaaelu.gzw.learn.java.understandingTheJVM;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    private static class OOMObject {

    }

    public static void main(String[] args){
        ArrayList<OOMObject> objs = new ArrayList();

        while(true) {
            objs.add(new OOMObject());
        }
    }
}
