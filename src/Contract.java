public class Contract {
    public String contractID;
    public String propertyID;
    public String tenantID;
    public double rentAmount;

    @Override
    public String toString() {
        return "Contract{" +
                "contractID='" + contractID + '\'' +
                ", propertyID='" + propertyID + '\'' +
                ", tenantID='" + tenantID + '\'' +
                ", rentAmount=" + rentAmount +
                '}';
    }
}
