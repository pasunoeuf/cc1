public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();


        ExpenseRequest request1 = new ExpenseRequest(300, "Team lunch");
        ExpenseRequest request2 = new ExpenseRequest(1500, "Conference registration");
        ExpenseRequest request3 = new ExpenseRequest(7000, "New office furniture");
        ExpenseRequest request4 = new ExpenseRequest(12000, "Office renovation");


        approvalChain.processRequest(request1);
        approvalChain.processRequest(request2);
        approvalChain.processRequest(request3);
        approvalChain.processRequest(request4);
    }
}
