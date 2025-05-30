public class PermanentContractBuilder implements ContractBuilder {
    private Contract contract;

    public PermanentContractBuilder() {
        contract = new Contract();
    }

    public void buildContractID() {
        contract.contractID = "PERM-" + System.currentTimeMillis();
    }

    public void buildPropertyID() {
        contract.propertyID = "P001";
    }

    public void buildTenantID() {
        contract.tenantID = "T001";
    }

    public void buildRentAmount() {
        contract.rentAmount = 1000;
    }

    public Contract signContract() {
        return contract;
    }
}
