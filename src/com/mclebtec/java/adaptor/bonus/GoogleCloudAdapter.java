package com.mclebtec.java.adaptor.bonus;

public class GoogleCloudAdapter implements ClientBrokerInterface {
    GoogleCloudProvider googleCloudProvider = new GoogleCloudProvider();

    @Override
    public void start(String id) {
        googleCloudProvider.startVM(id);

    }

    @Override
    public void stop(String id) {
        googleCloudProvider.shutdownVM(id);
    }

    @Override
    public void restart(String id) {
        googleCloudProvider.shutdownVM(id);
        googleCloudProvider.startVM(id);
    }
}
