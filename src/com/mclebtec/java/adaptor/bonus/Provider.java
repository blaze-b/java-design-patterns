package com.mclebtec.java.adaptor.bonus;

public interface Provider {
}

class AzureCloudProvider{
    public void bootVM(String id, String vdc){
        System.out.println(this.getClass().getSimpleName() + " start ");
    }

    public void terminateVM(String id, String vdc){
        System.out.println(this.getClass().getSimpleName() + " stop ");
    }

    public void rebootVM(String id){
        System.out.println(this.getClass().getSimpleName() + " reboot ");
    }
}

class AmazonCloudProvider {
    public void startVM(String id){
        System.out.println(this.getClass().getSimpleName() + " start ");
    }

    public void stopVM(String id){
        System.out.println(this.getClass().getSimpleName() + " stop ");
    }

    public void rebootVM(String id){
        System.out.println(this.getClass().getSimpleName() + " reboot ");
    }
}


class GoogleCloudProvider {
    public void startVM(String id){
        System.out.println(this.getClass().getSimpleName() + " start ");
    }

    public void shutdownVM(String id){
        System.out.println(this.getClass().getSimpleName() + " stop ");
    }
}