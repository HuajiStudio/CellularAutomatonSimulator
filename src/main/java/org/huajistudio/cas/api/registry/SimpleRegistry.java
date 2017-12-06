package org.huajistudio.cas.api.registry;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.huajistudio.cas.api.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;

public class SimpleRegistry<V extends RegistryEntry<V>> implements RegistryModifiable<V> {
    private final Class<V> type;
    private BiMap<ResourceLocation, V> biMap = HashBiMap.create();
    private Cache<ResourceLocation, V> registryCache = CacheBuilder.newBuilder().build(new CacheLoader<ResourceLocation, V>() {
        @Override
        public V load(@Nonnull ResourceLocation key) throws Exception {
            return biMap.get(key);
        }
    });

    public SimpleRegistry(Class<V> type) {
        this.type = type;
    }

    @Override
    public Class<V> getRegistrySuperType() {
        return type;
    }

    @Override
    public void register(V value) {
        biMap.put(value.getRegistryName(), value);
    }

    @SafeVarargs
    @Override
    public final void registerAll(V... values) {
        Arrays.stream(values).forEach(this::register);
    }

    @Override
    public boolean containsKey(ResourceLocation key) {
        return biMap.containsKey(key);
    }

    @Override
    public boolean containsValue(V value) {
        return biMap.containsValue(value);
    }

    @Nullable
    @Override
    public V getValue(ResourceLocation key) {
        return registryCache.getIfPresent(key);
    }

    @Nullable
    @Override
    public ResourceLocation getKey(V value) {
        return biMap.entrySet().stream().filter(entry -> entry.getValue().equals(value)).findAny().orElse(new AbstractMap.SimpleEntry<>(null, value)).getKey();
    }

    @Nonnull
    @Override
    public Set<ResourceLocation> getKeys() {
        return biMap.keySet();
    }

    @Nonnull
    @Override
    public List<V> getValues() {
        return new ArrayList<>(biMap.values());
    }

    @Nonnull
    @Override
    public Set<Map.Entry<ResourceLocation, V>> getEntries() {
        return biMap.entrySet();
    }

    @Override
    public <T> T getSlaveMap(ResourceLocation slaveMapName, Class<T> type) {
        throw new IllegalStateException("Method is not implemented.");
    }

    @Nonnull
    @Override
    public Iterator<V> iterator() {
        return biMap.values().iterator();
    }

    @Override
    public void clear() {
        biMap.clear();
    }

    @Override
    public V remove(ResourceLocation key) {
        return biMap.remove(key);
    }

    @Override
    public boolean isLocked() {
        return false;
    }
}
