import easyaccept.EasyAccept;

public class Main {
    public static void main(String[] args) {
        String facade = "br.ufal.ic.p2.myfood.Facade";
        // First milestone
        EasyAccept.main(new String[]{facade, "tests/us1_1.txt"});
        EasyAccept.main(new String[]{facade, "tests/us1_2.txt"});
        EasyAccept.main(new String[]{facade, "tests/us2_1.txt"});
        EasyAccept.main(new String[]{facade, "tests/us2_2.txt"});
        EasyAccept.main(new String[]{facade, "tests/us3_1.txt"});
        EasyAccept.main(new String[]{facade, "tests/us3_2.txt"});
        EasyAccept.main(new String[]{facade, "tests/us4_1.txt"});
        EasyAccept.main(new String[]{facade, "tests/us4_2.txt"});

        // Second milestone
//        EasyAccept.main(new String[]{facade, "tests/us8.txt"});
//        EasyAccept.main(new String[]{facade, "tests/us9.txt"});
//        EasyAccept.main(new String[]{facade, "tests/us9_1.txt"});
//        EasyAccept.main(new String[]{facade, "tests/us10.txt"});
//        EasyAccept.main(new String[]{facade, "tests/us10_1.txt"});
    }
}