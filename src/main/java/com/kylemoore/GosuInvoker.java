package com.kylemoore;

import gw.lang.Gosu;
import gw.lang.reflect.ReflectUtil;
import gw.lang.reflect.gs.IGosuObject;

public class GosuInvoker {

    public static void main(String[] args) {
        System.out.println("About to call main");
        Gosu.init();
        IGosuObject handle = ReflectUtil.constructGosuClassInstance("com.kylemoore.Pawn", 1);
        System.out.println(handle.getIntrinsicType().getDisplayName());

        ReflectUtil.invokeMethod(handle, "dump");

        Object result = ReflectUtil.invokeMethod(handle, "advance", 5);
        System.out.println("Got result: " + result);

        Object result2 = ReflectUtil.invokeMethod(handle, "squareIt");
        System.out.println("Got result: " + result2);
    }

}
