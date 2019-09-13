package com.ilhamrofiqi.skripsi.Variabel;

public class SkorBertahan {
    private static double skorbertahan;

    private static double titik1 = 0;
    private static double titik2 = 2500;
    private static double titik3 = 3000;
    private static double titik4 = 3500;

    public static double getSkorBertahan() {
        return skorbertahan;
    }

    public static void setSkorBertahan(double skorbertahan) {
        SkorBertahan.skorbertahan = skorbertahan;
    }

    public static double kecil() {
        if (skorbertahan>titik2 && skorbertahan<titik3) return (titik3-skorbertahan) / (titik3-titik2);
        else if (skorbertahan<=titik2) return 1;
        else return 0;
    }

    public static double sedang() {
        if (skorbertahan>titik2 && skorbertahan<titik3) return (skorbertahan-titik2) / (titik3-titik2);
        else if (skorbertahan>titik3 && skorbertahan<titik4) return (titik4-skorbertahan) / (titik4-titik3);
        else if (skorbertahan == titik3) return 1;
        else return 0;
    }

    public static double besar() {
        if (skorbertahan>titik3 && skorbertahan<titik4) return (skorbertahan-titik3) / (titik4-titik3);
        else if (skorbertahan>=titik4) return 1;
        else return 0;
    }
}
