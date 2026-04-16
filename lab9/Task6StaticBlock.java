public class Task6StaticBlock {
    static class Config {
        static String appName;
        static int version;

        static {
            appName = "StaticApp";
            version = 2;
            System.out.println("Static block executed");
        }
    }

    public static void main(String[] args) {
        System.out.println("App Name: " + Config.appName);
        System.out.println("Version: " + Config.version);
    }
}