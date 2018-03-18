package com.zan;

public class La {
	public int stevilo(int visina, int R) {
		System.out.println(visina + " " + R);
        double a = R-visina;
        double fi = Math.asin(a/R);
        double litri = (3000/(2*Math.PI))*(Math.PI - 2*fi - Math.sin(2*fi));
        System.out.println(fi+ " "+litri);
        int l = (int) Math.round(litri);
        return l;
	}
}
