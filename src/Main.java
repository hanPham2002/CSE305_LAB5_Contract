public class Main {
    public static void main(String[] args) {
        Client client = new Client();

      
        ContractBuilder builder = new PermanentContractBuilder();
        Contract contract = client.requestCreateRentalContract(builder);
        System.out.println("Permanent Contract:\n" + contract);

   
        ContractBuilder builder2 = new LongTermContractBuilder();
        Contract contract2 = client.requestCreateRentalContract(builder2);
        System.out.println("\nLong Term Contract:\n" + contract2);

        
        ContractBuilder builder3 = new ShortTermContractBuilder();
        Contract contract3 = client.requestCreateRentalContract(builder3);
        System.out.println("\nShort Term Contract:\n" + contract3);
    }
}
