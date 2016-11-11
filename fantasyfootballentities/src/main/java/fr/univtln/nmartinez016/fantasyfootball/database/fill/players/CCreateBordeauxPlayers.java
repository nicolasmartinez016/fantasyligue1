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
public class CCreateBordeauxPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lBdxFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.BORDEAUX).parameters())).get(0);


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

        List<CPositionEntity> lCarrassoPositionsBdx = new ArrayList<CPositionEntity>();
        lCarrassoPositionsBdx.add(lGk);

        List<CPositionEntity> lBernardoniPositionsBdx = new ArrayList<CPositionEntity>();
        lBernardoniPositionsBdx.add(lGk);

        List<CPositionEntity> lPriorPositionsBdx = new ArrayList<CPositionEntity>();
        lPriorPositionsBdx.add(lGk);


        List<CPositionEntity> lGajicPositionsBdx = new ArrayList<CPositionEntity>();
        lGajicPositionsBdx.add(lRb);

        List<CPositionEntity> lPalloisPositionsBdx = new ArrayList<CPositionEntity>();
        lPalloisPositionsBdx.add(lCb);

        List<CPositionEntity> lPoundjePositionsBdx = new ArrayList<CPositionEntity>();
        lPoundjePositionsBdx.add(lLb);

        List<CPositionEntity> lSabalyPositionsBdx = new ArrayList<CPositionEntity>();
        lSabalyPositionsBdx.add(lRb);
        lSabalyPositionsBdx.add(lLb);

        List<CPositionEntity> lGuilbertPositionsBdx = new ArrayList<CPositionEntity>();
        lGuilbertPositionsBdx.add(lRb);

        List<CPositionEntity> lContentoPositionsBdx = new ArrayList<CPositionEntity>();
        lContentoPositionsBdx.add(lLb);

        List<CPositionEntity> lPellenardPositionsBdx = new ArrayList<CPositionEntity>();
        lPellenardPositionsBdx.add(lLb);

        List<CPositionEntity> lSerticPositionsBdx = new ArrayList<CPositionEntity>();
        lSerticPositionsBdx.add(lCb);

        List<CPositionEntity> lPabloPositionsBdx = new ArrayList<CPositionEntity>();
        lPabloPositionsBdx.add(lCb);


        List<CPositionEntity> lArambarriPositionsBdx = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPlasilPositionsBdx = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lToulalanPositionsBdx = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMauriceBelayPositionsBdx = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lTraorePositionsBdx = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lKaabouniPositionsBdx = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lOunasPositionsBdx = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSoniPositionsBdx = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVadaPositionsBdx = new ArrayList<CPositionEntity>();
        lVadaPositionsBdx.add(lCdm);
        lVadaPositionsBdx.add(lCm);

        List<CPositionEntity> lTourePositionsBdx = new ArrayList<CPositionEntity>();
        lTourePositionsBdx.add(lLm);
        lTourePositionsBdx.add(lRw);

        List<CPositionEntity> lMenezPositionsBdx = new ArrayList<CPositionEntity>();
        lMenezPositionsBdx.add(lSt);
        lMenezPositionsBdx.add(lLw);

        List<CPositionEntity> lRolanPositionsBdx = new ArrayList<CPositionEntity>();
        lRolanPositionsBdx.add(lSt);

        List<CPositionEntity> lLabordePositionsBdx = new ArrayList<CPositionEntity>();
        lLabordePositionsBdx.add(lSt);

        List<CPositionEntity> lKieseThelinPositionsBdx = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMalcolmPositionsBdx = new ArrayList<CPositionEntity>();
        lMalcolmPositionsBdx.add(lRw);

        List<CPositionEntity> lKamanoPositionsBdx = new ArrayList<CPositionEntity>();
        lKamanoPositionsBdx.add(lSt);

        // players

        // gks

        CPlayerEntity lCarrassoBdx = new CPlayerEntity.CPlayerBuilder().firstName("cedric").lastName(CConstants.NAME_BDX_CARRASSO).team(lBdxFromDb).dayOfBirth(30).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lCarrassoPositionsBdx).picturePath(CConstants.PICTURE_BDX_CARRASSO).build();
        CPlayerEntity lBernardoniBdx = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_BDX_BERNARDONI).team(lBdxFromDb).dayOfBirth(18).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lBernardoniPositionsBdx).picturePath(CConstants.PICTURE_BDX_BERNARDONI).build();
        CPlayerEntity lPriorBdx = new CPlayerEntity.CPlayerBuilder().firstName("jerome").lastName(CConstants.NAME_BDX_PRIOR).team(lBdxFromDb).dayOfBirth(8).monthOfBirth(CConstants.AUGUST).yearOfBirth(1995).country(CConstants.FRANCE).positions(lPriorPositionsBdx).picturePath(CConstants.PICTURE_BDX_PRIOR).build();


        // defenders

        CPlayerEntity lContentoBdx = new CPlayerEntity.CPlayerBuilder().firstName("diego").lastName(CConstants.NAME_BDX_CONTENTO).team(lBdxFromDb).dayOfBirth(1).monthOfBirth(CConstants.MAY).yearOfBirth(1990).country(CConstants.GERMANY).positions(lContentoPositionsBdx).picturePath(CConstants.PICTURE_BDX_CONTENTO).build();
        CPlayerEntity lPalloisBdx = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_BDX_PALLOIS).team(lBdxFromDb).dayOfBirth(19).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1987).country(CConstants.FRANCE).positions(lPalloisPositionsBdx).picturePath(CConstants.PICTURE_BDX_PALLOIS).build();
        CPlayerEntity lPoundjeBdx = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_BDX_POUNDJE).team(lBdxFromDb).dayOfBirth(16).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.FRANCE).positions(lPoundjePositionsBdx).picturePath(CConstants.PICTURE_BDX_POUNDJE).build();
        CPlayerEntity lPellenardBdx = new CPlayerEntity.CPlayerBuilder().firstName("theo").lastName(CConstants.NAME_BDX_PELLENARD).team(lBdxFromDb).dayOfBirth(4).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lPellenardPositionsBdx).picturePath(CConstants.PICTURE_BDX_PELLENARD).build();
        CPlayerEntity lGajicBdx = new CPlayerEntity.CPlayerBuilder().firstName("milan").lastName(CConstants.NAME_BDX_GAJIC).team(lBdxFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lGajicPositionsBdx).picturePath(CConstants.PICTURE_BDX_GAJIC).build();
        CPlayerEntity lSerticBdx = new CPlayerEntity.CPlayerBuilder().firstName("gregory").lastName(CConstants.NAME_BDX_SERTIC).team(lBdxFromDb).dayOfBirth(5).monthOfBirth(CConstants.AUGUST).yearOfBirth(1989).country(CConstants.FRANCE).positions(lSerticPositionsBdx).picturePath(CConstants.PICTURE_BDX_SERTIC).build();
        CPlayerEntity lGuilbertBdx = new CPlayerEntity.CPlayerBuilder().firstName("frederic").lastName(CConstants.NAME_BDX_GUILBERT).team(lBdxFromDb).dayOfBirth(24).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lGuilbertPositionsBdx).picturePath(CConstants.PICTURE_BDX_GUILBERT).build();
        CPlayerEntity lSabalyBdx = new CPlayerEntity.CPlayerBuilder().firstName("youssouf").lastName(CConstants.NAME_BDX_SABALY).team(lBdxFromDb).dayOfBirth(5).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.FRANCE).positions(lSabalyPositionsBdx).picturePath(CConstants.PICTURE_BDX_SABALY).build();
        CPlayerEntity lPabloBdx = new CPlayerEntity.CPlayerBuilder().firstName("pablo").lastName(CConstants.NAME_BDX_PABLO).team(lBdxFromDb).dayOfBirth(21).monthOfBirth(CConstants.JUNE).yearOfBirth(1991).country(CConstants.BRAZIL).positions(lPabloPositionsBdx).picturePath(CConstants.PICTURE_BDX_PABLO).build();


        // midfielders

        CPlayerEntity lArambarriBdx = new CPlayerEntity.CPlayerBuilder().firstName("mauro").lastName(CConstants.NAME_BDX_ARAMBARRI).team(lBdxFromDb).dayOfBirth(30).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1995).country(CConstants.URUGUAY).positions(lArambarriPositionsBdx).picturePath(CConstants.PICTURE_BDX_ARAMBARRI).build();
        CPlayerEntity lPlasilBdx = new CPlayerEntity.CPlayerBuilder().firstName("jaroslav").lastName(CConstants.NAME_BDX_PLASIL).team(lBdxFromDb).dayOfBirth(5).monthOfBirth(CConstants.JANUARY).yearOfBirth(1982).country(CConstants.CZECH).positions(lPlasilPositionsBdx).picturePath(CConstants.PICTURE_BDX_PLASIL).build();
        CPlayerEntity lToulalanBdx = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_BDX_TOULALAN).team(lBdxFromDb).dayOfBirth(10).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1983).country(CConstants.FRANCE).positions(lToulalanPositionsBdx).picturePath(CConstants.PICTURE_BDX_TOULALAN).build();
        CPlayerEntity lMauriceBelayBdx = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_BDX_MAURICEBELAY).team(lBdxFromDb).dayOfBirth(19).monthOfBirth(CConstants.APRIL).yearOfBirth(1985).country(CConstants.FRANCE).positions(lMauriceBelayPositionsBdx).picturePath(CConstants.PICTURE_BDX_MAURICEBELAY).build();
        CPlayerEntity lTraoreBdx = new CPlayerEntity.CPlayerBuilder().firstName("abdou").lastName(CConstants.NAME_BDX_TRAORE).team(lBdxFromDb).dayOfBirth(17).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lTraorePositionsBdx).picturePath(CConstants.PICTURE_BDX_TRAORE).build();
        CPlayerEntity lKaabouniBdx = new CPlayerEntity.CPlayerBuilder().firstName("younes").lastName(CConstants.NAME_BDX_KAABOUNI).team(lBdxFromDb).dayOfBirth(23).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKaabouniPositionsBdx).picturePath(CConstants.PICTURE_BDX_KAABOUNI).build();
        CPlayerEntity lOunasBdx = new CPlayerEntity.CPlayerBuilder().firstName("adam").lastName(CConstants.NAME_BDX_OUNAS).team(lBdxFromDb).dayOfBirth(11).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lOunasPositionsBdx).picturePath(CConstants.PICTURE_BDX_OUNAS).build();
        CPlayerEntity lSoniBdx = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_BDX_SONI).team(lBdxFromDb).dayOfBirth(17).monthOfBirth(CConstants.APRIL).yearOfBirth(1998).country(CConstants.FRANCE).positions(lSoniPositionsBdx).picturePath(CConstants.PICTURE_BDX_SONI).build();
        CPlayerEntity lVadaBdx = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_BDX_VADA).team(lBdxFromDb).dayOfBirth(6).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.ARGENTINA).positions(lVadaPositionsBdx).picturePath(CConstants.PICTURE_BDX_VADA).build();


        // forwards

        CPlayerEntity lMenezBdx = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_BDX_MENEZ).team(lBdxFromDb).dayOfBirth(7).monthOfBirth(CConstants.MAY).yearOfBirth(1987).country(CConstants.FRANCE).positions(lMenezPositionsBdx).picturePath(CConstants.PICTURE_BDX_MENEZ).build();
        CPlayerEntity lToureBdx = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_BDX_TOURE).team(lBdxFromDb).dayOfBirth(27).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lTourePositionsBdx).picturePath(CConstants.PICTURE_BDX_TOURE).build();
        CPlayerEntity lKamanoBdx = new CPlayerEntity.CPlayerBuilder().firstName("francois").lastName(CConstants.NAME_BDX_KAMANO).team(lBdxFromDb).dayOfBirth(1).monthOfBirth(CConstants.MAY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lKamanoPositionsBdx).picturePath(CConstants.PICTURE_BDX_KAMANO).build();
        CPlayerEntity lRolanBdx = new CPlayerEntity.CPlayerBuilder().firstName("diego").lastName(CConstants.NAME_BDX_ROLAN).team(lBdxFromDb).dayOfBirth(24).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.URUGUAY).positions(lRolanPositionsBdx).picturePath(CConstants.PICTURE_BDX_ROLAN).build();
        CPlayerEntity lLabordeBdx = new CPlayerEntity.CPlayerBuilder().firstName("gaetan").lastName(CConstants.NAME_BDX_LABORDE).team(lBdxFromDb).dayOfBirth(3).monthOfBirth(CConstants.MAY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lLabordePositionsBdx).picturePath(CConstants.PICTURE_BDX_LABORDE).build();
        CPlayerEntity lMalcolmBdx = new CPlayerEntity.CPlayerBuilder().firstName("malcolm").lastName(CConstants.NAME_BDX_MALCOLM).team(lBdxFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.BRAZIL).positions(lMalcolmPositionsBdx).picturePath(CConstants.PICTURE_BDX_MALCOLM).build();
        CPlayerEntity lKieseThelinBdx = new CPlayerEntity.CPlayerBuilder().firstName("isaac").lastName(CConstants.NAME_BDX_KIESETHELIN).team(lBdxFromDb).dayOfBirth(24).monthOfBirth(CConstants.JUNE).yearOfBirth(1992).country(CConstants.SWEDEN).positions(lKieseThelinPositionsBdx).picturePath(CConstants.PICTURE_BDX_KIESETHELIN).build();



        // create

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCarrassoBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPriorBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBernardoniBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPalloisBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPoundjeBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGajicBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSabalyBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lContentoBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPellenardBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGuilbertBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPabloBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSerticBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPlasilBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToulalanBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVadaBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lArambarriBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lOunasBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMauriceBelayBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTraoreBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKaabouniBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSoniBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToureBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMenezBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKamanoBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKieseThelinBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLabordeBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRolanBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMalcolmBdx);
            lCrudMethods.commitTransaction();
        }

    }
}
