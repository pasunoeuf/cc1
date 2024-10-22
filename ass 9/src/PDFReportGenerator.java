public class PDFReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("Generating PDF Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Generating PDF Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Generating PDF Footer...");
    }
}
