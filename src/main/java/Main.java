import config.EntityFactory;
import entity.*;

public class Main {

    private static EntityFactory entityFactory = new EntityFactory();

    public static void main(String[] args) {

        LawSuit suit = (LawSuit) entityFactory
                .create(LawSuit.class)
                .setClassifiers(new KlUni(1,1), new KlUni(2,2), new KlUni(3, 3))
                .get();

        System.out.println(suit);
        System.out.println("<=================================================> \n");

        LawClaim claim = (LawClaim) entityFactory.create(LawClaim.class).bindWith(suit).get();
        System.out.println(claim);
        System.out.println("<=================================================> \n");

        LawProceeding lp = (LawProceeding) entityFactory
                .create(LawProceeding.class)
                .bindWith(claim)
                .setClassifier(20, 1).get();
        System.out.println(lp);
        System.out.println("<=================================================> \n");

//        LawProceeding lp1 = (LawProceeding) entityFactory
//                .create(LawProceeding.class)
//                .setClassifier(212, 13).get();
//        System.out.println(lp1);
//        System.out.println("<=================================================>\n");
//
//
//        LawProceeding lp2 = (LawProceeding) entityFactory
//                .create(LawProceeding.class)
//                .get();
//        System.out.println(lp2);
//        System.out.println("<=================================================>\n");
//
//        LawSuitExtraClaim extraClaim = (LawSuitExtraClaim) entityFactory.create(LawSuitExtraClaim.class).bindWith(suit).get();
//        System.out.println(extraClaim);
//        System.out.println("<=================================================>\n");

        LawProceedingExpertise lpe = (LawProceedingExpertise) entityFactory
                .create(LawProceedingExpertise.class)
                .bindWith(entityFactory.create(LawProceeding.class).bindWith(claim).get())
                .get();
        System.out.println(lpe);
        System.out.println("<=================================================>\n");
    }
}

// lawClaim = factory.create(LawClaim.class).bindWith(lawSuit).setClassifier(12, 456).get();