public interface ContractBuilder {
    void buildContractID();
    void buildPropertyID();
    void buildTenantID();
    void buildRentAmount();
    Contract signContract();
}
