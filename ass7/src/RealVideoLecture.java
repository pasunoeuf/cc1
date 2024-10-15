public class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video: " + title + "...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Lecture: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
