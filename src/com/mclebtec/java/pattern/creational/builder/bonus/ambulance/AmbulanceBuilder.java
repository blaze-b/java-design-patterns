package com.mclebtec.java.pattern.creational.builder.bonus.ambulance;

public class AmbulanceBuilder {

    public Ambulance buildAmbulance(int numberOfWheels, String label) {
        Ambulance ambulance = new Ambulance();
        VanFactory vanFactory = new VanFactory();
        ambulance.setVan(vanFactory.getVan(numberOfWheels));
        ambulance.setLabel(label);
        return ambulance;
    }

    public static class Ambulance {
        Van van;
        String label;

        public Van getVan() {
            return van;
        }

        public void setVan(Van van) {
            this.van = van;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return "Ambulance{" +
                    "van=" + van +
                    ", label='" + label + '\'' +
                    '}';
        }
    }
}

class Van {
    private int noOfWheels;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}

class FourWheelerVan extends Van {
    public FourWheelerVan() {
        setNoOfWheels(4);
    }
}

class SixWheelerVan extends Van {
    public SixWheelerVan() {
        setNoOfWheels(6);
    }
}

class EightWheelerVan extends Van {
    public EightWheelerVan() {
        setNoOfWheels(8);
    }
}
