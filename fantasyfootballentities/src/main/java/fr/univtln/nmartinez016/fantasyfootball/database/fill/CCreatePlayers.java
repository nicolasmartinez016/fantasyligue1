package fr.univtln.nmartinez016.fantasyfootball.database.fill;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 30/07/2016.
 */
public class CCreatePlayers {

    public static void main(String[] args) {

        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lAngersFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.ANGERS).parameters())).get(0);
        CTeamEntity lAsmFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.MONACO).parameters())).get(0);
        CTeamEntity lBastiaFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.BASTIA).parameters())).get(0);
        CTeamEntity lBdxFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.BORDEAUX).parameters())).get(0);
        CTeamEntity lCaenFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.CAEN).parameters())).get(0);
        CTeamEntity lDijonFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.DIJON).parameters())).get(0);
        CTeamEntity lEagFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.GUINGAMP).parameters())).get(0);
        CTeamEntity lLorientFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.LORIENT).parameters())).get(0);
        CTeamEntity lLoscFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.LOSC).parameters())).get(0);
        CTeamEntity lMetzFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.LOSC).parameters())).get(0);
        CTeamEntity lMhscFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.MHSC).parameters())).get(0);
        CTeamEntity lNancyFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NANCY).parameters())).get(0);
        CTeamEntity lNantesFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NANTES).parameters())).get(0);
        CTeamEntity lNiceFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NICE).parameters())).get(0);
        CTeamEntity lOlFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.OL).parameters())).get(0);
        CTeamEntity lOmFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME , CConstants.OM).parameters())).get(0);
        CTeamEntity lPsgFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.PSG).parameters())).get(0);
        CTeamEntity lRennesFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.RENNES).parameters())).get(0);
        CTeamEntity lSainteFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.ASSE).parameters())).get(0);
        CTeamEntity lToulouseFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.TOULOUSE).parameters())).get(0);



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

        List<CPositionEntity> lLetellierPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMichelPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPetricPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAndreuPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBourillonPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDialloPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLaidouniPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lManceauPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMartinezPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPavlovicPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lThomasPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTraorePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCapellePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lManganiPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNdoyePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSaissPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSantamariaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSerinPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTaitPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDiedhiouPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKetkeoPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNwakaemePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDorePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPepePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSunuPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTokoEkambiPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lWissaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSaihiPositions = new ArrayList<CPositionEntity>();



        // players

        // gks
        CPlayerEntity lLetellier = new CPlayerEntity.CPlayerBuilder().firstName("alexandre").lastName(CConstants.NAME_ANGERS_LETELLIER).team(lAngersFromDb).dayOfBirth(11).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lLetellierPositions).picturePath(CConstants.PICTURE_ANGERS_LETELLIER).build();
        CPlayerEntity lMichel = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_ANGERS_MICHEL).team(lAngersFromDb).dayOfBirth(4).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lMichelPositions).picturePath(CConstants.PICTURE_ANGERS_MICHEL).build();
        CPlayerEntity lPetric = new CPlayerEntity.CPlayerBuilder().firstName("denis").lastName(CConstants.NAME_ANGERS_PETRIC).team(lAngersFromDb).dayOfBirth(24).monthOfBirth(CConstants.MAY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lPetricPositions).picturePath(CConstants.PICTURE_ANGERS_PETRIC).build();

        // defenders

        CPlayerEntity lAndreu = new CPlayerEntity.CPlayerBuilder().firstName("yoann").lastName(CConstants.NAME_ANGERS_ANDREU).team(lAngersFromDb).dayOfBirth(3).monthOfBirth(CConstants.MAY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lAndreuPositions).picturePath(CConstants.PICTURE_ANGERS_ANDREU).build();
        CPlayerEntity lBourillon = new CPlayerEntity.CPlayerBuilder().firstName("gregory").lastName(CConstants.NAME_ANGERS_BOURILLON).team(lAngersFromDb).dayOfBirth(1).monthOfBirth(CConstants.JULY).yearOfBirth(1984).country(CConstants.FRANCE).positions(lBourillonPositions).picturePath(CConstants.PICTURE_ANGERS_BOURILLON).build();
        CPlayerEntity lDiallo = new CPlayerEntity.CPlayerBuilder().firstName("ibrahima").lastName(CConstants.NAME_ANGERS_DIALLO).team(lAngersFromDb).dayOfBirth(26).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1985).country(CConstants.GUINEA).positions(lDialloPositions).picturePath(CConstants.PICTURE_ANGERS_DIALLO).build();
        CPlayerEntity lLaidouni = new CPlayerEntity.CPlayerBuilder().firstName("aissa").lastName(CConstants.NAME_ANGERS_LAIDOUNI).team(lAngersFromDb).dayOfBirth(13).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lLaidouniPositions).picturePath(CConstants.PICTURE_ANGERS_LAIDOUNI).build();
        CPlayerEntity lManceau = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_ANGERS_MANCEAU).team(lAngersFromDb).dayOfBirth(10).monthOfBirth(CConstants.JULY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lManceauPositions).picturePath(CConstants.PICTURE_ANGERS_MANCEAU).build();
        CPlayerEntity lMartinez = new CPlayerEntity.CPlayerBuilder().firstName("pablo").lastName(CConstants.NAME_ANGERS_MARTINEZ).team(lAngersFromDb).dayOfBirth(21).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lMartinezPositions).picturePath(CConstants.PICTURE_ANGERS_MARTINEZ).build();
        CPlayerEntity lPavlovic = new CPlayerEntity.CPlayerBuilder().firstName("mateo").lastName(CConstants.NAME_ANGERS_PAVLOVIC).team(lAngersFromDb).dayOfBirth(9).monthOfBirth(CConstants.JUNE).yearOfBirth(1990).country(CConstants.FRANCE).positions(lPavlovicPositions).picturePath(CConstants.PICTURE_ANGERS_PAVLOVIC).build();
        CPlayerEntity lThomas = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_ANGERS_THOMAS).team(lAngersFromDb).dayOfBirth(12).monthOfBirth(CConstants.JUNE).yearOfBirth(1988).country(CConstants.FRANCE).positions(lThomasPositions).picturePath(CConstants.PICTURE_ANGERS_THOMAS).build();
        CPlayerEntity lTraore = new CPlayerEntity.CPlayerBuilder().firstName("ismael").lastName(CConstants.NAME_ANGERS_TRAORE).team(lAngersFromDb).dayOfBirth(18).monthOfBirth(CConstants.AUGUST).yearOfBirth(1986).country(CConstants.IVORYCOAST).positions(lTraorePositions).picturePath(CConstants.PICTURE_ANGERS_TRAORE).build();

        // midfielder

        CPlayerEntity lCapelle = new CPlayerEntity.CPlayerBuilder().firstName("pierrick").lastName(CConstants.NAME_ANGERS_CAPELLE).team(lAngersFromDb).dayOfBirth(15).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lCapellePositions).picturePath(CConstants.PICTURE_ANGERS_CAPELLE).build();
        CPlayerEntity lMangani = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_ANGERS_MANGANI).team(lAngersFromDb).dayOfBirth(29).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lManganiPositions).picturePath(CConstants.PICTURE_ANGERS_MANGANI).build();
        CPlayerEntity lNdoye = new CPlayerEntity.CPlayerBuilder().firstName("cheick").lastName(CConstants.NAME_ANGERS_NDOYE).team(lAngersFromDb).dayOfBirth(29).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.SENEGAL).positions(lNdoyePositions).picturePath(CConstants.PICTURE_ANGERS_NDOYE).build();
        CPlayerEntity lSaiss = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_ANGERS_SAISS).team(lAngersFromDb).dayOfBirth(26).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.MOROCCO).positions(lSaissPositions).picturePath(CConstants.PICTURE_ANGERS_SAISS).build();
        CPlayerEntity lSantamaria = new CPlayerEntity.CPlayerBuilder().firstName("baptiste").lastName(CConstants.NAME_ANGERS_SANTAMARIA).team(lAngersFromDb).dayOfBirth(3).monthOfBirth(CConstants.MARCH).yearOfBirth(1995).country(CConstants.FRANCE).positions(lSantamariaPositions).picturePath(CConstants.PICTURE_ANGERS_SANTAMARIA).build();
        CPlayerEntity lSerin = new CPlayerEntity.CPlayerBuilder().firstName("mathias").lastName(CConstants.NAME_ANGERS_SERIN).team(lAngersFromDb).dayOfBirth(1).monthOfBirth(CConstants.AUGUST).yearOfBirth(1991).country(CConstants.FRANCE).positions(lSerinPositions).picturePath(CConstants.PICTURE_ANGERS_SERIN).build();
        CPlayerEntity lTait = new CPlayerEntity.CPlayerBuilder().firstName("flavien").lastName(CConstants.NAME_ANGERS_TAIT).team(lAngersFromDb).dayOfBirth(2).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lTaitPositions).picturePath(CConstants.PICTURE_ANGERS_TAIT).build();
        CPlayerEntity lSaihi = new CPlayerEntity.CPlayerBuilder().firstName("jamel").lastName(CConstants.NAME_MHSC_SAIHI).team(lAngersFromDb).dayOfBirth(27).monthOfBirth(CConstants.JANUARY).yearOfBirth(1987).country(CConstants.FRANCE).positions(lSaihiPositions).picturePath(CConstants.PICTURE_MHSC_SAIHI).build();

        // forwards

        CPlayerEntity lDiedhiou = new CPlayerEntity.CPlayerBuilder().firstName("famara").lastName(CConstants.NAME_ANGERS_DIEDHIOU).team(lAngersFromDb).dayOfBirth(15).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDiedhiouPositions).picturePath(CConstants.PICTURE_ANGERS_DIEDHIOU).build();
        CPlayerEntity lKetkeo = new CPlayerEntity.CPlayerBuilder().firstName("billy").lastName(CConstants.NAME_ANGERS_KETKEO).team(lAngersFromDb).dayOfBirth(24).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.FRANCE).positions(lKetkeoPositions).picturePath(CConstants.PICTURE_ANGERS_KETKEO).build();
        CPlayerEntity lNwakaeme = new CPlayerEntity.CPlayerBuilder().firstName("dickson").lastName(CConstants.NAME_ANGERS_NWAKAEME).team(lAngersFromDb).dayOfBirth(21).monthOfBirth(CConstants.APRIL).yearOfBirth(1986).country(CConstants.FRANCE).positions(lNwakaemePositions).picturePath(CConstants.PICTURE_ANGERS_NWAKAEME).build();
        CPlayerEntity lDore = new CPlayerEntity.CPlayerBuilder().firstName("ferebory").lastName(CConstants.NAME_ANGERS_DORE).team(lAngersFromDb).dayOfBirth(21).monthOfBirth(CConstants.JANUARY).yearOfBirth(1989).country(CConstants.CONGO).positions(lDorePositions).picturePath(CConstants.PICTURE_ANGERS_DORE).build();
        CPlayerEntity lPepe = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_ANGERS_PEPE).team(lAngersFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lPepePositions).picturePath(CConstants.PICTURE_ANGERS_PEPE).build();
        CPlayerEntity lSunu = new CPlayerEntity.CPlayerBuilder().firstName("gilles").lastName(CConstants.NAME_ANGERS_SUNU).team(lAngersFromDb).dayOfBirth(30).monthOfBirth(CConstants.MARCH).yearOfBirth(1991).country(CConstants.FRANCE).positions(lSunuPositions).picturePath(CConstants.PICTURE_ANGERS_SUNU).build();
        CPlayerEntity lTokoEkambi = new CPlayerEntity.CPlayerBuilder().firstName("karl").lastName(CConstants.NAME_ANGERS_TOKOEKAMBI).team(lAngersFromDb).dayOfBirth(14).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1992).country(CConstants.CAMEROUN).positions(lTokoEkambiPositions).picturePath(CConstants.PICTURE_ANGERS_TOKOEKAMBI).build();
        CPlayerEntity lWissa = new CPlayerEntity.CPlayerBuilder().firstName("yoane").lastName(CConstants.NAME_ANGERS_WISSA).team(lAngersFromDb).dayOfBirth(3).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lWissaPositions).picturePath(CConstants.PICTURE_ANGERS_WISSA).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLetellier);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMichel);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPetric);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAndreu);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBourillon);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiallo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLaidouni);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lManceau);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMartinez);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPavlovic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTraore);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lThomas);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCapelle);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMangani);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdoye);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaihi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaiss);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSantamaria);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSerin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTait);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKetkeo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSunu);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTokoEkambi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiedhiou);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNwakaeme);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPepe);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDore);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lWissa);
            lCrudMethods.commitTransaction();
        }

        List<CPositionEntity> lSubasicPositions = new ArrayList<CPositionEntity>();
        lSubasicPositions.add(lGk);

        List<CPositionEntity> lDeSanctisPositions = new ArrayList<CPositionEntity>();
        lDeSanctisPositions.add(lGk);

        List<CPositionEntity> lGlikPositions = new ArrayList<CPositionEntity>();
        lGlikPositions.add(lCb);

        List<CPositionEntity> lTisserandPositions = new ArrayList<CPositionEntity>();
        lDeSanctisPositions.add(lCb);

        List<CPositionEntity> lSidibePositions = new ArrayList<CPositionEntity>();
        lSidibePositions.add(lRb);
        lSidibePositions.add(lLb);

        List<CPositionEntity> lMendyPositions = new ArrayList<CPositionEntity>();
        lMendyPositions.add(lLb);

        List<CPositionEntity> lJemersonPositions = new ArrayList<CPositionEntity>();
        lJemersonPositions.add(lCb);

        List<CPositionEntity> lTourePositions = new ArrayList<CPositionEntity>();
        lTourePositions.add(lRb);

        List<CPositionEntity> lFabinhoPositions = new ArrayList<CPositionEntity>();
        lFabinhoPositions.add(lRb);
        lFabinhoPositions.add(lCdm);

        List<CPositionEntity> lEchiejilePositions = new ArrayList<CPositionEntity>();
        lEchiejilePositions.add(lLb);

        List<CPositionEntity> lRaggiPositions = new ArrayList<CPositionEntity>();
        lRaggiPositions.add(lCb);
        lRaggiPositions.add(lRb);

        List<CPositionEntity> lNdoramPositions = new ArrayList<CPositionEntity>();
        lNdoramPositions.add(lCb);

        List<CPositionEntity> lTavaresPositions = new ArrayList<CPositionEntity>();
        lTavaresPositions.add(lCb);

        List<CPositionEntity> lWallacePositions = new ArrayList<CPositionEntity>();
        lWallacePositions.add(lCb);

        List<CPositionEntity> lBakayokoPositions = new ArrayList<CPositionEntity>();
        lBakayokoPositions.add(lCdm);

        List<CPositionEntity> lDirarPositions = new ArrayList<CPositionEntity>();
        lDirarPositions.add(lRm);

        List<CPositionEntity> lLemarPositions = new ArrayList<CPositionEntity>();
        lLemarPositions.add(lRm);
        lLemarPositions.add(lCam);

        List<CPositionEntity> lSilvaPositions = new ArrayList<CPositionEntity>();
        lSilvaPositions.add(lCam);
        lSilvaPositions.add(lRw);

        List<CPositionEntity> lBahlouliPositions = new ArrayList<CPositionEntity>();
        lBahlouliPositions.add(lCam);

        List<CPositionEntity> lMbappePositions = new ArrayList<CPositionEntity>();
        lMbappePositions.add(lLw);

        List<CPositionEntity> lTraoreMonacoPositions = new ArrayList<CPositionEntity>();
        lDeSanctisPositions.add(lRm);

        List<CPositionEntity> lBoschiliaPositions = new ArrayList<CPositionEntity>();
        lBoschiliaPositions.add(lCm);

        List<CPositionEntity> lMexiquePositions = new ArrayList<CPositionEntity>();
        lMexiquePositions.add(lCm);

        List<CPositionEntity> lVinagrePositions = new ArrayList<CPositionEntity>();
        lVinagrePositions.add(lCm);

        List<CPositionEntity> lJeanPositions = new ArrayList<CPositionEntity>();
        lJeanPositions.add(lSt);

        List<CPositionEntity> lGermainPositions = new ArrayList<CPositionEntity>();
        lGermainPositions.add(lSt);

        List<CPositionEntity> lFalcaoPositions = new ArrayList<CPositionEntity>();
        lFalcaoPositions.add(lSt);

        List<CPositionEntity> lCavaleiroPositions = new ArrayList<CPositionEntity>();
        lCavaleiroPositions.add(lLw);

        List<CPositionEntity> lCarilloPositions = new ArrayList<CPositionEntity>();
        lCarilloPositions.add(lSt);

        List<CPositionEntity> lWagnerLovePositions = new ArrayList<CPositionEntity>();
        lWagnerLovePositions.add(lSt);

        List<CPositionEntity> lDialloMonacoPositions = new ArrayList<CPositionEntity>();
        lDialloPositions.add(lCb);

        List<CPositionEntity> lBongiovanniPositions = new ArrayList<CPositionEntity>();
        lBongiovanniPositions.add(lCb);

        List<CPositionEntity> lBennedinePositions = new ArrayList<CPositionEntity>();
        lBennedinePositions.add(lCb);

        List<CPositionEntity> lCarvalhoPositions = new ArrayList<CPositionEntity>();
        lCarvalhoPositions.add(lCb);



        CPlayerEntity lSubasic = new CPlayerEntity.CPlayerBuilder().firstName("danijel").lastName(CConstants.NAME_ASM_SUBASIC).team(lAsmFromDb).dayOfBirth(27).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1984).country(CConstants.CROATIA).positions(lSubasicPositions).picturePath(CConstants.PICTURE_ASM_SUBASIC).build();
        CPlayerEntity lDeSanctis = new CPlayerEntity.CPlayerBuilder().firstName("morgan").lastName(CConstants.NAME_ASM_DESANCTIS).team(lAsmFromDb).dayOfBirth(26).monthOfBirth(CConstants.MARCH).yearOfBirth(1977).country(CConstants.ITALY).positions(lDeSanctisPositions).picturePath(CConstants.PICTURE_ASM_DESANCTIS).build();
        CPlayerEntity lGlik = new CPlayerEntity.CPlayerBuilder().firstName("kamil").lastName(CConstants.NAME_ASM_GLIK).team(lAsmFromDb).dayOfBirth(3).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1988).country(CConstants.POLAND).positions(lGlikPositions).picturePath(CConstants.PICTURE_ASM_GLIK).build();
        CPlayerEntity lMendy = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_ASM_MENDY).team(lAsmFromDb).dayOfBirth(17).monthOfBirth(CConstants.JULY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lMendyPositions).picturePath(CConstants.PICTURE_ASM_MENDY).build();
        CPlayerEntity lSidibe = new CPlayerEntity.CPlayerBuilder().firstName("djibril").lastName(CConstants.NAME_ASM_SIDIBE).team(lAsmFromDb).dayOfBirth(27).monthOfBirth(CConstants.JULY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSidibePositions).picturePath(CConstants.PICTURE_ASM_SIDIBE).build();
        CPlayerEntity lFabinho = new CPlayerEntity.CPlayerBuilder().firstName("fabio henrique tavares").lastName(CConstants.NAME_ASM_FABINHO).team(lAsmFromDb).dayOfBirth(23).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1993).country(CConstants.BRAZIL).positions(lFabinhoPositions).picturePath(CConstants.PICTURE_ASM_FABINHO).build();
        CPlayerEntity lCarvalho = new CPlayerEntity.CPlayerBuilder().firstName("ricardo").lastName(CConstants.NAME_ASM_CARVALHO).team(lAsmFromDb).dayOfBirth(18).monthOfBirth(CConstants.MAY).yearOfBirth(1978).country(CConstants.PORTUGAL).positions(lCarvalhoPositions).picturePath(CConstants.PICTURE_ASM_CARVALHO).build();
        CPlayerEntity lJemerson = new CPlayerEntity.CPlayerBuilder().firstName("jesus").lastName(CConstants.NAME_ASM_JEMERSON).team(lAsmFromDb).dayOfBirth(24).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.BRAZIL).positions(lJemersonPositions).picturePath(CConstants.PICTURE_ASM_JEMERSON).build();
        CPlayerEntity lToure = new CPlayerEntity.CPlayerBuilder().firstName("almany").lastName(CConstants.NAME_ASM_TOURE).team(lAsmFromDb).dayOfBirth(28).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.MALI).positions(lTourePositions).picturePath(CConstants.PICTURE_ASM_TOURE).build();
        CPlayerEntity lRaggi = new CPlayerEntity.CPlayerBuilder().firstName("andrea").lastName(CConstants.NAME_ASM_RAGGI).team(lAsmFromDb).dayOfBirth(24).monthOfBirth(CConstants.JUNE).yearOfBirth(1984).country(CConstants.ITALY).positions(lRaggiPositions).picturePath(CConstants.PICTURE_ASM_RAGGI).build();
        CPlayerEntity lEchiejile = new CPlayerEntity.CPlayerBuilder().firstName("uwa").lastName(CConstants.NAME_ASM_ECHIEJILE).team(lAsmFromDb).dayOfBirth(20).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.NIGERIA).positions(lEchiejilePositions).picturePath(CConstants.PICTURE_ASM_ECHIEJILE).build();
        CPlayerEntity lNdoram = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_ASM_NDORAM).team(lAsmFromDb).dayOfBirth(22).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lNdoramPositions).picturePath(CConstants.PICTURE_ASM_NDORAM).build();
        CPlayerEntity lTisserand = new CPlayerEntity.CPlayerBuilder().firstName("marcel").lastName(CConstants.NAME_ASM_TISSERAND).team(lAsmFromDb).dayOfBirth(10).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lTisserandPositions).picturePath(CConstants.PICTURE_ASM_TISSERAND).build();
        CPlayerEntity lDialloMonaco = new CPlayerEntity.CPlayerBuilder().firstName("abdou").lastName(CConstants.NAME_ASM_DIALLO).team(lAsmFromDb).dayOfBirth(4).monthOfBirth(CConstants.MAY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lDialloMonacoPositions).picturePath(CConstants.PICTURE_ASM_DIALLO).build();
        CPlayerEntity lBennedine = new CPlayerEntity.CPlayerBuilder().firstName("medhi").lastName(CConstants.NAME_ASM_BENEDDINE).team(lAsmFromDb).dayOfBirth(26).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBennedinePositions).picturePath(CConstants.PICTURE_ASM_BENEDDINE).build();
        CPlayerEntity lSilva = new CPlayerEntity.CPlayerBuilder().firstName("bernardo").lastName(CConstants.NAME_ASM_BERNARDO).team(lAsmFromDb).dayOfBirth(10).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.PORTUGAL).positions(lSilvaPositions).picturePath(CConstants.PICTURE_ASM_BERNARDO).build();
        CPlayerEntity lLemar = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_ASM_LEMAR).team(lAsmFromDb).dayOfBirth(12).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLemarPositions).picturePath(CConstants.PICTURE_ASM_LEMAR).build();
        CPlayerEntity lBakayoko = new CPlayerEntity.CPlayerBuilder().firstName("tiemoue").lastName(CConstants.NAME_ASM_BAKAYOKO).team(lAsmFromDb).dayOfBirth(17).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.FRANCE).positions(lBakayokoPositions).picturePath(CConstants.PICTURE_ASM_BAKAYOKO).build();
        CPlayerEntity lMbappe = new CPlayerEntity.CPlayerBuilder().firstName("killian").lastName(CConstants.NAME_ASM_MBAPPE).team(lAsmFromDb).dayOfBirth(20).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1998).country(CConstants.FRANCE).positions(lMbappePositions).picturePath(CConstants.PICTURE_ASM_MBAPPE).build();
        CPlayerEntity lBahlouli = new CPlayerEntity.CPlayerBuilder().firstName("fares").lastName(CConstants.NAME_ASM_BAHLOULI).team(lAsmFromDb).dayOfBirth(8).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lBahlouliPositions).picturePath(CConstants.PICTURE_ASM_BAHLOULI).build();
        CPlayerEntity lDirar = new CPlayerEntity.CPlayerBuilder().firstName("nabil").lastName(CConstants.NAME_ASM_DIRAR).team(lAsmFromDb).dayOfBirth(25).monthOfBirth(CConstants.APRIL).yearOfBirth(1986).country(CConstants.MOROCCO).positions(lDirarPositions).picturePath(CConstants.PICTURE_ASM_DIRAR).build();
        CPlayerEntity lTraoreMonaco = new CPlayerEntity.CPlayerBuilder().firstName("adama").lastName(CConstants.NAME_ASM_TRAORE).team(lAsmFromDb).dayOfBirth(28).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.MALI).positions(lTraoreMonacoPositions).picturePath(CConstants.PICTURE_ASM_TRAORE).build();
        CPlayerEntity lBoschilia = new CPlayerEntity.CPlayerBuilder().firstName("gabriel").lastName(CConstants.NAME_ASM_BOSCHILIA).team(lAsmFromDb).dayOfBirth(5).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.BRAZIL).positions(lBoschiliaPositions).picturePath(CConstants.PICTURE_ASM_BOSCHILIA).build();
        CPlayerEntity lMexique = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_ASM_MEXIQUE).team(lAsmFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1995).country(CConstants.FRANCE).positions(lMexiquePositions).picturePath(CConstants.PICTURE_ASM_MEXIQUE).build();
        CPlayerEntity lVinagre = new CPlayerEntity.CPlayerBuilder().firstName("ruben").lastName(CConstants.NAME_ASM_VINAGRE).team(lAsmFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1999).country(CConstants.PORTUGAL).positions(lVinagrePositions).picturePath(CConstants.PICTURE_ASM_VINAGRE).build();
        CPlayerEntity lJean = new CPlayerEntity.CPlayerBuilder().firstName("corentin").lastName(CConstants.NAME_ASM_JEAN).team(lAsmFromDb).dayOfBirth(15).monthOfBirth(CConstants.JULY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lJeanPositions).picturePath(CConstants.PICTURE_ASM_JEAN).build();
        CPlayerEntity lGermain = new CPlayerEntity.CPlayerBuilder().firstName("valere").lastName(CConstants.NAME_ASM_GERMAIN).team(lAsmFromDb).dayOfBirth(17).monthOfBirth(CConstants.APRIL).yearOfBirth(1990).country(CConstants.FRANCE).positions(lGermainPositions).picturePath(CConstants.PICTURE_ASM_GERMAIN).build();
        CPlayerEntity lFalcao = new CPlayerEntity.CPlayerBuilder().firstName("radamael").lastName(CConstants.NAME_ASM_FALCAO).team(lAsmFromDb).dayOfBirth(10).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1986).country(CConstants.COLOMBIA).positions(lFalcaoPositions).picturePath(CConstants.PICTURE_ASM_FALCAO).build();
        CPlayerEntity lCarillo = new CPlayerEntity.CPlayerBuilder().firstName("guido").lastName(CConstants.NAME_ASM_CARILLO).team(lAsmFromDb).dayOfBirth(25).monthOfBirth(CConstants.MAY).yearOfBirth(1991).country(CConstants.ARGENTINA).positions(lCarilloPositions).picturePath(CConstants.PICTURE_ASM_CARILLO).build();
        CPlayerEntity lCavaleiro = new CPlayerEntity.CPlayerBuilder().firstName("ivan").lastName(CConstants.NAME_ASM_CAVALEIRO).team(lAsmFromDb).dayOfBirth(18).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1993).country(CConstants.PORTUGAL).positions(lCavaleiroPositions).picturePath(CConstants.PICTURE_ASM_CAVALEIRO).build();
        CPlayerEntity lWagnerLove = new CPlayerEntity.CPlayerBuilder().firstName("daniel").lastName(CConstants.NAME_ASM_VAGNERLOVE).team(lAsmFromDb).dayOfBirth(11).monthOfBirth(CConstants.JUNE).yearOfBirth(1984).country(CConstants.FRANCE).positions(lWagnerLovePositions).picturePath(CConstants.PICTURE_ASM_VAGNERLOVE).build();
        CPlayerEntity lBongiovanni = new CPlayerEntity.CPlayerBuilder().firstName("adrien").lastName(CConstants.NAME_ASM_BONGIOVANNI).team(lAsmFromDb).dayOfBirth(20).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1999).country(CConstants.BELGIUM).positions(lBongiovanniPositions).picturePath(CConstants.PICTURE_ASM_BONGIOVANNI).build();





        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSubasic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDeSanctis);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGlik);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFabinho);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCarvalho);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTisserand);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiallo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRaggi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEchiejile);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSidibe);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJemerson);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToure);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdoram);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBennedine);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSilva);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLemar);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBakayoko);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBahlouli);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDirar);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMbappe);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTraore);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoschilia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMexique);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVinagre);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJean);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGermain);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFalcao);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lWagnerLove);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCarillo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBongiovanni);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCavaleiro);
            lCrudMethods.commitTransaction();
        }

        List<CPositionEntity> lCharruauPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLecaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVincensiniPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBenhaimPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCioniPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDialloBastiaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDjikuPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lElKaoutariPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMarangePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPeybernesPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSquillaciPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAlexandrePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDanicPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCahuzacPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSDialloPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lHouriPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lKeitaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMostefaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNgandoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSidoPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBifoumaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCabralPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCoulibalyPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCrivelliPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLangisPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lRaspentinoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSaintMaximinPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBengtssonPositions = new ArrayList<CPositionEntity>();
        lBengtssonPositions.add(lLb);





        CPlayerEntity lCharruau = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_BASTIA_CHARRUAU).team(lBastiaFromDb).dayOfBirth(12).monthOfBirth(CConstants.JULY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lCharruauPositions).picturePath(CConstants.PICTURE_BASTIA_CHARRUAU).build();
        CPlayerEntity lLeca = new CPlayerEntity.CPlayerBuilder().firstName("jean louis").lastName(CConstants.NAME_BASTIA_LECA).team(lBastiaFromDb).dayOfBirth(21).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1985).country(CConstants.FRANCE).positions(lLecaPositions).picturePath(CConstants.PICTURE_BASTIA_LECA).build();
        CPlayerEntity lVincensini = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_BASTIA_VINCENSINI).team(lBastiaFromDb).dayOfBirth(12).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lVincensiniPositions).picturePath(CConstants.PICTURE_BASTIA_VINCENSINI).build();

        CPlayerEntity lBenhaim = new CPlayerEntity.CPlayerBuilder().firstName("julien").lastName(CConstants.NAME_BASTIA_BENHAIM).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lBenhaimPositions).picturePath(CConstants.PICTURE_BASTIA_BENHAIM).build();
        CPlayerEntity lCioni = new CPlayerEntity.CPlayerBuilder().firstName("gilles").lastName(CConstants.NAME_BASTIA_CIONI).team(lBastiaFromDb).dayOfBirth(14).monthOfBirth(CConstants.JUNE).yearOfBirth(1984).country(CConstants.FRANCE).positions(lCioniPositions).picturePath(CConstants.PICTURE_BASTIA_CIONI).build();
        CPlayerEntity lDialloBastia = new CPlayerEntity.CPlayerBuilder().firstName("ismael").lastName(CConstants.NAME_BASTIA_DIALLO).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.IVORYCOAST).positions(lDialloBastiaPositions).picturePath(CConstants.PICTURE_BASTIA_DIALLO).build();
        CPlayerEntity lDjiku = new CPlayerEntity.CPlayerBuilder().firstName("alexander").lastName(CConstants.NAME_BASTIA_DJIKU).team(lBastiaFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.FRANCE).positions(lDjikuPositions).picturePath(CConstants.PICTURE_BASTIA_DJIKU).build();
        CPlayerEntity lElKaoutari = new CPlayerEntity.CPlayerBuilder().firstName("abdelhamid").lastName(CConstants.NAME_BASTIA_ELKAOUTARI).team(lBastiaFromDb).dayOfBirth(17).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.FRANCE).positions(lElKaoutariPositions).picturePath(CConstants.PICTURE_BASTIA_ELKAOUTARI).build();
        CPlayerEntity lMarange = new CPlayerEntity.CPlayerBuilder().firstName("florian").lastName(CConstants.NAME_BASTIA_MARANGE).team(lBastiaFromDb).dayOfBirth(3).monthOfBirth(CConstants.JUNE).yearOfBirth(1986).country(CConstants.FRANCE).positions(lMarangePositions).picturePath(CConstants.PICTURE_BASTIA_MARANGE).build();
        CPlayerEntity lPeybernes = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_BASTIA_PEYBERNES).team(lBastiaFromDb).dayOfBirth(21).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lPeybernesPositions).picturePath(CConstants.PICTURE_BASTIA_PEYBERNES).build();
        CPlayerEntity lSquillaci = new CPlayerEntity.CPlayerBuilder().firstName("sebastien").lastName(CConstants.NAME_BASTIA_SQUILLACI).team(lBastiaFromDb).dayOfBirth(11).monthOfBirth(CConstants.AUGUST).yearOfBirth(1980).country(CConstants.FRANCE).positions(lSquillaciPositions).picturePath(CConstants.PICTURE_BASTIA_SQUILLACI).build();
        CPlayerEntity lBengtsson = new CPlayerEntity.CPlayerBuilder().firstName("alexander").lastName(CConstants.NAME_BASTIA_BENGTSSON).team(lBastiaFromDb).dayOfBirth(12).monthOfBirth(CConstants.APRIL).yearOfBirth(1988).country(CConstants.SWEDEN).positions(lBengtssonPositions).picturePath(CConstants.PICTURE_BASTIA_BENGTSSON).build();


        CPlayerEntity lAlexandre = new CPlayerEntity.CPlayerBuilder().firstName("edgar").lastName(CConstants.NAME_BASTIA_ALEXANDRE).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lAlexandrePositions).picturePath(CConstants.PICTURE_BASTIA_ALEXANDRE).build();
        CPlayerEntity lDanic = new CPlayerEntity.CPlayerBuilder().firstName("gael").lastName(CConstants.NAME_BASTIA_DANIC).team(lBastiaFromDb).dayOfBirth(19).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lDanicPositions).picturePath(CConstants.PICTURE_BASTIA_DANIC).build();
        CPlayerEntity lCahuzac = new CPlayerEntity.CPlayerBuilder().firstName("yannick").lastName(CConstants.NAME_BASTIA_CAHUZAC).team(lBastiaFromDb).dayOfBirth(18).monthOfBirth(CConstants.JANUARY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lCahuzacPositions).picturePath(CConstants.PICTURE_BASTIA_CAHUZAC).build();
        CPlayerEntity lSDiallo = new CPlayerEntity.CPlayerBuilder().firstName("sadio").lastName(CConstants.NAME_BASTIA_DIALLO).team(lBastiaFromDb).dayOfBirth(28).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lSDialloPositions).picturePath(CConstants.PICTURE_BASTIA_SDIALLO).build();
        CPlayerEntity lHouri = new CPlayerEntity.CPlayerBuilder().firstName("lyes").lastName(CConstants.NAME_BASTIA_HOURI).team(lBastiaFromDb).dayOfBirth(19).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lHouriPositions).picturePath(CConstants.PICTURE_BASTIA_HOURI).build();
        CPlayerEntity lKeita = new CPlayerEntity.CPlayerBuilder().firstName("abdoulaye").lastName(CConstants.NAME_BASTIA_KEITA).team(lBastiaFromDb).dayOfBirth(5).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.MALI).positions(lKeitaPositions).picturePath(CConstants.PICTURE_BASTIA_KEITA).build();
        CPlayerEntity lMostefa = new CPlayerEntity.CPlayerBuilder().firstName("mehdi").lastName(CConstants.NAME_BASTIA_MOSTEFA).team(lBastiaFromDb).dayOfBirth(30).monthOfBirth(CConstants.AUGUST).yearOfBirth(1983).country(CConstants.ALGERIA).positions(lMostefaPositions).picturePath(CConstants.PICTURE_BASTIA_MOSTEFA).build();
        CPlayerEntity lNgando = new CPlayerEntity.CPlayerBuilder().firstName("axel").lastName(CConstants.NAME_BASTIA_NGANDO).team(lBastiaFromDb).dayOfBirth(13).monthOfBirth(CConstants.JULY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lNgandoPositions).picturePath(CConstants.PICTURE_BASTIA_NGANDO).build();
        CPlayerEntity lSido = new CPlayerEntity.CPlayerBuilder().firstName("rashade").lastName(CConstants.NAME_BASTIA_SIDO).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.BURKINAFASO).positions(lSidoPositions).picturePath(CConstants.PICTURE_BASTIA_SIDO).build();

        CPlayerEntity lBifouma = new CPlayerEntity.CPlayerBuilder().firstName("thievy").lastName(CConstants.NAME_BASTIA_BIFOUMA).team(lBastiaFromDb).dayOfBirth(13).monthOfBirth(CConstants.MAY).yearOfBirth(1992).country(CConstants.CONGO).positions(lBifoumaPositions).picturePath(CConstants.PICTURE_BASTIA_BIFOUMA).build();
        CPlayerEntity lCabral = new CPlayerEntity.CPlayerBuilder().firstName("jerson").lastName(CConstants.NAME_BASTIA_CABRAL).team(lBastiaFromDb).dayOfBirth(3).monthOfBirth(CConstants.JANUARY).yearOfBirth(1991).country(CConstants.NETHERLANDS).positions(lCabralPositions).picturePath(CConstants.PICTURE_BASTIA_CABRAL).build();
        CPlayerEntity lCoulibaly = new CPlayerEntity.CPlayerBuilder().firstName("lassana").lastName(CConstants.NAME_BASTIA_COULIBALY).team(lBastiaFromDb).dayOfBirth(10).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.MALI).positions(lCoulibalyPositions).picturePath(CConstants.PICTURE_BASTIA_COULIBALY).build();
        CPlayerEntity lCrivelli = new CPlayerEntity.CPlayerBuilder().firstName("enzo").lastName(CConstants.NAME_BASTIA_CRIVELLI).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCrivelliPositions).picturePath(CConstants.PICTURE_BASTIA_CRIVELLI).build();
        CPlayerEntity lLangis = new CPlayerEntity.CPlayerBuilder().firstName("lenny").lastName(CConstants.NAME_BASTIA_NANGIS).team(lBastiaFromDb).dayOfBirth(24).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lLangisPositions).picturePath(CConstants.PICTURE_BASTIA_NANGIS).build();
        CPlayerEntity lRaspentino = new CPlayerEntity.CPlayerBuilder().firstName("florian").lastName(CConstants.NAME_BASTIA_RASPENTINO).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.JUNE).yearOfBirth(1989).country(CConstants.FRANCE).positions(lRaspentinoPositions).picturePath(CConstants.PICTURE_BASTIA_RASPENTINO).build();
        CPlayerEntity lSaintMaximin = new CPlayerEntity.CPlayerBuilder().firstName("allan").lastName(CConstants.NAME_BASTIA_STMAXIMIN).team(lBastiaFromDb).dayOfBirth(12).monthOfBirth(CConstants.MARCH).yearOfBirth(1997).country(CConstants.FRANCE).positions(lSaintMaximinPositions).picturePath(CConstants.PICTURE_BASTIA_STMAXIMIN).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeca);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCharruau);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVincensini);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenhaim);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCioni);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPeybernes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCahuzac);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDjiku);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarange);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSDiallo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSquillaci);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lElKaoutari);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDanic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAlexandre);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHouri);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMostefa);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKeita);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNgando);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSido);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaintMaximin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCrivelli);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBifouma);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCabral);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCoulibaly);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLangis);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRaspentino);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBengtsson);
            lCrudMethods.commitTransaction();
        }

        // BORDEAUX

        List<CPositionEntity> lCarrassoPositions = new ArrayList<CPositionEntity>();
        lCarrassoPositions.add(lGk);

        List<CPositionEntity> lBernardoniPositions = new ArrayList<CPositionEntity>();
        lBernardoniPositions.add(lGk);

        List<CPositionEntity> lPriorPositions = new ArrayList<CPositionEntity>();
        lPriorPositions.add(lGk);


        List<CPositionEntity> lGajicPositions = new ArrayList<CPositionEntity>();
        lGajicPositions.add(lRb);

        List<CPositionEntity> lPalloisPositions = new ArrayList<CPositionEntity>();
        lPalloisPositions.add(lCb);

        List<CPositionEntity> lPoundjePositions = new ArrayList<CPositionEntity>();
        lPoundjePositions.add(lLb);

        List<CPositionEntity> lSabalyPositions = new ArrayList<CPositionEntity>();
        lSabalyPositions.add(lRb);
        lSabalyPositions.add(lLb);

        List<CPositionEntity> lGuilbertPositions = new ArrayList<CPositionEntity>();
        lGuilbertPositions.add(lRb);

        List<CPositionEntity> lContentoPositions = new ArrayList<CPositionEntity>();
        lContentoPositions.add(lLb);

        List<CPositionEntity> lPellenardPositions = new ArrayList<CPositionEntity>();
        lPellenardPositions.add(lLb);

        List<CPositionEntity> lSerticPositions = new ArrayList<CPositionEntity>();
        lSerticPositions.add(lCb);

        List<CPositionEntity> lPabloPositions = new ArrayList<CPositionEntity>();
        lPabloPositions.add(lCb);


        List<CPositionEntity> lArambarriPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPlasilPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lToulalanPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMauriceBelayPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lTraoreBdxPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lKaabouniPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lOunasPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSoniPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVadaPositions = new ArrayList<CPositionEntity>();
        lVadaPositions.add(lCdm);
        lVadaPositions.add(lCm);

        List<CPositionEntity> lToureBdxPositions = new ArrayList<CPositionEntity>();
        lTourePositions.add(lLm);
        lTourePositions.add(lRw);

        List<CPositionEntity> lMenezPositions = new ArrayList<CPositionEntity>();
        lMenezPositions.add(lSt);
        lMenezPositions.add(lLw);

        List<CPositionEntity> lRolanPositions = new ArrayList<CPositionEntity>();
        lRolanPositions.add(lSt);

        List<CPositionEntity> lLabordePositions = new ArrayList<CPositionEntity>();
        lLabordePositions.add(lSt);

        List<CPositionEntity> lKieseThelinPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMalcolmPositions = new ArrayList<CPositionEntity>();
        lMalcolmPositions.add(lRw);

        List<CPositionEntity> lKamanoPositions = new ArrayList<CPositionEntity>();
        lKamanoPositions.add(lSt);

        // players

        // gks

        CPlayerEntity lCarrasso = new CPlayerEntity.CPlayerBuilder().firstName("cedric").lastName(CConstants.NAME_BDX_CARRASSO).team(lBdxFromDb).dayOfBirth(30).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lCarrassoPositions).picturePath(CConstants.PICTURE_BDX_CARRASSO).build();
        CPlayerEntity lBernardoni = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_BDX_BERNARDONI).team(lBdxFromDb).dayOfBirth(18).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lBernardoniPositions).picturePath(CConstants.PICTURE_BDX_BERNARDONI).build();
        CPlayerEntity lPrior = new CPlayerEntity.CPlayerBuilder().firstName("jerome").lastName(CConstants.NAME_BDX_PRIOR).team(lBdxFromDb).dayOfBirth(8).monthOfBirth(CConstants.AUGUST).yearOfBirth(1995).country(CConstants.FRANCE).positions(lPriorPositions).picturePath(CConstants.PICTURE_BDX_PRIOR).build();


        // defenders

        CPlayerEntity lContento = new CPlayerEntity.CPlayerBuilder().firstName("diego").lastName(CConstants.NAME_BDX_CONTENTO).team(lBdxFromDb).dayOfBirth(1).monthOfBirth(CConstants.MAY).yearOfBirth(1990).country(CConstants.GERMANY).positions(lContentoPositions).picturePath(CConstants.PICTURE_BDX_CONTENTO).build();
        CPlayerEntity lPallois = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_BDX_PALLOIS).team(lBdxFromDb).dayOfBirth(19).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1987).country(CConstants.FRANCE).positions(lPalloisPositions).picturePath(CConstants.PICTURE_BDX_PALLOIS).build();
        CPlayerEntity lPoundje = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_BDX_POUNDJE).team(lBdxFromDb).dayOfBirth(16).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.FRANCE).positions(lPoundjePositions).picturePath(CConstants.PICTURE_BDX_POUNDJE).build();
        CPlayerEntity lPellenard = new CPlayerEntity.CPlayerBuilder().firstName("theo").lastName(CConstants.NAME_BDX_PELLENARD).team(lBdxFromDb).dayOfBirth(4).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lPellenardPositions).picturePath(CConstants.PICTURE_BDX_PELLENARD).build();
        CPlayerEntity lGajic = new CPlayerEntity.CPlayerBuilder().firstName("milan").lastName(CConstants.NAME_BDX_GAJIC).team(lBdxFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lGajicPositions).picturePath(CConstants.PICTURE_BDX_GAJIC).build();
        CPlayerEntity lSertic = new CPlayerEntity.CPlayerBuilder().firstName("gregory").lastName(CConstants.NAME_BDX_SERTIC).team(lBdxFromDb).dayOfBirth(5).monthOfBirth(CConstants.AUGUST).yearOfBirth(1989).country(CConstants.FRANCE).positions(lSerticPositions).picturePath(CConstants.PICTURE_BDX_SERTIC).build();
        CPlayerEntity lGuilbert = new CPlayerEntity.CPlayerBuilder().firstName("frederic").lastName(CConstants.NAME_BDX_GUILBERT).team(lBdxFromDb).dayOfBirth(24).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lGuilbertPositions).picturePath(CConstants.PICTURE_BDX_GUILBERT).build();
        CPlayerEntity lSabaly = new CPlayerEntity.CPlayerBuilder().firstName("youssouf").lastName(CConstants.NAME_BDX_SABALY).team(lBdxFromDb).dayOfBirth(5).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.FRANCE).positions(lSabalyPositions).picturePath(CConstants.PICTURE_BDX_SABALY).build();
        CPlayerEntity lPablo = new CPlayerEntity.CPlayerBuilder().firstName("pablo").lastName(CConstants.NAME_BDX_PABLO).team(lBdxFromDb).dayOfBirth(21).monthOfBirth(CConstants.JUNE).yearOfBirth(1991).country(CConstants.BRAZIL).positions(lPabloPositions).picturePath(CConstants.PICTURE_BDX_PABLO).build();


        // midfielders

        CPlayerEntity lArambarri = new CPlayerEntity.CPlayerBuilder().firstName("mauro").lastName(CConstants.NAME_BDX_ARAMBARRI).team(lBdxFromDb).dayOfBirth(30).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1995).country(CConstants.URUGUAY).positions(lArambarriPositions).picturePath(CConstants.PICTURE_BDX_ARAMBARRI).build();
        CPlayerEntity lPlasil = new CPlayerEntity.CPlayerBuilder().firstName("jaroslav").lastName(CConstants.NAME_BDX_PLASIL).team(lBdxFromDb).dayOfBirth(5).monthOfBirth(CConstants.JANUARY).yearOfBirth(1982).country(CConstants.CZECH).positions(lPlasilPositions).picturePath(CConstants.PICTURE_BDX_PLASIL).build();
        CPlayerEntity lToulalan = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_BDX_TOULALAN).team(lBdxFromDb).dayOfBirth(10).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1983).country(CConstants.FRANCE).positions(lToulalanPositions).picturePath(CConstants.PICTURE_BDX_TOULALAN).build();
        CPlayerEntity lMauriceBelay = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_BDX_MAURICEBELAY).team(lBdxFromDb).dayOfBirth(19).monthOfBirth(CConstants.APRIL).yearOfBirth(1985).country(CConstants.FRANCE).positions(lMauriceBelayPositions).picturePath(CConstants.PICTURE_BDX_MAURICEBELAY).build();
        CPlayerEntity lTraoreBdx = new CPlayerEntity.CPlayerBuilder().firstName("abdou").lastName(CConstants.NAME_BDX_TRAORE).team(lBdxFromDb).dayOfBirth(17).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lTraoreBdxPositions).picturePath(CConstants.PICTURE_BDX_TRAORE).build();
        CPlayerEntity lKaabouni = new CPlayerEntity.CPlayerBuilder().firstName("younes").lastName(CConstants.NAME_BDX_KAABOUNI).team(lBdxFromDb).dayOfBirth(23).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKaabouniPositions).picturePath(CConstants.PICTURE_BDX_KAABOUNI).build();
        CPlayerEntity lOunas = new CPlayerEntity.CPlayerBuilder().firstName("adam").lastName(CConstants.NAME_BDX_OUNAS).team(lBdxFromDb).dayOfBirth(11).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lOunasPositions).picturePath(CConstants.PICTURE_BDX_OUNAS).build();
        CPlayerEntity lSoni = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_BDX_SONI).team(lBdxFromDb).dayOfBirth(17).monthOfBirth(CConstants.APRIL).yearOfBirth(1998).country(CConstants.FRANCE).positions(lSoniPositions).picturePath(CConstants.PICTURE_BDX_SONI).build();
        CPlayerEntity lVada = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_BDX_VADA).team(lBdxFromDb).dayOfBirth(6).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.ARGENTINA).positions(lVadaPositions).picturePath(CConstants.PICTURE_BDX_VADA).build();


        // forwards

        CPlayerEntity lMenez = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_BDX_MENEZ).team(lBdxFromDb).dayOfBirth(7).monthOfBirth(CConstants.MAY).yearOfBirth(1987).country(CConstants.FRANCE).positions(lMenezPositions).picturePath(CConstants.PICTURE_BDX_MENEZ).build();
        CPlayerEntity lToureBdx = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_BDX_TOURE).team(lBdxFromDb).dayOfBirth(27).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lToureBdxPositions).picturePath(CConstants.PICTURE_BDX_TOURE).build();
        CPlayerEntity lKamano = new CPlayerEntity.CPlayerBuilder().firstName("francois").lastName(CConstants.NAME_BDX_KAMANO).team(lBdxFromDb).dayOfBirth(1).monthOfBirth(CConstants.MAY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lKamanoPositions).picturePath(CConstants.PICTURE_BDX_KAMANO).build();
        CPlayerEntity lRolan = new CPlayerEntity.CPlayerBuilder().firstName("diego").lastName(CConstants.NAME_BDX_ROLAN).team(lBdxFromDb).dayOfBirth(24).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.URUGUAY).positions(lRolanPositions).picturePath(CConstants.PICTURE_BDX_ROLAN).build();
        CPlayerEntity lLaborde = new CPlayerEntity.CPlayerBuilder().firstName("gaetan").lastName(CConstants.NAME_BDX_LABORDE).team(lBdxFromDb).dayOfBirth(3).monthOfBirth(CConstants.MAY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lLabordePositions).picturePath(CConstants.PICTURE_BDX_LABORDE).build();
        CPlayerEntity lMalcolm = new CPlayerEntity.CPlayerBuilder().firstName("malcolm").lastName(CConstants.NAME_BDX_MALCOLM).team(lBdxFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.BRAZIL).positions(lMalcolmPositions).picturePath(CConstants.PICTURE_BDX_MALCOLM).build();
        CPlayerEntity lKieseThelin = new CPlayerEntity.CPlayerBuilder().firstName("isaac").lastName(CConstants.NAME_BDX_KIESETHELIN).team(lBdxFromDb).dayOfBirth(24).monthOfBirth(CConstants.JUNE).yearOfBirth(1992).country(CConstants.SWEDEN).positions(lKieseThelinPositions).picturePath(CConstants.PICTURE_BDX_KIESETHELIN).build();



        // create

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCarrasso);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPrior);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBernardoni);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPallois);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPoundje);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGajic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSabaly);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lContento);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPellenard);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGuilbert);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPablo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSertic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPlasil);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToulalan);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVada);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lArambarri);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lOunas);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMauriceBelay);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTraoreBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKaabouni);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSoni);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToureBdx);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMenez);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKamano);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKieseThelin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLaborde);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRolan);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMalcolm);
            lCrudMethods.commitTransaction();
        }

        // CAEN

        List<CPositionEntity> lVercoutrePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDeschateauxPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lReuletPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDreyerPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lYahiaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBenYoussefPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lImorouPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAlhadurPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDaboPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDaSilvaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lGenevoisPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSeubePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDiomandePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDelaplacePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNkololoPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMalbranquePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBessatPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMakengoPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAdeotiPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeborgnePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lFeretPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lVoisinPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKaramohPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDelortPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRodelinPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLouisPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBazilePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSanePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKouakouPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSantiniPositions = new ArrayList<CPositionEntity>();


        CPlayerEntity lVercoutre = new CPlayerEntity.CPlayerBuilder().firstName("remy").lastName(CConstants.NAME_CAEN_VERCOUTRE).team(lCaenFromDb).dayOfBirth(26).monthOfBirth(CConstants.JUNE).yearOfBirth(1980).country(CConstants.FRANCE).positions(lVercoutrePositions).picturePath(CConstants.PICTURE_CAEN_VERCOUTRE).build();
        CPlayerEntity lDeschateaux = new CPlayerEntity.CPlayerBuilder().firstName("louis").lastName(CConstants.NAME_CAEN_DESCHATEAUX).team(lCaenFromDb).dayOfBirth(16).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lDeschateauxPositions).picturePath(CConstants.PICTURE_CAEN_DESCHATEAUX).build();
        CPlayerEntity lReulet = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_CAEN_REULET).team(lCaenFromDb).dayOfBirth(14).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lReuletPositions).picturePath(CConstants.PICTURE_CAEN_REULET).build();
        CPlayerEntity lDreyer = new CPlayerEntity.CPlayerBuilder().firstName("matthieu").lastName(CConstants.NAME_CAEN_DREYER).team(lCaenFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.FRANCE).positions(lDreyerPositions).picturePath(CConstants.PICTURE_CAEN_DREYER).build();

        CPlayerEntity lYahia = new CPlayerEntity.CPlayerBuilder().firstName("alaeddine").lastName(CConstants.NAME_CAEN_YAHIA).team(lCaenFromDb).dayOfBirth(26).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lYahiaPositions).picturePath(CConstants.PICTURE_CAEN_YAHIA).build();
        CPlayerEntity lBenYoussef = new CPlayerEntity.CPlayerBuilder().firstName("syam").lastName(CConstants.NAME_CAEN_BENYOUSSEF).team(lCaenFromDb).dayOfBirth(31).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.FRANCE).positions(lBenYoussefPositions).picturePath(CConstants.PICTURE_CAEN_BENYOUSSEF).build();
        CPlayerEntity lImorou = new CPlayerEntity.CPlayerBuilder().firstName("emmanuel").lastName(CConstants.NAME_CAEN_IMOROU).team(lCaenFromDb).dayOfBirth(16).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lImorouPositions).picturePath(CConstants.PICTURE_CAEN_IMOROU).build();
        CPlayerEntity lAlhadur = new CPlayerEntity.CPlayerBuilder().firstName("chaker").lastName(CConstants.NAME_CAEN_ALHADUR).team(lCaenFromDb).dayOfBirth(4).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lAlhadurPositions).picturePath(CConstants.PICTURE_CAEN_ALHADUR).build();
        CPlayerEntity lDabo = new CPlayerEntity.CPlayerBuilder().firstName("mouhamadou").lastName(CConstants.NAME_CAEN_DABO).team(lCaenFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1986).country(CConstants.SENEGAL).positions(lDaboPositions).picturePath(CConstants.PICTURE_CAEN_DABO).build();
        CPlayerEntity lDaSilva = new CPlayerEntity.CPlayerBuilder().firstName("damien").lastName(CConstants.NAME_CAEN_DASILVA).team(lCaenFromDb).dayOfBirth(17).monthOfBirth(CConstants.MAY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lDaSilvaPositions).picturePath(CConstants.PICTURE_CAEN_DASILVA).build();
        CPlayerEntity lGenevois = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_CAEN_GENEVOIS).team(lCaenFromDb).dayOfBirth(28).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1987).country(CConstants.FRANCE).positions(lGenevoisPositions).picturePath(CConstants.PICTURE_CAEN_GENEVOIS).build();

        CPlayerEntity lSeube = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_CAEN_SEUBE).team(lCaenFromDb).dayOfBirth(11).monthOfBirth(CConstants.AUGUST).yearOfBirth(1979).country(CConstants.FRANCE).positions(lSeubePositions).picturePath(CConstants.PICTURE_CAEN_SEUBE).build();
        CPlayerEntity lDiomande = new CPlayerEntity.CPlayerBuilder().firstName("ismael").lastName(CConstants.NAME_CAEN_DIOMANDE).team(lCaenFromDb).dayOfBirth(28).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lDiomandePositions).picturePath(CConstants.PICTURE_CAEN_DIOMANDE).build();
        CPlayerEntity lDelaplace = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_CAEN_DELAPLACE).team(lCaenFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.FRANCE).positions(lDelaplacePositions).picturePath(CConstants.PICTURE_CAEN_DELAPLACE).build();
        CPlayerEntity lNkololo = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_CAEN_NKOLOLO).team(lCaenFromDb).dayOfBirth(9).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lNkololoPositions).picturePath(CConstants.PICTURE_CAEN_NKOLOLO).build();
        CPlayerEntity lMalbranque = new CPlayerEntity.CPlayerBuilder().firstName("steed").lastName(CConstants.NAME_CAEN_MALBRANQUE).team(lCaenFromDb).dayOfBirth(6).monthOfBirth(CConstants.JANUARY).yearOfBirth(1980).country(CConstants.FRANCE).positions(lMalbranquePositions).picturePath(CConstants.PICTURE_CAEN_MALBRANQUE).build();
        CPlayerEntity lBessat = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_CAEN_BESSAT).team(lCaenFromDb).dayOfBirth(8).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1985).country(CConstants.FRANCE).positions(lBessatPositions).picturePath(CConstants.PICTURE_CAEN_BESSAT).build();
        CPlayerEntity lMakengo = new CPlayerEntity.CPlayerBuilder().firstName("jean victor").lastName(CConstants.NAME_CAEN_MAKENGO).team(lCaenFromDb).dayOfBirth(12).monthOfBirth(CConstants.JUNE).yearOfBirth(1998).country(CConstants.FRANCE).positions(lMakengoPositions).picturePath(CConstants.PICTURE_CAEN_MAKENGO).build();
        CPlayerEntity lAdeoti = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_CAEN_ADEOTI).team(lCaenFromDb).dayOfBirth(12).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.FRANCE).positions(lAdeotiPositions).picturePath(CConstants.PICTURE_CAEN_ADEOTI).build();
        CPlayerEntity lLeborgne = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_CAEN_LEBORGNE).team(lCaenFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLeborgnePositions).picturePath(CConstants.PICTURE_CAEN_LEBORGNE).build();
        CPlayerEntity lFeret = new CPlayerEntity.CPlayerBuilder().firstName("julien").lastName(CConstants.NAME_CAEN_FERET).team(lCaenFromDb).dayOfBirth(5).monthOfBirth(CConstants.JULY).yearOfBirth(1982).country(CConstants.FRANCE).positions(lFeretPositions).picturePath(CConstants.PICTURE_CAEN_FERET).build();
        CPlayerEntity lVoisin = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_CAEN_VOISIN).team(lCaenFromDb).dayOfBirth(19).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lVoisinPositions).picturePath(CConstants.PICTURE_CAEN_VOISIN).build();

        CPlayerEntity lKaramoh = new CPlayerEntity.CPlayerBuilder().firstName("yann").lastName(CConstants.NAME_CAEN_KARAMOH).team(lCaenFromDb).dayOfBirth(8).monthOfBirth(CConstants.JULY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lKaramohPositions).picturePath(CConstants.PICTURE_CAEN_KARAMOH).build();
        CPlayerEntity lDelort = new CPlayerEntity.CPlayerBuilder().firstName("andy").lastName(CConstants.NAME_CAEN_DELORT).team(lCaenFromDb).dayOfBirth(9).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lDelortPositions).picturePath(CConstants.PICTURE_CAEN_DELORT).build();
        CPlayerEntity lRodelin = new CPlayerEntity.CPlayerBuilder().firstName("rony").lastName(CConstants.NAME_CAEN_RODELIN).team(lCaenFromDb).dayOfBirth(18).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lRodelinPositions).picturePath(CConstants.PICTURE_CAEN_RODELIN).build();
        CPlayerEntity lLouis = new CPlayerEntity.CPlayerBuilder().firstName("jeff").lastName(CConstants.NAME_CAEN_LOUIS).team(lCaenFromDb).dayOfBirth(8).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.HAITI).positions(lLouisPositions).picturePath(CConstants.PICTURE_CAEN_LOUIS).build();
        CPlayerEntity lBazile = new CPlayerEntity.CPlayerBuilder().firstName("herve").lastName(CConstants.NAME_CAEN_BAZILE).team(lCaenFromDb).dayOfBirth(18).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.FRANCE).positions(lBazilePositions).picturePath(CConstants.PICTURE_CAEN_BAZILE).build();
        CPlayerEntity lSane = new CPlayerEntity.CPlayerBuilder().firstName("pape").lastName(CConstants.NAME_CAEN_SANE).team(lCaenFromDb).dayOfBirth(30).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1991).country(CConstants.SENEGAL).positions(lSanePositions).picturePath(CConstants.PICTURE_CAEN_SANE).build();
        CPlayerEntity lKouakou = new CPlayerEntity.CPlayerBuilder().firstName("christian").lastName(CConstants.NAME_CAEN_KOUAKOU).team(lCaenFromDb).dayOfBirth(1).monthOfBirth(CConstants.MARCH).yearOfBirth(1991).country(CConstants.IVORYCOAST).positions(lKouakouPositions).picturePath(CConstants.PICTURE_CAEN_KOUAKOU).build();
        CPlayerEntity lSantini = new CPlayerEntity.CPlayerBuilder().firstName("ivan").lastName(CConstants.NAME_CAEN_SANTINI).team(lCaenFromDb).dayOfBirth(21).monthOfBirth(CConstants.MAY).yearOfBirth(1989).country(CConstants.CROATIA).positions(lSantiniPositions).picturePath(CConstants.PICTURE_CAEN_SANTINI).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVercoutre);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDeschateaux);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lReulet);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDreyer);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDaSilva);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenYoussef);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lYahia);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lImorou);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDabo);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAlhadur);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGenevois);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSeube);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFeret);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiomande);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDelaplace);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNkololo);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMalbranque);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMakengo);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBessat);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAdeoti);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeborgne);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVoisin);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKaramoh);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDelort);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRodelin);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLouis);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBazile);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSane);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKouakou);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSantini);
            lCrudMethods.commitTransaction();
        }

        // DIJON

        List<CPositionEntity> lAllainPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeroyPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lReynetPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLotiesPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBernardPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRosierPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAbdelhamidPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRufliPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBoukaMoutouPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lChafikPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lVarraultPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBelmontePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSarrabayrousePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeesMelouPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBelaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMartinPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMariePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBalmontPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSammaritanoPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAmalfitanoPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lGastienPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBahamboulaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRivierePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDionyPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTavaresDijonPositions = new ArrayList<CPositionEntity>();




        // players

        // gk

        CPlayerEntity lAllain = new CPlayerEntity.CPlayerBuilder().firstName("bobby").lastName(CConstants.NAME_DIJON_ALLAIN).team(lDijonFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lAllainPositions).picturePath(CConstants.PICTURE_DIJON_ALLAIN).build();
        CPlayerEntity lLeroy = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_DIJON_LEROY).team(lDijonFromDb).dayOfBirth(7).monthOfBirth(CConstants.APRIL).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLeroyPositions).picturePath(CConstants.PICTURE_DIJON_LEROY).build();
        CPlayerEntity lReynet = new CPlayerEntity.CPlayerBuilder().firstName("baptiste").lastName(CConstants.NAME_DIJON_REYNET).team(lDijonFromDb).dayOfBirth(28).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lReynetPositions).picturePath(CConstants.PICTURE_DIJON_REYNET).build();

        // defenders

        CPlayerEntity lLoties = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_DIJON_LOTIES).team(lDijonFromDb).dayOfBirth(5).monthOfBirth(CConstants.AUGUST).yearOfBirth(1984).country(CConstants.FRANCE).positions(lLotiesPositions).picturePath(CConstants.PICTURE_DIJON_LOTIES).build();
        CPlayerEntity lBernard = new CPlayerEntity.CPlayerBuilder().firstName("quentin").lastName(CConstants.NAME_DIJON_BERNARD).team(lDijonFromDb).dayOfBirth(7).monthOfBirth(CConstants.JULY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lBernardPositions).picturePath(CConstants.PICTURE_DIJON_BERNARD).build();
        CPlayerEntity lRosier = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_DIJON_ROSIER).team(lDijonFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1996).country(CConstants.FRANCE).positions(lRosierPositions).picturePath(CConstants.PICTURE_DIJON_ROSIER).build();
        CPlayerEntity lAbdelhamid = new CPlayerEntity.CPlayerBuilder().firstName("younis").lastName(CConstants.NAME_DIJON_ABDELHAMID).team(lDijonFromDb).dayOfBirth(28).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1987).country(CConstants.FRANCE).positions(lAbdelhamidPositions).picturePath(CConstants.PICTURE_DIJON_ABDELHAMID).build();
        CPlayerEntity lRufli = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_DIJON_RUFLI).team(lDijonFromDb).dayOfBirth(22).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.SWITZERLAND).positions(lRufliPositions).picturePath(CConstants.PICTURE_DIJON_RUFLI).build();
        CPlayerEntity lBoukaMoutou = new CPlayerEntity.CPlayerBuilder().firstName("arnold").lastName(CConstants.NAME_DIJON_BOUKAMOUTOU).team(lDijonFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lBoukaMoutouPositions).picturePath(CConstants.PICTURE_DIJON_BOUKAMOUTOU).build();
        CPlayerEntity lChafik = new CPlayerEntity.CPlayerBuilder().firstName("fouad").lastName(CConstants.NAME_DIJON_CHAFIK).team(lDijonFromDb).dayOfBirth(16).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1986).country(CConstants.FRANCE).positions(lChafikPositions).picturePath(CConstants.PICTURE_DIJON_CHAFIK).build();
        CPlayerEntity lVarrault = new CPlayerEntity.CPlayerBuilder().firstName("cedrid").lastName(CConstants.NAME_DIJON_VARRAULT).team(lDijonFromDb).dayOfBirth(30).monthOfBirth(CConstants.JANUARY).yearOfBirth(1980).country(CConstants.FRANCE).positions(lVarraultPositions).picturePath(CConstants.PICTURE_DIJON_VARRAULT).build();

        // midfielders

        CPlayerEntity lBelmonte = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_DIJON_BELMONTE).team(lDijonFromDb).dayOfBirth(16).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lBelmontePositions).picturePath(CConstants.PICTURE_DIJON_BELMONTE).build();
        CPlayerEntity lSarrabayrouse = new CPlayerEntity.CPlayerBuilder().firstName("guillaume").lastName(CConstants.NAME_DIJON_SARRABAYROUSE).team(lDijonFromDb).dayOfBirth(14).monthOfBirth(CConstants.JUNE).yearOfBirth(1997).country(CConstants.FRANCE).positions(lSarrabayrousePositions).picturePath(CConstants.PICTURE_DIJON_SARRABAYROUSE).build();
        CPlayerEntity lLeesMelou = new CPlayerEntity.CPlayerBuilder().firstName("pierre").lastName(CConstants.NAME_DIJON_LEESMELOU).team(lDijonFromDb).dayOfBirth(25).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lLeesMelouPositions).picturePath(CConstants.PICTURE_DIJON_LEESMELOU).build();
        CPlayerEntity lBela = new CPlayerEntity.CPlayerBuilder().firstName("jeremie").lastName(CConstants.NAME_DIJON_BELA).team(lDijonFromDb).dayOfBirth(8).monthOfBirth(CConstants.APRIL).yearOfBirth(1993).country(CConstants.FRANCE).positions(lBelaPositions).picturePath(CConstants.PICTURE_DIJON_BELA).build();
        CPlayerEntity lMartin = new CPlayerEntity.CPlayerBuilder().firstName("marvin").lastName(CConstants.NAME_DIJON_MARTIN).team(lDijonFromDb).dayOfBirth(10).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lMartinPositions).picturePath(CConstants.PICTURE_DIJON_MARTIN).build();
        CPlayerEntity lMarie = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_DIJON_MARIE).team(lDijonFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lMariePositions).picturePath(CConstants.PICTURE_DIJON_MARIE).build();
        CPlayerEntity lBalmont = new CPlayerEntity.CPlayerBuilder().firstName("florent").lastName(CConstants.NAME_DIJON_BALMONT).team(lDijonFromDb).dayOfBirth(2).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1980).country(CConstants.FRANCE).positions(lBalmontPositions).picturePath(CConstants.PICTURE_DIJON_BALMONT).build();
        CPlayerEntity lSammaritano = new CPlayerEntity.CPlayerBuilder().firstName("frederic").lastName(CConstants.NAME_DIJON_SAMMARITANO).team(lDijonFromDb).dayOfBirth(23).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.FRANCE).positions(lSammaritanoPositions).picturePath(CConstants.PICTURE_DIJON_SAMMARITANO).build();
        CPlayerEntity lAmalfitano = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_DIJON_AMALFITANO).team(lDijonFromDb).dayOfBirth(27).monthOfBirth(CConstants.AUGUST).yearOfBirth(1989).country(CConstants.FRANCE).positions(lAmalfitanoPositions).picturePath(CConstants.PICTURE_DIJON_AMALFITANO).build();
        CPlayerEntity lGastien = new CPlayerEntity.CPlayerBuilder().firstName("johan").lastName(CConstants.NAME_DIJON_GASTIEN).team(lDijonFromDb).dayOfBirth(25).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lGastienPositions).picturePath(CConstants.PICTURE_DIJON_GASTIEN).build();
        CPlayerEntity lBahamboula = new CPlayerEntity.CPlayerBuilder().firstName("dylan").lastName(CConstants.NAME_DIJON_BAHAMBOULA).team(lDijonFromDb).dayOfBirth(22).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lBahamboulaPositions).picturePath(CConstants.PICTURE_DIJON_BAHAMBOULA).build();

        // forwards

        CPlayerEntity lRiviere = new CPlayerEntity.CPlayerBuilder().firstName("yohann").lastName(CConstants.NAME_DIJON_RIVIERE).team(lDijonFromDb).dayOfBirth(18).monthOfBirth(CConstants.AUGUST).yearOfBirth(1984).country(CConstants.FRANCE).positions(lRivierePositions).picturePath(CConstants.PICTURE_DIJON_RIVIERE).build();
        CPlayerEntity lDiony = new CPlayerEntity.CPlayerBuilder().firstName("lois").lastName(CConstants.NAME_DIJON_DIONY).team(lDijonFromDb).dayOfBirth(20).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDionyPositions).picturePath(CConstants.PICTURE_DIJON_DIONY).build();
        CPlayerEntity lTavaresDijon = new CPlayerEntity.CPlayerBuilder().firstName("julio").lastName(CConstants.NAME_DIJON_TAVARES).team(lDijonFromDb).dayOfBirth(19).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1988).country(CConstants.CAPVERT).positions(lTavaresDijonPositions).picturePath(CConstants.PICTURE_DIJON_TAVARES).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAllain);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeroy);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lReynet);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVarrault);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLoties);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBernard);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRosier);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAbdelhamid);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRufli);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoukaMoutou);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lChafik);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBelmonte);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSarrabayrouse);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeesMelou);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBela);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMartin);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarie);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBalmont);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAmalfitano);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSammaritano);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGastien);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBahamboula);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTavaresDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRiviere);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiony);
            lCrudMethods.commitTransaction();
        }

        // GUINGAMP

        List<CPositionEntity> lJohnssonPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSalinPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lGuivarchPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSorbonPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMartinsPereiraPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLemaitrePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lAngouaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLevequePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lKerbratPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lIkokoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSankohPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lManePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMarcalPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lGiressePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCocoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDePauwPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBlasPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDialloGuingampPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBenezetPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLivolantPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDeauxPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDidotPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSaliburPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPrivatPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBriandPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMartinetPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMendyGuingampPositions = new ArrayList<CPositionEntity>();

        // players

        // gks
        CPlayerEntity lJohnsson = new CPlayerEntity.CPlayerBuilder().firstName("karl johan").lastName("johnsson").team(lEagFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lJohnssonPositions).picturePath(CConstants.PICTURE_GUINGAMP_JOHNSSON).build();
        CPlayerEntity lSalin = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName("salin").team(lEagFromDb).dayOfBirth(29).monthOfBirth(CConstants.JULY).yearOfBirth(1984).country(CConstants.FRANCE).positions(lSalinPositions).picturePath(CConstants.PICTURE_GUINGAMP_SALIN).build();
        CPlayerEntity lGuivarch = new CPlayerEntity.CPlayerBuilder().firstName("theo").lastName("guivarch").team(lEagFromDb).dayOfBirth(17).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lGuivarchPositions).picturePath(CConstants.PICTURE_GUINGAMP_GUIVARCH).build();

        // defenders

        CPlayerEntity lSorbon = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_GUINGAMP_SORBON).team(lEagFromDb).dayOfBirth(5).monthOfBirth(CConstants.AUGUST).yearOfBirth(1983).country(CConstants.FRANCE).positions(lSorbonPositions).picturePath(CConstants.PICTURE_GUINGAMP_SORBON).build();
        CPlayerEntity lMartinsPereira = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_GUINGAMP_MARTINSPEREIRA).team(lEagFromDb).dayOfBirth(30).monthOfBirth(CConstants.JANUARY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lMartinsPereiraPositions).picturePath(CConstants.PICTURE_GUINGAMP_MARTINSPEREIRA).build();
        CPlayerEntity lLemaitre = new CPlayerEntity.CPlayerBuilder().firstName("reynald").lastName(CConstants.NAME_GUINGAMP_LEMAITRE).team(lEagFromDb).dayOfBirth(28).monthOfBirth(CConstants.JUNE).yearOfBirth(1983).country(CConstants.FRANCE).positions(lLemaitrePositions).picturePath(CConstants.PICTURE_GUINGAMP_LEMAITRE).build();
        CPlayerEntity lAngoua = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_GUINGAMP_ANGOUA).team(lEagFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1986).country(CConstants.FRANCE).positions(lAngouaPositions).picturePath(CConstants.PICTURE_GUINGAMP_ANGOUA).build();
        CPlayerEntity lLeveque = new CPlayerEntity.CPlayerBuilder().firstName("dorian").lastName(CConstants.NAME_GUINGAMP_LEVEQUE).team(lEagFromDb).dayOfBirth(22).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLevequePositions).picturePath(CConstants.PICTURE_GUINGAMP_LEVEQUE).build();
        CPlayerEntity lKerbrat = new CPlayerEntity.CPlayerBuilder().firstName("christophe").lastName(CConstants.NAME_GUINGAMP_KERBRAT).team(lEagFromDb).dayOfBirth(2).monthOfBirth(CConstants.AUGUST).yearOfBirth(1986).country(CConstants.FRANCE).positions(lKerbratPositions).picturePath(CConstants.PICTURE_GUINGAMP_KERBRAT).build();
        CPlayerEntity lIkoko = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_GUINGAMP_IKOKO).team(lEagFromDb).dayOfBirth(3).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lIkokoPositions).picturePath(CConstants.PICTURE_GUINGAMP_IKOKO).build();
        CPlayerEntity lSankoh = new CPlayerEntity.CPlayerBuilder().firstName("baissama").lastName(CConstants.NAME_GUINGAMP_SANKOH).team(lEagFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSankohPositions).picturePath(CConstants.PICTURE_GUINGAMP_SANKOH).build();
        CPlayerEntity lMane = new CPlayerEntity.CPlayerBuilder().firstName("alexis").lastName(CConstants.NAME_GUINGAMP_MANE).team(lEagFromDb).dayOfBirth(30).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lManePositions).picturePath(CConstants.PICTURE_GUINGAMP_MANE).build();
        CPlayerEntity lMarcal = new CPlayerEntity.CPlayerBuilder().firstName("fernando").lastName(CConstants.NAME_GUINGAMP_MARCAL).team(lEagFromDb).dayOfBirth(9).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lMarcalPositions).picturePath(CConstants.PICTURE_GUINGAMP_MARCAL).build();

        // midfielders

        CPlayerEntity lGiresse = new CPlayerEntity.CPlayerBuilder().firstName("thibault").lastName(CConstants.NAME_GUINGAMP_GIRESSE).team(lEagFromDb).dayOfBirth(25).monthOfBirth(CConstants.MAY).yearOfBirth(1981).country(CConstants.FRANCE).positions(lGiressePositions).picturePath(CConstants.PICTURE_GUINGAMP_GIRESSE).build();
        CPlayerEntity lCoco = new CPlayerEntity.CPlayerBuilder().firstName("marcus").lastName(CConstants.NAME_GUINGAMP_COCO).team(lEagFromDb).dayOfBirth(24).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lCocoPositions).picturePath(CConstants.PICTURE_GUINGAMP_COCO).build();
        CPlayerEntity lDePauw = new CPlayerEntity.CPlayerBuilder().firstName("nill").lastName(CConstants.NAME_GUINGAMP_DEPAUW).team(lEagFromDb).dayOfBirth(6).monthOfBirth(CConstants.JANUARY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lDePauwPositions).picturePath(CConstants.PICTURE_GUINGAMP_DEPAUW).build();
        CPlayerEntity lBlas = new CPlayerEntity.CPlayerBuilder().firstName("ludovic").lastName(CConstants.NAME_GUINGAMP_BLAS).team(lEagFromDb).dayOfBirth(31).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lBlasPositions).picturePath(CConstants.PICTURE_GUINGAMP_BLAS).build();
        CPlayerEntity lDialloGuingamp = new CPlayerEntity.CPlayerBuilder().firstName("moustapha").lastName(CConstants.NAME_RENNES_DIALLO).team(lEagFromDb).dayOfBirth(14).monthOfBirth(CConstants.MAY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lDialloGuingampPositions).picturePath(CConstants.PICTURE_GUINGAMP_DIALLO).build();
        CPlayerEntity lBenezet = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_GUINGAMP_BENEZET).team(lEagFromDb).dayOfBirth(24).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lBenezetPositions).picturePath(CConstants.PICTURE_GUINGAMP_BENEZET).build();
        CPlayerEntity lLivolant = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_GUINGAMP_LIVOLANT).team(lEagFromDb).dayOfBirth(9).monthOfBirth(CConstants.JANUARY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lLivolantPositions).picturePath(CConstants.PICTURE_GUINGAMP_LIVOLANT).build();
        CPlayerEntity lDeaux = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_GUINGAMP_DEAUX).team(lEagFromDb).dayOfBirth(26).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lDeauxPositions).picturePath(CConstants.PICTURE_GUINGAMP_DEAUX).build();
        CPlayerEntity lDidot = new CPlayerEntity.CPlayerBuilder().firstName("etienne").lastName(CConstants.NAME_GUINGAMP_DIDOT).team(lEagFromDb).dayOfBirth(24).monthOfBirth(CConstants.JULY).yearOfBirth(1983).country(CConstants.FRANCE).positions(lDidotPositions).picturePath(CConstants.PICTURE_GUINGAMP_DIDOT).build();

        // forwards

        CPlayerEntity lSalibur = new CPlayerEntity.CPlayerBuilder().firstName("yannis").lastName(CConstants.NAME_GUINGAMP_SALIBUR).team(lEagFromDb).dayOfBirth(25).monthOfBirth(CConstants.JANUARY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lSaliburPositions).picturePath(CConstants.PICTURE_GUINGAMP_SALIBUR).build();
        CPlayerEntity lPrivat = new CPlayerEntity.CPlayerBuilder().firstName("sloan").lastName(CConstants.NAME_GUINGAMP_PRIVAT).team(lEagFromDb).dayOfBirth(24).monthOfBirth(CConstants.JULY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lPrivatPositions).picturePath(CConstants.PICTURE_GUINGAMP_PRIVAT).build();
        CPlayerEntity lBriand = new CPlayerEntity.CPlayerBuilder().firstName("jimmy").lastName(CConstants.NAME_GUINGAMP_BRIAND).team(lEagFromDb).dayOfBirth(2).monthOfBirth(CConstants.AUGUST).yearOfBirth(1985).country(CConstants.FRANCE).positions(lBriandPositions).picturePath(CConstants.PICTURE_GUINGAMP_BRIAND).build();
        CPlayerEntity lMartinet = new CPlayerEntity.CPlayerBuilder().firstName("sullivan").lastName(CConstants.NAME_GUINGAMP_MARTINET).team(lEagFromDb).dayOfBirth(1).monthOfBirth(CConstants.JULY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMartinetPositions).picturePath(CConstants.PICTURE_GUINGAMP_MARTINET).build();
        CPlayerEntity lMendyGuingamp = new CPlayerEntity.CPlayerBuilder().firstName("alexandre").lastName(CConstants.NAME_GUINGAMP_MENDY).team(lEagFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lMendyGuingampPositions).picturePath(CConstants.PICTURE_GUINGAMP_MENDY).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJohnsson);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSalin);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGuivarch);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarcal);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMane);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKerbrat);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSorbon);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMartinsPereira);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAngoua);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeveque);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLemaitre);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lIkoko);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSankoh);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSalibur);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDeaux);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGiresse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloGuingamp);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenezet);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCoco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDePauw);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLivolant);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBlas);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBriand);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPrivat);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendyGuingamp);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMartinet);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDidot);
            lCrudMethods.commitTransaction();
        }

        // LORIENT

        List<CPositionEntity> lLecomtePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDelecroixPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCianiPositions = new ArrayList<CPositionEntity>();
        lCianiPositions.add(lCb);

        List<CPositionEntity> lLamongePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBellugouPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMoreiraPositions = new ArrayList<CPositionEntity>();
        lMoreiraPositions.add(lRb);

        List<CPositionEntity> lContePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLautoaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeGoffPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMazikouPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPayePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRosePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKoffiPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSelemaniPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lToureLorientPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBarthelmePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBenKhemisPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMvuembaPositions = new ArrayList<CPositionEntity>();
        lMvuembaPositions.add(lCm);

        List<CPositionEntity> lCabotPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCafuPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMaraPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMarveauxPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMesloubPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNdongPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPhilippoteauxPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lFofanaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lJeannotPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMoukandjoPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lWarisPositions = new ArrayList<CPositionEntity>();


        CPlayerEntity lLecomte = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_LORIENT_LECOMTE).team(lLorientFromDb).dayOfBirth(26).monthOfBirth(CConstants.APRIL).yearOfBirth(1991).country(CConstants.FRANCE).positions(lLecomtePositions).picturePath(CConstants.PICTURE_LORIENT_LECOMTE).build();
        CPlayerEntity lDelecroix = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_LORIENT_DELECROIX).team(lLorientFromDb).dayOfBirth(14).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lDelecroixPositions).picturePath(CConstants.PICTURE_LORIENT_DELECROIX).build();
        CPlayerEntity lLamonge = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_LORIENT_LAMONGE).team(lLorientFromDb).dayOfBirth(10).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lLamongePositions).picturePath(CConstants.PICTURE_LORIENT_LAMONGE).build();

        CPlayerEntity lBellugou = new CPlayerEntity.CPlayerBuilder().firstName("francois").lastName(CConstants.NAME_LORIENT_BELLUGOU).team(lLorientFromDb).dayOfBirth(25).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lBellugouPositions).picturePath(CConstants.PICTURE_LORIENT_BELLUGOU).build();
        CPlayerEntity lConte = new CPlayerEntity.CPlayerBuilder().firstName("ibrahima").lastName(CConstants.NAME_LORIENT_CONTE).team(lLorientFromDb).dayOfBirth(3).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.GUINEA).positions(lContePositions).picturePath(CConstants.PICTURE_LORIENT_CONTE).build();
        CPlayerEntity lLautoa = new CPlayerEntity.CPlayerBuilder().firstName("wesley").lastName(CConstants.NAME_LORIENT_LAUTOA).team(lLorientFromDb).dayOfBirth(25).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLautoaPositions).picturePath(CConstants.PICTURE_LORIENT_LAUTOA).build();
        CPlayerEntity lLeGoff = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_LORIENT_LEGOFF).team(lLorientFromDb).dayOfBirth(10).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLeGoffPositions).picturePath(CConstants.PICTURE_LORIENT_LEGOFF).build();
        CPlayerEntity lMazikou = new CPlayerEntity.CPlayerBuilder().firstName("bradley").lastName(CConstants.NAME_LORIENT_MAZIKOU).team(lLorientFromDb).dayOfBirth(2).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMazikouPositions).picturePath(CConstants.PICTURE_LORIENT_MAZIKOU).build();
        CPlayerEntity lPaye = new CPlayerEntity.CPlayerBuilder().firstName("pape abdou").lastName(CConstants.NAME_LORIENT_PAYE).team(lLorientFromDb).dayOfBirth(31).monthOfBirth(CConstants.MAY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lPayePositions).picturePath(CConstants.PICTURE_LORIENT_PAYE).build();
        CPlayerEntity lRose = new CPlayerEntity.CPlayerBuilder().firstName("lindsay").lastName(CConstants.NAME_LORIENT_ROSE).team(lLorientFromDb).dayOfBirth(8).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lRosePositions).picturePath(CConstants.PICTURE_LORIENT_ROSE).build();
        CPlayerEntity lSelemani = new CPlayerEntity.CPlayerBuilder().firstName("faiz").lastName(CConstants.NAME_LORIENT_SELEMANI).team(lLorientFromDb).dayOfBirth(14).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lSelemaniPositions).picturePath(CConstants.PICTURE_LORIENT_SELEMANI).build();
        CPlayerEntity lToureLorient = new CPlayerEntity.CPlayerBuilder().firstName("zargo").lastName(CConstants.NAME_LORIENT_TOURE).team(lLorientFromDb).dayOfBirth(11).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1989).country(CConstants.SENEGAL).positions(lToureLorientPositions).picturePath(CConstants.PICTURE_LORIENT_TOURE).build();
        CPlayerEntity lKoffi = new CPlayerEntity.CPlayerBuilder().firstName("").lastName(CConstants.NAME_LORIENT_KOFFI).team(lLorientFromDb).dayOfBirth(1).monthOfBirth(1).yearOfBirth(1980).picturePath(CConstants.PICTURE_LORIENT_KOFFI).country(CConstants.FRANCE).positions(lKoffiPositions).picturePath(CConstants.PICTURE_LORIENT_KOFFI).build();
        CPlayerEntity lMoreira = new CPlayerEntity.CPlayerBuilder().firstName("steven").lastName(CConstants.NAME_LORIENT_MOREIRA).team(lLorientFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.FRANCE).positions(lMoreiraPositions).picturePath(CConstants.PICTURE_LORIENT_MOREIRA).build();
        CPlayerEntity lCiani = new CPlayerEntity.CPlayerBuilder().firstName("michael").lastName(CConstants.NAME_LORIENT_CIANI).team(lLorientFromDb).dayOfBirth(6).monthOfBirth(CConstants.APRIL).yearOfBirth(1984).country(CConstants.FRANCE).positions(lCianiPositions).picturePath(CConstants.PICTURE_LORIENT_CIANI).build();



        CPlayerEntity lBarthelme = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_LORIENT_BARTHELME).team(lLorientFromDb).dayOfBirth(8).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lBarthelmePositions).picturePath(CConstants.PICTURE_LORIENT_BARTHELME).build();
        CPlayerEntity lBenKhemis = new CPlayerEntity.CPlayerBuilder().firstName("issam").lastName(CConstants.NAME_LORIENT_BENKHEMIS).team(lLorientFromDb).dayOfBirth(10).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBenKhemisPositions).picturePath(CConstants.PICTURE_LORIENT_BENKHEMIS).build();
        CPlayerEntity lCabot = new CPlayerEntity.CPlayerBuilder().firstName("jimmy").lastName(CConstants.NAME_LORIENT_CABOT).team(lLorientFromDb).dayOfBirth(18).monthOfBirth(CConstants.APRIL).yearOfBirth(1994).country(CConstants.FRANCE).positions(lCabotPositions).picturePath(CConstants.PICTURE_LORIENT_CABOT).build();
        CPlayerEntity lCafu = new CPlayerEntity.CPlayerBuilder().firstName("carlos miguel").lastName(CConstants.NAME_LORIENT_CAFU).team(lLorientFromDb).dayOfBirth(26).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1993).country(CConstants.PORTUGAL).positions(lCafuPositions).picturePath(CConstants.PICTURE_LORIENT_CAFU).build();
        CPlayerEntity lMara = new CPlayerEntity.CPlayerBuilder().firstName("mohamed").lastName(CConstants.NAME_LORIENT_MARA).team(lLorientFromDb).dayOfBirth(12).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMaraPositions).picturePath(CConstants.PICTURE_LORIENT_MARA).build();
        CPlayerEntity lMarveaux = new CPlayerEntity.CPlayerBuilder().firstName("sylvain").lastName(CConstants.NAME_LORIENT_MARVEAUX).team(lLorientFromDb).dayOfBirth(15).monthOfBirth(CConstants.APRIL).yearOfBirth(1986).country(CConstants.FRANCE).positions(lMarveauxPositions).picturePath(CConstants.PICTURE_LORIENT_MARVEAUX).build();
        CPlayerEntity lMesloub = new CPlayerEntity.CPlayerBuilder().firstName("walid").lastName(CConstants.NAME_LORIENT_MESLOUB).team(lLorientFromDb).dayOfBirth(4).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1985).country(CConstants.FRANCE).positions(lMesloubPositions).picturePath(CConstants.PICTURE_LORIENT_MESLOUB).build();
        CPlayerEntity lNdong = new CPlayerEntity.CPlayerBuilder().firstName("didier").lastName(CConstants.NAME_LORIENT_NDONG).team(lLorientFromDb).dayOfBirth(17).monthOfBirth(CConstants.JUNE).yearOfBirth(1994).country(CConstants.GABON).positions(lNdongPositions).picturePath(CConstants.PICTURE_LORIENT_NDONG).build();
        CPlayerEntity lPhilippoteaux = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_LORIENT_PHILIPPOTEAUX).team(lLorientFromDb).dayOfBirth(2).monthOfBirth(CConstants.MARCH).yearOfBirth(1988).country(CConstants.FRANCE).positions(lPhilippoteauxPositions).picturePath(CConstants.PICTURE_LORIENT_PHILIPPOTEAUX).build();
        CPlayerEntity lMvuemba = new CPlayerEntity.CPlayerBuilder().firstName("arnold").lastName(CConstants.NAME_LORIENT_MVUEMBA).team(lLorientFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lMvuembaPositions).picturePath(CConstants.PICTURE_LORIENT_MVUEMBA).build();


        CPlayerEntity lFofana = new CPlayerEntity.CPlayerBuilder().firstName("moryke").lastName(CConstants.NAME_LORIENT_FOFANA).team(lLorientFromDb).dayOfBirth(23).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1991).country(CConstants.IVORYCOAST).positions(lFofanaPositions).picturePath(CConstants.PICTURE_LORIENT_FOFANA).build();
        CPlayerEntity lJeannot = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_LORIENT_JEANNOT).team(lLorientFromDb).dayOfBirth(22).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lJeannotPositions).picturePath(CConstants.PICTURE_LORIENT_JEANNOT).build();
        CPlayerEntity lMoukandjo = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_LORIENT_MOUKANDJO).team(lLorientFromDb).dayOfBirth(12).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.CAMEROUN).positions(lMoukandjoPositions).picturePath(CConstants.PICTURE_LORIENT_MOUKANDJO).build();
        CPlayerEntity lWaris = new CPlayerEntity.CPlayerBuilder().firstName("majeed").lastName(CConstants.NAME_LORIENT_WARIS).team(lLorientFromDb).dayOfBirth(19).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1991).country(CConstants.GHANA).positions(lWarisPositions).picturePath(CConstants.PICTURE_LORIENT_WARIS).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLecomte);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDelecroix);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLamonge);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBellugou);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lConte);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLautoa);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeGoff);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMazikou);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPaye);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRose);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSelemani);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToureLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBarthelme);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenKhemis);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCabot);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCafu);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMara);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMoreira);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarveaux);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMesloub);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdong);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPhilippoteaux);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFofana);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJeannot);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMoukandjo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lWaris);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKoffi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMvuemba);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCiani);
            lCrudMethods.commitTransaction();
        }

        // LOSC

        List<CPositionEntity> lEneyamaPositions = new ArrayList<CPositionEntity>();
        lEneyamaPositions.add(lGk);

        List<CPositionEntity> lMaignanPositions = new ArrayList<CPositionEntity>();
        lMaignanPositions.add(lGk);

        List<CPositionEntity> lButezPositions = new ArrayList<CPositionEntity>();
        lButezPositions.add(lGk);


        List<CPositionEntity> lCorchiaPositions = new ArrayList<CPositionEntity>();
        lCorchiaPositions.add(lRb);
        lCorchiaPositions.add(lRm);

        List<CPositionEntity> lCivelliPositions = new ArrayList<CPositionEntity>();
        lCivelliPositions.add(lCb);

        List<CPositionEntity> lBasaPositions = new ArrayList<CPositionEntity>();
        lBasaPositions.add(lCb);

        List<CPositionEntity> lPavardPositions = new ArrayList<CPositionEntity>();
        lPavardPositions.add(lCb);
        lPavardPositions.add(lRb);

        List<CPositionEntity> lSoumaoroPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBeriaPositions = new ArrayList<CPositionEntity>();
        lBeriaPositions.add(lLb);

        List<CPositionEntity> lSunzuPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKonePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPalmieriPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMendylPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lArcusPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lSankharePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lObbadiPositions = new ArrayList<CPositionEntity>();
        lObbadiPositions.add(lCdm);
        lObbadiPositions.add(lCm);

        List<CPositionEntity> lLopesPositions = new ArrayList<CPositionEntity>();
        lLopesPositions.add(lCam);
        lLopesPositions.add(lRw);

        List<CPositionEntity> lBoufalPositions = new ArrayList<CPositionEntity>();
        lBoufalPositions.add(lCam);
        lBoufalPositions.add(lLw);

        List<CPositionEntity> lAmadouPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAmalfitanoLoscPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBautheacPositions = new ArrayList<CPositionEntity>();
        lBautheacPositions.add(lLm);
        lBautheacPositions.add(lLw);

        List<CPositionEntity> lMavubaPositions = new ArrayList<CPositionEntity>();
        lMavubaPositions.add(lCm);
        lMavubaPositions.add(lCdm);

        List<CPositionEntity> lBissoumaPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lBenziaPositions = new ArrayList<CPositionEntity>();
        lBenziaPositions.add(lSt);

        List<CPositionEntity> lTalloPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lEderPositions = new ArrayList<CPositionEntity>();
        lEderPositions.add(lSt);

        List<CPositionEntity> lMendesPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTerrierPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMothibaPositions = new ArrayList<CPositionEntity>();


        CPlayerEntity lEneyama = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_LOSC_ENEYAMA).team(lLoscFromDb).dayOfBirth(29).monthOfBirth(CConstants.AUGUST).yearOfBirth(1982).country(CConstants.NIGERIA).positions(lEneyamaPositions).picturePath(CConstants.PICTURE_LOSC_ENEYAMA).build();
        CPlayerEntity lMaignan = new CPlayerEntity.CPlayerBuilder().firstName("mike").lastName(CConstants.NAME_LOSC_MAIGNAN).team(lLoscFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lMaignanPositions).picturePath(CConstants.PICTURE_LOSC_MAIGNAN).build();
        CPlayerEntity lButez = new CPlayerEntity.CPlayerBuilder().firstName("jean").lastName(CConstants.NAME_LOSC_BUTEZ).team(lLoscFromDb).dayOfBirth(8).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.FRANCE).positions(lButezPositions).picturePath(CConstants.PICTURE_LOSC_BUTEZ).build();

        CPlayerEntity lCorchia = new CPlayerEntity.CPlayerBuilder().firstName("sebastian").lastName(CConstants.NAME_LOSC_CORCHIA).team(lLoscFromDb).dayOfBirth(1).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lCorchiaPositions).picturePath(CConstants.PICTURE_LOSC_CORCHIA).build();
        CPlayerEntity lKone = new CPlayerEntity.CPlayerBuilder().firstName("youssouf").lastName(CConstants.NAME_LOSC_KONE).team(lLoscFromDb).dayOfBirth(5).monthOfBirth(CConstants.JULY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKonePositions).picturePath(CConstants.PICTURE_LOSC_KONE).build();
        CPlayerEntity lCivelli = new CPlayerEntity.CPlayerBuilder().firstName("renato").lastName(CConstants.NAME_LOSC_CIVELLI).team(lLoscFromDb).dayOfBirth(14).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1983).country(CConstants.FRANCE).positions(lCivelliPositions).picturePath(CConstants.PICTURE_LOSC_CIVELLI).build();
        CPlayerEntity lSunzu = new CPlayerEntity.CPlayerBuilder().firstName("stoppila").lastName(CConstants.NAME_LOSC_SUNZU).team(lLoscFromDb).dayOfBirth(22).monthOfBirth(CConstants.JUNE).yearOfBirth(1989).country(CConstants.ZAMBIE).positions(lSunzuPositions).picturePath(CConstants.PICTURE_LOSC_SUNZU).build();
        CPlayerEntity lPalmieri = new CPlayerEntity.CPlayerBuilder().firstName("julian").lastName(CConstants.NAME_LOSC_PALMIERI).team(lLoscFromDb).dayOfBirth(7).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1986).country(CConstants.FRANCE).positions(lPalmieriPositions).picturePath(CConstants.PICTURE_LOSC_PALMIERI).build();
        CPlayerEntity lBeria = new CPlayerEntity.CPlayerBuilder().firstName("franck").lastName(CConstants.NAME_LOSC_BERIA).team(lLoscFromDb).dayOfBirth(23).monthOfBirth(CConstants.MAY).yearOfBirth(1983).country(CConstants.FRANCE).positions(lBeriaPositions).picturePath(CConstants.PICTURE_LOSC_BERIA).build();
        CPlayerEntity lSoumaoro = new CPlayerEntity.CPlayerBuilder().firstName("adama").lastName(CConstants.NAME_LOSC_SOUMAORO).team(lLoscFromDb).dayOfBirth(18).monthOfBirth(CConstants.JUNE).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSoumaoroPositions).picturePath(CConstants.PICTURE_LOSC_SOUMAORO).build();
        CPlayerEntity lBasa = new CPlayerEntity.CPlayerBuilder().firstName("marko").lastName(CConstants.NAME_LOSC_BASA).team(lLoscFromDb).dayOfBirth(29).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1982).country(CConstants.MONTENEGRO).positions(lBasaPositions).picturePath(CConstants.PICTURE_LOSC_BASA).build();
        CPlayerEntity lPavard = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_LOSC_PAVARD).team(lLoscFromDb).dayOfBirth(28).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.FRANCE).positions(lPavardPositions).picturePath(CConstants.PICTURE_LOSC_PAVARD).build();
        CPlayerEntity lMendyl = new CPlayerEntity.CPlayerBuilder().firstName("hamza").lastName(CConstants.NAME_LOSC_MENDYL).team(lLoscFromDb).dayOfBirth(21).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1997).country(CConstants.MOROCCO).positions(lMendylPositions).picturePath(CConstants.PICTURE_LOSC_MENDYL).build();
        CPlayerEntity lArcus = new CPlayerEntity.CPlayerBuilder().firstName("carlens").lastName(CConstants.NAME_LOSC_ARCUS).team(lLoscFromDb).dayOfBirth(20).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.HAITI).positions(lArcusPositions).picturePath(CConstants.PICTURE_LOSC_ARCUS).build();

        CPlayerEntity lSankhare = new CPlayerEntity.CPlayerBuilder().firstName("younousse").lastName(CConstants.NAME_LOSC_SANKHARE).team(lLoscFromDb).dayOfBirth(10).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lSankharePositions).picturePath(CConstants.PICTURE_LOSC_SANKHARE).build();
        CPlayerEntity lAmadou = new CPlayerEntity.CPlayerBuilder().firstName("ibrahim").lastName(CConstants.NAME_LOSC_AMADOU).team(lLoscFromDb).dayOfBirth(6).monthOfBirth(CConstants.APRIL).yearOfBirth(1993).country(CConstants.CAMEROUN).positions(lAmadouPositions).picturePath(CConstants.PICTURE_LOSC_AMADOU).build();
        CPlayerEntity lBoufal = new CPlayerEntity.CPlayerBuilder().firstName("sofiane").lastName(CConstants.NAME_LOSC_BOUFAL).team(lLoscFromDb).dayOfBirth(17).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lBoufalPositions).picturePath(CConstants.PICTURE_LOSC_BOUFAL).build();
        CPlayerEntity lObbadi = new CPlayerEntity.CPlayerBuilder().firstName("mounir").lastName(CConstants.NAME_LOSC_OBBADI).team(lLoscFromDb).dayOfBirth(4).monthOfBirth(CConstants.APRIL).yearOfBirth(1983).country(CConstants.MOROCCO).positions(lObbadiPositions).picturePath(CConstants.PICTURE_LOSC_OBBADI).build();
        CPlayerEntity lAmalfitanoLosc = new CPlayerEntity.CPlayerBuilder().firstName("morgan").lastName(CConstants.NAME_LOSC_AMALFITANO).team(lLoscFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1985).country(CConstants.FRANCE).positions(lAmalfitanoLoscPositions).picturePath(CConstants.PICTURE_LOSC_AMALFITANO).build();
        CPlayerEntity lBautheac = new CPlayerEntity.CPlayerBuilder().firstName("eric").lastName(CConstants.NAME_LOSC_BAUTHEAC).team(lLoscFromDb).dayOfBirth(24).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lBautheacPositions).picturePath(CConstants.PICTURE_LOSC_BAUTHEAC).build();
        CPlayerEntity lLopes = new CPlayerEntity.CPlayerBuilder().firstName("rony").lastName(CConstants.NAME_LOSC_LOPES).team(lLoscFromDb).dayOfBirth(28).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1995).country(CConstants.PORTUGAL).positions(lLopesPositions).picturePath(CConstants.PICTURE_LOSC_LOPES).build();
        CPlayerEntity lMavuba = new CPlayerEntity.CPlayerBuilder().firstName("rio").lastName(CConstants.NAME_LOSC_MAVUBA).team(lLoscFromDb).dayOfBirth(8).monthOfBirth(CConstants.MARCH).yearOfBirth(1984).country(CConstants.FRANCE).positions(lMavubaPositions).picturePath(CConstants.PICTURE_LOSC_MAVUBA).build();
        CPlayerEntity lBissouma = new CPlayerEntity.CPlayerBuilder().firstName("yves").lastName(CConstants.NAME_LOSC_BISSOUMA).team(lLoscFromDb).dayOfBirth(30).monthOfBirth(CConstants.AUGUST).yearOfBirth(1996).country(CConstants.MALI).positions(lBissoumaPositions).picturePath(CConstants.PICTURE_LOSC_BISSOUMA).build();

        CPlayerEntity lBenzia = new CPlayerEntity.CPlayerBuilder().firstName("yassine").lastName(CConstants.NAME_LOSC_BENZIA).team(lLoscFromDb).dayOfBirth(8).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lBenziaPositions).picturePath(CConstants.PICTURE_LOSC_BENZIA).build();
        CPlayerEntity lTallo = new CPlayerEntity.CPlayerBuilder().firstName("junior").lastName(CConstants.NAME_LOSC_TALLO).team(lLoscFromDb).dayOfBirth(21).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lTalloPositions).picturePath(CConstants.PICTURE_LOSC_TALLO).build();
        CPlayerEntity lEder = new CPlayerEntity.CPlayerBuilder().firstName("eder").lastName(CConstants.NAME_LOSC_EDER).team(lLoscFromDb).dayOfBirth(22).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1987).country(CConstants.PORTUGAL).positions(lEderPositions).picturePath(CConstants.PICTURE_LOSC_EDER).build();
        CPlayerEntity lMendes = new CPlayerEntity.CPlayerBuilder().firstName("ryan").lastName(CConstants.NAME_LOSC_MENDES).team(lLoscFromDb).dayOfBirth(8).monthOfBirth(CConstants.JANUARY).yearOfBirth(1990).country(CConstants.CAPVERT).positions(lMendesPositions).picturePath(CConstants.PICTURE_LOSC_MENDES).build();
        CPlayerEntity lTerrier = new CPlayerEntity.CPlayerBuilder().firstName("martin").lastName(CConstants.NAME_LOSC_TERRIER).team(lLoscFromDb).dayOfBirth(4).monthOfBirth(CConstants.MARCH).yearOfBirth(1997).country(CConstants.FRANCE).positions(lTerrierPositions).picturePath(CConstants.PICTURE_LOSC_TERRIER).build();
        CPlayerEntity lMothiba = new CPlayerEntity.CPlayerBuilder().firstName("lebo").lastName(CConstants.NAME_LOSC_MOTHIBA).team(lLoscFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.SOUTHAFRICA).positions(lMothibaPositions).picturePath(CConstants.PICTURE_LOSC_MOTHIBA).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEneyama);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaignan);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lButez);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCivelli);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCorchia);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBeria);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBasa);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPavard);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSoumaoro);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAmadou);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSunzu);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoufal);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLopes);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBautheac);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMavuba);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lObbadi);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEder);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendes);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenzia);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPalmieri);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendyl);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lArcus);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKone);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSankhare);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBissouma);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAmalfitanoLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTallo);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMothiba);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTerrier);
            lCrudMethods.commitTransaction();
        }

        // METZ

        List<CPositionEntity> lKawashimaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDidillonPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lOberhauserPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lAssouEkotoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lRivierezPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPhilippsPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMilanPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lFalettePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lUdolPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSignorinoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSelimovicPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBalliuPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lIkaunieksPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSaliuPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSidoMetzPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lHeinPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lJouffrePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDoukourePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMandjeckPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMolletPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLarrierePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLejeunePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCohadePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSarrPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lThillPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNsorPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVionPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lErdingPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNguettePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDialloMetzPositions = new ArrayList<CPositionEntity>();


        // players

        CPlayerEntity lKawashima = new CPlayerEntity.CPlayerBuilder().firstName("eiji").lastName(CConstants.NAME_METZ_KAWASHIMA).team(lMetzFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1983).country(CConstants.JAPAN).positions(lKawashimaPositions).picturePath(CConstants.PICTURE_METZ_KAWASHIMA).build();
        CPlayerEntity lDidillon = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_METZ_DIDILLON).team(lMetzFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lDidillonPositions).picturePath(CConstants.PICTURE_METZ_DIDILLON).build();
        CPlayerEntity lOberhauser = new CPlayerEntity.CPlayerBuilder().firstName("david").lastName(CConstants.NAME_METZ_OBERHAUSER).team(lMetzFromDb).dayOfBirth(29).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lOberhauserPositions).picturePath(CConstants.PICTURE_METZ_OBERHAUSER).build();

        CPlayerEntity lAssouEkoto = new CPlayerEntity.CPlayerBuilder().firstName("benoit").lastName(CConstants.NAME_METZ_ASSOUEKOTTO).team(lMetzFromDb).dayOfBirth(24).monthOfBirth(CConstants.MARCH).yearOfBirth(1984).country(CConstants.FRANCE).positions(lAssouEkotoPositions).picturePath(CConstants.PICTURE_METZ_ASSOUEKOTTO).build();
        CPlayerEntity lRivierez = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_METZ_RIVIEREZ).team(lMetzFromDb).dayOfBirth(18).monthOfBirth(CConstants.MAY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lRivierezPositions).picturePath(CConstants.PICTURE_METZ_RIVIEREZ).build();
        CPlayerEntity lPhilipps = new CPlayerEntity.CPlayerBuilder().firstName("chris").lastName(CConstants.NAME_METZ_PHILIPPS).team(lMetzFromDb).dayOfBirth(8).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.LUXEMBOURG).positions(lPhilippsPositions).picturePath(CConstants.PICTURE_METZ_PHILIPPS).build();
        CPlayerEntity lMilan = new CPlayerEntity.CPlayerBuilder().firstName("guido").lastName(CConstants.NAME_METZ_MILAN).team(lMetzFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1987).country(CConstants.ARGENTINA).positions(lMilanPositions).picturePath(CConstants.PICTURE_METZ_MILAN).build();
        CPlayerEntity lFalette = new CPlayerEntity.CPlayerBuilder().firstName("simon").lastName(CConstants.NAME_METZ_FALETTE).team(lMetzFromDb).dayOfBirth(19).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lFalettePositions).picturePath(CConstants.PICTURE_METZ_FALETTE).build();
        CPlayerEntity lUdol = new CPlayerEntity.CPlayerBuilder().firstName("matthieu").lastName(CConstants.NAME_METZ_UDOL).team(lMetzFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.FRANCE).positions(lUdolPositions).picturePath(CConstants.PICTURE_METZ_UDOL).build();
        CPlayerEntity lSignorino = new CPlayerEntity.CPlayerBuilder().firstName("franck").lastName(CConstants.NAME_METZ_SIGNORINO).team(lMetzFromDb).dayOfBirth(19).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lSignorinoPositions).picturePath(CConstants.PICTURE_METZ_SIGNORINO).build();
        CPlayerEntity lSelimovic = new CPlayerEntity.CPlayerBuilder().firstName("vahid").lastName(CConstants.NAME_METZ_SELIMOVIC).team(lMetzFromDb).dayOfBirth(3).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.LUXEMBOURG).positions(lSelimovicPositions).picturePath(CConstants.PICTURE_METZ_SELIMOVIC).build();
        CPlayerEntity lBalliu = new CPlayerEntity.CPlayerBuilder().firstName("ivan").lastName(CConstants.NAME_METZ_BALLIU).team(lMetzFromDb).dayOfBirth(1).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.SPAIN).positions(lBalliuPositions).picturePath(CConstants.PICTURE_METZ_BALLIU).build();
        CPlayerEntity lIkaunieks = new CPlayerEntity.CPlayerBuilder().firstName("janis").lastName(CConstants.NAME_METZ_IKAUNIEKS).team(lMetzFromDb).dayOfBirth(16).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.LATVIA).positions(lIkaunieksPositions).picturePath(CConstants.PICTURE_METZ_IKAUNIEKS).build();
        CPlayerEntity lSaliu = new CPlayerEntity.CPlayerBuilder().firstName("popoola").lastName(CConstants.NAME_METZ_SALIU).team(lMetzFromDb).dayOfBirth(7).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.NIGERIA).positions(lSaliuPositions).picturePath(CConstants.PICTURE_METZ_SALIU).build();
        CPlayerEntity lSidoMetz = new CPlayerEntity.CPlayerBuilder().firstName("fadil").lastName(CConstants.NAME_METZ_SIDO).team(lMetzFromDb).dayOfBirth(13).monthOfBirth(CConstants.APRIL).yearOfBirth(1993).country(CConstants.BURKINAFASO).positions(lSidoMetzPositions).picturePath(CConstants.PICTURE_METZ_SIDO).build();
        CPlayerEntity lHein = new CPlayerEntity.CPlayerBuilder().firstName("gauthier").lastName(CConstants.NAME_METZ_HEIN).team(lMetzFromDb).dayOfBirth(7).monthOfBirth(CConstants.AUGUST).yearOfBirth(1996).country(CConstants.FRANCE).positions(lHeinPositions).picturePath(CConstants.PICTURE_METZ_HEIN).build();
        CPlayerEntity lJouffre = new CPlayerEntity.CPlayerBuilder().firstName("yann").lastName(CConstants.NAME_METZ_JOUFFRE).team(lMetzFromDb).dayOfBirth(23).monthOfBirth(CConstants.JULY).yearOfBirth(1984).country(CConstants.FRANCE).positions(lJouffrePositions).picturePath(CConstants.PICTURE_METZ_JOUFFRE).build();
        CPlayerEntity lDoukoure = new CPlayerEntity.CPlayerBuilder().firstName("cheick").lastName(CConstants.NAME_METZ_DOUKOURE).team(lMetzFromDb).dayOfBirth(11).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lDoukourePositions).picturePath(CConstants.PICTURE_METZ_DOUKOURE).build();
        CPlayerEntity lMandjeck = new CPlayerEntity.CPlayerBuilder().firstName("georges").lastName(CConstants.NAME_METZ_MANDJECK).team(lMetzFromDb).dayOfBirth(9).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1988).country(CConstants.CAMEROUN).positions(lMandjeckPositions).picturePath(CConstants.PICTURE_METZ_MANDJECK).build();
        CPlayerEntity lMollet = new CPlayerEntity.CPlayerBuilder().firstName("florent").lastName(CConstants.NAME_METZ_MOLLET).team(lMetzFromDb).dayOfBirth(19).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lMolletPositions).picturePath(CConstants.PICTURE_METZ_MOLLET).build();
        CPlayerEntity lLarriere = new CPlayerEntity.CPlayerBuilder().firstName("alexis").lastName(CConstants.NAME_METZ_LARRIERE).team(lMetzFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1997).country(CConstants.FRANCE).positions(lLarrierePositions).picturePath(CConstants.PICTURE_METZ_LARRIERE).build();
        CPlayerEntity lLejeune = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_METZ_LEJEUNE).team(lMetzFromDb).dayOfBirth(22).monthOfBirth(CConstants.JANUARY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lLejeunePositions).picturePath(CConstants.PICTURE_METZ_LEJEUNE).build();
        CPlayerEntity lCohade = new CPlayerEntity.CPlayerBuilder().firstName("renaud").lastName(CConstants.NAME_METZ_COHADE).team(lMetzFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1984).country(CConstants.FRANCE).positions(lCohadePositions).picturePath(CConstants.PICTURE_METZ_COHADE).build();
        CPlayerEntity lSarr = new CPlayerEntity.CPlayerBuilder().firstName("ismaila").lastName(CConstants.NAME_METZ_SARR).team(lMetzFromDb).dayOfBirth(25).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1998).country(CConstants.SENEGAL).positions(lSarrPositions).picturePath(CConstants.PICTURE_METZ_SARR).build();
        CPlayerEntity lThill = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_METZ_THILL).team(lMetzFromDb).dayOfBirth(4).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(2000).country(CConstants.LUXEMBOURG).positions(lThillPositions).picturePath(CConstants.PICTURE_METZ_THILL).build();
        CPlayerEntity lNsor = new CPlayerEntity.CPlayerBuilder().firstName("kwame").lastName(CConstants.NAME_METZ_NSOR).team(lMetzFromDb).dayOfBirth(1).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.GHANA).positions(lNsorPositions).picturePath(CConstants.PICTURE_METZ_NSOR).build();
        CPlayerEntity lVion = new CPlayerEntity.CPlayerBuilder().firstName("thibaut").lastName(CConstants.NAME_METZ_VION).team(lMetzFromDb).dayOfBirth(11).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lVionPositions).picturePath(CConstants.PICTURE_METZ_VION).build();
        CPlayerEntity lErding = new CPlayerEntity.CPlayerBuilder().firstName("mevlut").lastName(CConstants.NAME_METZ_ERDING).team(lMetzFromDb).dayOfBirth(25).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1987).country(CConstants.TURKEY).positions(lErdingPositions).picturePath(CConstants.PICTURE_METZ_ERDING).build();
        CPlayerEntity lNguette = new CPlayerEntity.CPlayerBuilder().firstName("opa").lastName(CConstants.NAME_METZ_NGUETTE).team(lMetzFromDb).dayOfBirth(8).monthOfBirth(CConstants.JULY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lNguettePositions).picturePath(CConstants.PICTURE_METZ_NGUETTE).build();
        CPlayerEntity lDialloMetz = new CPlayerEntity.CPlayerBuilder().firstName("habib").lastName(CConstants.NAME_RENNES_DIALLO).team(lMetzFromDb).dayOfBirth(15).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.SENEGAL).positions(lDialloMetzPositions).picturePath(CConstants.PICTURE_METZ_DIALLO).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDidillon);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKawashima);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lOberhauser);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAssouEkoto);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRivierez);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBalliu);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaliu);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPhilipps);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMilan);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lUdol);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFalette);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSignorino);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSelimovic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lIkaunieks);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSidoMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHein);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDoukoure);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJouffre);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMandjeck);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCohade);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMollet);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLarriere);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLejeune);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSarr);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lThill);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNsor);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVion);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNguette);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lErding);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloMetz);
            lCrudMethods.commitTransaction();
        }

        // MONTPELLIER

        List<CPositionEntity> lPionnierPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lJourdrenPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLigaliPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNdiayePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCongrePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lHiltonPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSaintRufPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVandenBorrePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lRemyPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lRoussillonPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDeplagnePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lGissiPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMarveauxMhscPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLasnePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSansonPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBoudebouzPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSkhiriPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lFitoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lKSansonPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBerigaudPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMouniePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCamaraPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNingaPositions = new ArrayList<CPositionEntity>();

        // players

        // gk
        CPlayerEntity lPionnier = new CPlayerEntity.CPlayerBuilder().firstName("laurent").lastName(CConstants.NAME_MHSC_PIONNIER).team(lMhscFromDb).dayOfBirth(24).monthOfBirth(CConstants.MAY).yearOfBirth(1982).country(CConstants.FRANCE).positions(lPionnierPositions).picturePath(CConstants.PICTURE_MHSC_PIONNIER).build();
        CPlayerEntity lJourdren = new CPlayerEntity.CPlayerBuilder().firstName("geoffrey").lastName(CConstants.NAME_MHSC_JOURDREN).team(lMhscFromDb).dayOfBirth(4).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lJourdrenPositions).picturePath(CConstants.PICTURE_MHSC_JOURDREN).build();
        CPlayerEntity lLigali = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_MHSC_LIGALI).team(lMhscFromDb).dayOfBirth(28).monthOfBirth(CConstants.MAY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lLigaliPositions).picturePath(CConstants.PICTURE_MHSC_LIGALI).build();

        // defenders

        CPlayerEntity lNdiaye = new CPlayerEntity.CPlayerBuilder().firstName("mamadou").lastName(CConstants.NAME_MHSC_NDIAYE).team(lMhscFromDb).dayOfBirth(28).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.SENEGAL).positions(lNdiayePositions).picturePath(CConstants.PICTURE_MHSC_NDIAYE).build();
        CPlayerEntity lCongre = new CPlayerEntity.CPlayerBuilder().firstName("daniel").lastName(CConstants.NAME_MHSC_CONGRE).team(lMhscFromDb).dayOfBirth(5).monthOfBirth(CConstants.APRIL).yearOfBirth(1985).country(CConstants.FRANCE).positions(lCongrePositions).picturePath(CConstants.PICTURE_MHSC_CONGRE).build();
        CPlayerEntity lHilton = new CPlayerEntity.CPlayerBuilder().firstName("vitorino").lastName(CConstants.NAME_MHSC_HILTON).team(lMhscFromDb).dayOfBirth(13).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1977).country(CConstants.BRAZIL).positions(lHiltonPositions).picturePath(CConstants.PICTURE_MHSC_HILTON).build();
        CPlayerEntity lSaintRuf = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_MHSC_SAINTRUF).team(lMhscFromDb).dayOfBirth(24).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSaintRufPositions).picturePath(CConstants.PICTURE_MHSC_SAINTRUF).build();
        CPlayerEntity lVandenBorre = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_MHSC_VANDENBORRE).team(lMhscFromDb).dayOfBirth(24).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1987).country(CConstants.BELGIUM).positions(lVandenBorrePositions).picturePath(CConstants.PICTURE_MHSC_VANDENBORRE).build();
        CPlayerEntity lRemy = new CPlayerEntity.CPlayerBuilder().firstName("william").lastName(CConstants.NAME_MHSC_REMY).team(lMhscFromDb).dayOfBirth(4).monthOfBirth(CConstants.APRIL).yearOfBirth(1991).country(CConstants.FRANCE).positions(lRemyPositions).picturePath(CConstants.PICTURE_MHSC_REMY).build();
        CPlayerEntity lRoussillon = new CPlayerEntity.CPlayerBuilder().firstName("jerome").lastName(CConstants.NAME_MHSC_ROUSSILLON).team(lMhscFromDb).dayOfBirth(6).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lRoussillonPositions).picturePath(CConstants.PICTURE_MHSC_ROUSSILLON).build();
        CPlayerEntity lDeplagne = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_MHSC_DEPLAGNE).team(lMhscFromDb).dayOfBirth(1).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lDeplagnePositions).picturePath(CConstants.PICTURE_MHSC_DEPLAGNE).build();
        CPlayerEntity lGissi = new CPlayerEntity.CPlayerBuilder().firstName("dylan").lastName(CConstants.NAME_MHSC_GISSI).team(lMhscFromDb).dayOfBirth(27).monthOfBirth(CConstants.APRIL).yearOfBirth(1991).country(CConstants.ARGENTINA).positions(lGissiPositions).picturePath(CConstants.PICTURE_MHSC_GISSI).build();

        // midfielders

        CPlayerEntity lMarveauxMhsc = new CPlayerEntity.CPlayerBuilder().firstName("joris").lastName(CConstants.NAME_MHSC_MARVEAUX).team(lMhscFromDb).dayOfBirth(15).monthOfBirth(CConstants.AUGUST).yearOfBirth(1982).country(CConstants.FRANCE).positions(lMarveauxMhscPositions).picturePath(CConstants.PICTURE_MHSC_MARVEAUX).build();
        CPlayerEntity lLasne = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAMEE_MHSC_LASNE).team(lMhscFromDb).dayOfBirth(16).monthOfBirth(CConstants.JANUARY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLasnePositions).picturePath(CConstants.PICTURE_MHSC_LASNE).build();
        CPlayerEntity lSanson = new CPlayerEntity.CPlayerBuilder().firstName("morgan").lastName(CConstants.NAME_MHSC_SANSON).team(lMhscFromDb).dayOfBirth(18).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.FRANCE).positions(lSansonPositions).picturePath(CConstants.PICTURE_MHSC_SANSON).build();
        CPlayerEntity lBoudebouz = new CPlayerEntity.CPlayerBuilder().firstName("ryad").lastName(CConstants.NAME_MHSC_BOUDEBOUZ).team(lMhscFromDb).dayOfBirth(19).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lBoudebouzPositions).picturePath(CConstants.PICTURE_MHSC_BOUDEBOUZ).build();
        CPlayerEntity lSkhiri = new CPlayerEntity.CPlayerBuilder().firstName("ellyes").lastName(CConstants.NAME_MHSC_SKHIRI).team(lMhscFromDb).dayOfBirth(10).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lSkhiriPositions).picturePath(CConstants.PICTURE_MHSC_SKHIRI).build();
        CPlayerEntity lFito = new CPlayerEntity.CPlayerBuilder().firstName("pierrick").lastName(CConstants.NAME_MHSC_FITO).team(lMhscFromDb).dayOfBirth(1).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lFitoPositions).picturePath(CConstants.PICTURE_MHSC_FITO).build();
        CPlayerEntity lKSanson = new CPlayerEntity.CPlayerBuilder().firstName("killian").lastName(CConstants.NAME_MHSC_SANSON).team(lMhscFromDb).dayOfBirth(7).monthOfBirth(CConstants.JUNE).yearOfBirth(1997).country(CConstants.FRANCE).positions(lKSansonPositions).picturePath(CConstants.PICTURE_MHSC_KSANSON).build();

        // forwards

        CPlayerEntity lBerigaud = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_MHSC_BERIGAUD).team(lMhscFromDb).dayOfBirth(9).monthOfBirth(CConstants.MAY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lBerigaudPositions).picturePath(CConstants.PICTURE_MHSC_BERIGAUD).build();
        CPlayerEntity lMounie = new CPlayerEntity.CPlayerBuilder().firstName("steve").lastName(CConstants.NAME_MHSC_MOUNIE).team(lMhscFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lMouniePositions).picturePath(CConstants.PICTURE_MHSC_MOUNIE).build();
        CPlayerEntity lCamara = new CPlayerEntity.CPlayerBuilder().firstName("souleymane").lastName(CConstants.NAME_MHSC_CAMARA).team(lMhscFromDb).dayOfBirth(22).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1982).country(CConstants.SENEGAL).positions(lCamaraPositions).picturePath(CConstants.PICTURE_MHSC_CAMARA).build();
        CPlayerEntity lNinga = new CPlayerEntity.CPlayerBuilder().firstName("casimir").lastName(CConstants.NAME_MHSC_NINGA).team(lMhscFromDb).dayOfBirth(17).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.TCHAD).positions(lNingaPositions).picturePath(CConstants.PICTURE_MHSC_NINGA).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJourdren);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPionnier);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLigali);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdiaye);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCongre);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHilton);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaintRuf);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVandenBorre);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRemy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRoussillon);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDeplagne);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGissi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarveauxMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLasne);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSanson);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoudebouz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSkhiri);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKSanson);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFito);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBerigaud);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMounie);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCamara);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNinga);
            lCrudMethods.commitTransaction();
        }

        // NANCY

        List<CPositionEntity> lNdyAssembePositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lChernikPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMenayPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lLengletPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lBadilaPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lDiagnePositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lCuffautPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMaouassaPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lChretienPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lCabacoPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMuratoriPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lCetoutPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lDiarraPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lAitBennasserPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lRobicPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMarchettiPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lCoulibalyNancyPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lNguessanPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lGuidileyePositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lPuyoPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lPedrettiPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lDalePositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lDiaPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMandannePositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lHadjiPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMabellaPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lKouraPositions = new ArrayList<CPositionEntity>();



        CPlayerEntity lNdyAssembe = new CPlayerEntity.CPlayerBuilder().firstName("guy").lastName(CConstants.NAME_NANCY_NDYASSEMBE).team(lNancyFromDb).dayOfBirth(28).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lNdyAssembePositions).picturePath(CConstants.PICTURE_NANCY_NDYASSEMBE).build();
        CPlayerEntity lChernik = new CPlayerEntity.CPlayerBuilder().firstName("sergey").lastName(CConstants.NAME_NANCY_CHERNIK).team(lNancyFromDb).dayOfBirth(20).monthOfBirth(CConstants.JULY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lChernikPositions).picturePath(CConstants.PICTURE_NANCY_CHERNIK).build();
        CPlayerEntity lMenay= new CPlayerEntity.CPlayerBuilder().firstName("alexandre").lastName(CConstants.NAME_NANCY_MENAY).team(lNancyFromDb).dayOfBirth(5).monthOfBirth(CConstants.JULY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMenayPositions).picturePath(CConstants.PICTURE_NANCY_MENAY).build();

        CPlayerEntity lLenglet = new CPlayerEntity.CPlayerBuilder().firstName("clement").lastName(CConstants.NAME_NANCY_LENGLET).team(lNancyFromDb).dayOfBirth(17).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLengletPositions).picturePath(CConstants.PICTURE_NANCY_LENGLET).build();
        CPlayerEntity lBadila = new CPlayerEntity.CPlayerBuilder().firstName("tobias").lastName(CConstants.NAME_NANCY_BADILA).team(lNancyFromDb).dayOfBirth(12).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lBadilaPositions).picturePath(CConstants.PICTURE_NANCY_BADILA).build();
        CPlayerEntity lDiagne = new CPlayerEntity.CPlayerBuilder().firstName("modou").lastName(CConstants.NAME_NANCY_DIAGNE).team(lNancyFromDb).dayOfBirth(3).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lDiagnePositions).picturePath(CConstants.PICTURE_NANCY_DIAGNE).build();
        CPlayerEntity lCuffaut = new CPlayerEntity.CPlayerBuilder().firstName("joffrey").lastName(CConstants.NAME_NANCY_CUFFAUT).team(lNancyFromDb).dayOfBirth(15).monthOfBirth(CConstants.MARCH).yearOfBirth(1988).country(CConstants.FRANCE).positions(lCuffautPositions).picturePath(CConstants.PICTURE_NANCY_CUFFAUT).build();
        CPlayerEntity lMaouassa = new CPlayerEntity.CPlayerBuilder().firstName("faitout").lastName(CConstants.NAME_NANCY_MAOUASSA).team(lNancyFromDb).dayOfBirth(6).monthOfBirth(CConstants.JULY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lMaouassaPositions).picturePath(CConstants.PICTURE_NANCY_MAOUASSA).build();
        CPlayerEntity lChretien = new CPlayerEntity.CPlayerBuilder().firstName("michael").lastName(CConstants.NAME_NANCY_CHRETIEN).team(lNancyFromDb).dayOfBirth(10).monthOfBirth(CConstants.JULY).yearOfBirth(1984).country(CConstants.FRANCE).positions(lChretienPositions).picturePath(CConstants.PICTURE_NANCY_CHRETIEN).build();
        CPlayerEntity lCabaco = new CPlayerEntity.CPlayerBuilder().firstName("erick").lastName(CConstants.NAME_NANCY_CABACO).team(lNancyFromDb).dayOfBirth(19).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCabacoPositions).picturePath(CConstants.PICTURE_NANCY_CABACO).build();
        CPlayerEntity lMuratori = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_NANCY_MURATORI).team(lNancyFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lMuratoriPositions).picturePath(CConstants.PICTURE_NANCY_MURATORI).build();
        CPlayerEntity lCetout = new CPlayerEntity.CPlayerBuilder().firstName("julien").lastName(CConstants.NAME_NANCY_CETOUT).team(lNancyFromDb).dayOfBirth(2).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lCetoutPositions).picturePath(CConstants.PICTURE_NANCY_CETOUT).build();

        CPlayerEntity lDiarra = new CPlayerEntity.CPlayerBuilder().firstName("alou").lastName(CConstants.NAME_NANCY_DIARRA).team(lNancyFromDb).dayOfBirth(15).monthOfBirth(CConstants.JULY).yearOfBirth(1981).country(CConstants.FRANCE).positions(lDiarraPositions).picturePath(CConstants.PICTURE_NANCY_DIARRA).build();
        CPlayerEntity lAitBennasser = new CPlayerEntity.CPlayerBuilder().firstName("youssef").lastName(CConstants.NAME_NANCY_AITBENNASSER).team(lNancyFromDb).dayOfBirth(7).monthOfBirth(CConstants.JULY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lAitBennasserPositions).picturePath(CConstants.PICTURE_NANCY_AITBENNASSER).build();
        CPlayerEntity lRobic = new CPlayerEntity.CPlayerBuilder().firstName("antony").lastName(CConstants.NAME_NANCY_ROBIC).team(lNancyFromDb).dayOfBirth(5).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.FRANCE).positions(lRobicPositions).picturePath(CConstants.PICTURE_NANCY_ROBIC).build();
        CPlayerEntity lMarchetti = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_NANCY_MARCHETTI).team(lNancyFromDb).dayOfBirth(4).monthOfBirth(CConstants.JULY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lMarchettiPositions).picturePath(CConstants.PICTURE_NANCY_MARCHETTI).build();
        CPlayerEntity lCoulibalyNancy = new CPlayerEntity.CPlayerBuilder().firstName("karim").lastName(CConstants.NAME_NANCY_COULIBALY).team(lNancyFromDb).dayOfBirth(3).monthOfBirth(CConstants.JUNE).yearOfBirth(1993).country(CConstants.FRANCE).positions(lCoulibalyNancyPositions).picturePath(CConstants.PICTURE_NANCY_COULIBALY).build();
        CPlayerEntity lNguessan = new CPlayerEntity.CPlayerBuilder().firstName("serge").lastName(CConstants.NAME_NANCY_NGUESSAN).team(lNancyFromDb).dayOfBirth(31).monthOfBirth(CConstants.JULY).yearOfBirth(1994).country(CConstants.IVORYCOAST).positions(lNguessanPositions).picturePath(CConstants.PICTURE_NANCY_NGUESSAN).build();
        CPlayerEntity lGuidileye = new CPlayerEntity.CPlayerBuilder().firstName("dialo").lastName(CConstants.NAME_NANCY_GUIDILEYE).team(lNancyFromDb).dayOfBirth(30).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lGuidileyePositions).picturePath(CConstants.PICTURE_NANCY_GUIDILEYE).build();
        CPlayerEntity lPuyo = new CPlayerEntity.CPlayerBuilder().firstName("loic").lastName(CConstants.NAME_NANCY_PUYO).team(lNancyFromDb).dayOfBirth(19).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lPuyoPositions).picturePath(CConstants.PICTURE_NANCY_PUYO).build();
        CPlayerEntity lPedretti = new CPlayerEntity.CPlayerBuilder().firstName("benoit").lastName(CConstants.NAME_NANCY_PEDRETTI).team(lNancyFromDb).dayOfBirth(12).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1980).country(CConstants.FRANCE).positions(lPedrettiPositions).picturePath(CConstants.PICTURE_NANCY_PEDRETTI).build();

        CPlayerEntity lDale = new CPlayerEntity.CPlayerBuilder().firstName("junior").lastName(CConstants.NAME_NANCY_DALE).team(lNancyFromDb).dayOfBirth(12).monthOfBirth(CConstants.JULY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lDalePositions).picturePath(CConstants.PICTURE_NANCY_DALE).build();
        CPlayerEntity lDia = new CPlayerEntity.CPlayerBuilder().firstName("issiar").lastName(CConstants.NAME_NANCY_DIA).team(lNancyFromDb).dayOfBirth(8).monthOfBirth(CConstants.JUNE).yearOfBirth(1987).country(CConstants.FRANCE).positions(lDiaPositions).picturePath(CConstants.PICTURE_NANCY_DIA).build();
        CPlayerEntity lMandanne = new CPlayerEntity.CPlayerBuilder().firstName("christophe").lastName(CConstants.NAME_NANCY_MANDANNE).team(lNancyFromDb).dayOfBirth(7).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lMandannePositions).picturePath(CConstants.PICTURE_NANCY_MANDANNE).build();
        CPlayerEntity lHadji = new CPlayerEntity.CPlayerBuilder().firstName("youssouf").lastName(CConstants.NAME_NANCY_HADJI).team(lNancyFromDb).dayOfBirth(25).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1980).country(CConstants.MOROCCO).positions(lHadjiPositions).picturePath(CConstants.PICTURE_NANCY_HADJI).build();
        CPlayerEntity lMabella = new CPlayerEntity.CPlayerBuilder().firstName("yann").lastName(CConstants.NAME_NANCY_MABELLA).team(lNancyFromDb).dayOfBirth(22).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMabellaPositions).picturePath(CConstants.PICTURE_NANCY_MABELLA).build();
        CPlayerEntity lKoura = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_NANCY_KOURA).team(lNancyFromDb).dayOfBirth(6).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lKouraPositions).picturePath(CConstants.PICTURE_NANCY_KOURA).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdyAssembe);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lChernik);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMenay);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLenglet);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMuratori);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaouassa);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCabaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBadila);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiagne);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCuffaut);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lChretien);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCetout);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiarra);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPuyo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHadji);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPedretti);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAitBennasser);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRobic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarchetti);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCoulibalyNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNguessan);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGuidileye);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDale);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMandanne);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKoura);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMabella);
            lCrudMethods.commitTransaction();
        }

        // NANTES

        List<CPositionEntity> lRiouPositions = new ArrayList<CPositionEntity>();
        lRiouPositions.add(lGk);

        List<CPositionEntity> lDupePositions = new ArrayList<CPositionEntity>();
        lDupePositions.add(lGk);

        List<CPositionEntity> lVizcaPositions = new ArrayList<CPositionEntity>();
        lVizcaPositions.add(lCb);

        List<CPositionEntity> lDjidjiPositions = new ArrayList<CPositionEntity>();
        lDjidjiPositions.add(lCb);

        List<CPositionEntity> lCarlosPositions = new ArrayList<CPositionEntity>();
        lCarlosPositions.add(lCb);

        List<CPositionEntity> lBagnackPositions = new ArrayList<CPositionEntity>();
        lBagnackPositions.add(lCb);
        lBagnackPositions.add(lCdm);

        List<CPositionEntity> lDuboisPositions = new ArrayList<CPositionEntity>();
        lDuboisPositions.add(lRb);

        List<CPositionEntity> lKwatengPositions = new ArrayList<CPositionEntity>();
        lKwatengPositions.add(lRb);

        List<CPositionEntity> lLimaPositions = new ArrayList<CPositionEntity>();
        lLimaPositions.add(lLb);

        List<CPositionEntity> lMoimbePositions = new ArrayList<CPositionEntity>();
        lMoimbePositions.add(lLb);

        List<CPositionEntity> lGilletPositions = new ArrayList<CPositionEntity>();
        lGilletPositions.add(lCdm);
        lGilletPositions.add(lCm);
        lGilletPositions.add(lRb);

        List<CPositionEntity> lThomassonPositions = new ArrayList<CPositionEntity>();
        lThomassonPositions.add(lCm);
        lThomassonPositions.add(lCam);
        lThomassonPositions.add(lRam);

        List<CPositionEntity> lRongierPositions = new ArrayList<CPositionEntity>();
        lRongierPositions.add(lCdm);
        lRongierPositions.add(lCm);

        List<CPositionEntity> lHaritPositions = new ArrayList<CPositionEntity>();
        lHaritPositions.add(lCm);

        List<CPositionEntity> lToureNantesPositions = new ArrayList<CPositionEntity>();
        lTourePositions.add(lCdm);

        List<CPositionEntity> lThomsenPositions = new ArrayList<CPositionEntity>();
        lThomsenPositions.add(lCm);
        lThomsenPositions.add(lCam);
        lThomsenPositions.add(lLam);

        List<CPositionEntity> lKacaniklicPositions = new ArrayList<CPositionEntity>();
        lKacaniklicPositions.add(lRam);
        lKacaniklicPositions.add(lRw);

        List<CPositionEntity> lAleguePositions = new ArrayList<CPositionEntity>();
        lAleguePositions.add(lRam);
        lAleguePositions.add(lRw);

        List<CPositionEntity> lIlokiPositions = new ArrayList<CPositionEntity>();
        lIlokiPositions.add(lRam);
        lIlokiPositions.add(lRw);

        List<CPositionEntity> lSigPositions = new ArrayList<CPositionEntity>();
        lSigPositions.add(lSt);

        List<CPositionEntity> lSalaPositions = new ArrayList<CPositionEntity>();
        lSalaPositions.add(lSt);

        List<CPositionEntity> lArisPositions = new ArrayList<CPositionEntity>();
        lArisPositions.add(lSt);

        List<CPositionEntity> lBammouPositions = new ArrayList<CPositionEntity>();
        lBammouPositions.add(lSt);

        List<CPositionEntity> lStepinskiPositions = new ArrayList<CPositionEntity>();
        lStepinskiPositions.add(lSt);

        // gks
        CPlayerEntity lRiou = new CPlayerEntity.CPlayerBuilder().firstName("remi").lastName(CConstants.NAME_NANTES_RIOU).team(lNantesFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lRiouPositions).picturePath(CConstants.PICTURE_NANTES_RIOU).build();
        CPlayerEntity lDupe = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_NANTES_DUPE).team(lNantesFromDb).dayOfBirth(4).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.FRANCE).positions(lDupePositions).picturePath(CConstants.PICTURE_NANTES_DUPE).build();


        // defs
        CPlayerEntity lLima = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_NANTES_LIMA).team(lNantesFromDb).dayOfBirth(10).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1991).country(CConstants.BRAZIL).positions(lLimaPositions).picturePath(CConstants.PICTURE_NANTES_LIMA).build();
        CPlayerEntity lCarlos = new CPlayerEntity.CPlayerBuilder().firstName("diego").lastName(CConstants.NAME_NANTES_CARLOS).team(lNantesFromDb).dayOfBirth(15).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.BRAZIL).positions(lCarlosPositions).picturePath(CConstants.PICTURE_NANTES_CARLOS).build();
        CPlayerEntity lVizcarrondo = new CPlayerEntity.CPlayerBuilder().firstName("oswaldo").lastName(CConstants.NAME_NANTES_VIZCARRONDO).team(lNantesFromDb).dayOfBirth(31).monthOfBirth(CConstants.MAY).yearOfBirth(1984).country(CConstants.VENEZUELA).positions(lVizcaPositions).picturePath(CConstants.PICTURE_NANTES_VIZCARRONDO).build();
        CPlayerEntity lDubois = new CPlayerEntity.CPlayerBuilder().firstName("leo").lastName(CConstants.NAME_NANTES_DUBOIS).team(lNantesFromDb).dayOfBirth(14).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lDuboisPositions).picturePath(CConstants.PICTURE_NANTES_DUBOIS).build();
        CPlayerEntity lDjidji = new CPlayerEntity.CPlayerBuilder().firstName("koffi").lastName(CConstants.NAME_NANTES_DJIDJI).team(lNantesFromDb).dayOfBirth(30).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDjidjiPositions).picturePath(CConstants.PICTURE_NANTES_DJIDJI).build();
        CPlayerEntity lKwateng = new CPlayerEntity.CPlayerBuilder().firstName("enock").lastName(CConstants.NAME_NANTES_KWATENG).team(lNantesFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lKwatengPositions).picturePath(CConstants.PICTURE_NANTES_KWATENG).build();
        CPlayerEntity lMoimbe = new CPlayerEntity.CPlayerBuilder().firstName("wilfried").lastName(CConstants.NAME_NANTES_MOIMBE).team(lNantesFromDb).dayOfBirth(18).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lMoimbePositions).picturePath(CConstants.PICTURE_NANTES_MOIMBE).build();


        // midfielders
        CPlayerEntity lGillet = new CPlayerEntity.CPlayerBuilder().firstName("guillaume").lastName(CConstants.NAME_NANTES_GILLET).team(lNantesFromDb).dayOfBirth(9).monthOfBirth(CConstants.MARCH).yearOfBirth(1984).country(CConstants.BELGIUM).positions(lGilletPositions).picturePath(CConstants.PICTURE_NANTES_GILLET).build();
        CPlayerEntity lRongier = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_NANTES_RONGIER).team(lNantesFromDb).dayOfBirth(7).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lRongierPositions).picturePath(CConstants.PICTURE_NANTES_RONGIER).build();
        CPlayerEntity lThomasson = new CPlayerEntity.CPlayerBuilder().firstName("adrien").lastName(CConstants.NAME_NANTES_THOMASSON).team(lNantesFromDb).dayOfBirth(10).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lThomassonPositions).picturePath(CConstants.PICTURE_NANTES_THOMASSON).build();
        CPlayerEntity lHarit = new CPlayerEntity.CPlayerBuilder().firstName("amine").lastName(CConstants.NAME_NANTES_HARIT).team(lNantesFromDb).dayOfBirth(18).monthOfBirth(CConstants.JUNE).yearOfBirth(1997).country(CConstants.FRANCE).positions(lHaritPositions).picturePath(CConstants.PICTURE_NANTES_HARIT).build();
        CPlayerEntity lThomsen = new CPlayerEntity.CPlayerBuilder().firstName("nicolaj").lastName(CConstants.NAME_NANTES_THOMSEN).team(lNantesFromDb).dayOfBirth(8).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.DENMARK).positions(lThomsenPositions).picturePath(CConstants.PICTURE_NANTES_THOMSEN).build();
        CPlayerEntity lToureNantes = new CPlayerEntity.CPlayerBuilder().firstName("abdoulaye").lastName(CConstants.NAME_NANTES_TOURE).team(lNantesFromDb).dayOfBirth(3).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lToureNantesPositions).picturePath(CConstants.PICTURE_NANTES_TOURE).build();


        // forwards
        CPlayerEntity lKacaniklic = new CPlayerEntity.CPlayerBuilder().firstName("aleksander").lastName(CConstants.NAME_NANTES_KACANIKLIC).team(lNantesFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1991).country(CConstants.SWEDEN).positions(lKacaniklicPositions).picturePath(CConstants.PICTURE_NANTES_KACANIKLIC).build();
        CPlayerEntity lSig = new CPlayerEntity.CPlayerBuilder().firstName("kolbeinn").lastName(CConstants.NAME_NANTES_SIGTHORSSON).team(lNantesFromDb).dayOfBirth(14).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.ICELAND).positions(lSigPositions).picturePath(CConstants.PICTURE_NANTES_SIGTHORSSON).build();
        CPlayerEntity lSala = new CPlayerEntity.CPlayerBuilder().firstName("emiliano").lastName(CConstants.NAME_NANTES_SALA).team(lNantesFromDb).dayOfBirth(31).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.ARGENTINA).positions(lSalaPositions).picturePath(CConstants.PICTURE_NANTES_SALA).build();
        CPlayerEntity lAris = new CPlayerEntity.CPlayerBuilder().firstName("fernando").lastName(CConstants.NAME_NANTES_ARISTEGUIETA).team(lNantesFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1992).country(CConstants.VENEZUELA).positions(lArisPositions).picturePath(CConstants.PICTURE_NANTES_ARISTEGUIETA).build();
        CPlayerEntity lAlegue = new CPlayerEntity.CPlayerBuilder().firstName("alexis").lastName(CConstants.NAME_NANTES_ALEGUE).team(lNantesFromDb).dayOfBirth(23).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lAleguePositions).picturePath(CConstants.PICTURE_NANTES_ALEGUE).build();
        CPlayerEntity lIloki = new CPlayerEntity.CPlayerBuilder().firstName("jules").lastName(CConstants.NAME_NANTES_ILOKI).team(lNantesFromDb).dayOfBirth(14).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lIlokiPositions).picturePath(CConstants.PICTURE_NANTES_ILOKI).build();
        CPlayerEntity lBammou = new CPlayerEntity.CPlayerBuilder().firstName("yacine").lastName(CConstants.NAME_NANTES_BAMMOU).team(lNantesFromDb).dayOfBirth(14).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lBammouPositions).picturePath(CConstants.PICTURE_NANTES_BAMMOU).build();
        CPlayerEntity lStepinski = new CPlayerEntity.CPlayerBuilder().firstName("mariusz").lastName(CConstants.NAME_NANTES_STEPINSKI).team(lNantesFromDb).dayOfBirth(12).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.POLAND).positions(lStepinskiPositions).picturePath(CConstants.PICTURE_NANTES_STEPINSKI).build();



        lCrudMethods.openTransaction();
        lCrudMethods.persist(lRongier);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lRiou);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lThomasson);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lDubois);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lLima);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lVizcarrondo);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lCarlos);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lGillet);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lKacaniklic);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lThomsen);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lSig);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lHarit);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lDjidji);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lSala);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lAris);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lAlegue);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lDupe);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lKwateng);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lMoimbe);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lStepinski);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lToureNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lIloki);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lBammou);
        lCrudMethods.commitTransaction();

        // NICE

        List<CPositionEntity> lHassenPositions = new ArrayList<CPositionEntity>();
        lHassenPositions.add(lGk);

        List<CPositionEntity> lCardinalePositions = new ArrayList<CPositionEntity>();
        lCardinalePositions.add(lGk);

        List<CPositionEntity> lPouplinPositions = new ArrayList<CPositionEntity>();
        lPouplinPositions.add(lGk);

        List<CPositionEntity> lBenitezPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lSarrNicePositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lSouquetPositions = new ArrayList<CPositionEntity>();
        lSouquetPositions.add(lCb);

        List<CPositionEntity> lLlorisPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBayssePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lGomisPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRougeauxPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeMarchandPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPereiraPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBodmerPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBoscagliPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lHenriquePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBurnerPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMarcelPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSeriPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lVercauterenPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLusambaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRafetraniainaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lEyssericPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lWalterPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCyprienPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKozielloPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeBihanPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBenrahmaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPleaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lConstantPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDonisPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBosettiPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCaddyPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDantePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBelhandaPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBaloPositions = new ArrayList<CPositionEntity>();
        // players

        CPlayerEntity lHassen = new CPlayerEntity.CPlayerBuilder().firstName("mouez").lastName(CConstants.NAME_NICE_HASSEN).team(lNiceFromDb).dayOfBirth(5).monthOfBirth(CConstants.MARCH).yearOfBirth(1995).country(CConstants.FRANCE).positions(lHassenPositions).picturePath(CConstants.PICTURE_NICE_HASSEN).build();
        CPlayerEntity lCardinale = new CPlayerEntity.CPlayerBuilder().firstName("yoan").lastName(CConstants.NAME_NICE_CARDINALE).team(lNiceFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lCardinalePositions).picturePath(CConstants.PICTURE_NICE_CARDINALE).build();
        CPlayerEntity lPouplin = new CPlayerEntity.CPlayerBuilder().firstName("simon").lastName(CConstants.NAME_NICE_POUPLIN).team(lNiceFromDb).dayOfBirth(28).monthOfBirth(CConstants.MAY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lPouplinPositions).picturePath(CConstants.PICTURE_NICE_POUPLIN).build();
        CPlayerEntity lBenitez = new CPlayerEntity.CPlayerBuilder().firstName("walter").lastName(CConstants.NAME_NICE_BENITEZ).team(lNiceFromDb).dayOfBirth(19).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.ARGENTINA).positions(lBenitezPositions).picturePath(CConstants.PICTURE_NICE_BENITEZ).build();

        CPlayerEntity lSarrNice = new CPlayerEntity.CPlayerBuilder().firstName("malang").lastName(CConstants.NAME_NICE_SARR).team(lNiceFromDb).dayOfBirth(23).monthOfBirth(CConstants.JANUARY).yearOfBirth(1999).country(CConstants.FRANCE).positions(lSarrNicePositions).picturePath(CConstants.PICTURE_NICE_SARR).build();
        CPlayerEntity lSouquet = new CPlayerEntity.CPlayerBuilder().firstName("arnaud").lastName(CConstants.NAME_NICE_SOUQUET).team(lNiceFromDb).dayOfBirth(12).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSouquetPositions).picturePath(CConstants.PICTURE_NICE_SOUQUET).build();
        CPlayerEntity lLloris = new CPlayerEntity.CPlayerBuilder().firstName("gautier").lastName(CConstants.NAME_NICE_LLORIS).team(lNiceFromDb).dayOfBirth(18).monthOfBirth(CConstants.JULY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLlorisPositions).picturePath(CConstants.PICTURE_NICE_LLORIS).build();
        CPlayerEntity lBaysse = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_NICE_BAYSSE).team(lNiceFromDb).dayOfBirth(18).monthOfBirth(CConstants.MAY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lBayssePositions).picturePath(CConstants.PICTURE_NICE_BAYSSE).build();
        CPlayerEntity lGomis = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_NICE_GOMIS).team(lNiceFromDb).dayOfBirth(20).monthOfBirth(CConstants.JANUARY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lGomisPositions).picturePath(CConstants.PICTURE_NICE_GOMIS).build();
        CPlayerEntity lRougeaux = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_NICE_ROUGEAUX).team(lNiceFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lRougeauxPositions).picturePath(CConstants.PICTURE_NICE_ROUGEAUX).build();
        CPlayerEntity lLeMarchand = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_NICE_LEMARCHAND).team(lNiceFromDb).dayOfBirth(11).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLeMarchandPositions).picturePath(CConstants.PICTURE_NICE_LEMARCHAND).build();
        CPlayerEntity lPereira = new CPlayerEntity.CPlayerBuilder().firstName("ricardo").lastName(CConstants.NAME_NICE_PEREIRA).team(lNiceFromDb).dayOfBirth(6).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPereiraPositions).picturePath(CConstants.PICTURE_NICE_PEREIRA).build();
        CPlayerEntity lBodmer = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_NICE_BODMER).team(lNiceFromDb).dayOfBirth(22).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1982).country(CConstants.FRANCE).positions(lBodmerPositions).picturePath(CConstants.PICTURE_NICE_BODMER).build();
        CPlayerEntity lBoscagli = new CPlayerEntity.CPlayerBuilder().firstName("olivier").lastName(CConstants.NAME_NICE_BOSCAGLI).team(lNiceFromDb).dayOfBirth(18).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lBoscagliPositions).picturePath(CConstants.PICTURE_NICE_BOSCAGLI).build();
        CPlayerEntity lHenrique = new CPlayerEntity.CPlayerBuilder().firstName("dalbert").lastName(CConstants.NAME_NICE_HENRIQUE).team(lNiceFromDb).dayOfBirth(8).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1993).country(CConstants.BRAZIL).positions(lHenriquePositions).picturePath(CConstants.PICTURE_NICE_HENRIQUE).build();
        CPlayerEntity lBurner = new CPlayerEntity.CPlayerBuilder().firstName("patrick").lastName(CConstants.NAME_NICE_BURNER).team(lNiceFromDb).dayOfBirth(11).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBurnerPositions).picturePath(CConstants.PICTURE_NICE_BURNER).build();
        CPlayerEntity lDante = new CPlayerEntity.CPlayerBuilder().firstName("bonfim").lastName(CConstants.NAME_NICE_DANTE).team(lNiceFromDb).dayOfBirth(18).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1983).country(CConstants.BRAZIL).positions(lDantePositions).picturePath(CConstants.PICTURE_NICE_DANTE).build();


        CPlayerEntity lMarcel = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_NICE_MARCEL).team(lNiceFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lMarcelPositions).picturePath(CConstants.PICTURE_NICE_MARCEL).build();
        CPlayerEntity lSeri = new CPlayerEntity.CPlayerBuilder().firstName("jean michael").lastName(CConstants.NAME_NICE_SERI).team(lNiceFromDb).dayOfBirth(19).monthOfBirth(CConstants.JULY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lSeriPositions).picturePath(CConstants.PICTURE_NICE_SERI).build();
        CPlayerEntity lVercauteren = new CPlayerEntity.CPlayerBuilder().firstName("julien").lastName(CConstants.NAME_NICE_VERCAUTEREN).team(lNiceFromDb).dayOfBirth(12).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lVercauterenPositions).picturePath(CConstants.PICTURE_NICE_VERCAUTEREN).build();
        CPlayerEntity lLusamba = new CPlayerEntity.CPlayerBuilder().firstName("arnaud").lastName(CConstants.NAME_NICE_LUSAMBA).team(lNiceFromDb).dayOfBirth(4).monthOfBirth(CConstants.JANUARY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lLusambaPositions).picturePath(CConstants.PICTURE_NICE_LUSAMBA).build();
        CPlayerEntity lRafetraniaina = new CPlayerEntity.CPlayerBuilder().firstName("albert").lastName(CConstants.NAME_NICE_RAFETRANIAINA).team(lNiceFromDb).dayOfBirth(9).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lRafetraniainaPositions).picturePath(CConstants.PICTURE_NICE_RAFETRANIAINA).build();
        CPlayerEntity lEysseric = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_NICE_EYSSERIC).team(lNiceFromDb).dayOfBirth(25).monthOfBirth(CConstants.MARCH).yearOfBirth(1992).country(CConstants.FRANCE).positions(lEyssericPositions).picturePath(CConstants.PICTURE_NICE_EYSSERIC).build();
        CPlayerEntity lWalter = new CPlayerEntity.CPlayerBuilder().firstName("remi").lastName(CConstants.NAME_NICE_WALTER).team(lNiceFromDb).dayOfBirth(26).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lWalterPositions).picturePath(CConstants.PICTURE_NICE_WALTER).build();
        CPlayerEntity lCyprien = new CPlayerEntity.CPlayerBuilder().firstName("wylan").lastName(CConstants.NAME_NICE_CYPRIEN).team(lNiceFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCyprienPositions).picturePath(CConstants.PICTURE_NICE_CYPRIEN).build();
        CPlayerEntity lKoziello = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_NICE_KOZIELLO).team(lNiceFromDb).dayOfBirth(28).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKozielloPositions).picturePath(CConstants.PICTURE_NICE_KOZIELLO).build();
        CPlayerEntity lBelhanda = new CPlayerEntity.CPlayerBuilder().firstName("younes").lastName(CConstants.NAME_NICE_BELHANDA).team(lNiceFromDb).dayOfBirth(25).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1990).country(CConstants.MOROCCO).positions(lBelhandaPositions).picturePath(CConstants.PICTURE_NICE_BELHANDA).build();


        CPlayerEntity lLeBihan = new CPlayerEntity.CPlayerBuilder().firstName("mickael").lastName(CConstants.NAME_NICE_LEBIHAN).team(lNiceFromDb).dayOfBirth(16).monthOfBirth(CConstants.MAY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lLeBihanPositions).picturePath(CConstants.PICTURE_NICE_LEBIHAN).build();
        CPlayerEntity lBenrahma = new CPlayerEntity.CPlayerBuilder().firstName("said").lastName(CConstants.NAME_NICE_BENRAHMA).team(lNiceFromDb).dayOfBirth(10).monthOfBirth(CConstants.AUGUST).yearOfBirth(1995).country(CConstants.ALGERIA).positions(lBenrahmaPositions).picturePath(CConstants.PICTURE_NICE_BENRAHMA).build();
        CPlayerEntity lPlea = new CPlayerEntity.CPlayerBuilder().firstName("alassane").lastName(CConstants.NAME_NICE_PLEA).team(lNiceFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPleaPositions).picturePath(CConstants.PICTURE_NICE_PLEA).build();
        CPlayerEntity lConstant = new CPlayerEntity.CPlayerBuilder().firstName("bryan").lastName(CConstants.NAME_NICE_CONSTANT).team(lNiceFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lConstantPositions).picturePath(CConstants.PICTURE_NICE_CONSTANT).build();
        CPlayerEntity lDonis = new CPlayerEntity.CPlayerBuilder().firstName("anastasios").lastName(CConstants.NAME_NICE_DONIS).team(lNiceFromDb).dayOfBirth(29).monthOfBirth(CConstants.AUGUST).yearOfBirth(1996).country(CConstants.FRANCE).positions(lDonisPositions).picturePath(CConstants.PICTURE_NICE_DONIS).build();
        CPlayerEntity lBosetti = new CPlayerEntity.CPlayerBuilder().firstName("alexy").lastName(CConstants.NAME_NICE_BOSETTI).team(lNiceFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lBosettiPositions).picturePath(CConstants.PICTURE_NICE_BOSETTI).build();
        CPlayerEntity lCaddy = new CPlayerEntity.CPlayerBuilder().firstName("dorian").lastName(CConstants.NAME_NICE_CADDY).team(lNiceFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCaddyPositions).picturePath(CConstants.PICTURE_NICE_CADDY).build();
        CPlayerEntity lBalo = new CPlayerEntity.CPlayerBuilder().firstName("mario").lastName(CConstants.NAME_NICE_BALOTELLI).team(lNiceFromDb).dayOfBirth(12).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.ITALY).positions(lBaloPositions).picturePath(CConstants.PICTURE_NICE_BALOTELLI).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHassen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPouplin);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCardinale);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenitez);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeMarchand);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBaysse);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoscagli);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBodmer);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSarrNice);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSouquet);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGomis);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHenrique);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPereira);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLloris);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRougeaux);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBurner);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lWalter);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKoziello);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarcel);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSeri);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLusamba);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEysseric);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCyprien);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRafetraniaina);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVercauteren);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeBihan);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenrahma);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lConstant);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPlea);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDonis);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBosetti);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCaddy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBalo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDante);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBelhanda);
            lCrudMethods.commitTransaction();
        }

        // OL

        List<CPositionEntity> lLopesOlPositions = new ArrayList<CPositionEntity>();
        lLopesPositions.add(lGk);

        List<CPositionEntity> lGorgelinPositions = new ArrayList<CPositionEntity>();
        lGorgelinPositions.add(lGk);


        List<CPositionEntity> lMapouPositions = new ArrayList<CPositionEntity>();
        lMapouPositions.add(lCb);


        List<CPositionEntity> lRafaelPositions = new ArrayList<CPositionEntity>();
        lRafaelPositions.add(lRb);


        List<CPositionEntity> lJalletPositions = new ArrayList<CPositionEntity>();
        lJalletPositions.add(lRb);

        List<CPositionEntity> lNkoulouPositions = new ArrayList<CPositionEntity>();
        lNkoulouPositions.add(lCb);


        List<CPositionEntity> lMorelPositions = new ArrayList<CPositionEntity>();
        lMorelPositions.add(lLb);
        lMorelPositions.add(lCb);


        List<CPositionEntity> lMammanaPositions = new ArrayList<CPositionEntity>();
        lMammanaPositions.add(lCb);


        List<CPositionEntity> lRybusPositions = new ArrayList<CPositionEntity>();
        lRybusPositions.add(lLb);

        List<CPositionEntity> lKemenPositions = new ArrayList<CPositionEntity>();
        lKemenPositions.add(lCdm);

        List<CPositionEntity> lFofanaOlPositions = new ArrayList<CPositionEntity>();
        lFofanaPositions.add(lCdm);
        lFofanaPositions.add(lCm);

        List<CPositionEntity> lGrenierPositions = new ArrayList<CPositionEntity>();
        lGrenierPositions.add(lCam);

        List<CPositionEntity> lTousardPositions = new ArrayList<CPositionEntity>();
        lTousardPositions.add(lCdm);

        List<CPositionEntity> lFerriPositions = new ArrayList<CPositionEntity>();
        lFerriPositions.add(lCm);

        List<CPositionEntity> lTolissoPositions = new ArrayList<CPositionEntity>();
        lTolissoPositions.add(lCm);

        List<CPositionEntity> lDarderPositions = new ArrayList<CPositionEntity>();
        lDarderPositions.add(lCdm);
        lDarderPositions.add(lCm);


        List<CPositionEntity> lGonalonsPositions = new ArrayList<CPositionEntity>();
        lGonalonsPositions.add(lCdm);


        List<CPositionEntity> lValbuenaPositions = new ArrayList<CPositionEntity>();
        lValbuenaPositions.add(lCam);


        List<CPositionEntity> lKaluluPositions = new ArrayList<CPositionEntity>();
        lKaluluPositions.add(lSt);


        List<CPositionEntity> lLacazettePositions = new ArrayList<CPositionEntity>();
        lLacazettePositions.add(lSt);


        List<CPositionEntity> lGhezzalPositions = new ArrayList<CPositionEntity>();
        lGhezzalPositions.add(lRw);


        List<CPositionEntity> lFekirPositions = new ArrayList<CPositionEntity>();
        lFekirPositions.add(lF9);
        lFekirPositions.add(lRw);
        lFekirPositions.add(lCam);


        List<CPositionEntity> lCornetPositions = new ArrayList<CPositionEntity>();
        lCornetPositions.add(lLw);
        lCornetPositions.add(lSt);


        List<CPositionEntity> lPerrinPositions = new ArrayList<CPositionEntity>();
        lPerrinPositions.add(lSt);

        List<CPositionEntity> lLabidiPositions = new ArrayList<CPositionEntity>();
        lLabidiPositions.add(lSt);

        List<CPositionEntity> lDiakhabyPositions = new ArrayList<CPositionEntity>();
        lDiakhabyPositions.add(lCb);


        CPlayerEntity lLopesOl = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_OL_LOPES).team(lOlFromDb).dayOfBirth(1).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.PORTUGAL).positions(lLopesOlPositions).picturePath(CConstants.PICTURE_OL_LOPES).build();
        CPlayerEntity lGorgelin = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_OL_GORGELIN).team(lOlFromDb).dayOfBirth(5).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.FRANCE).positions(lGorgelinPositions).picturePath(CConstants.PICTURE_OL_GORGELIN).build();
        CPlayerEntity lJallet = new CPlayerEntity.CPlayerBuilder().firstName("christophe").lastName(CConstants.NAME_OL_JALLET).team(lOlFromDb).dayOfBirth(31).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1983).country(CConstants.FRANCE).positions(lJalletPositions).picturePath(CConstants.PICTURE_OL_JALLET).build();
        CPlayerEntity lMapou = new CPlayerEntity.CPlayerBuilder().firstName("mapou").lastName(CConstants.NAME_OL_MAPOU).team(lOlFromDb).dayOfBirth(25).monthOfBirth(CConstants.MAY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lMapouPositions).picturePath(CConstants.PICTURE_OL_MAPOU).build();
        CPlayerEntity lNkoulou = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_OL_NKOULOU).team(lOlFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.CAMEROUN).positions(lNkoulouPositions).picturePath(CConstants.PICTURE_OL_NKOULOU).build();
        CPlayerEntity lMorel = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_OL_MOREL).team(lOlFromDb).dayOfBirth(2).monthOfBirth(CConstants.APRIL).yearOfBirth(1984).country(CConstants.BRAZIL).positions(lMorelPositions).picturePath(CConstants.PICTURE_OL_MOREL).build();
        CPlayerEntity lRafael = new CPlayerEntity.CPlayerBuilder().firstName("rafael").lastName(CConstants.NAME_OL_RAFAEL).team(lOlFromDb).dayOfBirth(9).monthOfBirth(CConstants.JULY).yearOfBirth(1990).country(CConstants.BRAZIL).positions(lRafaelPositions).picturePath(CConstants.PICTURE_OL_RAFAEL).build();
        CPlayerEntity lMammana = new CPlayerEntity.CPlayerBuilder().firstName("emmanuel").lastName(CConstants.NAME_OL_MAMMANA).team(lOlFromDb).dayOfBirth(10).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1996).country(CConstants.ARGENTINA).positions(lMammanaPositions).picturePath(CConstants.PICTURE_OL_MAMMANA).build();
        CPlayerEntity lRybus = new CPlayerEntity.CPlayerBuilder().firstName("maciej").lastName(CConstants.NAME_OL_RYBUS).team(lOlFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1989).country(CConstants.POLAND).positions(lRybusPositions).picturePath(CConstants.PICTURE_OL_RYBUS).build();
        CPlayerEntity lFerri = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_OL_FERRI).team(lOlFromDb).dayOfBirth(12).monthOfBirth(CConstants.MARCH).yearOfBirth(1992).country(CConstants.FRANCE).positions(lFerriPositions).picturePath(CConstants.PICTURE_OL_FERRI).build();
        CPlayerEntity lTousard = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_OL_TOUSARD).team(lOlFromDb).dayOfBirth(29).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lTousardPositions).picturePath(CConstants.PICTURE_OL_TOUSARD).build();
        CPlayerEntity lTolisso = new CPlayerEntity.CPlayerBuilder().firstName("corentin").lastName(CConstants.NAME_OL_TOLISSO).team(lOlFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.ITALY).positions(lTolissoPositions).picturePath(CConstants.PICTURE_OL_TOLISSO).build();
        CPlayerEntity lDarder = new CPlayerEntity.CPlayerBuilder().firstName("sergi").lastName(CConstants.NAME_OL_DARDER).team(lOlFromDb).dayOfBirth(22).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.SPAIN).positions(lDarderPositions).picturePath(CConstants.PICTURE_OL_DARDER).build();
        CPlayerEntity lGrenier = new CPlayerEntity.CPlayerBuilder().firstName("clement").lastName(CConstants.NAME_OL_GRENIER).team(lOlFromDb).dayOfBirth(7).monthOfBirth(CConstants.JANUARY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lGrenierPositions).picturePath(CConstants.PICTURE_OL_GRENIER).build();
        CPlayerEntity lGonalons = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_OL_GONALONS).team(lOlFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.FRANCE).positions(lGonalonsPositions).picturePath(CConstants.PICTURE_OL_GONALONS).build();
        CPlayerEntity lFofanaOl = new CPlayerEntity.CPlayerBuilder().firstName("gueida").lastName(CConstants.NAME_OL_FOFANA).team(lOlFromDb).dayOfBirth(16).monthOfBirth(CConstants.MAY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lFofanaOlPositions).picturePath(CConstants.PICTURE_OL_FOFANA).build();
        CPlayerEntity lKemen = new CPlayerEntity.CPlayerBuilder().firstName("olivier").lastName(CConstants.NAME_OL_KEMEN).team(lOlFromDb).dayOfBirth(20).monthOfBirth(CConstants.JULY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lKemenPositions).picturePath(CConstants.PICTURE_OL_KEMEN).build();
        CPlayerEntity lValbuena = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_OL_VALBUENA).team(lOlFromDb).dayOfBirth(28).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1984).country(CConstants.FRANCE).positions(lValbuenaPositions).picturePath(CConstants.PICTURE_OL_VALBUENA).build();
        CPlayerEntity lLacazette = new CPlayerEntity.CPlayerBuilder().firstName("alexandre").lastName(CConstants.NAME_OL_LACAZETTE).team(lOlFromDb).dayOfBirth(28).monthOfBirth(CConstants.MAY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lLacazettePositions).picturePath(CConstants.PICTURE_OL_LACAZETTE).build();
        CPlayerEntity lGhezzal = new CPlayerEntity.CPlayerBuilder().firstName("rachid").lastName(CConstants.NAME_OL_GHEZZAL).team(lOlFromDb).dayOfBirth(9).monthOfBirth(CConstants.MAY).yearOfBirth(1992).country(CConstants.ALGERIA).positions(lGhezzalPositions).picturePath(CConstants.PICTURE_OL_GHEZZAL).build();
        CPlayerEntity lFekir = new CPlayerEntity.CPlayerBuilder().firstName("nabil").lastName(CConstants.NAME_OL_FEKIR).team(lOlFromDb).dayOfBirth(18).monthOfBirth(CConstants.JULY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lFekirPositions).picturePath(CConstants.PICTURE_OL_FEKIR).build();
        CPlayerEntity lKalulu = new CPlayerEntity.CPlayerBuilder().firstName("aldo").lastName(CConstants.NAME_OL_KALULU).team(lOlFromDb).dayOfBirth(21).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lKaluluPositions).picturePath(CConstants.PICTURE_OL_KALULU).build();
        CPlayerEntity lPerrin = new CPlayerEntity.CPlayerBuilder().firstName("gaetan").lastName(CConstants.NAME_OL_PERRIN).team(lOlFromDb).dayOfBirth(7).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lPerrinPositions).picturePath(CConstants.PICTURE_OL_PERRIN).build();
        CPlayerEntity lCornet = new CPlayerEntity.CPlayerBuilder().firstName("maxwell").lastName(CConstants.NAME_OL_CORNET).team(lOlFromDb).dayOfBirth(27).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lCornetPositions).picturePath(CConstants.PICTURE_OL_CORNET).build();
        CPlayerEntity lLabidi = new CPlayerEntity.CPlayerBuilder().firstName("zakarie").lastName(CConstants.NAME_OL_LABIDI).team(lOlFromDb).dayOfBirth(8).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLabidiPositions).picturePath(CConstants.PICTURE_OL_LABIDI).build();
        CPlayerEntity lDiakhaby = new CPlayerEntity.CPlayerBuilder().firstName("mouctar").lastName(CConstants.NAME_OL_DIAKHABY).team(lOlFromDb).dayOfBirth(19).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lDiakhabyPositions).picturePath(CConstants.PICTURE_OL_DIAKHABY).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLopesOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGorgelin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMapou);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMammana);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRybus);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNkoulou);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMorel);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJallet);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRafael);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTousard);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFofanaOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGrenier);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGonalons);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFerri);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTolisso);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lValbuena);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDarder);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKemen);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLacazette);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFekir);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPerrin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGhezzal);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCornet);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLabidi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKalulu);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiakhaby);
            lCrudMethods.commitTransaction();
        }

        // OM

        List<CPositionEntity> lPelePositions = new ArrayList<CPositionEntity>();
        lPelePositions.add(lGk);

        List<CPositionEntity> lSambaPositions = new ArrayList<CPositionEntity>();
        lSambaPositions.add(lGk);


        List<CPositionEntity> lDoriaPositions = new ArrayList<CPositionEntity>();
        lDoriaPositions.add(lCb);

        List<CPositionEntity> lAloePositions = new ArrayList<CPositionEntity>();
        lAloePositions.add(lCb);


        List<CPositionEntity> lRolandoPositions = new ArrayList<CPositionEntity>();
        lRolandoPositions.add(lCb);


        List<CPositionEntity> lRekikPositions = new ArrayList<CPositionEntity>();
        lRekikPositions.add(lRb);


        List<CPositionEntity> lHubocanPositions = new ArrayList<CPositionEntity>();
        lHubocanPositions.add(lCb);


        List<CPositionEntity> lAndonianPositions = new ArrayList<CPositionEntity>();
        lAndonianPositions.add(lCb);


        List<CPositionEntity> lSakaiPositions = new ArrayList<CPositionEntity>();
        lSakaiPositions.add(lRb);


        List<CPositionEntity> lBedimoPositions = new ArrayList<CPositionEntity>();
        lBedimoPositions.add(lLb);


        List<CPositionEntity> lSaneOmPositions = new ArrayList<CPositionEntity>();
        lSanePositions.add(lLb);

        List<CPositionEntity> lHauganPositions = new ArrayList<CPositionEntity>();
        lHauganPositions.add(lCb);

        List<CPositionEntity> lDiabyPositions = new ArrayList<CPositionEntity>();
        lDiabyPositions.add(lCm);

        List<CPositionEntity> lCabellaPositions = new ArrayList<CPositionEntity>();
        lCabellaPositions.add(lCam);

        List<CPositionEntity> lDiarraOmPositions = new ArrayList<CPositionEntity>();
        lDiarraPositions.add(lCdm);

        List<CPositionEntity> lTuilomaPositions = new ArrayList<CPositionEntity>();
        lTuilomaPositions.add(lCm);

        List<CPositionEntity> lMachachPositions = new ArrayList<CPositionEntity>();
        lMachachPositions.add(lCm);

        List<CPositionEntity> lZamboPositions = new ArrayList<CPositionEntity>();
        lZamboPositions.add(lCdm);


        List<CPositionEntity> lLopezPositions = new ArrayList<CPositionEntity>();
        lLopezPositions.add(lCam);


        List<CPositionEntity> lKhaouiPositions = new ArrayList<CPositionEntity>();
        lKhaouiPositions.add(lRw);


        List<CPositionEntity> lAlessandriniPositions = new ArrayList<CPositionEntity>();
        lAlessandriniPositions.add(lRw);
        lAlessandriniPositions.add(lLw);



        List<CPositionEntity> lGomisOmPositions = new ArrayList<CPositionEntity>();
        lGomisPositions.add(lSt);


        List<CPositionEntity> lPorsanPositions = new ArrayList<CPositionEntity>();
        lPorsanPositions.add(lSt);


        List<CPositionEntity> lRabillardPositions = new ArrayList<CPositionEntity>();
        lRabillardPositions.add(lSt);

        List<CPositionEntity> lIsekaPositions = new ArrayList<CPositionEntity>();
        lIsekaPositions.add(lSt);


        List<CPositionEntity> lSarrOmPositions = new ArrayList<CPositionEntity>();
        lSarrPositions.add(lLw);
        lSarrPositions.add(lRw);

        List<CPositionEntity> lMouhammadouPositions = new ArrayList<CPositionEntity>();
        lMouhammadouPositions.add(lSt);

        List<CPositionEntity> lFanniPositions = new ArrayList<CPositionEntity>();
        lFanniPositions.add(lCb);
        lFanniPositions.add(lRb);

        List<CPositionEntity> lThauvinPositions = new ArrayList<CPositionEntity>();
        lThauvinPositions.add(lRm);
        lThauvinPositions.add(lRw);

        List<CPositionEntity> lNjiePositions = new ArrayList<CPositionEntity>();
        lNjiePositions.add(lLw);

        List<CPositionEntity> lVainqueurPositions = new ArrayList<CPositionEntity>();
        lVainqueurPositions.add(lCdm);

        CPlayerEntity lPele = new CPlayerEntity.CPlayerBuilder().firstName("yohan").lastName(CConstants.NAME_OM_PELE).team(lOmFromDb).dayOfBirth(4).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1982).country(CConstants.FRANCE).positions(lPelePositions).picturePath(CConstants.PICTURE_OM_PELE).build();
        CPlayerEntity lSamba = new CPlayerEntity.CPlayerBuilder().firstName("brice").lastName(CConstants.NAME_OM_SAMBA).team(lOmFromDb).dayOfBirth(25).monthOfBirth(CConstants.APRIL).yearOfBirth(1994).country(CConstants.FRANCE).positions(lSambaPositions).picturePath(CConstants.PICTURE_OM_SAMBA).build();
        CPlayerEntity lHubocan = new CPlayerEntity.CPlayerBuilder().firstName("tomas").lastName(CConstants.NAME_OM_HUBOCAN).team(lOmFromDb).dayOfBirth(17).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1985).country(CConstants.SLOVAKIA).positions(lHubocanPositions).picturePath(CConstants.PICTURE_OM_HUBOCAN).build();
        CPlayerEntity lRolando = new CPlayerEntity.CPlayerBuilder().firstName("jorge").lastName(CConstants.NAME_OM_ROLANDO).team(lOmFromDb).dayOfBirth(31).monthOfBirth(CConstants.AUGUST).yearOfBirth(1985).country(CConstants.PORTUGAL).positions(lRolandoPositions).picturePath(CConstants.PICTURE_OM_ROLANDO).build();
        CPlayerEntity lRekik = new CPlayerEntity.CPlayerBuilder().firstName("karim").lastName(CConstants.NAME_OM_REKIK).team(lOmFromDb).dayOfBirth(2).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1994).country(CConstants.NETHERLANDS).positions(lRekikPositions).picturePath(CConstants.PICTURE_OM_REKIK).build();
        CPlayerEntity lAloe = new CPlayerEntity.CPlayerBuilder().firstName("baptiste").lastName(CConstants.NAME_OM_ALOE).team(lOmFromDb).dayOfBirth(7).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lAloePositions).picturePath(CConstants.PICTURE_OM_ALOE).build();
        CPlayerEntity lAndonian = new CPlayerEntity.CPlayerBuilder().firstName("gael").lastName(CConstants.NAME_OM_ANDONIAN).team(lOmFromDb).dayOfBirth(7).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lAndonianPositions).picturePath(CConstants.PICTURE_OM_ANDONIAN).build();
        CPlayerEntity lDoria = new CPlayerEntity.CPlayerBuilder().firstName("matheus").lastName(CConstants.NAME_OM_DORIA).team(lOmFromDb).dayOfBirth(8).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1994).country(CConstants.BRAZIL).positions(lDoriaPositions).picturePath(CConstants.PICTURE_OM_DORIA).build();
        CPlayerEntity lBedimo = new CPlayerEntity.CPlayerBuilder().firstName("henri").lastName(CConstants.NAME_OM_BEDIMO).team(lOmFromDb).dayOfBirth(4).monthOfBirth(CConstants.JUNE).yearOfBirth(1984).country(CConstants.CAMEROUN).positions(lBedimoPositions).picturePath(CConstants.PICTURE_OM_BEDIMO).build();
        CPlayerEntity lSakai = new CPlayerEntity.CPlayerBuilder().firstName("hiroki").lastName(CConstants.NAME_OM_SAKAI).team(lOmFromDb).dayOfBirth(12).monthOfBirth(CConstants.APRIL).yearOfBirth(1990).country(CConstants.JAPAN).positions(lSakaiPositions).picturePath(CConstants.PICTURE_OM_SAKAI).build();
        CPlayerEntity lSaneOm = new CPlayerEntity.CPlayerBuilder().firstName("alphousseyni").lastName(CConstants.NAME_CAEN_SANE).team(lOmFromDb).dayOfBirth(17).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lSaneOmPositions).picturePath(CConstants.PICTURE_OM_SANE).build();
        CPlayerEntity lDiaby = new CPlayerEntity.CPlayerBuilder().firstName("abou").lastName(CConstants.NAME_OM_DIABY).team(lOmFromDb).dayOfBirth(11).monthOfBirth(CConstants.MAY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lDiabyPositions).picturePath(CConstants.PICTURE_OM_DIABY).build();
        CPlayerEntity lDiarraOm = new CPlayerEntity.CPlayerBuilder().firstName("lassana").lastName(CConstants.NAME_OM_DIARRA).team(lOmFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1985).country(CConstants.FRANCE).positions(lDiarraOmPositions).picturePath(CConstants.PICTURE_OM_DIARRA).build();
        CPlayerEntity lMachach = new CPlayerEntity.CPlayerBuilder().firstName("zinedine").lastName(CConstants.NAME_OM_MACHACH).team(lOmFromDb).dayOfBirth(5).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMachachPositions).picturePath(CConstants.PICTURE_OM_MACHACH).build();
        CPlayerEntity lCabella = new CPlayerEntity.CPlayerBuilder().firstName("remy").lastName(CConstants.NAME_OM_CABELLA).team(lOmFromDb).dayOfBirth(8).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.FRANCE).positions(lCabellaPositions).picturePath(CConstants.PICTURE_OM_CABELLA).build();
        CPlayerEntity lAlessandrini = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_OM_ALESSANDRINI).team(lOmFromDb).dayOfBirth(3).monthOfBirth(CConstants.APRIL).yearOfBirth(1989).country(CConstants.FRANCE).positions(lAlessandriniPositions).picturePath(CConstants.PICTURE_OM_ALESSANDRINI).build();
        CPlayerEntity lSarrOm = new CPlayerEntity.CPlayerBuilder().firstName("bouna").lastName(CConstants.NAME_OM_SARR).team(lOmFromDb).dayOfBirth(31).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSarrOmPositions).picturePath(CConstants.PICTURE_OM_SARR).build();
        CPlayerEntity lKhaoui = new CPlayerEntity.CPlayerBuilder().firstName("saif eddine").lastName(CConstants.NAME_OM_KHAOUI).team(lOmFromDb).dayOfBirth(27).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKhaouiPositions).picturePath(CConstants.PICTURE_OM_KHAOUI).build();
        CPlayerEntity lZambo = new CPlayerEntity.CPlayerBuilder().firstName("franck").lastName(CConstants.NAME_OM_ZAMBO).team(lOmFromDb).dayOfBirth(16).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1995).country(CConstants.CAMEROUN).positions(lZamboPositions).picturePath(CConstants.PICTURE_OM_ZAMBO).build();
        CPlayerEntity lTuiloma = new CPlayerEntity.CPlayerBuilder().firstName("bill").lastName(CConstants.NAME_OM_TUILOMA).team(lOmFromDb).dayOfBirth(27).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.NEW_ZEALAND).positions(lTuilomaPositions).picturePath(CConstants.PICTURE_OM_TUILOMA).build();
        CPlayerEntity lLopez = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_OM_LOPEZ).team(lOmFromDb).dayOfBirth(4).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lLopezPositions).picturePath(CConstants.PICTURE_OM_LOPEZ).build();
        CPlayerEntity lGomisOm = new CPlayerEntity.CPlayerBuilder().firstName("bafetimbi").lastName(CConstants.NAME_NICE_GOMIS).team(lOmFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1985).country(CConstants.FRANCE).positions(lGomisOmPositions).picturePath(CConstants.PICTURE_OM_GOMIS).build();
        CPlayerEntity lIseka = new CPlayerEntity.CPlayerBuilder().firstName("aaron").lastName(CConstants.NAME_OM_ISEKA).team(lOmFromDb).dayOfBirth(15).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1997).country(CConstants.BELGIUM).positions(lIsekaPositions).picturePath(CConstants.PICTURE_OM_ISEKA).build();
        CPlayerEntity lPorsan = new CPlayerEntity.CPlayerBuilder().firstName("jeremie").lastName(CConstants.NAME_OM_PORSAN).team(lOmFromDb).dayOfBirth(16).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lPorsanPositions).picturePath(CConstants.PICTURE_OM_PORSAN).build();
        CPlayerEntity lRabillard = new CPlayerEntity.CPlayerBuilder().firstName("antoine").lastName(CConstants.NAME_OM_RABILLARD).team(lOmFromDb).dayOfBirth(22).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lRabillardPositions).picturePath(CConstants.PICTURE_OM_RABILLARD).build();
        CPlayerEntity lMouhammadou = new CPlayerEntity.CPlayerBuilder().firstName("samad").lastName(CConstants.NAME_OM_MOUHAMMADOU).team(lOmFromDb).dayOfBirth(13).monthOfBirth(CConstants.JANUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lMouhammadouPositions).picturePath(CConstants.PICTURE_OM_MOUHAMMADOU).build();
        CPlayerEntity lHaugan = new CPlayerEntity.CPlayerBuilder().firstName("eirik").lastName(CConstants.NAME_OM_HAUGAN).team(lOmFromDb).dayOfBirth(27).monthOfBirth(CConstants.AUGUST).yearOfBirth(1997).country(CConstants.NORWAY).positions(lHauganPositions).picturePath(CConstants.PICTURE_OM_HAUGAN).build();
        CPlayerEntity lFanni = new CPlayerEntity.CPlayerBuilder().firstName("rod").lastName(CConstants.NAME_OM_FANNI).team(lOmFromDb).dayOfBirth(6).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lFanniPositions).picturePath(CConstants.PICTURE_OM_FANNI).build();
        CPlayerEntity lThauvin = new CPlayerEntity.CPlayerBuilder().firstName("florian").lastName(CConstants.NAME_OM_THAUVIN).team(lOmFromDb).dayOfBirth(26).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lThauvinPositions).picturePath(CConstants.PICTURE_OM_THAUVIN).build();
        CPlayerEntity lNjie = new CPlayerEntity.CPlayerBuilder().firstName("clinton").lastName(CConstants.NAME_OM_NJIE).team(lOmFromDb).dayOfBirth(15).monthOfBirth(CConstants.AUGUST).yearOfBirth(1993).country(CConstants.CAMEROUN).positions(lNjiePositions).picturePath(CConstants.PICTURE_OM_NJIE).build();
        CPlayerEntity lVainqueur = new CPlayerEntity.CPlayerBuilder().firstName("william").lastName(CConstants.NAME_OM_VAINQUEUR).team(lOmFromDb).dayOfBirth(19).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lVainqueurPositions).picturePath(CConstants.PICTURE_OM_VAINQUEUR).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPele);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSamba);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDoria);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAndonian);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRekik);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRolando);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHubocan);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSakai);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaneOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBedimo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiarraOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiaby);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCabella);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKhaoui);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAlessandrini);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTuiloma);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lZambo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMachach);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGomisOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPorsan);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRabillard);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMouhammadou);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSarrOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLopez);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lIseka);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHaugan);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAloe);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFanni);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lThauvin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVainqueur);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNjie);
            lCrudMethods.commitTransaction();
        }

        // PSG

        List<CPositionEntity> lTrappPositions = new ArrayList<CPositionEntity>();
        lTrappPositions.add(lGk);

        List<CPositionEntity> lSilvaPsgPositions = new ArrayList<CPositionEntity>();
        lSilvaPositions.add(lCb);


        List<CPositionEntity> lLuizPositions = new ArrayList<CPositionEntity>();
        lLuizPositions.add(lCb);
        lLuizPositions.add(lCdm);


        List<CPositionEntity> lAurierPositions = new ArrayList<CPositionEntity>();
        lAurierPositions.add(lRb);


        List<CPositionEntity> lMeunierPositions = new ArrayList<CPositionEntity>();
        lMeunierPositions.add(lRb);
        lMeunierPositions.add(lRm);

        List<CPositionEntity> lKurzawaPositions = new ArrayList<CPositionEntity>();
        lKurzawaPositions.add(lLb);


        List<CPositionEntity> lMaxwellPositions = new ArrayList<CPositionEntity>();
        lMaxwellPositions.add(lLb);


        List<CPositionEntity> lMarquinhosPositions = new ArrayList<CPositionEntity>();
        lMarquinhosPositions.add(lCb);


        List<CPositionEntity> lKimpembePositions = new ArrayList<CPositionEntity>();
        lKimpembePositions.add(lCb);

        List<CPositionEntity> lKrychowiakPositions = new ArrayList<CPositionEntity>();
        lKrychowiakPositions.add(lCdm);

        List<CPositionEntity> lVerrattiPositions = new ArrayList<CPositionEntity>();
        lVerrattiPositions.add(lCdm);
        lVerrattiPositions.add(lCm);

        List<CPositionEntity> lMottaPositions = new ArrayList<CPositionEntity>();
        lMottaPositions.add(lCdm);

        List<CPositionEntity> lHbaPositions = new ArrayList<CPositionEntity>();
        lHbaPositions.add(lRw);
        lHbaPositions.add(lCam);

        List<CPositionEntity> lLucasPositions = new ArrayList<CPositionEntity>();
        lLucasPositions.add(lRw);

        List<CPositionEntity> lRabiotPositions = new ArrayList<CPositionEntity>();
        lRabiotPositions.add(lCdm);
        lRabiotPositions.add(lCm);


        List<CPositionEntity> lStambouliPositions = new ArrayList<CPositionEntity>();
        lStambouliPositions.add(lCm);


        List<CPositionEntity> lMatuidiPositions = new ArrayList<CPositionEntity>();
        lMatuidiPositions.add(lCdm);
        lMatuidiPositions.add(lCm);


        List<CPositionEntity> lPastorePositions = new ArrayList<CPositionEntity>();
        lPastorePositions.add(lCam);


        List<CPositionEntity> lAdmPositions = new ArrayList<CPositionEntity>();
        lAdmPositions.add(lCam);
        lAdmPositions.add(lLw);
        lAdmPositions.add(lRw);


        List<CPositionEntity> lJesePositions = new ArrayList<CPositionEntity>();
        lJesePositions.add(lLw);
        lJesePositions.add(lSt);


        List<CPositionEntity> lCavaniPositions = new ArrayList<CPositionEntity>();
        lCavaniPositions.add(lSt);
        lCavaniPositions.add(lLw);


        List<CPositionEntity> lAugustinPositions = new ArrayList<CPositionEntity>();
        lAugustinPositions.add(lSt);


        List<CPositionEntity> lAreolaPositions = new ArrayList<CPositionEntity>();
        lAreolaPositions.add(lGk);

        List<CPositionEntity> lAlecPositions = new ArrayList<CPositionEntity>();
        lAlecPositions.add(lCb);

        List<CPositionEntity> lNkunkuPositions = new ArrayList<CPositionEntity>();
        lNkunkuPositions.add(lCm);


        List<CPositionEntity> lOngendaPositions = new ArrayList<CPositionEntity>();
        lOngendaPositions.add(lSt);



        CPlayerEntity lTrapp = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_PSG_TRAPP).team(lPsgFromDb).dayOfBirth(8).monthOfBirth(CConstants.JULY).yearOfBirth(1990).country(CConstants.GERMANY).positions(lTrappPositions).picturePath(CConstants.PICTURE_PSG_TRAPP).build();
        CPlayerEntity lMeunier = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_PSG_MEUNIER).team(lPsgFromDb).dayOfBirth(12).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1991).country(CConstants.BELGIUM).positions(lMeunierPositions).picturePath(CConstants.PICTURE_PSG_MEUNIER).build();
        CPlayerEntity lLuiz = new CPlayerEntity.CPlayerBuilder().firstName("david").lastName(CConstants.NAME_PSG_LUIZ).team(lPsgFromDb).dayOfBirth(22).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.BRAZIL).positions(lLuizPositions).picturePath(CConstants.PICTURE_PSG_LUIZ).build();
        CPlayerEntity lSilvaPsg = new CPlayerEntity.CPlayerBuilder().firstName("thiago").lastName(CConstants.NAME_PSG_SILVA).team(lPsgFromDb).dayOfBirth(22).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1984).country(CConstants.BRAZIL).positions(lSilvaPsgPositions).picturePath(CConstants.PICTURE_PSG_SILVA).build();
        CPlayerEntity lMarquinhos = new CPlayerEntity.CPlayerBuilder().firstName("marqui").lastName(CConstants.NAME_PSG_MARQUINHOS).team(lPsgFromDb).dayOfBirth(14).monthOfBirth(CConstants.MAY).yearOfBirth(1994).country(CConstants.BRAZIL).positions(lMarquinhosPositions).picturePath(CConstants.PICTURE_PSG_MARQUINHOS).build();
        CPlayerEntity lAurier = new CPlayerEntity.CPlayerBuilder().firstName("serge").lastName(CConstants.NAME_PSG_AURIER).team(lPsgFromDb).dayOfBirth(24).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lAurierPositions).picturePath(CConstants.PICTURE_PSG_AURIER).build();
        CPlayerEntity lKurzawa = new CPlayerEntity.CPlayerBuilder().firstName("layvin").lastName(CConstants.NAME_PSG_KURZAWA).team(lPsgFromDb).dayOfBirth(4).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lKurzawaPositions).picturePath(CConstants.PICTURE_PSG_KURZAWA).build();
        CPlayerEntity lMaxwell = new CPlayerEntity.CPlayerBuilder().firstName("maxwell").lastName(CConstants.NAME_PSG_MAXWELL).team(lPsgFromDb).dayOfBirth(27).monthOfBirth(CConstants.AUGUST).yearOfBirth(1981).country(CConstants.BRAZIL).positions(lMaxwellPositions).picturePath(CConstants.PICTURE_PSG_MAXWELL).build();
        CPlayerEntity lKimpembe = new CPlayerEntity.CPlayerBuilder().firstName("presnel").lastName(CConstants.NAME_PSG_KIMPEMBE).team(lPsgFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKimpembePositions).picturePath(CConstants.PICTURE_PSG_KIMPEMBE).build();
        CPlayerEntity lVerratti = new CPlayerEntity.CPlayerBuilder().firstName("marco").lastName(CConstants.NAME_PSG_VERRATTI).team(lPsgFromDb).dayOfBirth(5).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1992).country(CConstants.ITALY).positions(lVerrattiPositions).picturePath(CConstants.PICTURE_PSG_VERRATTI).build();
        CPlayerEntity lMotta = new CPlayerEntity.CPlayerBuilder().firstName("thiago").lastName(CConstants.NAME_PSG_MOTTA).team(lPsgFromDb).dayOfBirth(28).monthOfBirth(CConstants.AUGUST).yearOfBirth(1982).country(CConstants.ITALY).positions(lMottaPositions).picturePath(CConstants.PICTURE_PSG_MOTTA).build();
        CPlayerEntity lMatuidi = new CPlayerEntity.CPlayerBuilder().firstName("blaise").lastName(CConstants.NAME_PSG_MATUIDI).team(lPsgFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lMatuidiPositions).picturePath(CConstants.PICTURE_PSG_MATUIDI).build();
        CPlayerEntity lPastore = new CPlayerEntity.CPlayerBuilder().firstName("javier").lastName(CConstants.NAME_PSG_PASTORE).team(lPsgFromDb).dayOfBirth(20).monthOfBirth(CConstants.JUNE).yearOfBirth(1989).country(CConstants.ARGENTINA).positions(lPastorePositions).picturePath(CConstants.PICTURE_PSG_PASTORE).build();
        CPlayerEntity lHba = new CPlayerEntity.CPlayerBuilder().firstName("hatem").lastName(CConstants.NAME_PSG_BENARFA).team(lPsgFromDb).dayOfBirth(7).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lHbaPositions).picturePath(CConstants.PICTURE_PSG_BENARFA).build();
        CPlayerEntity lAdm = new CPlayerEntity.CPlayerBuilder().firstName("angel").lastName(CConstants.NAME_PSG_DIMARIA).team(lPsgFromDb).dayOfBirth(14).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1988).country(CConstants.ARGENTINA).positions(lAdmPositions).picturePath(CConstants.PICTURE_PSG_DIMARIA).build();
        CPlayerEntity lLucas = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_PSG_LUCAS).team(lPsgFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.BRAZIL).positions(lLucasPositions).picturePath(CConstants.PICTURE_PSG_LUCAS).build();
        CPlayerEntity lKrychowiak = new CPlayerEntity.CPlayerBuilder().firstName("grzegorz").lastName(CConstants.NAME_PSG_KRYCHOWIAK).team(lPsgFromDb).dayOfBirth(29).monthOfBirth(CConstants.JANUARY).yearOfBirth(1990).country(CConstants.POLAND).positions(lKrychowiakPositions).picturePath(CConstants.PICTURE_PSG_KRYCHOWIAK).build();
        CPlayerEntity lJese = new CPlayerEntity.CPlayerBuilder().firstName("jese").lastName(CConstants.NAME_PSG_JESE).team(lPsgFromDb).dayOfBirth(26).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1993).country(CConstants.SPAIN).positions(lJesePositions).picturePath(CConstants.PICTURE_PSG_JESE).build();
        CPlayerEntity lCavani = new CPlayerEntity.CPlayerBuilder().firstName("edinson").lastName(CConstants.NAME_PSG_CAVANI).team(lPsgFromDb).dayOfBirth(14).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1987).country(CConstants.URUGUAY).positions(lCavaniPositions).picturePath(CConstants.PICTURE_PSG_CAVANI).build();
        CPlayerEntity lAugustin = new CPlayerEntity.CPlayerBuilder().firstName("jean kevin").lastName(CConstants.NAME_PSG_AUGUSTIN).team(lPsgFromDb).dayOfBirth(16).monthOfBirth(CConstants.JUNE).yearOfBirth(1997).country(CConstants.FRANCE).positions(lAugustinPositions).picturePath(CConstants.PICTURE_PSG_AUGUSTIN).build();
        CPlayerEntity lAreola = new CPlayerEntity.CPlayerBuilder().firstName("alphonse").lastName(CConstants.NAME_PSG_AREOLA).team(lPsgFromDb).dayOfBirth(27).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lAreolaPositions).picturePath(CConstants.PICTURE_PSG_AREOLA).build();
        CPlayerEntity lRabiot = new CPlayerEntity.CPlayerBuilder().firstName("adrien").lastName(CConstants.NAME_PSG_RABIOT).team(lPsgFromDb).dayOfBirth(3).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lRabiotPositions).picturePath(CConstants.PICTURE_PSG_RABIOT).build();
        CPlayerEntity lStambouli = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_PSG_STAMBOULI).team(lPsgFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.FRANCE).positions(lStambouliPositions).picturePath(CConstants.PICTURE_PSG_STAMBOULI).build();
        CPlayerEntity lOngenda = new CPlayerEntity.CPlayerBuilder().firstName("hervin").lastName(CConstants.NAME_PSG_ONGENDA).team(lPsgFromDb).dayOfBirth(24).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.FRANCE).positions(lOngendaPositions).picturePath(CConstants.PICTURE_PSG_ONGENDA).build();
        CPlayerEntity lNkunku = new CPlayerEntity.CPlayerBuilder().firstName("christopher").lastName(CConstants.NAME_PSG_NKUNKU).team(lPsgFromDb).dayOfBirth(14).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lNkunkuPositions).picturePath(CConstants.PICTURE_PSG_NKUNKU).build();
        CPlayerEntity lAlec = new CPlayerEntity.CPlayerBuilder().firstName("georgen").lastName(CConstants.NAME_PSG_ALEC).team(lPsgFromDb).dayOfBirth(17).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1998).country(CConstants.FRANCE).positions(lAlecPositions).picturePath(CConstants.PICTURE_PSG_ALEC).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTrapp);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAreola);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSilvaPsg);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLuiz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarquinhos);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKimpembe);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaxwell);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKurzawa);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAurier);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMeunier);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAlec);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKrychowiak);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVerratti);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMatuidi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMotta);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHba);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAdm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPastore);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLucas);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJese);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCavani);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAugustin);
            lCrudMethods.commitTransaction();
        }


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRabiot);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lOngenda);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNkunku);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lStambouli);
            lCrudMethods.commitTransaction();
        }

        // RENNES

        List<CPositionEntity> lCostilPositions = new ArrayList<CPositionEntity>();
        lCostilPositions.add(lGk);

        List<CPositionEntity> lDialloRennesPositions = new ArrayList<CPositionEntity>();
        lDialloPositions.add(lGk);

        List<CPositionEntity> lNardiPositions = new ArrayList<CPositionEntity>();
        lNardiPositions.add(lGk);

        List<CPositionEntity> lGertmonasPositions = new ArrayList<CPositionEntity>();
        lGertmonasPositions.add(lGk);

        List<CPositionEntity> lArmandPositions = new ArrayList<CPositionEntity>();
        lArmandPositions.add(lCb);
        lArmandPositions.add(lLb);

        List<CPositionEntity> lMendesRennesPositions = new ArrayList<CPositionEntity>();
        lMendesPositions.add(lCb);
        lMendesPositions.add(lRb);

        List<CPositionEntity> lMexerPositions = new ArrayList<CPositionEntity>();
        lMexerPositions.add(lCb);

        List<CPositionEntity> lBensebainiPositions = new ArrayList<CPositionEntity>();
        lBensebainiPositions.add(lCb);

        List<CPositionEntity> lBaalPositions = new ArrayList<CPositionEntity>();
        lBaalPositions.add(lLb);

        List<CPositionEntity> lZeffanePositions = new ArrayList<CPositionEntity>();
        lZeffanePositions.add(lRb);
        lZeffanePositions.add(lRw);

        List<CPositionEntity> lDanzePositions = new ArrayList<CPositionEntity>();
        lDanzePositions.add(lRb);

        List<CPositionEntity> lCavarePositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lFigueiredoPositions = new ArrayList<CPositionEntity>();
        lFigueiredoPositions.add(lLb);

        List<CPositionEntity> lGnagnonPositions = new ArrayList<CPositionEntity>();
        lGnagnonPositions.add(lCb);
        lGnagnonPositions.add(lCdm);



        List<CPositionEntity> lAndrePositions = new ArrayList<CPositionEntity>();
        lAndrePositions.add(lCdm);
        lAndrePositions.add(lCm);

        List<CPositionEntity> lGourcuffPositions = new ArrayList<CPositionEntity>();
        lGourcuffPositions.add(lCam);
        lGourcuffPositions.add(lCm);

        List<CPositionEntity> lJanvierPositions = new ArrayList<CPositionEntity>();
        lJanvierPositions.add(lCam);
        lJanvierPositions.add(lCm);

        List<CPositionEntity> lFernandesPositions = new ArrayList<CPositionEntity>();
        lFernandesPositions.add(lCdm);
        lFernandesPositions.add(lCm);

        List<CPositionEntity> lSyllaPositions = new ArrayList<CPositionEntity>();
        lSyllaPositions.add(lCdm);

        List<CPositionEntity> lChantomePositions = new ArrayList<CPositionEntity>();
        lChantomePositions.add(lCm);
        lChantomePositions.add(lCam);

        List<CPositionEntity> lHunouPositions = new ArrayList<CPositionEntity>();
        lHunouPositions.add(lCam);
        lHunouPositions.add(lRw);

        List<CPositionEntity> lPrcicPositions = new ArrayList<CPositionEntity>();
        lPrcicPositions.add(lCam);
        lPrcicPositions.add(lLw);

        List<CPositionEntity> lRibelinPositions = new ArrayList<CPositionEntity>();
        lRibelinPositions.add(lCam);

        List<CPositionEntity> lErasmusPositions = new ArrayList<CPositionEntity>();
        lErasmusPositions.add(lSt);

        List<CPositionEntity> lGrosickiPositions = new ArrayList<CPositionEntity>();
        lGrosickiPositions.add(lLw);
        lGrosickiPositions.add(lRw);

        List<CPositionEntity> lHabibouPositions = new ArrayList<CPositionEntity>();
        lHabibouPositions.add(lSt);

        List<CPositionEntity> lSaidPositions = new ArrayList<CPositionEntity>();
        lSaidPositions.add(lSt);
        lSaidPositions.add(lRw);
        lSaidPositions.add(lLw);

        List<CPositionEntity> lSioPositions = new ArrayList<CPositionEntity>();
        lSioPositions.add(lSt);

        List<CPositionEntity> lHenriqueRennesPositions = new ArrayList<CPositionEntity>();
        lHenriquePositions.add(lSt);
        lHenriquePositions.add(lRw);

        List<CPositionEntity> lNtepPositions = new ArrayList<CPositionEntity>();
        lNtepPositions.add(lLw);




        // players

        CPlayerEntity lCostil = new CPlayerEntity.CPlayerBuilder().firstName("benoit").lastName(CConstants.NAME_RENNES_COSTIL).team(lRennesFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1987).country(CConstants.FRANCE).positions(lCostilPositions).picturePath(CConstants.PICTURE_RENNES_COSTIL).build();
        CPlayerEntity lDialloRennes = new CPlayerEntity.CPlayerBuilder().firstName("abdoulaye").lastName(CConstants.NAME_RENNES_DIALLO).team(lRennesFromDb).dayOfBirth(3).monthOfBirth(CConstants.MARCH).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDialloRennesPositions).picturePath(CConstants.PICTURE_RENNES_DIALLO).build();
        CPlayerEntity lGertmonas = new CPlayerEntity.CPlayerBuilder().firstName("edvinas").lastName(CConstants.NAME_RENNES_GERTMONAS).team(lRennesFromDb).dayOfBirth(1).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lGertmonasPositions).picturePath(CConstants.PICTURE_RENNES_GERTMONAS).build();
        CPlayerEntity lNardi = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_RENNES_NARDI).team(lRennesFromDb).dayOfBirth(18).monthOfBirth(CConstants.MAY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lNardiPositions).picturePath(CConstants.PICTURE_RENNES_NARDI).build();

        CPlayerEntity lArmand = new CPlayerEntity.CPlayerBuilder().firstName("sylvain").lastName(CConstants.NAME_RENNES_ARMAND).team(lRennesFromDb).dayOfBirth(1).monthOfBirth(CConstants.AUGUST).yearOfBirth(1980).country(CConstants.FRANCE).positions(lArmandPositions).picturePath(CConstants.PICTURE_RENNES_ARMAND).build();
        CPlayerEntity lBaal = new CPlayerEntity.CPlayerBuilder().firstName("ludovic").lastName(CConstants.NAME_RENNES_BAAL).team(lRennesFromDb).dayOfBirth(24).monthOfBirth(CConstants.MAY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lBaalPositions).picturePath(CConstants.PICTURE_RENNES_BAAL).build();
        CPlayerEntity lBensebaini = new CPlayerEntity.CPlayerBuilder().firstName("ramy").lastName(CConstants.NAME_RENNES_BENSEBAINI).team(lRennesFromDb).dayOfBirth(16).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.ALGERIA).positions(lBensebainiPositions).picturePath(CConstants.PICTURE_RENNES_BENSEBAINI).build();
        CPlayerEntity lCavare = new CPlayerEntity.CPlayerBuilder().firstName("dimitri").lastName(CConstants.NAME_RENNES_CAVARE).team(lRennesFromDb).dayOfBirth(5).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCavarePositions).picturePath(CConstants.PICTURE_RENNES_CAVARE).build();
        CPlayerEntity lDanze = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_RENNES_DANZE).team(lRennesFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lDanzePositions).picturePath(CConstants.PICTURE_RENNES_DANZE).build();
        CPlayerEntity lFigueiredo = new CPlayerEntity.CPlayerBuilder().firstName("afonso").lastName(CConstants.NAME_RENNES_FIGUEIREDO).team(lRennesFromDb).dayOfBirth(6).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.PORTUGAL).positions(lFigueiredoPositions).picturePath(CConstants.PICTURE_RENNES_FIGUEIREDO).build();
        CPlayerEntity lGnagnon = new CPlayerEntity.CPlayerBuilder().firstName("joris").lastName(CConstants.NAME_RENNES_GNAGNON).team(lRennesFromDb).dayOfBirth(13).monthOfBirth(CConstants.JANUARY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lGnagnonPositions).picturePath(CConstants.PICTURE_RENNES_GNAGNON).build();
        CPlayerEntity lMendesRennes = new CPlayerEntity.CPlayerBuilder().firstName("pedro").lastName(CConstants.NAME_RENNES_MENDES).team(lRennesFromDb).dayOfBirth(1).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.PORTUGAL).positions(lMendesRennesPositions).picturePath(CConstants.PICTURE_RENNES_MENDES).build();
        CPlayerEntity lMexer = new CPlayerEntity.CPlayerBuilder().firstName("edson").lastName(CConstants.NAME_RENNES_MEXER).team(lRennesFromDb).dayOfBirth(8).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.MOZAMBIQUE).positions(lMexerPositions).picturePath(CConstants.PICTURE_RENNES_MEXER).build();
        CPlayerEntity lZeffane = new CPlayerEntity.CPlayerBuilder().firstName("mehdi").lastName(CConstants.NAME_RENNES_ZEFFANE).team(lRennesFromDb).dayOfBirth(19).monthOfBirth(CConstants.MAY).yearOfBirth(1992).country(CConstants.ALGERIA).positions(lZeffanePositions).picturePath(CConstants.PICTURE_RENNES_ZEFFANE).build();

        CPlayerEntity lAndre = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_RENNES_ANDRE).team(lRennesFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.FRANCE).positions(lAndrePositions).picturePath(CConstants.PICTURE_RENNES_ANDRE).build();
        CPlayerEntity lChantome = new CPlayerEntity.CPlayerBuilder().firstName("clement").lastName(CConstants.NAME_RENNES_CHANTOME).team(lRennesFromDb).dayOfBirth(11).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1987).country(CConstants.FRANCE).positions(lChantomePositions).picturePath(CConstants.PICTURE_RENNES_CHANTOME).build();
        CPlayerEntity lFernandes = new CPlayerEntity.CPlayerBuilder().firstName("gelson").lastName(CConstants.NAME_RENNES_FERNANDES).team(lRennesFromDb).dayOfBirth(2).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1986).country(CConstants.SWITZERLAND).positions(lFernandesPositions).picturePath(CConstants.PICTURE_RENNES_FERNANDES).build();
        CPlayerEntity lGourcuff = new CPlayerEntity.CPlayerBuilder().firstName("yoann").lastName(CConstants.NAME_RENNES_GOURCUFF).team(lRennesFromDb).dayOfBirth(11).monthOfBirth(CConstants.JULY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lGourcuffPositions).picturePath(CConstants.PICTURE_RENNES_GOURCUFF).build();
        CPlayerEntity lHunou = new CPlayerEntity.CPlayerBuilder().firstName("adrien").lastName(CConstants.NAME_RENNES_HUNOU).team(lRennesFromDb).dayOfBirth(19).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lHunouPositions).picturePath(CConstants.PICTURE_RENNES_HUNOU).build();
        CPlayerEntity lJanvier = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_RENNES_JANVIER).team(lRennesFromDb).dayOfBirth(11).monthOfBirth(CConstants.AUGUST).yearOfBirth(1998).country(CConstants.FRANCE).positions(lJanvierPositions).picturePath(CConstants.PICTURE_RENNES_JANVIER).build();
        CPlayerEntity lPrcic = new CPlayerEntity.CPlayerBuilder().firstName("sanjin").lastName(CConstants.NAME_RENNES_PRCIC).team(lRennesFromDb).dayOfBirth(20).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPrcicPositions).picturePath(CConstants.PICTURE_RENNES_PRCIC).build();
        CPlayerEntity lRibelin = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_RENNES_RIBELIN).team(lRennesFromDb).dayOfBirth(8).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.FRANCE).positions(lRibelinPositions).picturePath(CConstants.PICTURE_RENNES_RIBELIN).build();

        CPlayerEntity lErasmus = new CPlayerEntity.CPlayerBuilder().firstName("kermit").lastName(CConstants.NAME_RENNES_ERASMUS).team(lRennesFromDb).dayOfBirth(8).monthOfBirth(CConstants.JULY).yearOfBirth(1990).country(CConstants.SOUTHAFRICA).positions(lErasmusPositions).picturePath(CConstants.PICTURE_RENNES_ERASMUS).build();
        CPlayerEntity lGrosicki = new CPlayerEntity.CPlayerBuilder().firstName("kamil").lastName(CConstants.NAME_RENNES_GROSICKI).team(lRennesFromDb).dayOfBirth(8).monthOfBirth(CConstants.JUNE).yearOfBirth(1988).country(CConstants.POLAND).positions(lGrosickiPositions).picturePath(CConstants.PICTURE_RENNES_GROSICKI).build();
        CPlayerEntity lHabibou = new CPlayerEntity.CPlayerBuilder().firstName("habib").lastName(CConstants.NAME_RENNES_HABIBOU).team(lRennesFromDb).dayOfBirth(16).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lHabibouPositions).picturePath(CConstants.PICTURE_RENNES_HABIBOU).build();
        CPlayerEntity lPedroHenrique = new CPlayerEntity.CPlayerBuilder().firstName("pedro").lastName(CConstants.NAME_NICE_HENRIQUE).team(lRennesFromDb).dayOfBirth(16).monthOfBirth(CConstants.JUNE).yearOfBirth(1990).country(CConstants.BRAZIL).positions(lHenriqueRennesPositions).picturePath(CConstants.PICTURE_RENNES_HENRIQUE).build();
        CPlayerEntity lNtep = new CPlayerEntity.CPlayerBuilder().firstName("paul georges").lastName(CConstants.NAME_RENNES_NTEP).team(lRennesFromDb).dayOfBirth(29).monthOfBirth(CConstants.JULY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lNtepPositions).picturePath(CConstants.PICTURE_RENNES_NTEP).build();
        CPlayerEntity lSaid = new CPlayerEntity.CPlayerBuilder().firstName("wesley").lastName(CConstants.NAME_RENNES_SAID).team(lRennesFromDb).dayOfBirth(16).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lSaidPositions).picturePath(CConstants.PICTURE_RENNES_SAID).build();
        CPlayerEntity lSio = new CPlayerEntity.CPlayerBuilder().firstName("giovanni").lastName(CConstants.NAME_RENNES_SIO).team(lRennesFromDb).dayOfBirth(31).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.IVORYCOAST).positions(lSioPositions).picturePath(CConstants.PICTURE_RENNES_SIO).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCostil);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNardi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGertmonas);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lArmand);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendesRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMexer);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBensebaini);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDanze);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lZeffane);
            lCrudMethods.commitTransaction();
        }



        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFigueiredo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCavare);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGnagnon);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBaal);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAndre);
            lCrudMethods.commitTransaction();
        }



        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lChantome);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPrcic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGourcuff);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJanvier);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHunou);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFernandes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRibelin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGrosicki);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lErasmus);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPedroHenrique);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNtep);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaid);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSio);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHabibou);
            lCrudMethods.commitTransaction();
        }

        // SAINT ETIENNE

        List<CPositionEntity> lMaisonnialPositions = new ArrayList<CPositionEntity>();
        lMaisonnialPositions.add(lGk);

        List<CPositionEntity> lRuffierPositions = new ArrayList<CPositionEntity>();
        lRuffierPositions.add(lGk);

        List<CPositionEntity> lMoulinPositions = new ArrayList<CPositionEntity>();
        lMoulinPositions.add(lGk);

        List<CPositionEntity> lPogbaPositions = new ArrayList<CPositionEntity>();
        lPogbaPositions.add(lCb);

        List<CPositionEntity> lKtcPositions = new ArrayList<CPositionEntity>();
        lKtcPositions.add(lRb);

        List<CPositionEntity> lPolomatPositions = new ArrayList<CPositionEntity>();
        lPolomatPositions.add(lLb);

        List<CPositionEntity> lPerrinAssePositions = new ArrayList<CPositionEntity>();
        lPerrinPositions.add(lCb);

        List<CPositionEntity> lMbenguePositions = new ArrayList<CPositionEntity>();
        lMbenguePositions.add(lLb);

        List<CPositionEntity> lMalcuitPositions = new ArrayList<CPositionEntity>();
        lMalcuitPositions.add(lRb);


        List<CPositionEntity> lDaboAssePositions = new ArrayList<CPositionEntity>();
        lDaboPositions.add(lCdm);

        List<CPositionEntity> lPajotPositions = new ArrayList<CPositionEntity>();
        lPajotPositions.add(lCm);

        List<CPositionEntity> lClementPositions = new ArrayList<CPositionEntity>();
        lClementPositions.add(lCm);

        List<CPositionEntity> lCorgnetPositions = new ArrayList<CPositionEntity>();
        lCorgnetPositions.add(lCam);

        List<CPositionEntity> lSelnaesPositions = new ArrayList<CPositionEntity>();
        lSelnaesPositions.add(lCm);

        List<CPositionEntity> lLemoinePositions = new ArrayList<CPositionEntity>();
        lLemoinePositions.add(lCm);


        List<CPositionEntity> lBambaPositions = new ArrayList<CPositionEntity>();
        lBambaPositions.add(lRw);

        List<CPositionEntity> lBericPositions = new ArrayList<CPositionEntity>();
        lBericPositions.add(lSt);

        List<CPositionEntity> lRouxPositions = new ArrayList<CPositionEntity>();
        lRouxPositions.add(lSt);
        lRouxPositions.add(lRw);

        List<CPositionEntity> lTannanePositions = new ArrayList<CPositionEntity>();
        lTannanePositions.add(lLw);

        List<CPositionEntity> lMolloPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lHamoumaPositions = new ArrayList<CPositionEntity>();
        lHamoumaPositions.add(lRw);

        List<CPositionEntity> lSoderlundPositions = new ArrayList<CPositionEntity>();
        lSoderlundPositions.add(lSt);

        List<CPositionEntity> lMonnetPaquetPositions = new ArrayList<CPositionEntity>();
        lMonnetPaquetPositions.add(lLw);

        List<CPositionEntity> lSaivetPositions = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lVeretoutPositions = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLacroixPositions = new ArrayList<CPositionEntity>();





        // players

        CPlayerEntity lMaisonnial = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_ASSE_MAISONNIAL).team(lSainteFromDb).dayOfBirth(23).monthOfBirth(CConstants.MARCH).yearOfBirth(1998).country(CConstants.FRANCE).positions(lMaisonnialPositions).picturePath(CConstants.PICTURE_ASSE_MAISONNIAL).build();
        CPlayerEntity lRuffier = new CPlayerEntity.CPlayerBuilder().firstName("stephane").lastName(CConstants.NAME_ASSE_RUFFIER).team(lSainteFromDb).dayOfBirth(27).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1986).country(CConstants.FRANCE).positions(lRuffierPositions).picturePath(CConstants.PICTURE_ASSE_RUFFIER).build();
        CPlayerEntity lMoulin = new CPlayerEntity.CPlayerBuilder().firstName("jessy").lastName(CConstants.NAME_ASSE_MOULIN).team(lSainteFromDb).dayOfBirth(13).monthOfBirth(CConstants.JANUARY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lMoulinPositions).picturePath(CConstants.PICTURE_ASSE_MOULIN).build();

        CPlayerEntity lKtc = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_ASSE_KTC).team(lSainteFromDb).dayOfBirth(28).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lKtcPositions).picturePath(CConstants.PICTURE_ASSE_KTC).build();
        CPlayerEntity lPolomat = new CPlayerEntity.CPlayerBuilder().firstName("pierre yves").lastName(CConstants.NAME_ASSE_POLOMAT).team(lSainteFromDb).dayOfBirth(27).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPolomatPositions).picturePath(CConstants.PICTURE_ASSE_POLOMAT).build();
        CPlayerEntity lMbengue = new CPlayerEntity.CPlayerBuilder().firstName("cheick").lastName(CConstants.NAME_ASSE_MBENGUE).team(lSainteFromDb).dayOfBirth(23).monthOfBirth(CConstants.JULY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lMbenguePositions).picturePath(CConstants.PICTURE_ASSE_MBENGUE).build();
        CPlayerEntity lPogba = new CPlayerEntity.CPlayerBuilder().firstName("florentin").lastName(CConstants.NAME_ASSE_POGBA).team(lSainteFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.FRANCE).positions(lPogbaPositions).picturePath(CConstants.PICTURE_ASSE_POGBA).build();
        CPlayerEntity lPerrinAsse = new CPlayerEntity.CPlayerBuilder().firstName("loic").lastName(CConstants.NAME_ASSE_PERRIN).team(lSainteFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1985).country(CConstants.FRANCE).positions(lPerrinAssePositions).picturePath(CConstants.PICTURE_ASSE_PERRIN).build();
        CPlayerEntity lMalcuit = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_ASSE_MALCUIT).team(lSainteFromDb).dayOfBirth(31).monthOfBirth(CConstants.JULY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lMalcuitPositions).picturePath(CConstants.PICTURE_ASSE_MALCUIT).build();
        CPlayerEntity lLacroix = new CPlayerEntity.CPlayerBuilder().firstName("fabien").lastName(CConstants.NAME_ASSE_LEMOINE).team(lSainteFromDb).dayOfBirth(16).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLemoinePositions).picturePath(CConstants.PICTURE_ASSE_LEMOINE).build();


        CPlayerEntity lDaboAsse = new CPlayerEntity.CPlayerBuilder().firstName("bryan").lastName(CConstants.NAME_ASSE_DABO).team(lSainteFromDb).dayOfBirth(18).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDaboAssePositions).picturePath(CConstants.PICTURE_ASSE_DABO).build();
        CPlayerEntity lPajot = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_ASSE_PAJOT).team(lSainteFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1995).country(CConstants.FRANCE).positions(lPajotPositions).picturePath(CConstants.PICTURE_ASSE_PAJOT).build();
        CPlayerEntity lClement = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_ASSE_CLEMENT).team(lSainteFromDb).dayOfBirth(26).monthOfBirth(CConstants.AUGUST).yearOfBirth(1984).country(CConstants.FRANCE).positions(lClementPositions).picturePath(CConstants.PICTURE_ASSE_CLEMENT).build();
        CPlayerEntity lCorgnet = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_ASSE_CORGNET).team(lSainteFromDb).dayOfBirth(6).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lCorgnetPositions).picturePath(CConstants.PICTURE_ASSE_CORGNET).build();
        CPlayerEntity lSelnaes = new CPlayerEntity.CPlayerBuilder().firstName("ole").lastName(CConstants.NAME_ASSE_SELNAES).team(lSainteFromDb).dayOfBirth(7).monthOfBirth(CConstants.JULY).yearOfBirth(1994).country(CConstants.NORWAY).positions(lSelnaesPositions).picturePath(CConstants.PICTURE_ASSE_SELNAES).build();
        CPlayerEntity lLemoine = new CPlayerEntity.CPlayerBuilder().firstName("fabien").lastName(CConstants.NAME_ASSE_LEMOINE).team(lSainteFromDb).dayOfBirth(16).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLemoinePositions).picturePath(CConstants.PICTURE_ASSE_LEMOINE).build();
        CPlayerEntity lVeretout = new CPlayerEntity.CPlayerBuilder().firstName("fabien").lastName(CConstants.NAME_ASSE_LEMOINE).team(lSainteFromDb).dayOfBirth(16).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLemoinePositions).picturePath(CConstants.PICTURE_ASSE_LEMOINE).build();
        CPlayerEntity lSaivet = new CPlayerEntity.CPlayerBuilder().firstName("fabien").lastName(CConstants.NAME_ASSE_LEMOINE).team(lSainteFromDb).dayOfBirth(16).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLemoinePositions).picturePath(CConstants.PICTURE_ASSE_LEMOINE).build();


        CPlayerEntity lRoux = new CPlayerEntity.CPlayerBuilder().firstName("nolan").lastName(CConstants.NAME_ASSE_ROUX).team(lSainteFromDb).dayOfBirth(1).monthOfBirth(CConstants.MARCH).yearOfBirth(1988).country(CConstants.FRANCE).positions(lRouxPositions).picturePath(CConstants.PICTURE_ASSE_ROUX).build();
        CPlayerEntity lTannane = new CPlayerEntity.CPlayerBuilder().firstName("oussama").lastName(CConstants.NAME_ASSE_TANNANE).team(lSainteFromDb).dayOfBirth(23).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.TUNISIA).positions(lTannanePositions).picturePath(CConstants.PICTURE_ASSE_TANNANE).build();
        CPlayerEntity lMollo = new CPlayerEntity.CPlayerBuilder().firstName("yohan").lastName(CConstants.NAME_ASSE_MOLLO).team(lSainteFromDb).dayOfBirth(18).monthOfBirth(CConstants.JULY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lMolloPositions).picturePath(CConstants.PICTURE_ASSE_MOLLO).build();
        CPlayerEntity lHamouma = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_ASSE_HAMOUMA).team(lSainteFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lHamoumaPositions).picturePath(CConstants.PICTURE_ASSE_HAMOUMA).build();
        CPlayerEntity lKmp = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_ASSE_KMP).team(lSainteFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1988).country(CConstants.NORWAY).positions(lMonnetPaquetPositions).picturePath(CConstants.PICTURE_ASSE_KMP).build();
        CPlayerEntity lSoderlund = new CPlayerEntity.CPlayerBuilder().firstName("alexander").lastName(CConstants.NAME_ASSE_SODERLUND).team(lSainteFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lSoderlundPositions).picturePath(CConstants.PICTURE_ASSE_SODERLUND).build();
        CPlayerEntity lBeric = new CPlayerEntity.CPlayerBuilder().firstName("robert").lastName(CConstants.NAME_ASSE_BERIC).team(lSainteFromDb).dayOfBirth(17).monthOfBirth(CConstants.JUNE).yearOfBirth(1991).country(CConstants.SLOVENIA).positions(lBericPositions).picturePath(CConstants.PICTURE_ASSE_BERIC).build();
        CPlayerEntity lBamba = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_ASSE_BAMBA).team(lSainteFromDb).dayOfBirth(26).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBambaPositions).picturePath(CConstants.PICTURE_ASSE_BAMBA).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaisonnial);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRuffier);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMoulin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMalcuit);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKtc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMbengue);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPerrinAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPogba);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPolomat);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDaboAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLemoine);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCorgnet);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPajot);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSelnaes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lClement);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRoux);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBamba);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBeric);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSoderlund);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTannane);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKmp);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHamouma);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMollo);
            lCrudMethods.commitTransaction();
        }

        // TOULOUSE

        List<CPositionEntity> lLafontPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVidalPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lGoicoecheaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMoubandjePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNinkovPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSpajicPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVeskovacPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lYagoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSyllaToulousePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lJullienPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDiopPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lAkpaAkproPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDoumbiaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBodigerPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lTrejoPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSirieixPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBlinPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSomaliaPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPiPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSangarePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBraithwaitePositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPesicPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lToivonenPositions = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lEdouardPositions = new ArrayList<CPositionEntity>();


        // players

        CPlayerEntity lLafont = new CPlayerEntity.CPlayerBuilder().firstName("alban").lastName(CConstants.NAME_TOULOUSE_LAFONT).team(lToulouseFromDb).dayOfBirth(23).monthOfBirth(CConstants.JANUARY).yearOfBirth(1999).country(CConstants.FRANCE).positions(lLafontPositions).picturePath(CConstants.PICTURE_TOULOUSE_LAFONT).build();
        CPlayerEntity lVidal = new CPlayerEntity.CPlayerBuilder().firstName("marc").lastName(CConstants.NAME_TOULOUSE_VIDAL).team(lToulouseFromDb).dayOfBirth(3).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lVidalPositions).picturePath(CConstants.PICTURE_TOULOUSE_VIDAL).build();
        CPlayerEntity lGoicoechea = new CPlayerEntity.CPlayerBuilder().firstName("mauro").lastName(CConstants.NAME_TOULOUSE_GOIGOECHEA).team(lToulouseFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1988).country(CConstants.URUGUAY).positions(lGoicoecheaPositions).picturePath(CConstants.PICTURE_TOULOUSE_GOIGOECHEA).build();

        CPlayerEntity lMoubandje = new CPlayerEntity.CPlayerBuilder().firstName("francois").lastName(CConstants.NAME_TOULOUSE_MOUBANDJE).team(lToulouseFromDb).dayOfBirth(21).monthOfBirth(CConstants.JUNE).yearOfBirth(1990).country(CConstants.SWITZERLAND).positions(lMoubandjePositions).picturePath(CConstants.PICTURE_TOULOUSE_MOUBANDJE).build();
        CPlayerEntity lNinkov = new CPlayerEntity.CPlayerBuilder().firstName("pavle").lastName(CConstants.NAME_TOULOUSE_NINKOV).team(lToulouseFromDb).dayOfBirth(20).monthOfBirth(CConstants.APRIL).yearOfBirth(1985).country(CConstants.SERBIA).positions(lNinkovPositions).picturePath(CConstants.PICTURE_TOULOUSE_NINKOV).build();
        CPlayerEntity lSpajic = new CPlayerEntity.CPlayerBuilder().firstName("uros").lastName(CConstants.NAME_TOULOUSE_SPAJIC).team(lToulouseFromDb).dayOfBirth(13).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1993).country(CConstants.SERBIA).positions(lSpajicPositions).picturePath(CConstants.PICTURE_TOULOUSE_SPAJIC).build();
        CPlayerEntity lVeskovac = new CPlayerEntity.CPlayerBuilder().firstName("dusan").lastName(CConstants.NAME_TOULOUSE_VESKOVAC).team(lToulouseFromDb).dayOfBirth(13).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.SERBIA).positions(lVeskovacPositions).picturePath(CConstants.PICTURE_TOULOUSE_VESKOVAC).build();
        CPlayerEntity lYago = new CPlayerEntity.CPlayerBuilder().firstName("steeve").lastName(CConstants.NAME_TOULOUSE_YAGO).team(lToulouseFromDb).dayOfBirth(16).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lYagoPositions).picturePath(CConstants.PICTURE_TOULOUSE_YAGO).build();
        CPlayerEntity lSyllaToulouse = new CPlayerEntity.CPlayerBuilder().firstName("issiaga").lastName(CConstants.NAME_RENNES_SYLLA).team(lToulouseFromDb).dayOfBirth(1).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lSyllaToulousePositions).picturePath(CConstants.PICTURE_TOULOUSE_SYLLA).build();
        CPlayerEntity lJullien = new CPlayerEntity.CPlayerBuilder().firstName("christopher").lastName(CConstants.NAME_TOULOUSE_JULLIEN).team(lToulouseFromDb).dayOfBirth(22).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.FRANCE).positions(lJullienPositions).picturePath(CConstants.PICTURE_TOULOUSE_JULLIEN).build();
        CPlayerEntity lDiop = new CPlayerEntity.CPlayerBuilder().firstName("issa").lastName(CConstants.NAME_TOULOUSE_DIOP).team(lToulouseFromDb).dayOfBirth(9).monthOfBirth(CConstants.JANUARY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lDiopPositions).picturePath(CConstants.PICTURE_TOULOUSE_DIOP).build();

        CPlayerEntity lAkpaAkpro = new CPlayerEntity.CPlayerBuilder().firstName("jean daniel").lastName(CConstants.NAME_TOULOUSE_AKPAAKPRO).team(lToulouseFromDb).dayOfBirth(11).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lAkpaAkproPositions).picturePath(CConstants.PICTURE_TOULOUSE_AKPAAKPRO).build();
        CPlayerEntity lDoumbia = new CPlayerEntity.CPlayerBuilder().firstName("tongo").lastName(CConstants.NAME_TOULOUSE_DOUMBIA).team(lToulouseFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1989).country(CConstants.MALI).positions(lDoumbiaPositions).picturePath(CConstants.PICTURE_TOULOUSE_DOUMBIA).build();
        CPlayerEntity lBodiger = new CPlayerEntity.CPlayerBuilder().firstName("yann").lastName(CConstants.NAME_TOULOUSE_BODIGER).team(lToulouseFromDb).dayOfBirth(9).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lBodigerPositions).picturePath(CConstants.PICTURE_TOULOUSE_BODIGER).build();
        CPlayerEntity lTrejo = new CPlayerEntity.CPlayerBuilder().firstName("oscar").lastName(CConstants.NAME_TOULOUSE_TREJO).team(lToulouseFromDb).dayOfBirth(26).monthOfBirth(CConstants.APRIL).yearOfBirth(1988).country(CConstants.FRANCE).positions(lTrejoPositions).picturePath(CConstants.PICTURE_TOULOUSE_TREJO).build();
        CPlayerEntity lSirieix = new CPlayerEntity.CPlayerBuilder().firstName("pantxi").lastName(CConstants.NAME_TOULOUSE_SIRIEIX).team(lToulouseFromDb).dayOfBirth(7).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1980).country(CConstants.FRANCE).positions(lSirieixPositions).picturePath(CConstants.PICTURE_TOULOUSE_SIRIEIX).build();
        CPlayerEntity lBlin = new CPlayerEntity.CPlayerBuilder().firstName("alexis").lastName(CConstants.NAME_TOULOUSE_BLIN).team(lToulouseFromDb).dayOfBirth(16).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBlinPositions).picturePath(CConstants.PICTURE_TOULOUSE_BLIN).build();
        CPlayerEntity lSomalia = new CPlayerEntity.CPlayerBuilder().firstName("wergiton").lastName(CConstants.NAME_TOULOUSE_SOMALIA).team(lToulouseFromDb).dayOfBirth(28).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.BRAZIL).positions(lSomaliaPositions).picturePath(CConstants.PICTURE_TOULOUSE_SOMALIA).build();
        CPlayerEntity lPi = new CPlayerEntity.CPlayerBuilder().firstName("jessy").lastName(CConstants.NAME_TOULOUSE_PI).team(lToulouseFromDb).dayOfBirth(24).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPiPositions).picturePath(CConstants.PICTURE_TOULOUSE_PI).build();
        CPlayerEntity lSangare = new CPlayerEntity.CPlayerBuilder().firstName("ibrahim").lastName(CConstants.NAME_TOULOUSE_SANGARE).team(lToulouseFromDb).dayOfBirth(2).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1997).country(CConstants.IVORYCOAST).positions(lSangarePositions).picturePath(CConstants.PICTURE_TOULOUSE_SANGARE).build();

        CPlayerEntity lBraithwaite = new CPlayerEntity.CPlayerBuilder().firstName("martin").lastName(CConstants.NAME_TOULOUSE_BRAITHWAITE).team(lToulouseFromDb).dayOfBirth(5).monthOfBirth(CConstants.JUNE).yearOfBirth(1991).country(CConstants.DENMARK).positions(lBraithwaitePositions).picturePath(CConstants.PICTURE_TOULOUSE_BRAITHWAITE).build();
        CPlayerEntity lPesic = new CPlayerEntity.CPlayerBuilder().firstName("aleksandar").lastName(CConstants.NAME_TOULOUSE_PESIC).team(lToulouseFromDb).dayOfBirth(21).monthOfBirth(CConstants.MAY).yearOfBirth(1992).country(CConstants.SERBIA).positions(lPesicPositions).picturePath(CConstants.PICTURE_TOULOUSE_PESIC).build();
        CPlayerEntity lToivonen = new CPlayerEntity.CPlayerBuilder().firstName("ola").lastName(CConstants.NAME_TOULOUSE_TOIVONEN).team(lToulouseFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1987).country(CConstants.SWEDEN).positions(lToivonenPositions).picturePath(CConstants.PICTURE_TOULOUSE_TOIVONEN).build();
        CPlayerEntity lEdouard = new CPlayerEntity.CPlayerBuilder().firstName("odsonne").lastName(CConstants.NAME_TOULOUSE_EDOUARD).team(lToulouseFromDb).dayOfBirth(16).monthOfBirth(CConstants.JANUARY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lEdouardPositions).picturePath(CConstants.PICTURE_TOULOUSE_EDOUARD).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEdouard);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToivonen);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPesic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBraithwaite);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSangare);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPi);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSomalia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBlin);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSirieix);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTrejo);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBodiger);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDoumbia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAkpaAkpro);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiop);
            lCrudMethods.commitTransaction();
        }


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSyllaToulouse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJullien);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lYago);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVeskovac);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSpajic);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNinkov);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMoubandje);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGoicoechea);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLafont);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVidal);
            lCrudMethods.commitTransaction();
        }

    }
}
