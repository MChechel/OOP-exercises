package com.company.EnumeratedTypes;

import com.sun.security.jgss.GSSUtil;

public class Task2 {
    public static void main(String[] args) {
        PackageSize pacSize = PackageSize.getPackageSize(41,60);
        System.out.println(pacSize);
    }
}


enum PackageSize {
    SMALL(40,90),
    MEDIUM(90,140),
    LARGE(140,250),
    UNKNOWN(0,0);

    //parameters:
    private int minimumSize;
    private int maximumSize;

    PackageSize(int minimumSize, int maximumSize){
        this.maximumSize = maximumSize;
        this.minimumSize = minimumSize;
    }

    public static PackageSize getPackageSize(int minSize, int maxSize){
        for (PackageSize a:values()){
            if (minSize>=a.minimumSize && maxSize<a.maximumSize){
                return a;
            }
        }
        return UNKNOWN;
    }

}