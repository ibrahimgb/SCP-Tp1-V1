package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CM cm = new CM();
        // this has 7 key values that can search for
        //  translate  	weather   netflix   twitter   outlook   pinterest   walmart
        ArrayList<Pairs> pairs = new ArrayList<Pairs>();
        ArrayList<Element> list1=new ArrayList<Element>();//creating new generic arraylist
        Pairs pair1 = new Pairs("translate",list1);
        pairs.add(pair1);
        ArrayList<Element> list2=new ArrayList<Element>();
        Pairs pair2 = new Pairs("weather",list1);
        pairs.add(pair2);
        ArrayList<Element> list3=new ArrayList<Element>();
        Pairs pair3 = new Pairs("netflix",list1);
        pairs.add(pair3);
        ArrayList<Element> list4=new ArrayList<Element>();
        Pairs pair4 = new Pairs("twitter",list1);
        pairs.add(pair4);
        ArrayList<Element> list5=new ArrayList<Element>();
        Pairs pair5 = new Pairs("outlook",list1);
        pairs.add(pair5);
        ArrayList<Element> list6=new ArrayList<Element>();
        Pairs pair6 = new Pairs("pinterest",list1);
        pairs.add(pair6);
        ArrayList<Element> list7=new ArrayList<Element>();
        Pairs pair7 = new Pairs("walmart",list1);
        pairs.add(pair7);

        cm.makeElements(20,list1);
        cm.makeElements(20,list2);
        cm.makeElements(20,list3);
        cm.makeElements(20,list4);
        cm.makeElements(20,list5);
        cm.makeElements(20,list6);
        cm.makeElements(20,list7);

        //Ading all pairs to my cm
        cm.pairs= pairs;

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter your research: ");
        String searchingString= sc.nextLine();
        System.out.println("you are searching for "+ searchingString);
        String searchingStrings[] = searchingString.split(" ");
        System.out.println("you are searching for "+searchingStrings.length+" key words ! ");
        cm.sertch(searchingStrings);
        int k = 3;
        cm.printResolts(k);





    }


}
