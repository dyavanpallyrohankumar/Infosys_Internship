package Projects.Restaurant_Management_System;

import java.util.*;

class Menu {
    private Map<Integer, Item> items = new LinkedHashMap<>();

    public void addItem(Item item) {
        items.put(item.getId(), item);
    }

    public void removeItem(int id) {
        items.remove(id);
    }

    public void displayMenu() {
        System.out.println("\n---- MENU ----");
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }

    public Item getItemById(int id) {
        return items.get(id);
    }

    public void searchItem(String keyword) {
        System.out.println("\nSearch Results:");
        for (Item item : items.values()) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                    item.getCategory().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item);
            }
        }
    }

    public Collection<Item> getAllItems() {
        return items.values();
    }
}