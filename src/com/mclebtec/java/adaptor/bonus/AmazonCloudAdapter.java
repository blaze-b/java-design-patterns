package com.mclebtec.java.adaptor.bonus;

public class AmazonCloudAdapter implements ClientBrokerInterface {
    AmazonCloudProvider amazonCloudProvider = new AmazonCloudProvider();

    @Override
    public void start(String id) {
        amazonCloudProvider.startVM(id);

    }

    @Override
    public void stop(String id) {
        amazonCloudProvider.stopVM(id);
    }

    @Override
    public void restart(String id) {
        amazonCloudProvider.rebootVM(id);
    }
}
