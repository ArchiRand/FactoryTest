package factory;

import annotations.Factory;
import entity.KlUni;
import entity.LawClaim;
import entity.LawSuit;
import interfaces.BaseEntity;

import java.util.ArrayList;

@Factory
public class LawClaimFactory extends BaseFactory<LawClaim, LawClaimFactory> {

    @Override
    public LawClaimFactory create() {
        LawClaim lawClaim = new LawClaim();
        lawClaim.setLawParticipants(new ArrayList<>());
        setEntity(lawClaim);
        return this;
    }

    @Override
    public LawClaimFactory bindWith(BaseEntity entity) {
        get().setLawSuit((LawSuit) entity);
        return this;
    }

    @Override
    public LawClaimFactory setClassifier(Integer type, Integer code) {
        get().setClaimType(new KlUni(35, 15));
        return this;
    }
}
