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
}