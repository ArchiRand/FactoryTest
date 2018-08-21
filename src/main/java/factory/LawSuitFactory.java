package factory;

import annotations.Factory;
import entity.KlUni;
import entity.LawSuit;
import interfaces.BaseEntity;

import java.util.ArrayList;

@Factory
public class LawSuitFactory extends BaseFactory<LawSuit, LawSuitFactory> {

    @Override
    public LawSuitFactory create() {
        LawSuit lawSuit = new LawSuit();
        lawSuit.setLawClaims(new ArrayList<>());
        lawSuit.setLawParticipants(new ArrayList<>());
        setEntity(lawSuit);
        return this;
    }

    @Override
    public LawSuitFactory bindWith(BaseEntity entity) {
        return this;
    }

    @Override
    public LawSuitFactory setClassifier(Integer type, Integer code) {
        get().setTypeSuit(new KlUni(type, code));
        return this;
    }

    @Override
    public LawSuitFactory setClassifiers(KlUni... klUnis) {
        get().setCourt(klUnis[0]);
        get().setStage(klUnis[1]);
        get().setTypeSuit(klUnis[2]);
        return this;
    }

    @Override
    public LawSuit get() {
        return super.get();
    }
}
