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
 * Created by marti on 03/08/2016.
 */
public class CCreatePsgPlayers {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lPsgFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.PSG).parameters())).get(0);


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


        List<CPositionEntity> lTrappPositionsPsg = new ArrayList<CPositionEntity>();
        lTrappPositionsPsg.add(lGk);

        List<CPositionEntity> lSilvaPositionsPsg = new ArrayList<CPositionEntity>();
        lSilvaPositionsPsg.add(lCb);


        List<CPositionEntity> lLuizPositionsPsg = new ArrayList<CPositionEntity>();
        lLuizPositionsPsg.add(lCb);
        lLuizPositionsPsg.add(lCdm);


        List<CPositionEntity> lAurierPositionsPsg = new ArrayList<CPositionEntity>();
        lAurierPositionsPsg.add(lRb);


        List<CPositionEntity> lMeunierPositionsPsg = new ArrayList<CPositionEntity>();
        lMeunierPositionsPsg.add(lRb);
        lMeunierPositionsPsg.add(lRm);

        List<CPositionEntity> lKurzawaPositionsPsg = new ArrayList<CPositionEntity>();
        lKurzawaPositionsPsg.add(lLb);


        List<CPositionEntity> lMaxwellPositionsPsg = new ArrayList<CPositionEntity>();
        lMaxwellPositionsPsg.add(lLb);


        List<CPositionEntity> lMarquinhosPositionsPsg = new ArrayList<CPositionEntity>();
        lMarquinhosPositionsPsg.add(lCb);


        List<CPositionEntity> lKimpembePositionsPsg = new ArrayList<CPositionEntity>();
        lKimpembePositionsPsg.add(lCb);

        List<CPositionEntity> lKrychowiakPositionsPsg = new ArrayList<CPositionEntity>();
        lKrychowiakPositionsPsg.add(lCdm);

        List<CPositionEntity> lVerrattiPositionsPsg = new ArrayList<CPositionEntity>();
        lVerrattiPositionsPsg.add(lCdm);
        lVerrattiPositionsPsg.add(lCm);

        List<CPositionEntity> lMottaPositionsPsg = new ArrayList<CPositionEntity>();
        lMottaPositionsPsg.add(lCdm);

        List<CPositionEntity> lHbaPositionsPsg = new ArrayList<CPositionEntity>();
        lHbaPositionsPsg.add(lRw);
        lHbaPositionsPsg.add(lCam);

        List<CPositionEntity> lLucasPositionsPsg = new ArrayList<CPositionEntity>();
        lLucasPositionsPsg.add(lRw);

        List<CPositionEntity> lRabiotPositionsPsg = new ArrayList<CPositionEntity>();
        lRabiotPositionsPsg.add(lCdm);
        lRabiotPositionsPsg.add(lCm);


        List<CPositionEntity> lStambouliPositionsPsg = new ArrayList<CPositionEntity>();
        lStambouliPositionsPsg.add(lCm);


        List<CPositionEntity> lMatuidiPositionsPsg = new ArrayList<CPositionEntity>();
        lMatuidiPositionsPsg.add(lCdm);
        lMatuidiPositionsPsg.add(lCm);


        List<CPositionEntity> lPastorePositionsPsg = new ArrayList<CPositionEntity>();
        lPastorePositionsPsg.add(lCam);


        List<CPositionEntity> lAdmPositionsPsg = new ArrayList<CPositionEntity>();
        lAdmPositionsPsg.add(lCam);
        lAdmPositionsPsg.add(lLw);
        lAdmPositionsPsg.add(lRw);


        List<CPositionEntity> lJesePositionsPsg = new ArrayList<CPositionEntity>();
        lJesePositionsPsg.add(lLw);
        lJesePositionsPsg.add(lSt);


        List<CPositionEntity> lCavaniPositionsPsg = new ArrayList<CPositionEntity>();
        lCavaniPositionsPsg.add(lSt);
        lCavaniPositionsPsg.add(lLw);


        List<CPositionEntity> lAugustinPositionsPsg = new ArrayList<CPositionEntity>();
        lAugustinPositionsPsg.add(lSt);


        List<CPositionEntity> lAreolaPositionsPsg = new ArrayList<CPositionEntity>();
        lAreolaPositionsPsg.add(lGk);

        List<CPositionEntity> lAlecPositionsPsg = new ArrayList<CPositionEntity>();
        lAlecPositionsPsg.add(lCb);

        List<CPositionEntity> lNkunkuPositionsPsg = new ArrayList<CPositionEntity>();
        lNkunkuPositionsPsg.add(lCm);


        List<CPositionEntity> lOngendaPositionsPsg = new ArrayList<CPositionEntity>();
        lOngendaPositionsPsg.add(lSt);



        CPlayerEntity lTrappPsg = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_PSG_TRAPP).team(lPsgFromDb).dayOfBirth(8).monthOfBirth(CConstants.JULY).yearOfBirth(1990).country(CConstants.GERMANY).positions(lTrappPositionsPsg).picturePath(CConstants.PICTURE_PSG_TRAPP).build();
        CPlayerEntity lMeunierPsg = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_PSG_MEUNIER).team(lPsgFromDb).dayOfBirth(12).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1991).country(CConstants.BELGIUM).positions(lMeunierPositionsPsg).picturePath(CConstants.PICTURE_PSG_MEUNIER).build();
        CPlayerEntity lLuizPsg = new CPlayerEntity.CPlayerBuilder().firstName("david").lastName(CConstants.NAME_PSG_LUIZ).team(lPsgFromDb).dayOfBirth(22).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.BRAZIL).positions(lLuizPositionsPsg).picturePath(CConstants.PICTURE_PSG_LUIZ).build();
        CPlayerEntity lSilvaPsg = new CPlayerEntity.CPlayerBuilder().firstName("thiago").lastName(CConstants.NAME_PSG_SILVA).team(lPsgFromDb).dayOfBirth(22).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1984).country(CConstants.BRAZIL).positions(lSilvaPositionsPsg).picturePath(CConstants.PICTURE_PSG_SILVA).build();
        CPlayerEntity lMarquinhosPsg = new CPlayerEntity.CPlayerBuilder().firstName("marqui").lastName(CConstants.NAME_PSG_MARQUINHOS).team(lPsgFromDb).dayOfBirth(14).monthOfBirth(CConstants.MAY).yearOfBirth(1994).country(CConstants.BRAZIL).positions(lMarquinhosPositionsPsg).picturePath(CConstants.PICTURE_PSG_MARQUINHOS).build();
        CPlayerEntity lAurierPsg = new CPlayerEntity.CPlayerBuilder().firstName("serge").lastName(CConstants.NAME_PSG_AURIER).team(lPsgFromDb).dayOfBirth(24).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lAurierPositionsPsg).picturePath(CConstants.PICTURE_PSG_AURIER).build();
        CPlayerEntity lKurzawaPsg = new CPlayerEntity.CPlayerBuilder().firstName("layvin").lastName(CConstants.NAME_PSG_KURZAWA).team(lPsgFromDb).dayOfBirth(4).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lKurzawaPositionsPsg).picturePath(CConstants.PICTURE_PSG_KURZAWA).build();
        CPlayerEntity lMaxwellPsg = new CPlayerEntity.CPlayerBuilder().firstName("maxwell").lastName(CConstants.NAME_PSG_MAXWELL).team(lPsgFromDb).dayOfBirth(27).monthOfBirth(CConstants.AUGUST).yearOfBirth(1981).country(CConstants.BRAZIL).positions(lMaxwellPositionsPsg).picturePath(CConstants.PICTURE_PSG_MAXWELL).build();
        CPlayerEntity lKimpembePsg = new CPlayerEntity.CPlayerBuilder().firstName("presnel").lastName(CConstants.NAME_PSG_KIMPEMBE).team(lPsgFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKimpembePositionsPsg).picturePath(CConstants.PICTURE_PSG_KIMPEMBE).build();
        CPlayerEntity lVerrattiPsg = new CPlayerEntity.CPlayerBuilder().firstName("marco").lastName(CConstants.NAME_PSG_VERRATTI).team(lPsgFromDb).dayOfBirth(5).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1992).country(CConstants.ITALY).positions(lVerrattiPositionsPsg).picturePath(CConstants.PICTURE_PSG_VERRATTI).build();
        CPlayerEntity lMottaPsg = new CPlayerEntity.CPlayerBuilder().firstName("thiago").lastName(CConstants.NAME_PSG_MOTTA).team(lPsgFromDb).dayOfBirth(28).monthOfBirth(CConstants.AUGUST).yearOfBirth(1982).country(CConstants.ITALY).positions(lMottaPositionsPsg).picturePath(CConstants.PICTURE_PSG_MOTTA).build();
        CPlayerEntity lMatuidiPsg = new CPlayerEntity.CPlayerBuilder().firstName("blaise").lastName(CConstants.NAME_PSG_MATUIDI).team(lPsgFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lMatuidiPositionsPsg).picturePath(CConstants.PICTURE_PSG_MATUIDI).build();
        CPlayerEntity lPastorePsg = new CPlayerEntity.CPlayerBuilder().firstName("javier").lastName(CConstants.NAME_PSG_PASTORE).team(lPsgFromDb).dayOfBirth(20).monthOfBirth(CConstants.JUNE).yearOfBirth(1989).country(CConstants.ARGENTINA).positions(lPastorePositionsPsg).picturePath(CConstants.PICTURE_PSG_PASTORE).build();
        CPlayerEntity lHbaPsg = new CPlayerEntity.CPlayerBuilder().firstName("hatem").lastName(CConstants.NAME_PSG_BENARFA).team(lPsgFromDb).dayOfBirth(7).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lHbaPositionsPsg).picturePath(CConstants.PICTURE_PSG_BENARFA).build();
        CPlayerEntity lAdmPsg = new CPlayerEntity.CPlayerBuilder().firstName("angel").lastName(CConstants.NAME_PSG_DIMARIA).team(lPsgFromDb).dayOfBirth(14).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1988).country(CConstants.ARGENTINA).positions(lAdmPositionsPsg).picturePath(CConstants.PICTURE_PSG_DIMARIA).build();
        CPlayerEntity lLucasPsg = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_PSG_LUCAS).team(lPsgFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.BRAZIL).positions(lLucasPositionsPsg).picturePath(CConstants.PICTURE_PSG_LUCAS).build();
        CPlayerEntity lKrychowiakPsg = new CPlayerEntity.CPlayerBuilder().firstName("grzegorz").lastName(CConstants.NAME_PSG_KRYCHOWIAK).team(lPsgFromDb).dayOfBirth(29).monthOfBirth(CConstants.JANUARY).yearOfBirth(1990).country(CConstants.POLAND).positions(lKrychowiakPositionsPsg).picturePath(CConstants.PICTURE_PSG_KRYCHOWIAK).build();
        CPlayerEntity lJesePsg = new CPlayerEntity.CPlayerBuilder().firstName("jese").lastName(CConstants.NAME_PSG_JESE).team(lPsgFromDb).dayOfBirth(26).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1993).country(CConstants.SPAIN).positions(lJesePositionsPsg).picturePath(CConstants.PICTURE_PSG_JESE).build();
        CPlayerEntity lCavaniPsg = new CPlayerEntity.CPlayerBuilder().firstName("edinson").lastName(CConstants.NAME_PSG_CAVANI).team(lPsgFromDb).dayOfBirth(14).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1987).country(CConstants.URUGUAY).positions(lCavaniPositionsPsg).picturePath(CConstants.PICTURE_PSG_CAVANI).build();
        CPlayerEntity lAugustinPsg = new CPlayerEntity.CPlayerBuilder().firstName("jean kevin").lastName(CConstants.NAME_PSG_AUGUSTIN).team(lPsgFromDb).dayOfBirth(16).monthOfBirth(CConstants.JUNE).yearOfBirth(1997).country(CConstants.FRANCE).positions(lAugustinPositionsPsg).picturePath(CConstants.PICTURE_PSG_AUGUSTIN).build();
        CPlayerEntity lAreolaPsg = new CPlayerEntity.CPlayerBuilder().firstName("alphonse").lastName(CConstants.NAME_PSG_AREOLA).team(lPsgFromDb).dayOfBirth(27).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lAreolaPositionsPsg).picturePath(CConstants.PICTURE_PSG_AREOLA).build();
        CPlayerEntity lRabiotPsg = new CPlayerEntity.CPlayerBuilder().firstName("adrien").lastName(CConstants.NAME_PSG_RABIOT).team(lPsgFromDb).dayOfBirth(3).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lRabiotPositionsPsg).picturePath(CConstants.PICTURE_PSG_RABIOT).build();
        CPlayerEntity lStambouliPsg = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_PSG_STAMBOULI).team(lPsgFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.FRANCE).positions(lStambouliPositionsPsg).picturePath(CConstants.PICTURE_PSG_STAMBOULI).build();
        CPlayerEntity lOngendaPsg = new CPlayerEntity.CPlayerBuilder().firstName("hervin").lastName(CConstants.NAME_PSG_ONGENDA).team(lPsgFromDb).dayOfBirth(24).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.FRANCE).positions(lOngendaPositionsPsg).picturePath(CConstants.PICTURE_PSG_ONGENDA).build();
        CPlayerEntity lNkunkuPsg = new CPlayerEntity.CPlayerBuilder().firstName("christopher").lastName(CConstants.NAME_PSG_NKUNKU).team(lPsgFromDb).dayOfBirth(14).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lNkunkuPositionsPsg).picturePath(CConstants.PICTURE_PSG_NKUNKU).build();
        CPlayerEntity lAlecPsg = new CPlayerEntity.CPlayerBuilder().firstName("georgen").lastName(CConstants.NAME_PSG_ALEC).team(lPsgFromDb).dayOfBirth(17).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1998).country(CConstants.FRANCE).positions(lAlecPositionsPsg).picturePath(CConstants.PICTURE_PSG_ALEC).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTrappPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAreolaPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSilvaPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLuizPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarquinhosPsg);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKimpembePsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaxwellPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKurzawaPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAurierPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMeunierPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAlecPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKrychowiakPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVerrattiPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMatuidiPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMottaPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHbaPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAdmPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPastorePsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLucasPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJesePsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCavaniPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAugustinPsg);
            lCrudMethods.commitTransaction();
        }


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRabiotPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lOngendaPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNkunkuPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lStambouliPsg);
            lCrudMethods.commitTransaction();
        }





    }
}
