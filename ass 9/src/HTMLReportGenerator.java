public class HTMLReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("Generating HTML Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Generating HTML Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Generating HTML Footer...");
    }
}
