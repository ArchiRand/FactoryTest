package factory;

import annotations.Factory;
import entity.KlUni;
import entity.LawClaim;
import entity.LawProceeding;
import entity.LawProceedingExpertise;
import interfaces.BaseEntity;

import java.util.Date;

@Factory
public class LawProceedingFactory extends BaseFactory<LawProceeding, LawProceedingFactory> {

    @Override
    public LawProceedingFactory create() {
        LawProceeding lp = new LawProceeding();
        setEntity(lp);
        return this;
    }

    @Override
    public LawProceedingFactory bindWith(BaseEntity entity) {
        get().setLawClaim((LawClaim) entity);
        return this;
    }

    @Override
    public LawProceedingFactory setClassifier(Integer type, Integer code) {
        get().setProceeding(new KlUni(type, code));
        return this;
    }

    @Override
    public LawProceedingFactory oneToOneByCode(int code) {
        get().setDateDoc(new Date());
        switch (code) {
            case 614:
//                proceeding.setLawProcMotivate(creaLawProceedingMotivate(proceeding));
                break;
            case 729:
            case 737:
            case 730:
            case 738:
            case 859:
//                proceeding.setLawProcDefinition(createLawProceedingDefinition(proceeding));
                break;
            case 733:
//                proceeding.setMotion(createLawProceedingMotion(proceeding));
                break;
            case 731:
                get().setLawProcExpert((LawProceedingExpertise) getEntityFactory().create(LawProceedingExpertise.class)
                        .bindWith(get()).get());
                break;
            case 776:
//                proceeding.setLawPartMeasure(createLawPartMeasure(proceeding));
                break;
            case 793:
//                proceeding.setLawProcAppeal(createLawProceedingAppeal(proceeding));
                break;
            case 796:
//                proceeding.setLawProcExec(createLawProceedingExecution(proceeding));
                break;
            case 797:
//                proceeding.setLawProcApplication(createLawProceedingApplication(proceeding));
                break;
            case 816:
            case 817:
            case 818:
            case 819:
            case 820:
            case 821:
            case 822:
            case 823:
            case 824:
            case 825:
            case 826:
            case 827:
            case 828:
            case 829:
            case 830:
            case 831:
            case 832:
            case 833:
            case 834:
            case 835:
//                proceeding.setPrepDecision(createLawProceedingPrepDecision(proceeding));
                break;
            case 855:
//                proceeding.setLawProcExecOrder(createLawProceedingExecutionOrder(proceeding));
                break;
            case 860:
                break;
            case 872:
//                proceeding.setReclamation(createLawProceedingReclamation(proceeding));
                break;
            case 873:
                break;
        }
        get().setProceeding(new KlUni(0, code));
        return this;
    }

}
