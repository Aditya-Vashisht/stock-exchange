package Execution;

public class ExecutingTheOrders {
    public void executeOrders(String buyOrderId, Double sellingPrice, int quantity, String sellerOrderID) {
        System.out.println(buyOrderId + " " + sellingPrice + " " + quantity + " " + sellerOrderID);
    }
}