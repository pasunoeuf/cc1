import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private final List<DocumentVersion> versions = new ArrayList<>();


    public void saveVersion(Document document) {
        versions.add(document.save());
        System.out.println("Saved version: " + (versions.size()));
    }


    public void listVersions() {
        System.out.println("Available versions:");
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1));
        }
    }


    public void restoreVersion(Document document, int versionIndex) {
        if (versionIndex < 1 || versionIndex > versions.size()) {
            System.out.println("Invalid version number.");
            return;
        }
        document.restore(versions.get(versionIndex - 1));
        System.out.println("Restored to version " + versionIndex + ": " + document.getContent());
    }
}
