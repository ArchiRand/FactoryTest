package entity;

import interfaces.BaseEntity;

import java.util.List;

public class LawSuit extends BaseEntity {
    private List<LawClaim> lawClaims;
    private KlUni typeSuit;
    private KlUni stage;
    private KlUni court;
    private List<LawParticipant> lawParticipants;

    public KlUni getStage() {
        return stage;
    }

    public void setStage(KlUni stage) {
        this.stage = stage;
    }

    public KlUni getCourt() {
        return court;
    }

    public void setCourt(KlUni court) {
        this.court = court;
    }

    public List<LawParticipant> getLawParticipants() {
        return lawParticipants;
    }

    public void setLawParticipants(List<LawParticipant> lawParticipants) {
        this.lawParticipants = lawParticipants;
    }

    public List<LawClaim> getLawClaims() {
        return lawClaims;
    }

    public void setLawClaims(List<LawClaim> lawClaims) {
        this.lawClaims = lawClaims;
    }

    public KlUni getTypeSuit() {
        return typeSuit;
    }

    public void setTypeSuit(KlUni typeSuit) {
        this.typeSuit = typeSuit;
    }

    @Override
    public String toString() {
        return "LawSuit{" +
                "lawClaims=" + lawClaims +
                ", typeSuit=" + typeSuit +
                ", stage=" + stage +
                ", court=" + court +
                ", lawParticipants=" + lawParticipants +
                '}';
    }
}
