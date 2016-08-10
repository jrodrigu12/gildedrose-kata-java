package com.gildedrose;

class GildedRose {
    private final QualityUpdater qualityUpdater;
    Item[] items;

    public GildedRose(Item[] items) {
        qualityUpdater = new QualityUpdater();
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            qualityUpdater.updateItemQuality(item);
        }
    }

}
