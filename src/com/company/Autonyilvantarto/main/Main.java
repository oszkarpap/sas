package com.company.Autonyilvantarto.main;

import com.company.Autonyilvantarto.jarmu.Auto;
import com.company.Autonyilvantarto.jarmu.Jarmu;
import com.company.Autonyilvantarto.stack.Stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args){
//		Stack<String> s = new Stack<>();
//		s.push("Sztring");
//		Stack<Integer> sInt=new Stack<>();
//		sInt.push(new Integer(5));
//		sInt.push(4);
//		int i= sInt.pop();
//		printAll(s);
//		printAll(sInt);
//		
//		
//		Stack<Jarmu> jarmuvek= new Stack<Jarmu>();
//		add(jarmuvek, new Auto("ABC123"));
//		add(jarmuvek, new Auto("HJK456"));
//		
//		printJarmuvek(jarmuvek);
		
		//add <rendszám>, remove <rendszám>, list, exit


		//(grafikus megjelenites 01);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//Collection<Auto> autok= new ArrayList<>();
		//Collection<Auto> autok = new HashSet<>();
		Collection<Auto> autok = new TreeSet<>(Auto.AJTO_COMPARATOR);
		System.out.println("Irja be a parancsot: ");
		try {
			while(true){
				String commandLine=br.readLine().toLowerCase();
				if(commandLine.equals("exit")) break;
				else if(commandLine.equals("list")){
					for (Auto auto : autok) {
						System.out.println(auto.toString());
					}
				}else{
					String[] splitted=commandLine.split(" ");
					if(splitted.length==2){
						if(splitted[0].equals("add")){
							//add parancs
							autok.add(new Auto(splitted[1]));
						}else if(splitted[0].equals("remove")){
							//remove parancs
							autok.remove(new Auto(splitted[1]));
						}else
							System.out.println("Ilyen utasítás nincs!");
					}else
						System.out.println("Ilyen utasítás nincs!");
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static <T> boolean add(Stack<? super T> stack, T obj){
		if(stack.isFull()==false){
			stack.push(obj);
			return true;
		}else return false;
	}
	
	public static void printJarmuvek(Stack<? extends Jarmu> jarmuvek){
		while(jarmuvek.isEmpty()==false){
			System.out.println(jarmuvek.pop().getRendszam());
		}
	}
	
	public static void printAll(Stack<?> stack){
		while(stack.isEmpty()==false){
			System.out.println(stack.pop().toString());
		}
	}
}
