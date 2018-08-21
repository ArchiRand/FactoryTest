package factory;

import annotations.Factory;
import entity.KlUni;
import entity.LawClaim;
import entity.LawParticipant;
import entity.LawSuit;
import interfaces.BaseEntity;

@Factory
public class LawParticipantFactory extends BaseFactory<LawParticipant, LawParticipantFactory> {

    @Override
    public LawParticipantFactory create() {
        LawParticipant lawParticipant = new LawParticipant();
        setEntity(lawParticipant);
        return this;
    }

    @Override
    public LawParticipantFactory bindWith(BaseEntity baseEntity) {
        if (baseEntity instanceof LawSuit) {
            get().setLawSuit((LawSuit) baseEntity);
        } else if (baseEntity instanceof LawClaim) {
            get().setLawClaim((LawClaim) baseEntity);
        }
        return this;
    }

    @Override
    public LawParticipantFactory setClassifier(Integer type, Integer code) {
        get().setTypePart(new KlUni(type, code));
        return this;
    }

}
