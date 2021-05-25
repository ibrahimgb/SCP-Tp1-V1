package com.company;

//import java.util.ArrayList;

public class Element {
    public Element(String keyValue, double score) {
        this.objectOrLink = keyValue;
        this.score = score;
    }

    String objectOrLink;
    double score;

    @Override
    public String toString() {
        return "Pairs:" +
                "keyValue='" + objectOrLink + '\'' +
                ", score=" + score +/*"class name:"+this.getClass().getName()+*/
                '.';
    }


}

