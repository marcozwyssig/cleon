package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware;

public class VMWareEsxiLicenseCalculator {
    private String recommendedLicense;
    private int requiredLicenses;

    public VMWareEsxiLicenseCalculator(int totalHosts, int totalCores) {
        // Calculate optimal license configuration
        calculateOptimalLicense(totalHosts, totalCores);
    }

    private void calculateOptimalLicense(int totalHosts, int totalCores) {
    	 // Berechnung der benötigten Lizenzen (1 Lizenz pro 16 Kerne)
    	requiredLicenses = (int) Math.ceil((double) totalCores / 16);
        
        if (totalHosts <= 3) {
            recommendedLicense = "vSphere Essentials Plus (max. 3 Hosts)";
        } else if (totalCores <= 512) {
            recommendedLicense = "vSphere Standard oder Enterprise Plus";
        } else {
            recommendedLicense = "vSphere+ mit flexibler Lizenzierung";
        }
    }

    public int getRequiredLicenses() {
        return requiredLicenses;
    }

    // Returns the total number of cores to be licensed
    public String getRecommendedLicense() {
        return recommendedLicense;
    }
}
