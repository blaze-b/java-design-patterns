package com.mclebtec.java.adaptor.bonus;

public interface ClientBrokerInterface {
    void start(String id);

    void stop(String id);

    void restart(String id);
}
