package com.company;

import java.util.Scanner;

public class TOPT {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        if(a==1 || (a>11 && a%10==1))
            System.out.println(a+" TOPT");
        if((a>=2 && a<=4) || (a>20 && a%10>=2 && a%10<=4 && a%100>=22 && a%100<=24) || (a%10>=2 && a%10<=4 && a>20))
            System.out.println(a+" TOPTA");
        if((a>=5 && a<=10) || (a>=10 && a<=20 ) || (a%10==0) || (a%10>=5 && a%10<=9) || (a%100>=10 && a%100<=20))
            System.out.println(a+" TOPTOB");
    }
}
