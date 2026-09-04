package cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat;

public class RhelLicenseCalculator {
    private boolean useHost;
    private int amount;
    private double totalCost;

    public RhelLicenseCalculator(int physicalCores, int vmCount) {
        // Calculate optimal license configuration
        calculateOptimalLicense(physicalCores, vmCount);
    }

    private void calculateOptimalLicense(int physicalCores, int vmCount) {
        // Pricing (modifiable based on real costs)
        double perVmCost = 849.0;  // Cost per VM (Standard 1-year subscription)
        double perCoreCost = 125.0; // Cost per core (Datacenter unlimited VMs per host)
                
        // Calculate costs
        double totalVmCost = vmCount * perVmCost;
        double totalHostCost = physicalCores * perCoreCost;
                
        // Determine the best option
        if (totalVmCost < totalHostCost) {
            useHost = false;
            amount = vmCount;
            totalCost = totalVmCost;
        } else {
            useHost = true;
            amount = 1;
            totalCost = totalHostCost;
        }    
    }

    // Returns whether Datacenter licensing is more cost-effective
    public boolean isUseHost() {
        return useHost;
    }
    
    // Returns the total calculated cost
    public double getTotalCost() {
        return totalCost;
    }
    
    // Returns the number of standard licenses required (if per-VM is chosen)
    public int getAmount() {
        return amount;
    }
}