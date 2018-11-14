package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[2].getClassName()+"."+ste[2].getMethodName();
        //throw new NotImplementedException();
        // --end-->
    }
}
