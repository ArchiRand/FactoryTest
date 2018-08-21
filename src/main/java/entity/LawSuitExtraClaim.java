package entity;

import interfaces.BaseEntity;

public class LawSuitExtraClaim extends BaseEntity {
    private LawSuit lawSuit;

    public LawSuit getLawSuit() {
        return lawSuit;
    }

    public void setLawSuit(LawSuit lawSuit) {
        this.lawSuit = lawSuit;
    }

    @Override
    public String toString() {
        return "LawSuitExtraClaim{" +
                "lawSuit=" + lawSuit +
                '}';
    }
}
