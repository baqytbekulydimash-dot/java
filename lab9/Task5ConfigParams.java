public class Task5ConfigParams {
    static class Config {
        static String appName = "MyApplication";
        static int version = 1;
    }

    public static void main(String[] args) {
        System.out.println("App Name: " + Config.appName);
        System.out.println("Version: " + Config.version);
    }
}