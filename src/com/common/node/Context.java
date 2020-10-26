package com.common.node;

/**
 * 存放上下文关系，从而使得每次节点运行时不用传入运行环境
 */
public class Context {
    private static ThreadLocal<Environment> environment = new ThreadLocal<Environment>();

    public static Environment getEnvironment() {
        return environment.get();
    }

    public static void setEnvironment(Environment environment) {
        Context.environment.set(environment);
    }
}
