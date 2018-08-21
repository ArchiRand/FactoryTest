package config;

import annotations.Factory;
import factory.BaseFactory;
import org.reflections.Reflections;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntityFactory {
    private Map<Class, BaseFactory> factories = new HashMap<>();

    private BaseFactory putToContext(Class clazz) {
        Reflections reflections = new Reflections("factory");
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(Factory.class);
        for (Class x : classes) {
            if (((ParameterizedType) x.getGenericSuperclass()).getActualTypeArguments()[0].equals(clazz)) {
                try {
                    BaseFactory factory = (BaseFactory) x.newInstance();
//                    factory.setEntityFactory(this);
                    return factories.putIfAbsent(clazz, factory);
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public BaseFactory create(Class clazz) {
        return factories.getOrDefault(clazz, putToContext(clazz)).create();
    }

    public Map<Class, BaseFactory> getFactories() {
        return factories;
    }

}
