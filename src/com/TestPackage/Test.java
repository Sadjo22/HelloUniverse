package com.TestPackage;
import com.MyUniverseProject.Planet;

import java.util.Scanner;

public class Test {
    static void min(int... arr){
        int min = arr[0];
        for(int i= 0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];

            }

        }
        System.out.println(min);
    }
    public static void main(String args[]){
        Planet p = new Planet("Totler",922,"Tellurique");
        p.revolution(p.matiere);
        Student student = new Student();
        student.setName("Sadjo");
        System.out.println(student.getStudentName());
        Scanner sc = new Scanner(System.in);
        int b[] ={
                33,22,44,55,66,77,88
        };
        int e[] = b.clone();
        System.arraycopy(b,1,e,0,4);
        for(int i:e){
            System.out.println(i);
        }
        min(33,22,44,55,66,77,88);
    }
}
