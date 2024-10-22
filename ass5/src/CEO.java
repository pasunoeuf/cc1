public class CEO extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() > 10000) {
            System.out.println("CEO approved the expense: " + request.getPurpose());
        } else {
            System.out.println("Invalid request. No approver found.");
        }
    }
}
