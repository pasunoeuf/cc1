public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();


        course.addLecture(new ProxyVideoLecture("Introduction to Java"));
        course.addLecture(new ProxyVideoLecture("Design Patterns Overview"));
        course.addLecture(new ProxyVideoLecture("Advanced Java Concepts"));


        course.showCourseInfo();


        System.out.println("\nStarting lecture 2:");
        course.playLecture(1);  // This will trigger the lazy loading


        System.out.println("\nStarting lecture 1:");
        course.playLecture(0);  // This will also trigger lazy loading
    }
}
