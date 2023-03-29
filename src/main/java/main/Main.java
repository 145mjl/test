package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> co = new ArrayList<>();
        for(int i=0;i<6;i++){
            co.add(sc.nextInt());
        }
        sc.close();
        int xCoSum=0;
        int yCoSum=0;
        for (int i=0;i<co.size();i++) {
            if(i%2==0){
                xCoSum += co.get(i);
            }else{
                yCoSum += co.get(i);
            }
        }
        System.out.printf("(%.1f, %.1f)",xCoSum/(co.size()/2.0),yCoSum/(co.size()/2.0));
    }
}
