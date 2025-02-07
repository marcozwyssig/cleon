package cleon.architecturemethods.hermes.metamodel.spec.licensing.veeam;

public class VeeamLicenseCalculator {
    private String recommendedLicense;
    private int requiredLicenses;

    public VeeamLicenseCalculator(int totalCores, int totalVmsToBackup) {
        // Calculate optimal license configuration
        calculateOptimalLicense(totalCores, totalVmsToBackup);
    }

    private void calculateOptimalLicense(int totalCores, int totalVmsToBackup) {
        // Lizenzpreise (diese Werte können je nach aktuellen Marktpreisen angepasst werden)
        double costPerSocketLicense = 1500.0; // Beispielpreis pro CPU-Socket-Lizenz
        double costPerVUL = 300.0; // Beispielpreis pro VUL (pro gesicherte VM)

        double totalSocketLicenseCost = totalCores * costPerSocketLicense;
        double totalVULCost = totalVmsToBackup * costPerVUL;

        // Empfehlung ausgeben
        if (totalSocketLicenseCost < totalVULCost) {
        	requiredLicenses = totalCores;
        	recommendedLicense = "Socket-basierte Lizenz"; 
        } else {
        	requiredLicenses = totalVmsToBackup;
        	recommendedLicense = "Veeam Universal License (VUL)"; 
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
