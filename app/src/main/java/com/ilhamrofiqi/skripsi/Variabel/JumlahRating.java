package com.ilhamrofiqi.skripsi.Variabel;

public class JumlahRating {
    private static double jumlahrating;

    private static double titik1 = 0;
    private static double titik2 = 3000;
    private static double titik3 = 4000;
    private static double titik4 = 5000;

    public static double getJumlahRating() {
        return jumlahrating;
    }

    public static void setJumlahRating(double jumlahrating) {
        JumlahRating.jumlahrating = jumlahrating;
    }

    public static double kecil() {
        if (jumlahrating>titik2 && jumlahrating<titik3) return (titik3-jumlahrating) / (titik3-titik2);
        else if (jumlahrating<=titik2) return 1;
        else return 0;
    }

    public static double sedang() {
        if (jumlahrating>titik2 && jumlahrating<titik3) return (jumlahrating-titik2) / (titik3-titik2);
        else if (jumlahrating>titik3 && jumlahrating<titik4) return (titik4-jumlahrating) / (titik4-titik3);
        else if (jumlahrating == titik3) return 1;
        else return 0;
    }

    public static double besar() {
        if (jumlahrating>titik3 && jumlahrating<titik4) return (jumlahrating-titik3) / (titik4-titik3);
        else if (jumlahrating>=titik4) return 1;
        else return 0;
    }
}
