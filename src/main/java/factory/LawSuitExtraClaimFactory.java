package factory;

import annotations.Factory;
import entity.LawSuit;
import entity.LawSuitExtraClaim;
import interfaces.BaseEntity;

@Factory
public class LawSuitExtraClaimFactory extends BaseFactory<LawSuitExtraClaim, LawSuitExtraClaimFactory> {

    @Override
    public LawSuitExtraClaimFactory create() {
        LawSuitExtraClaim extraClaim = new LawSuitExtraClaim();
        setEntity(extraClaim);
        return this;
    }

    @Override
    public LawSuitExtraClaimFactory bindWith(BaseEntity entity) {
        get().setLawSuit((LawSuit) entity);
        return this;
    }

    @Override
    public LawSuitExtraClaimFactory setClassifier(Integer type, Integer code) {
        return this;
    }

    @Override
    public LawSuitExtraClaim get() {
        return super.get();
    }
}
