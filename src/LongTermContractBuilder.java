public class LongTermContractBuilder implements ContractBuilder {
    private Contract contract;

    public LongTermContractBuilder() {
        contract = new Contract();
    }

    public void buildContractID() {
        contract.contractID = "LONG-" + System.currentTimeMillis();
    }

    public void buildPropertyID() {
        contract.propertyID = "P002";
    }

    public void buildTenantID() {
        contract.tenantID = "T002";
    }

    public void buildRentAmount() {
        contract.rentAmount = 800;
    }

    public Contract signContract() {
        return contract;
    }
}
