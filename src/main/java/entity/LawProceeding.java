package entity;

import interfaces.BaseEntity;

public class LawProceeding extends BaseEntity {
    private LawClaim lawClaim;
    private KlUni proceedind;
    private LawProceedingExpertise lawProcExpert;

    public LawProceedingExpertise getLawProcExpert() {
        return lawProcExpert;
    }

    public void setLawProcExpert(LawProceedingExpertise lawProcExpert) {
        this.lawProcExpert = lawProcExpert;
    }

    public KlUni getProceedind() {
        return proceedind;
    }

    public void setProceedind(KlUni proceedind) {
        this.proceedind = proceedind;
    }

    public LawClaim getLawClaim() {
        return lawClaim;
    }

    public void setLawClaim(LawClaim lawClaim) {
        this.lawClaim = lawClaim;
    }

    @Override
    public String toString() {
        return "LawProceeding{" +
                "lawClaim=" + lawClaim +
                ", proceedind=" + proceedind +
                '}';
    }
}
