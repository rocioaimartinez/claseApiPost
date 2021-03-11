package com.bootcampml.hello;

public class RomanEx {
    public String turnToRoman(int n){

        int naturals[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder finalnumber= new StringBuilder();

        for (int i =0; i < naturals.length;i++){
            while(n >= naturals[i]){
                n-= naturals[i];
                finalnumber.append(roman[i]);
            }

        }
        return finalnumber.toString();
    }
}
