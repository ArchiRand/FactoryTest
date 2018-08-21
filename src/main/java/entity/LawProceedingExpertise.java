package entity;

import interfaces.BaseEntity;

public class LawProceedingExpertise extends BaseEntity {
    private LawProceeding proceeding;

    public LawProceeding getProceeding() {
        return proceeding;
    }

    public void setProceeding(LawProceeding proceeding) {
        this.proceeding = proceeding;
    }

    @Override
    public String toString() {
        return "LawProceedingExpertise{" +
                "proceeding=" + proceeding +
                '}';
    }
}
