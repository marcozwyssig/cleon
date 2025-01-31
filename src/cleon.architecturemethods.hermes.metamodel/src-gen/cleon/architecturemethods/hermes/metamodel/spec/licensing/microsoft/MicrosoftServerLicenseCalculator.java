package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft;

public class MicrosoftServerLicenseCalculator {
    private boolean useDatacenter;
    private int standardLicenses;
    private int coresToLicense;

    public MicrosoftServerLicenseCalculator(int physicalCores, int vmCount) {
        // Calculate optimal license configuration
        calculateOptimalLicense(physicalCores, vmCount);
    }

    private void calculateOptimalLicense(int physicalCores, int vmCount) {
        // Ensure a minimum of 16 cores per server
        this.coresToLicense = Math.max(16, physicalCores);
        
        // Calculate required standard licenses (2 VMs per license)
        this.standardLicenses = (int) Math.ceil(vmCount / 2.0);

        // Cost calculation for Standard and Datacenter licensing
        int costPerStandardLicense = 500; // Price for a 16-core Standard license
        int costPerDatacenterLicense = 6000; // Price for a 16-core Datacenter license

        int totalStandardCost = standardLicenses * costPerStandardLicense;
        int totalDatacenterCost = (coresToLicense / 16) * costPerDatacenterLicense;

        // Decide whether to use Datacenter licensing
        this.useDatacenter = totalDatacenterCost <= totalStandardCost;
    }

    // Returns whether Datacenter licensing is more cost-effective
    public boolean isUseDatacenter() {
        return useDatacenter;
    }

    // Returns the required number of Standard licenses
    public int getStandardLicenses() {
        return standardLicenses;
    }

    // Returns the total number of cores to be licensed
    public int getCoresToLicense() {
        return coresToLicense;
    }
}
