public class Client {
    public Contract requestCreateRentalContract(ContractBuilder builder) {
        builder.buildContractID();
        builder.buildPropertyID();
        builder.buildTenantID();
        builder.buildRentAmount();
        return builder.signContract();
    }
}
