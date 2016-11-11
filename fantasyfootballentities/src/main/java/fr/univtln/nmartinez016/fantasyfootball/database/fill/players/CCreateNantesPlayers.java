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
 * Created by marti on 31/07/2016.
 */
public class CCreateNantesPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lNantesFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NANTES).parameters())).get(0);


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

        List<CPositionEntity> lRiouPositionsNantes = new ArrayList<CPositionEntity>();
        lRiouPositionsNantes.add(lGk);

        List<CPositionEntity> lDupePositionsNantes = new ArrayList<CPositionEntity>();
        lDupePositionsNantes.add(lGk);

        List<CPositionEntity> lVizcaPositionsNantes = new ArrayList<CPositionEntity>();
        lVizcaPositionsNantes.add(lCb);

        List<CPositionEntity> lDjidjiPositionsNantes = new ArrayList<CPositionEntity>();
        lDjidjiPositionsNantes.add(lCb);

        List<CPositionEntity> lCarlosPositionsNantes = new ArrayList<CPositionEntity>();
        lCarlosPositionsNantes.add(lCb);

        List<CPositionEntity> lBagnackPositionsNantes = new ArrayList<CPositionEntity>();
        lBagnackPositionsNantes.add(lCb);
        lBagnackPositionsNantes.add(lCdm);

        List<CPositionEntity> lDuboisPositionsNantes = new ArrayList<CPositionEntity>();
        lDuboisPositionsNantes.add(lRb);

        List<CPositionEntity> lKwatengPositionsNantes = new ArrayList<CPositionEntity>();
        lKwatengPositionsNantes.add(lRb);

        List<CPositionEntity> lLimaPositionsNantes = new ArrayList<CPositionEntity>();
        lLimaPositionsNantes.add(lLb);

        List<CPositionEntity> lMoimbePositionsNantes = new ArrayList<CPositionEntity>();
        lMoimbePositionsNantes.add(lLb);

        List<CPositionEntity> lGilletPositionsNantes = new ArrayList<CPositionEntity>();
        lGilletPositionsNantes.add(lCdm);
        lGilletPositionsNantes.add(lCm);
        lGilletPositionsNantes.add(lRb);

        List<CPositionEntity> lThomassonPositionsNantes = new ArrayList<CPositionEntity>();
        lThomassonPositionsNantes.add(lCm);
        lThomassonPositionsNantes.add(lCam);
        lThomassonPositionsNantes.add(lRam);

        List<CPositionEntity> lRongierPositionsNantes = new ArrayList<CPositionEntity>();
        lRongierPositionsNantes.add(lCdm);
        lRongierPositionsNantes.add(lCm);

        List<CPositionEntity> lHaritPositionsNantes = new ArrayList<CPositionEntity>();
        lHaritPositionsNantes.add(lCm);

        List<CPositionEntity> lTourePositionsNantes = new ArrayList<CPositionEntity>();
        lTourePositionsNantes.add(lCdm);

        List<CPositionEntity> lThomsenPositionsNantes = new ArrayList<CPositionEntity>();
        lThomsenPositionsNantes.add(lCm);
        lThomsenPositionsNantes.add(lCam);
        lThomsenPositionsNantes.add(lLam);

        List<CPositionEntity> lKacaniklicPositionsNantes = new ArrayList<CPositionEntity>();
        lKacaniklicPositionsNantes.add(lRam);
        lKacaniklicPositionsNantes.add(lRw);

        List<CPositionEntity> lAleguePositionsNantes = new ArrayList<CPositionEntity>();
        lAleguePositionsNantes.add(lRam);
        lAleguePositionsNantes.add(lRw);

        List<CPositionEntity> lIlokiPositionsNantes = new ArrayList<CPositionEntity>();
        lIlokiPositionsNantes.add(lRam);
        lIlokiPositionsNantes.add(lRw);

        List<CPositionEntity> lSigPositionsNantes = new ArrayList<CPositionEntity>();
        lSigPositionsNantes.add(lSt);

        List<CPositionEntity> lSalaPositionsNantes = new ArrayList<CPositionEntity>();
        lSalaPositionsNantes.add(lSt);

        List<CPositionEntity> lArisPositionsNantes = new ArrayList<CPositionEntity>();
        lArisPositionsNantes.add(lSt);

        List<CPositionEntity> lBammouPositionsNantes = new ArrayList<CPositionEntity>();
        lBammouPositionsNantes.add(lSt);

        List<CPositionEntity> lStepinskiPositionsNantes = new ArrayList<CPositionEntity>();
        lStepinskiPositionsNantes.add(lSt);

        // gks
        CPlayerEntity lRiouNantes = new CPlayerEntity.CPlayerBuilder().firstName("remi").lastName(CConstants.NAME_NANTES_RIOU).team(lNantesFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lRiouPositionsNantes).picturePath(CConstants.PICTURE_NANTES_RIOU).build();
        CPlayerEntity lDupeNantes = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_NANTES_DUPE).team(lNantesFromDb).dayOfBirth(4).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.FRANCE).positions(lDupePositionsNantes).picturePath(CConstants.PICTURE_NANTES_DUPE).build();


        // defs
        CPlayerEntity lLimaNantes = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_NANTES_LIMA).team(lNantesFromDb).dayOfBirth(10).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1991).country(CConstants.BRAZIL).positions(lLimaPositionsNantes).picturePath(CConstants.PICTURE_NANTES_LIMA).build();
        CPlayerEntity lCarlosNantes = new CPlayerEntity.CPlayerBuilder().firstName("diego").lastName(CConstants.NAME_NANTES_CARLOS).team(lNantesFromDb).dayOfBirth(15).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.BRAZIL).positions(lCarlosPositionsNantes).picturePath(CConstants.PICTURE_NANTES_CARLOS).build();
        CPlayerEntity lVizcarrondoNantes = new CPlayerEntity.CPlayerBuilder().firstName("oswaldo").lastName(CConstants.NAME_NANTES_VIZCARRONDO).team(lNantesFromDb).dayOfBirth(31).monthOfBirth(CConstants.MAY).yearOfBirth(1984).country(CConstants.VENEZUELA).positions(lVizcaPositionsNantes).picturePath(CConstants.PICTURE_NANTES_VIZCARRONDO).build();
        CPlayerEntity lDuboisNantes = new CPlayerEntity.CPlayerBuilder().firstName("leo").lastName(CConstants.NAME_NANTES_DUBOIS).team(lNantesFromDb).dayOfBirth(14).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lDuboisPositionsNantes).picturePath(CConstants.PICTURE_NANTES_DUBOIS).build();
        CPlayerEntity lDjidjiNantes = new CPlayerEntity.CPlayerBuilder().firstName("koffi").lastName(CConstants.NAME_NANTES_DJIDJI).team(lNantesFromDb).dayOfBirth(30).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDjidjiPositionsNantes).picturePath(CConstants.PICTURE_NANTES_DJIDJI).build();
        CPlayerEntity lKwatengNantes = new CPlayerEntity.CPlayerBuilder().firstName("enock").lastName(CConstants.NAME_NANTES_KWATENG).team(lNantesFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lKwatengPositionsNantes).picturePath(CConstants.PICTURE_NANTES_KWATENG).build();
        CPlayerEntity lMoimbeNantes = new CPlayerEntity.CPlayerBuilder().firstName("wilfried").lastName(CConstants.NAME_NANTES_MOIMBE).team(lNantesFromDb).dayOfBirth(18).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lMoimbePositionsNantes).picturePath(CConstants.PICTURE_NANTES_MOIMBE).build();


        // midfielders
        CPlayerEntity lGilletNantes = new CPlayerEntity.CPlayerBuilder().firstName("guillaume").lastName(CConstants.NAME_NANTES_GILLET).team(lNantesFromDb).dayOfBirth(9).monthOfBirth(CConstants.MARCH).yearOfBirth(1984).country(CConstants.BELGIUM).positions(lGilletPositionsNantes).picturePath(CConstants.PICTURE_NANTES_GILLET).build();
        CPlayerEntity lRongierNantes = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_NANTES_RONGIER).team(lNantesFromDb).dayOfBirth(7).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lRongierPositionsNantes).picturePath(CConstants.PICTURE_NANTES_RONGIER).build();
        CPlayerEntity lThomassonNantes = new CPlayerEntity.CPlayerBuilder().firstName("adrien").lastName(CConstants.NAME_NANTES_THOMASSON).team(lNantesFromDb).dayOfBirth(10).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lThomassonPositionsNantes).picturePath(CConstants.PICTURE_NANTES_THOMASSON).build();
        CPlayerEntity lHaritNantes = new CPlayerEntity.CPlayerBuilder().firstName("amine").lastName(CConstants.NAME_NANTES_HARIT).team(lNantesFromDb).dayOfBirth(18).monthOfBirth(CConstants.JUNE).yearOfBirth(1997).country(CConstants.FRANCE).positions(lHaritPositionsNantes).picturePath(CConstants.PICTURE_NANTES_HARIT).build();
        CPlayerEntity lThomsenNantes = new CPlayerEntity.CPlayerBuilder().firstName("nicolaj").lastName(CConstants.NAME_NANTES_THOMSEN).team(lNantesFromDb).dayOfBirth(8).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.DENMARK).positions(lThomsenPositionsNantes).picturePath(CConstants.PICTURE_NANTES_THOMSEN).build();
        CPlayerEntity lToureNantes = new CPlayerEntity.CPlayerBuilder().firstName("abdoulaye").lastName(CConstants.NAME_NANTES_TOURE).team(lNantesFromDb).dayOfBirth(3).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lTourePositionsNantes).picturePath(CConstants.PICTURE_NANTES_TOURE).build();


        // forwards
        CPlayerEntity lKacaniklicNantes = new CPlayerEntity.CPlayerBuilder().firstName("aleksander").lastName(CConstants.NAME_NANTES_KACANIKLIC).team(lNantesFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1991).country(CConstants.SWEDEN).positions(lKacaniklicPositionsNantes).picturePath(CConstants.PICTURE_NANTES_KACANIKLIC).build();
        CPlayerEntity lSigNantes = new CPlayerEntity.CPlayerBuilder().firstName("kolbeinn").lastName(CConstants.NAME_NANTES_SIGTHORSSON).team(lNantesFromDb).dayOfBirth(14).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.ICELAND).positions(lSigPositionsNantes).picturePath(CConstants.PICTURE_NANTES_SIGTHORSSON).build();
        CPlayerEntity lSalaNantes = new CPlayerEntity.CPlayerBuilder().firstName("emiliano").lastName(CConstants.NAME_NANTES_SALA).team(lNantesFromDb).dayOfBirth(31).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.ARGENTINA).positions(lSalaPositionsNantes).picturePath(CConstants.PICTURE_NANTES_SALA).build();
        CPlayerEntity lArisNantes = new CPlayerEntity.CPlayerBuilder().firstName("fernando").lastName(CConstants.NAME_NANTES_ARISTEGUIETA).team(lNantesFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1992).country(CConstants.VENEZUELA).positions(lArisPositionsNantes).picturePath(CConstants.PICTURE_NANTES_ARISTEGUIETA).build();
        CPlayerEntity lAlegueNantes = new CPlayerEntity.CPlayerBuilder().firstName("alexis").lastName(CConstants.NAME_NANTES_ALEGUE).team(lNantesFromDb).dayOfBirth(23).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lAleguePositionsNantes).picturePath(CConstants.PICTURE_NANTES_ALEGUE).build();
        CPlayerEntity lIlokiNantes = new CPlayerEntity.CPlayerBuilder().firstName("jules").lastName(CConstants.NAME_NANTES_ILOKI).team(lNantesFromDb).dayOfBirth(14).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lIlokiPositionsNantes).picturePath(CConstants.PICTURE_NANTES_ILOKI).build();
        CPlayerEntity lBammouNantes = new CPlayerEntity.CPlayerBuilder().firstName("yacine").lastName(CConstants.NAME_NANTES_BAMMOU).team(lNantesFromDb).dayOfBirth(14).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lBammouPositionsNantes).picturePath(CConstants.PICTURE_NANTES_BAMMOU).build();
        CPlayerEntity lStepinskiNantes = new CPlayerEntity.CPlayerBuilder().firstName("mariusz").lastName(CConstants.NAME_NANTES_STEPINSKI).team(lNantesFromDb).dayOfBirth(12).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.POLAND).positions(lStepinskiPositionsNantes).picturePath(CConstants.PICTURE_NANTES_STEPINSKI).build();



        lCrudMethods.openTransaction();
        lCrudMethods.persist(lRongierNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lRiouNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lThomassonNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lDuboisNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lLimaNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lVizcarrondoNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lCarlosNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lGilletNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lKacaniklicNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lThomsenNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lSigNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lHaritNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lDjidjiNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lSalaNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lArisNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lAlegueNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lDupeNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lKwatengNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lMoimbeNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lStepinskiNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lToureNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lIlokiNantes);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.persist(lBammouNantes);
        lCrudMethods.commitTransaction();

    }
}
