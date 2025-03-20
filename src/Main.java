public class Main {
    public static void main(String[] args) throws Exception {
        StoreOneA storeonea = new  StoreOneA(true, 100000, 12, true);
        storeonea.enterStoreDetails();
        storeonea.calculateLoanFinancing();
        storeonea.showStoreInfo();
    }
}
