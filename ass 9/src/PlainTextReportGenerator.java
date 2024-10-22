public class PlainTextReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("Generating Plain Text Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Generating Plain Text Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Generating Plain Text Footer...");
    }
}
