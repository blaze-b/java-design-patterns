package com.mclebtec.java.adaptor.bonus;

public class AzureCloudAdapter implements ClientBrokerInterface {
    AzureCloudProvider azureCloudProvider = new AzureCloudProvider();

    @Override
    public void start(String id) {
        azureCloudProvider.bootVM(id, "");

    }

    @Override
    public void stop(String id) {
        azureCloudProvider.terminateVM(id, "");
    }

    @Override
    public void restart(String id) {
        azureCloudProvider.rebootVM(id);
    }
}
