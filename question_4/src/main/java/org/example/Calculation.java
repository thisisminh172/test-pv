package org.example;

public class Calculation {
    private static Calculation uniqueInstance;
    private String env;
    private String dao;

    private static final Object lock = new Object();

    private Calculation() {
    }

    private Calculation(String dao, String env) {
        this.env = env;
        this.dao = dao;
    }

    public static Calculation getInstance(String dao, String env) {
        if (uniqueInstance == null) {
            synchronized (lock) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Calculation(dao, env);
                }
            }
        }
        return uniqueInstance;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getDao() {
        return dao;
    }

    public void setDao(String dao) {
        this.dao = dao;
    }
}
