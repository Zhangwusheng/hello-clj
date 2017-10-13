package com.zws.java;

/**
 * Created by zws on 10/13/17.
 */
import clojure.java.api.Clojure;
import clojure.lang.IFn;

/**
 * Java跟Clojure交互的工具方法
 *
 */
public class CljUtil {
    private static final IFn require = Clojure.var("clojure.core", "require");

    /**
     * 加载指定的Clojure空间 使用相应空间的函数前必须先调用该函数加载相应空间
     *
     * @param ns
     */
    public static final void requireNameSpace(String ns) {
        require.invoke(Clojure.read(ns));
    }

    /**
     * 引用指定空间中的相应Clojure函数 注意：先加载相应函数
     */
    public static final IFn referClojureFn(String ns, String fn) {
        return Clojure.var(ns, fn);
    }
}