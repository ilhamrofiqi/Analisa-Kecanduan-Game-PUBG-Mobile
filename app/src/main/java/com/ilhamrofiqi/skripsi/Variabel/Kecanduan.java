package com.ilhamrofiqi.skripsi.Variabel;

public class Kecanduan {
    private static double kecanduan;

    private static double titik1 = 20;
    private static double titik2 = 35;
    private static double titik3 = 52;
    private static double titik4 = 70;
    private static double titik5 = 85;

    public static double getKecanduan() {
        return kecanduan;
    }

    public static void setKecanduan(double kecanduan) {
        Kecanduan.kecanduan = kecanduan;
    }

    public static double rendah() {
        if (kecanduan>titik1 && kecanduan<titik2) return (titik2-kecanduan) / (titik2-titik1);
        else if (kecanduan<=titik1) return 1;
        else return 0;
    }

    public static double sedang() {
        if (kecanduan>titik2 && kecanduan<titik3) return (kecanduan-titik2) / (titik3-titik2);
        else if (kecanduan>titik3 && kecanduan<titik4) return (titik4-kecanduan) / (titik4-titik3);
        else if (kecanduan == titik3) return 1;
        else return 0;
    }

    public static double tinggi() {
        if (kecanduan>titik4 && kecanduan<titik5) return (kecanduan-titik4) / (titik5-titik4);
        else if (kecanduan>=titik5) return 1;
        else return 0;
    }

    public static double rendah(double in) {
        return (titik2 - (in*(titik2-titik1)));
    }

    public static double sedang(double in) {
        return titik2 + (in*(titik3-titik2));
//        return titik4 - (in*(titik4-titik3));
    }

    public static double tinggi(double in) {
        return titik4 + (in*(titik5-titik4));
    }
}
