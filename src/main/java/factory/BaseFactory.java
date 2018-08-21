package factory;

import config.EntityFactory;
import entity.KlUni;
import interfaces.BaseEntity;

public abstract class BaseFactory<E extends BaseEntity, F extends BaseFactory> {
    // @Inject
    private EntityFactory entityFactory;

//    @Inject
//    private DatabaseManager dm;

    private F factory;
    private E entity;

    public abstract F create();

    public abstract F bindWith(BaseEntity entity);

    public abstract F setClassifier(Integer type, Integer code);

    public F setClassifiers(KlUni... klUnis) {
        return factory;
    }

    public F oneToOneByCode(int code) {
        return factory;
    }

    public E get() {
        return entity;
    }

    public void setEntity(E entity) {
        this.entity = entity;
    }

    public EntityFactory getEntityFactory() {
        return entityFactory;
    }

    public void setEntityFactory(EntityFactory entityFactory) {
        this.entityFactory = entityFactory;
    }
}
