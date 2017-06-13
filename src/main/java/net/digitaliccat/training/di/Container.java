package net.digitaliccat.training.di;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class Container {

    private Map<String, Object> container;

    public Container() {
        container = new HashMap<>();
    }

    public Container add(String qualifier, Object obj) {
        container.put(qualifier, (Supplier<Object>) () -> {
            try {
                // Limitation: only compatible with no-arg constructor
                return obj.getClass().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        });
        return this;
    }

    public Container addAsSingleton(String qualifier, Object obj) {
        container.put(qualifier, obj);
        return this;
    }

    public Object get(String qualifier) {
        Object obj = container.get(qualifier);
        if (obj == null) {
            throw new IllegalArgumentException("No object found with qualifier: " + qualifier);
        }

        if (obj instanceof Supplier) {
            Supplier<Object> sup = (Supplier<Object>) obj;
            return sup.get();
        }

        return obj;
    }

}
