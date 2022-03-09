package ru.netology.sqr;

 public class SQRService {

     public int clean(int a, int b) {
         int counter = 0;
         for (int i = 10; i <= 99; i++) {
             int x = i * i;
             if (x >= a && x <= b){
                 x=1;
                 counter = 0+x+x ;
                 //System.out.println ( counter);
             }
         }
         return counter ;
     }
 }