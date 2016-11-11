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
 * Created by marti on 19/08/2016.
 */
public class CCreateAngersPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lAngersFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.ANGERS).parameters())).get(0);


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

        List<CPositionEntity> lLetellierPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMichelPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPetricPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAndreuPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBourillonPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDialloPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLaidouniPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lManceauPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMartinezPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPavlovicPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lThomasPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTraorePositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCapellePositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lManganiPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNdoyePositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSaissPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSantamariaPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSerinPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTaitPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDiedhiouPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKetkeoPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNwakaemePositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDorePositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPepePositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSunuPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTokoEkambiPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lWissaPositionsAngers = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSaihiPositionsAngers = new ArrayList<CPositionEntity>();



        // players

        // gks
        CPlayerEntity lLetellierAngers = new CPlayerEntity.CPlayerBuilder().firstName("alexandre").lastName(CConstants.NAME_ANGERS_LETELLIER).team(lAngersFromDb).dayOfBirth(11).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lLetellierPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_LETELLIER).build();
        CPlayerEntity lMichelAngers = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_ANGERS_MICHEL).team(lAngersFromDb).dayOfBirth(4).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lMichelPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_MICHEL).build();
        CPlayerEntity lPetricAngers = new CPlayerEntity.CPlayerBuilder().firstName("denis").lastName(CConstants.NAME_ANGERS_PETRIC).team(lAngersFromDb).dayOfBirth(24).monthOfBirth(CConstants.MAY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lPetricPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_PETRIC).build();

        // defenders

        CPlayerEntity lAndreuAngers = new CPlayerEntity.CPlayerBuilder().firstName("yoann").lastName(CConstants.NAME_ANGERS_ANDREU).team(lAngersFromDb).dayOfBirth(3).monthOfBirth(CConstants.MAY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lAndreuPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_ANDREU).build();
        CPlayerEntity lBourillonAngers = new CPlayerEntity.CPlayerBuilder().firstName("gregory").lastName(CConstants.NAME_ANGERS_BOURILLON).team(lAngersFromDb).dayOfBirth(1).monthOfBirth(CConstants.JULY).yearOfBirth(1984).country(CConstants.FRANCE).positions(lBourillonPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_BOURILLON).build();
        CPlayerEntity lDialloAngers = new CPlayerEntity.CPlayerBuilder().firstName("ibrahima").lastName(CConstants.NAME_ANGERS_DIALLO).team(lAngersFromDb).dayOfBirth(26).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1985).country(CConstants.GUINEA).positions(lDialloPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_DIALLO).build();
        CPlayerEntity lLaidouniAngers = new CPlayerEntity.CPlayerBuilder().firstName("aissa").lastName(CConstants.NAME_ANGERS_LAIDOUNI).team(lAngersFromDb).dayOfBirth(13).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lLaidouniPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_LAIDOUNI).build();
        CPlayerEntity lManceauAngers = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_ANGERS_MANCEAU).team(lAngersFromDb).dayOfBirth(10).monthOfBirth(CConstants.JULY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lManceauPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_MANCEAU).build();
        CPlayerEntity lMartinezAngers = new CPlayerEntity.CPlayerBuilder().firstName("pablo").lastName(CConstants.NAME_ANGERS_MARTINEZ).team(lAngersFromDb).dayOfBirth(21).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lMartinezPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_MARTINEZ).build();
        CPlayerEntity lPavlovicAngers = new CPlayerEntity.CPlayerBuilder().firstName("mateo").lastName(CConstants.NAME_ANGERS_PAVLOVIC).team(lAngersFromDb).dayOfBirth(9).monthOfBirth(CConstants.JUNE).yearOfBirth(1990).country(CConstants.FRANCE).positions(lPavlovicPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_PAVLOVIC).build();
        CPlayerEntity lThomasAngers = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_ANGERS_THOMAS).team(lAngersFromDb).dayOfBirth(12).monthOfBirth(CConstants.JUNE).yearOfBirth(1988).country(CConstants.FRANCE).positions(lThomasPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_THOMAS).build();
        CPlayerEntity lTraoreAngers = new CPlayerEntity.CPlayerBuilder().firstName("ismael").lastName(CConstants.NAME_ANGERS_TRAORE).team(lAngersFromDb).dayOfBirth(18).monthOfBirth(CConstants.AUGUST).yearOfBirth(1986).country(CConstants.IVORYCOAST).positions(lTraorePositionsAngers).picturePath(CConstants.PICTURE_ANGERS_TRAORE).build();

        // midfielder

        CPlayerEntity lCapelleAngers = new CPlayerEntity.CPlayerBuilder().firstName("pierrick").lastName(CConstants.NAME_ANGERS_CAPELLE).team(lAngersFromDb).dayOfBirth(15).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lCapellePositionsAngers).picturePath(CConstants.PICTURE_ANGERS_CAPELLE).build();
        CPlayerEntity lManganiAngers = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_ANGERS_MANGANI).team(lAngersFromDb).dayOfBirth(29).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lManganiPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_MANGANI).build();
        CPlayerEntity lNdoyeAngers = new CPlayerEntity.CPlayerBuilder().firstName("cheick").lastName(CConstants.NAME_ANGERS_NDOYE).team(lAngersFromDb).dayOfBirth(29).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.SENEGAL).positions(lNdoyePositionsAngers).picturePath(CConstants.PICTURE_ANGERS_NDOYE).build();
        CPlayerEntity lSaissAngers = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_ANGERS_SAISS).team(lAngersFromDb).dayOfBirth(26).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.MOROCCO).positions(lSaissPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_SAISS).build();
        CPlayerEntity lSantamariaAngers = new CPlayerEntity.CPlayerBuilder().firstName("baptiste").lastName(CConstants.NAME_ANGERS_SANTAMARIA).team(lAngersFromDb).dayOfBirth(3).monthOfBirth(CConstants.MARCH).yearOfBirth(1995).country(CConstants.FRANCE).positions(lSantamariaPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_SANTAMARIA).build();
        CPlayerEntity lSerinAngers = new CPlayerEntity.CPlayerBuilder().firstName("mathias").lastName(CConstants.NAME_ANGERS_SERIN).team(lAngersFromDb).dayOfBirth(1).monthOfBirth(CConstants.AUGUST).yearOfBirth(1991).country(CConstants.FRANCE).positions(lSerinPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_SERIN).build();
        CPlayerEntity lTaitAngers = new CPlayerEntity.CPlayerBuilder().firstName("flavien").lastName(CConstants.NAME_ANGERS_TAIT).team(lAngersFromDb).dayOfBirth(2).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lTaitPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_TAIT).build();
        CPlayerEntity lSaihiAngers = new CPlayerEntity.CPlayerBuilder().firstName("jamel").lastName(CConstants.NAME_MHSC_SAIHI).team(lAngersFromDb).dayOfBirth(27).monthOfBirth(CConstants.JANUARY).yearOfBirth(1987).country(CConstants.FRANCE).positions(lSaihiPositionsAngers).picturePath(CConstants.PICTURE_MHSC_SAIHI).build();

        // forwards

        CPlayerEntity lDiedhiouAngers = new CPlayerEntity.CPlayerBuilder().firstName("famara").lastName(CConstants.NAME_ANGERS_DIEDHIOU).team(lAngersFromDb).dayOfBirth(15).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDiedhiouPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_DIEDHIOU).build();
        CPlayerEntity lKetkeoAngers = new CPlayerEntity.CPlayerBuilder().firstName("billy").lastName(CConstants.NAME_ANGERS_KETKEO).team(lAngersFromDb).dayOfBirth(24).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.FRANCE).positions(lKetkeoPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_KETKEO).build();
        CPlayerEntity lNwakaemeAngers = new CPlayerEntity.CPlayerBuilder().firstName("dickson").lastName(CConstants.NAME_ANGERS_NWAKAEME).team(lAngersFromDb).dayOfBirth(21).monthOfBirth(CConstants.APRIL).yearOfBirth(1986).country(CConstants.FRANCE).positions(lNwakaemePositionsAngers).picturePath(CConstants.PICTURE_ANGERS_NWAKAEME).build();
        CPlayerEntity lDoreAngers = new CPlayerEntity.CPlayerBuilder().firstName("ferebory").lastName(CConstants.NAME_ANGERS_DORE).team(lAngersFromDb).dayOfBirth(21).monthOfBirth(CConstants.JANUARY).yearOfBirth(1989).country(CConstants.CONGO).positions(lDorePositionsAngers).picturePath(CConstants.PICTURE_ANGERS_DORE).build();
        CPlayerEntity lPepeAngers = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_ANGERS_PEPE).team(lAngersFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lPepePositionsAngers).picturePath(CConstants.PICTURE_ANGERS_PEPE).build();
        CPlayerEntity lSunuAngers = new CPlayerEntity.CPlayerBuilder().firstName("gilles").lastName(CConstants.NAME_ANGERS_SUNU).team(lAngersFromDb).dayOfBirth(30).monthOfBirth(CConstants.MARCH).yearOfBirth(1991).country(CConstants.FRANCE).positions(lSunuPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_SUNU).build();
        CPlayerEntity lTokoEkambiAngers = new CPlayerEntity.CPlayerBuilder().firstName("karl").lastName(CConstants.NAME_ANGERS_TOKOEKAMBI).team(lAngersFromDb).dayOfBirth(14).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1992).country(CConstants.CAMEROUN).positions(lTokoEkambiPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_TOKOEKAMBI).build();
        CPlayerEntity lWissaAngers = new CPlayerEntity.CPlayerBuilder().firstName("yoane").lastName(CConstants.NAME_ANGERS_WISSA).team(lAngersFromDb).dayOfBirth(3).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lWissaPositionsAngers).picturePath(CConstants.PICTURE_ANGERS_WISSA).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLetellierAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMichelAngers);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPetricAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAndreuAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBourillonAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLaidouniAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lManceauAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMartinezAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPavlovicAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTraoreAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lThomasAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCapelleAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lManganiAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdoyeAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaihiAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaissAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSantamariaAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSerinAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTaitAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKetkeoAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSunuAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTokoEkambiAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiedhiouAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNwakaemeAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPepeAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDoreAngers);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lWissaAngers);
            lCrudMethods.commitTransaction();
        }
    }
}
