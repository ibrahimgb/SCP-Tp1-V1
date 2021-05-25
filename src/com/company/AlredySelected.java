package com.company;

public class AlredySelected  implements Comparable<AlredySelected> {
    public AlredySelected(Element element, double som) {
        this.element = element;
        this.som = som;
    }

    Element element;
    double som;

    public double getSom() {
        return som;
    }

    @Override
    public int compareTo(AlredySelected alredySelected) {

        if (this.som < alredySelected.getSom()) {
            return 1;
        }
        else if (this.getSom() >  alredySelected.getSom()) {
            return -1;
        }
        else {
            return 0;
        }

    }
}
