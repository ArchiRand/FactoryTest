package entity;

import interfaces.BaseEntity;

public class LawParticipant extends BaseEntity {
    private LawClaim lawClaim;
    private KlUni typePart;
    private LawSuit lawSuit;

    public KlUni getTypePart() {
        return typePart;
    }

    public void setTypePart(KlUni typePart) {
        this.typePart = typePart;
    }

    public LawClaim getLawClaim() {
        return lawClaim;
    }

    public void setLawClaim(LawClaim lawClaim) {
        this.lawClaim = lawClaim;
    }

    public LawSuit getLawSuit() {
        return lawSuit;
    }

    public void setLawSuit(LawSuit lawSuit) {
        this.lawSuit = lawSuit;
    }

    @Override
    public String toString() {
        return "LawParticipant{" +
                "lawClaim=" + lawClaim +
                ", typePart=" + typePart +
                ", lawSuit=" + lawSuit +
                '}';
    }
}
