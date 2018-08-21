package entity;

import interfaces.BaseEntity;

import java.util.List;

public class LawClaim extends BaseEntity {

    private LawSuit lawSuit;

    private KlUni claimType;

    private List<LawParticipant> lawParticipants;

    public List<LawParticipant> getLawParticipants() {
        return lawParticipants;
    }

    public void setLawParticipants(List<LawParticipant> lawParticipants) {
        this.lawParticipants = lawParticipants;
    }

    public LawSuit getLawSuit() {
        return lawSuit;
    }

    public void setLawSuit(LawSuit lawSuit) {
        this.lawSuit = lawSuit;
    }

    public KlUni getClaimType() {
        return claimType;
    }

    public void setClaimType(KlUni claimType) {
        this.claimType = claimType;
    }

    @Override
    public String toString() {
        return "LawClaim{" +
                "lawSuit=" + lawSuit +
                ", claimType=" + claimType +
                ", lawParticipants=" + lawParticipants +
                '}';
    }
}
