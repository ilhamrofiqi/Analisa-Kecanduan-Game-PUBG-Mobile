package com.ilhamrofiqi.skripsi.Variabel;

public class LamaBertahan {
    private static double lamabertahan;

    private static double titik1 = 0;
    private static double titik2 = 24;
    private static double titik3 = 36;
    private static double titik4 = 48;

    public static double getLamaBertahan() {
        return lamabertahan;
    }

    public static void setLamaBertahan(double lamabertahan) {
        LamaBertahan.lamabertahan = lamabertahan;
    }

    public static double sebentar() {
        if (lamabertahan>titik2 && lamabertahan<titik3) return (titik3-lamabertahan) / (titik3-titik2);
        else if (lamabertahan<=titik2) return 1;
        else return 0;
    }

    public static double sedang() {
        if (lamabertahan>titik2 && lamabertahan<titik3) return (lamabertahan-titik2) / (titik3-titik2);
        else if (lamabertahan>titik3 && lamabertahan<titik4) return (titik4-lamabertahan) / (titik4-titik3);
        else if (lamabertahan == titik3) return 1;
        else return 0;
    }

    public static double lama() {
        if (lamabertahan>titik3 && lamabertahan<titik4) return (lamabertahan-titik3) / (titik4-titik3);
        else if (lamabertahan>=titik4) return 1;
        else return 0;
    }
}
