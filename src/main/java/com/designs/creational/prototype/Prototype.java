package com.designs.creational.prototype;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Prototype<T> implements Cloneable {

    /**
     * Object a shallow copy of this object or null if this object is not Cloneable.
     */
    @SuppressWarnings("unchecked")
    @SneakyThrows
    public T copy() {
        return (T) super.clone();
    }
}
