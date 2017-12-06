package org.huajistudio.cas.api.registry;

import org.huajistudio.cas.api.ResourceLocation;

public interface RegistryModifiable<V extends RegistryEntry<V>> extends Registry<V> {
    void clear();

    V remove(ResourceLocation key);

    boolean isLocked();
}
