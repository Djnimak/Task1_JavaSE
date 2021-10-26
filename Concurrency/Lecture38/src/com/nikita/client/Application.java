package com.nikita.client;

import com.nikita.homework.inventory.InventoryManager;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });

        inventoryTask.start();
        Thread.sleep(1000);
//        inventoryTask.join();

        displayTask.start();
    }
}
