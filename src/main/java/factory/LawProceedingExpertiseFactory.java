package factory;

import annotations.Factory;
import entity.LawProceeding;
import entity.LawProceedingExpertise;
import interfaces.BaseEntity;

@Factory
public class LawProceedingExpertiseFactory extends BaseFactory<LawProceedingExpertise, LawProceedingExpertiseFactory> {

    @Override
    public LawProceedingExpertiseFactory create() {
        LawProceedingExpertise lpe = new LawProceedingExpertise();
        setEntity(lpe);
        return this;
    }

    @Override
    public LawProceedingExpertiseFactory bindWith(BaseEntity entity) {
        get().setProceeding((LawProceeding) entity);
        ((LawProceeding) entity).setLawProcExpert(get());
        return this;
    }

    @Override
    public LawProceedingExpertiseFactory setClassifier(Integer type, Integer code) {
        return this;
    }

    @Override
    public LawProceedingExpertise get() {
        return entity;
    }
}
