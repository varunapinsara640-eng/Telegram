package org.wooble.messenger;

public interface GenericProvider<F, T> {
    T provide(F obj);
}
