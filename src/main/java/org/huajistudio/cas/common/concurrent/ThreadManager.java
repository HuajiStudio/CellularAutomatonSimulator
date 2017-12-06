package org.huajistudio.cas.common.concurrent;

import org.huajistudio.cas.api.ResourceLocation;

import javax.annotation.Nonnull;
import java.util.concurrent.AbstractExecutorService;

public class ThreadManager {
    public void registerThread(@Nonnull ResourceLocation name, Runnable thread) {
    }

    public void registerRunnableExecutor(@Nonnull ResourceLocation name, AbstractExecutorService executorService) {

    }
}
