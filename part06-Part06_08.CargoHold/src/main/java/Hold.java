/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author K2
 */
public class Hold {

    private ArrayList<Suitcase> cargoHold;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.cargoHold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            cargoHold.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase element : cargoHold) {
            totalWeight += element.totalWeight();
        }

        return totalWeight;
    }
    
    public void printItems() {
        for (Suitcase contents: cargoHold) {
            contents.printItems();
        }
    }
    
    public String toString() {
        return cargoHold.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
