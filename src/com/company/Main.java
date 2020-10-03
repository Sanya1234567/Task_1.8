package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[];
        boolean z = true;
        a = new int [N];
        for (int i = 0; i < N; i++){
            a[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        for (int b = 0; b < N; b++){
            if(a[b] == k){
                System.out.print(b + 1);
                z = false;
                break;
            }
        }
        if(z){
            System.out.print("NO");
        }
    }
}
