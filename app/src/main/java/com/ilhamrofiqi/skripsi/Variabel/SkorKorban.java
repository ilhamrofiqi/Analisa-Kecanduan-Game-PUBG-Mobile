package com.ilhamrofiqi.skripsi.Variabel;

public class SkorKorban {
    private static double skorkorban;

    private static double titik1 = 0;
    private static double titik2 = 2500;
    private static double titik3 = 3000;
    private static double titik4 = 3500;

    public static double getSkorKorban() {
        return skorkorban;
    }

    public static void setSkorKorban(double skorkorban) {
        SkorKorban.skorkorban = skorkorban;
    }

    public static double kecil() {
        if (skorkorban>titik2 && skorkorban<titik3) return (titik3-skorkorban) / (titik3-titik2);
        else if (skorkorban<=titik2) return 1;
        else return 0;
    }

    public static double sedang() {
        if (skorkorban>titik2 && skorkorban<titik3) return (skorkorban-titik2) / (titik3-titik2);
        else if (skorkorban>titik3 && skorkorban<titik4) return (titik4-skorkorban) / (titik4-titik3);
        else if (skorkorban == titik3) return 1;
        else return 0;
    }

    public static double besar() {
        if (skorkorban>titik3 && skorkorban<titik4) return (skorkorban-titik3) / (titik4-titik3);
        else if (skorkorban>=titik4) return 1;
        else return 0;
    }
}
