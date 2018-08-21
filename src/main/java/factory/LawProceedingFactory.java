package factory;

import annotations.Factory;
import entity.KlUni;
import entity.LawClaim;
import entity.LawProceeding;
import interfaces.BaseEntity;

@Factory
public class LawProceedingFactory extends BaseFactory<LawProceeding, LawProceedingFactory> {

    @Override
    public LawProceedingFactory create() {
        LawProceeding lp = new LawProceeding();
        setEntity(lp);
        return this;
    }

    @Override
    public LawProceedingFactory bindWith(BaseEntity entity) {
        get().setLawClaim((LawClaim) entity);
        return this;
    }

    @Override
    public LawProceedingFactory setClassifier(Integer type, Integer code) {
        get().setProceedind(new KlUni(type, code));
        return this;
    }

}
