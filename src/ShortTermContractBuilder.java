public class ShortTermContractBuilder implements ContractBuilder {
    private Contract contract;

    public ShortTermContractBuilder() {
        contract = new Contract();
    }

    public void buildContractID() {
        contract.contractID = "SHORT-" + System.currentTimeMillis();
    }

    public void buildPropertyID() {
        contract.propertyID = "P003";
    }

    public void buildTenantID() {
        contract.tenantID = "T003";
    }

    public void buildRentAmount() {
        contract.rentAmount = 500;
    }

    public Contract signContract() {
        return contract;
    }
}
