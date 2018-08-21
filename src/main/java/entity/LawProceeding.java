package entity;

import interfaces.BaseEntity;

import java.util.Date;

public class LawProceeding extends BaseEntity {
    private LawClaim lawClaim;
    private KlUni proceedind;
    private Date dateDoc;
    private LawProceedingExpertise lawProcExpert;

    public Date getDateDoc() {
        return dateDoc;
    }

    public void setDateDoc(Date dateDoc) {
        this.dateDoc = dateDoc;
    }

    public LawProceedingExpertise getLawProcExpert() {
        return lawProcExpert;
    }

    public void setLawProcExpert(LawProceedingExpertise lawProcExpert) {
        this.lawProcExpert = lawProcExpert;
    }

    public KlUni getProceedind() {
        return proceedind;
    }

    public void setProceeding(KlUni proceedind) {
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
