package com.bilgeadamboost.homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shape {

	 void readInput(){
	        List<Integer> edgeSize = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        int value = 0;
	        while(value != -1){
	            System.out.println((edgeSize.size() +1) + "kenari giriniz:");
	            value = scanner.nextInt();
	            if (value>0 && edgeSize.size()<3) {
	                edgeSize.add(value);
	            }
	            
	            else if (value == 0){
	                System.out.println(edgeSize.size() + "Kenarli dikdortgen olmaz.");
	                edgeSize.clear();
	            }
	            else if (edgeSize.size()>=3){
	                int cevre = 0;
	                int alan = 0;
	                for (int v : edgeSize) {
	                    cevre += v;
	                }
	                System.out.println("Cevre: "+cevre);

	                alan = edgeSize.get(0)*edgeSize.get(1);
	                System.out.println("Alan: "+alan);
	                edgeSize.clear();
	            }else if (value == -1){
	                break;
	            }

	        }


	    }
	}