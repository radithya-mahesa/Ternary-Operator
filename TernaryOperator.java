public class TernaryOperator {

    public static void main(String[] args) {
        // if statement biasa
        int duit = 15_000;;

        if (duit >= 10_000){
            System.out.println("Cukup buat bakso");
        } else {
            System.out.println("Tabung lagi");
        }

        // ternary operator
        // (kondisi) ? jika_true : jika_false
        String percakapan = (duit >= 10000) ? "Pinjam dulu 10rb" : "Gajadi pinjam";
        System.out.println(percakapan);


        //Daerah yang dikenal masyarakat dengan kasus pencurian besi adalah?
        String kuis = (/*ini jawaban mu*/ "jakarta" == /*jawaban sebenarnya */ "madura") 
        ? "JAWABAN KAMU BENAR" : "JAWABAN KAMU SALAH";
        System.out.println(kuis);
    }
}