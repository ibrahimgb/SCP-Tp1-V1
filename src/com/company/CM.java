package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CM {







    String name;
    String obj;
    ArrayList<AlredySelected> alreadySelected= new ArrayList<>();
    ArrayList<Pairs> pairs = new ArrayList<>();

    public void makeElements(int i, ArrayList<Element> list) {
        int max = 1000;
        int min = 0;
        int range = max - min + 1;
        name= "pair"+0;
        for ( i = 0; i < 5; i++) {

            obj="Object"+i;
            name = "pair"+i;
            Element name = new Element(obj,(int)(Math.random() * range) + min);
            list.add(name);
            System.out.println(name.toString()+"is aded to:"+list.getClass().getSimpleName());

        }
    }

    private int searchInAlreadySelected(Element element){
        for(int counter = 0; counter < alreadySelected.size(); counter++) {
            if(alreadySelected.get(counter).element.equals(element)){
                return counter;
            }
        }
        return -1;
    }

    private void search(String searchKey){
        Element element;
        int e;
        for (int fcounter = 0; fcounter < pairs.size(); fcounter++) {
            if (searchKey.equals(pairs.get(fcounter).keyValue)) {
                for (int counter = 0; counter < pairs.get(fcounter).elements.size(); counter++) {
                    element = pairs.get(fcounter).elements.get(counter);
                    e = searchInAlreadySelected(element);
                    if (e != -1) {
                        alreadySelected.get(e).som = +element.score;
                    }
                    else  alreadySelected.add(new AlredySelected(element,element.score));

                }
            }
        }
    }


    public void sertch(String searchingStrings[]){
        for (int i=0;i<searchingStrings.length;i++){
            search(searchingStrings[i]);
        }
    }


    public void printResolts(int k){
        //testList.sort(Comparator.comparing(ClassName::getFieldName));
        //alreadySelected.sort(Comparator.comparing(AlredySelected));
        Collections.sort(alreadySelected);
//        for (int i = 0; i < alreadySelected.size();i++)
//        {
//            System.out.println(alreadySelected.get(i).element.objectOrLink + "has a score of"+alreadySelected.get(i).som);
//        }
        for (int i = 0; (i < alreadySelected.size()) &&(i < k);i++)
        {
            System.out.println(alreadySelected.get(i).element.objectOrLink + " has a score of "+alreadySelected.get(i).som);
        }
    }
}
