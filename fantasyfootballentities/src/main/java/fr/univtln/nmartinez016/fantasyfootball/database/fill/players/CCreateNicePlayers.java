package fr.univtln.nmartinez016.fantasyfootball.database.fill.players;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 15/08/2016.
 */
public class CCreateNicePlayers {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lNiceFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NICE).parameters())).get(0);


        // load positions

        CPositionEntity lGk = lCrudMethods.find(CPositionEntity.class, CConstants.GK);
        CPositionEntity lRb = lCrudMethods.find(CPositionEntity.class, CConstants.RB);
        CPositionEntity lLb = lCrudMethods.find(CPositionEntity.class, CConstants.LB);
        CPositionEntity lCb = lCrudMethods.find(CPositionEntity.class, CConstants.CB);
        CPositionEntity lRcb = lCrudMethods.find(CPositionEntity.class, CConstants.RCB);
        CPositionEntity lLcb = lCrudMethods.find(CPositionEntity.class, CConstants.LCB);
        CPositionEntity lRwb = lCrudMethods.find(CPositionEntity.class, CConstants.RWB);
        CPositionEntity lLwb = lCrudMethods.find(CPositionEntity.class, CConstants.LWB);
        CPositionEntity lCdm = lCrudMethods.find(CPositionEntity.class, CConstants.CDM);
        CPositionEntity lRdm = lCrudMethods.find(CPositionEntity.class, CConstants.RDM);
        CPositionEntity lLdm = lCrudMethods.find(CPositionEntity.class, CConstants.LDM);
        CPositionEntity lCm = lCrudMethods.find(CPositionEntity.class, CConstants.CM);
        CPositionEntity lRcm = lCrudMethods.find(CPositionEntity.class, CConstants.RCM);
        CPositionEntity lLcm = lCrudMethods.find(CPositionEntity.class, CConstants.LCM);
        CPositionEntity lRm = lCrudMethods.find(CPositionEntity.class, CConstants.RM);
        CPositionEntity lLm = lCrudMethods.find(CPositionEntity.class, CConstants.LM);
        CPositionEntity lCam = lCrudMethods.find(CPositionEntity.class, CConstants.CAM);
        CPositionEntity lRam = lCrudMethods.find(CPositionEntity.class, CConstants.RAM);
        CPositionEntity lLam = lCrudMethods.find(CPositionEntity.class, CConstants.LAM);
        CPositionEntity lRw = lCrudMethods.find(CPositionEntity.class, CConstants.RW);
        CPositionEntity lLw = lCrudMethods.find(CPositionEntity.class, CConstants.LW);
        CPositionEntity lF9 = lCrudMethods.find(CPositionEntity.class, CConstants.F9);
        CPositionEntity lSt = lCrudMethods.find(CPositionEntity.class, CConstants.ST);
        CPositionEntity lRst = lCrudMethods.find(CPositionEntity.class, CConstants.RST);
        CPositionEntity lLst = lCrudMethods.find(CPositionEntity.class, CConstants.LST);


        // players positions

        List<CPositionEntity> lHassenPositionsNice = new ArrayList<CPositionEntity>();
        lHassenPositionsNice.add(lGk);

        List<CPositionEntity> lCardinalePositionsNice = new ArrayList<CPositionEntity>();
        lCardinalePositionsNice.add(lGk);

        List<CPositionEntity> lPouplinPositionsNice = new ArrayList<CPositionEntity>();
        lPouplinPositionsNice.add(lGk);

        List<CPositionEntity> lBenitezPositionsNice = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lSarrPositionsNice = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lSouquetPositionsNice = new ArrayList<CPositionEntity>();
        lSouquetPositionsNice.add(lCb);

        List<CPositionEntity> lLlorisPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBayssePositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lGomisPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRougeauxPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeMarchandPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPereiraPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBodmerPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBoscagliPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lHenriquePositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBurnerPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMarcelPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSeriPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lVercauterenPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLusambaPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRafetraniainaPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lEyssericPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lWalterPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCyprienPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKozielloPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeBihanPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBenrahmaPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPleaPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lConstantPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDonisPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBosettiPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCaddyPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDantePositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBelhandaPositionsNice = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBaloPositionsNice = new ArrayList<CPositionEntity>();
        // players

        CPlayerEntity lHassenNice = new CPlayerEntity.CPlayerBuilder().firstName("mouez").lastName(CConstants.NAME_NICE_HASSEN).team(lNiceFromDb).dayOfBirth(5).monthOfBirth(CConstants.MARCH).yearOfBirth(1995).country(CConstants.FRANCE).positions(lHassenPositionsNice).picturePath(CConstants.PICTURE_NICE_HASSEN).build();
        CPlayerEntity lCardinaleNice = new CPlayerEntity.CPlayerBuilder().firstName("yoan").lastName(CConstants.NAME_NICE_CARDINALE).team(lNiceFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lCardinalePositionsNice).picturePath(CConstants.PICTURE_NICE_CARDINALE).build();
        CPlayerEntity lPouplinNice = new CPlayerEntity.CPlayerBuilder().firstName("simon").lastName(CConstants.NAME_NICE_POUPLIN).team(lNiceFromDb).dayOfBirth(28).monthOfBirth(CConstants.MAY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lPouplinPositionsNice).picturePath(CConstants.PICTURE_NICE_POUPLIN).build();
        CPlayerEntity lBenitezNice = new CPlayerEntity.CPlayerBuilder().firstName("walter").lastName(CConstants.NAME_NICE_BENITEZ).team(lNiceFromDb).dayOfBirth(19).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.ARGENTINA).positions(lBenitezPositionsNice).picturePath(CConstants.PICTURE_NICE_BENITEZ).build();

        CPlayerEntity lSarrNice = new CPlayerEntity.CPlayerBuilder().firstName("malang").lastName(CConstants.NAME_NICE_SARR).team(lNiceFromDb).dayOfBirth(23).monthOfBirth(CConstants.JANUARY).yearOfBirth(1999).country(CConstants.FRANCE).positions(lSarrPositionsNice).picturePath(CConstants.PICTURE_NICE_SARR).build();
        CPlayerEntity lSouquetNice = new CPlayerEntity.CPlayerBuilder().firstName("arnaud").lastName(CConstants.NAME_NICE_SOUQUET).team(lNiceFromDb).dayOfBirth(12).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSouquetPositionsNice).picturePath(CConstants.PICTURE_NICE_SOUQUET).build();
        CPlayerEntity lLlorisNice = new CPlayerEntity.CPlayerBuilder().firstName("gautier").lastName(CConstants.NAME_NICE_LLORIS).team(lNiceFromDb).dayOfBirth(18).monthOfBirth(CConstants.JULY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLlorisPositionsNice).picturePath(CConstants.PICTURE_NICE_LLORIS).build();
        CPlayerEntity lBaysseNice = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_NICE_BAYSSE).team(lNiceFromDb).dayOfBirth(18).monthOfBirth(CConstants.MAY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lBayssePositionsNice).picturePath(CConstants.PICTURE_NICE_BAYSSE).build();
        CPlayerEntity lGomisNice = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_NICE_GOMIS).team(lNiceFromDb).dayOfBirth(20).monthOfBirth(CConstants.JANUARY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lGomisPositionsNice).picturePath(CConstants.PICTURE_NICE_GOMIS).build();
        CPlayerEntity lRougeauxNice = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_NICE_ROUGEAUX).team(lNiceFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lRougeauxPositionsNice).picturePath(CConstants.PICTURE_NICE_ROUGEAUX).build();
        CPlayerEntity lLeMarchandNice = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_NICE_LEMARCHAND).team(lNiceFromDb).dayOfBirth(11).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLeMarchandPositionsNice).picturePath(CConstants.PICTURE_NICE_LEMARCHAND).build();
        CPlayerEntity lPereiraNice = new CPlayerEntity.CPlayerBuilder().firstName("ricardo").lastName(CConstants.NAME_NICE_PEREIRA).team(lNiceFromDb).dayOfBirth(6).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPereiraPositionsNice).picturePath(CConstants.PICTURE_NICE_PEREIRA).build();
        CPlayerEntity lBodmerNice = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_NICE_BODMER).team(lNiceFromDb).dayOfBirth(22).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1982).country(CConstants.FRANCE).positions(lBodmerPositionsNice).picturePath(CConstants.PICTURE_NICE_BODMER).build();
        CPlayerEntity lBoscagliNice = new CPlayerEntity.CPlayerBuilder().firstName("olivier").lastName(CConstants.NAME_NICE_BOSCAGLI).team(lNiceFromDb).dayOfBirth(18).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lBoscagliPositionsNice).picturePath(CConstants.PICTURE_NICE_BOSCAGLI).build();
        CPlayerEntity lHenriqueNice = new CPlayerEntity.CPlayerBuilder().firstName("dalbert").lastName(CConstants.NAME_NICE_HENRIQUE).team(lNiceFromDb).dayOfBirth(8).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1993).country(CConstants.BRAZIL).positions(lHenriquePositionsNice).picturePath(CConstants.PICTURE_NICE_HENRIQUE).build();
        CPlayerEntity lBurnerNice = new CPlayerEntity.CPlayerBuilder().firstName("patrick").lastName(CConstants.NAME_NICE_BURNER).team(lNiceFromDb).dayOfBirth(11).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBurnerPositionsNice).picturePath(CConstants.PICTURE_NICE_BURNER).build();
        CPlayerEntity lDanteNice = new CPlayerEntity.CPlayerBuilder().firstName("bonfim").lastName(CConstants.NAME_NICE_DANTE).team(lNiceFromDb).dayOfBirth(18).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1983).country(CConstants.BRAZIL).positions(lDantePositionsNice).picturePath(CConstants.PICTURE_NICE_DANTE).build();


        CPlayerEntity lMarcelNice = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_NICE_MARCEL).team(lNiceFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lMarcelPositionsNice).picturePath(CConstants.PICTURE_NICE_MARCEL).build();
        CPlayerEntity lSeriNice = new CPlayerEntity.CPlayerBuilder().firstName("jean michael").lastName(CConstants.NAME_NICE_SERI).team(lNiceFromDb).dayOfBirth(19).monthOfBirth(CConstants.JULY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lSeriPositionsNice).picturePath(CConstants.PICTURE_NICE_SERI).build();
        CPlayerEntity lVercauterenNice = new CPlayerEntity.CPlayerBuilder().firstName("julien").lastName(CConstants.NAME_NICE_VERCAUTEREN).team(lNiceFromDb).dayOfBirth(12).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lVercauterenPositionsNice).picturePath(CConstants.PICTURE_NICE_VERCAUTEREN).build();
        CPlayerEntity lLusambaNice = new CPlayerEntity.CPlayerBuilder().firstName("arnaud").lastName(CConstants.NAME_NICE_LUSAMBA).team(lNiceFromDb).dayOfBirth(4).monthOfBirth(CConstants.JANUARY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lLusambaPositionsNice).picturePath(CConstants.PICTURE_NICE_LUSAMBA).build();
        CPlayerEntity lRafetraniainaNice = new CPlayerEntity.CPlayerBuilder().firstName("albert").lastName(CConstants.NAME_NICE_RAFETRANIAINA).team(lNiceFromDb).dayOfBirth(9).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lRafetraniainaPositionsNice).picturePath(CConstants.PICTURE_NICE_RAFETRANIAINA).build();
        CPlayerEntity lEyssericNice = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_NICE_EYSSERIC).team(lNiceFromDb).dayOfBirth(25).monthOfBirth(CConstants.MARCH).yearOfBirth(1992).country(CConstants.FRANCE).positions(lEyssericPositionsNice).picturePath(CConstants.PICTURE_NICE_EYSSERIC).build();
        CPlayerEntity lWalterNice = new CPlayerEntity.CPlayerBuilder().firstName("remi").lastName(CConstants.NAME_NICE_WALTER).team(lNiceFromDb).dayOfBirth(26).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lWalterPositionsNice).picturePath(CConstants.PICTURE_NICE_WALTER).build();
        CPlayerEntity lCyprienNice = new CPlayerEntity.CPlayerBuilder().firstName("wylan").lastName(CConstants.NAME_NICE_CYPRIEN).team(lNiceFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCyprienPositionsNice).picturePath(CConstants.PICTURE_NICE_CYPRIEN).build();
        CPlayerEntity lKozielloNice = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_NICE_KOZIELLO).team(lNiceFromDb).dayOfBirth(28).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKozielloPositionsNice).picturePath(CConstants.PICTURE_NICE_KOZIELLO).build();
        CPlayerEntity lBelhandaNice = new CPlayerEntity.CPlayerBuilder().firstName("younes").lastName(CConstants.NAME_NICE_BELHANDA).team(lNiceFromDb).dayOfBirth(25).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1990).country(CConstants.MOROCCO).positions(lBelhandaPositionsNice).picturePath(CConstants.PICTURE_NICE_BELHANDA).build();


        CPlayerEntity lLeBihanNice = new CPlayerEntity.CPlayerBuilder().firstName("mickael").lastName(CConstants.NAME_NICE_LEBIHAN).team(lNiceFromDb).dayOfBirth(16).monthOfBirth(CConstants.MAY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lLeBihanPositionsNice).picturePath(CConstants.PICTURE_NICE_LEBIHAN).build();
        CPlayerEntity lBenrahmaNice = new CPlayerEntity.CPlayerBuilder().firstName("said").lastName(CConstants.NAME_NICE_BENRAHMA).team(lNiceFromDb).dayOfBirth(10).monthOfBirth(CConstants.AUGUST).yearOfBirth(1995).country(CConstants.ALGERIA).positions(lBenrahmaPositionsNice).picturePath(CConstants.PICTURE_NICE_BENRAHMA).build();
        CPlayerEntity lPleaNice = new CPlayerEntity.CPlayerBuilder().firstName("alassane").lastName(CConstants.NAME_NICE_PLEA).team(lNiceFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPleaPositionsNice).picturePath(CConstants.PICTURE_NICE_PLEA).build();
        CPlayerEntity lConstantNice = new CPlayerEntity.CPlayerBuilder().firstName("bryan").lastName(CConstants.NAME_NICE_CONSTANT).team(lNiceFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lConstantPositionsNice).picturePath(CConstants.PICTURE_NICE_CONSTANT).build();
        CPlayerEntity lDonisNice = new CPlayerEntity.CPlayerBuilder().firstName("anastasios").lastName(CConstants.NAME_NICE_DONIS).team(lNiceFromDb).dayOfBirth(29).monthOfBirth(CConstants.AUGUST).yearOfBirth(1996).country(CConstants.FRANCE).positions(lDonisPositionsNice).picturePath(CConstants.PICTURE_NICE_DONIS).build();
        CPlayerEntity lBosettiNice = new CPlayerEntity.CPlayerBuilder().firstName("alexy").lastName(CConstants.NAME_NICE_BOSETTI).team(lNiceFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lBosettiPositionsNice).picturePath(CConstants.PICTURE_NICE_BOSETTI).build();
        CPlayerEntity lCaddyNice = new CPlayerEntity.CPlayerBuilder().firstName("dorian").lastName(CConstants.NAME_NICE_CADDY).team(lNiceFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCaddyPositionsNice).picturePath(CConstants.PICTURE_NICE_CADDY).build();
        CPlayerEntity lBaloNice = new CPlayerEntity.CPlayerBuilder().firstName("mario").lastName(CConstants.NAME_NICE_BALOTELLI).team(lNiceFromDb).dayOfBirth(12).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.ITALY).positions(lBaloPositionsNice).picturePath(CConstants.PICTURE_NICE_BALOTELLI).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHassenNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPouplinNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCardinaleNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenitezNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeMarchandNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBaysseNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoscagliNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBodmerNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSarrNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSouquetNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGomisNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHenriqueNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPereiraNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLlorisNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRougeauxNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBurnerNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lWalterNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKozielloNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarcelNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSeriNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLusambaNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEyssericNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCyprienNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRafetraniainaNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVercauterenNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeBihanNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenrahmaNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lConstantNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPleaNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDonisNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBosettiNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCaddyNice);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBaloNice);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDanteNice);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBelhandaNice);
            lCrudMethods.commitTransaction();
        }


    }
}
