package com.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name).as("name").isEqualTo("foo");
        assertThat(app.items[0].sellIn).as("sellIn").isEqualTo(-1);
        assertThat(app.items[0].quality).as("quality").isEqualTo(0);
    }

}
