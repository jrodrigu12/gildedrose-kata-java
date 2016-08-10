package com.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QualityUpdaterTest {
    @Test
    public void updateFoo() {
        final Item item = new Item("foo", 0, 0);

        final QualityUpdater system = new QualityUpdater();
        system.updateItemQuality(item);

        assertThat(item.name).as("name").isEqualTo("foo");
        assertThat(item.sellIn).as("sellIn").isEqualTo(-1);
        assertThat(item.quality).as("quality").isEqualTo(0);
    }

    @Test
    public void updateBackstage() {
        final Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0);

        final QualityUpdater system = new QualityUpdater();
        system.updateItemQuality(item);

        assertThat(item.name).as("name").isEqualTo("Backstage passes to a TAFKAL80ETC concert");
        assertThat(item.sellIn).as("sellIn").isEqualTo(-1);
        assertThat(item.quality).as("quality").isEqualTo(0);
    }

    @Test
    public void updateFooGivenNonZeroQuality() {
        final Item item = new Item("foo", 0, 2);

        final QualityUpdater system = new QualityUpdater();
        system.updateItemQuality(item);

        assertThat(item.name).as("name").isEqualTo("foo");
        assertThat(item.sellIn).as("sellIn").isEqualTo(-1);
        assertThat(item.quality).as("quality").isEqualTo(0);
    }

    @Test
    public void updateAgedBrieGivenNonZeroQuality() {
        final Item item = new Item("Aged Brie", 0, 2);

        final QualityUpdater system = new QualityUpdater();
        system.updateItemQuality(item);

        assertThat(item.name).as("name").isEqualTo("Aged Brie");
        assertThat(item.sellIn).as("sellIn").isEqualTo(-1);
        assertThat(item.quality).as("quality").isEqualTo(4);
    }
}