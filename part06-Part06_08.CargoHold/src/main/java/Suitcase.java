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
public class Suitcase {
    private ArrayList<Item> itemsInSuitcase;
    private int maxWeight;
    
    
    public Suitcase(int maxWeight) {
        this.itemsInSuitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
        
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item element: itemsInSuitcase) {
            totalWeight += element.getWeight();
        }
        return totalWeight;
    }
    
    
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            this.itemsInSuitcase.add(item);
        }
        
    }
    
    public Item heaviestItem() {
        if (itemsInSuitcase.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = new Item("Dummy", 0);
        
        for (Item compareWeight: itemsInSuitcase) {
            if (heaviestItem.getWeight() < compareWeight.getWeight()) {
                heaviestItem = compareWeight;
            }
        }
        
        return heaviestItem;
    }
        

    
    public void printItems() {
        for (Item element: itemsInSuitcase) {
            System.out.println(element);
        }
    }
    
    public String toString() {
        if (itemsInSuitcase.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (itemsInSuitcase.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        
        return itemsInSuitcase.size() + " items (" + totalWeight() + " kg)";
    }
    
}
        