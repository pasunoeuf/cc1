public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial content.");
        VersionControl versionControl = new VersionControl();


        versionControl.saveVersion(document);


        document.setContent("First edit.");
        versionControl.saveVersion(document);

        document.setContent("Second edit.");
        versionControl.saveVersion(document);


        versionControl.listVersions();


        versionControl.restoreVersion(document, 1);
        System.out.println("Current Document Content: " + document.getContent());


        versionControl.restoreVersion(document, 2);
        System.out.println("Current Document Content: " + document.getContent());
    }
}
