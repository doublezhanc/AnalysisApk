public class Main {
    public static void main(String[] args) {
        String path = "E:/app-develop-debug.apk";
        String[] messag = AnalysisApk.unZip(path);
        System.out.println(messag[0] + "-------->" + messag[1] + "-------->" + messag[2]);
    }
}
