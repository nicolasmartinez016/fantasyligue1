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
public class CCreateOmPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lOmFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME , CConstants.OM).parameters())).get(0);


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


        List<CPositionEntity> lPelePositionsOm = new ArrayList<CPositionEntity>();
        lPelePositionsOm.add(lGk);

        List<CPositionEntity> lSambaPositionsOm = new ArrayList<CPositionEntity>();
        lSambaPositionsOm.add(lGk);


        List<CPositionEntity> lDoriaPositionsOm = new ArrayList<CPositionEntity>();
        lDoriaPositionsOm.add(lCb);

        List<CPositionEntity> lAloePositionsOm = new ArrayList<CPositionEntity>();
        lAloePositionsOm.add(lCb);


        List<CPositionEntity> lRolandoPositionsOm = new ArrayList<CPositionEntity>();
        lRolandoPositionsOm.add(lCb);


        List<CPositionEntity> lRekikPositionsOm = new ArrayList<CPositionEntity>();
        lRekikPositionsOm.add(lRb);


        List<CPositionEntity> lHubocanPositionsOm = new ArrayList<CPositionEntity>();
        lHubocanPositionsOm.add(lCb);


        List<CPositionEntity> lAndonianPositionsOm = new ArrayList<CPositionEntity>();
        lAndonianPositionsOm.add(lCb);


        List<CPositionEntity> lSakaiPositionsOm = new ArrayList<CPositionEntity>();
        lSakaiPositionsOm.add(lRb);


        List<CPositionEntity> lBedimoPositionsOm = new ArrayList<CPositionEntity>();
        lBedimoPositionsOm.add(lLb);


        List<CPositionEntity> lSanePositionsOm = new ArrayList<CPositionEntity>();
        lSanePositionsOm.add(lLb);

        List<CPositionEntity> lHauganPositionsOm = new ArrayList<CPositionEntity>();
        lHauganPositionsOm.add(lCb);

        List<CPositionEntity> lDiabyPositionsOm = new ArrayList<CPositionEntity>();
        lDiabyPositionsOm.add(lCm);

        List<CPositionEntity> lCabellaPositionsOm = new ArrayList<CPositionEntity>();
        lCabellaPositionsOm.add(lCam);

        List<CPositionEntity> lDiarraPositionsOm = new ArrayList<CPositionEntity>();
        lDiarraPositionsOm.add(lCdm);

        List<CPositionEntity> lTuilomaPositionsOm = new ArrayList<CPositionEntity>();
        lTuilomaPositionsOm.add(lCm);

        List<CPositionEntity> lMachachPositionsOm = new ArrayList<CPositionEntity>();
        lMachachPositionsOm.add(lCm);

        List<CPositionEntity> lZamboPositionsOm = new ArrayList<CPositionEntity>();
        lZamboPositionsOm.add(lCdm);


        List<CPositionEntity> lLopezPositionsOm = new ArrayList<CPositionEntity>();
        lLopezPositionsOm.add(lCam);


        List<CPositionEntity> lKhaouiPositionsOm = new ArrayList<CPositionEntity>();
        lKhaouiPositionsOm.add(lRw);


        List<CPositionEntity> lAlessandriniPositionsOm = new ArrayList<CPositionEntity>();
        lAlessandriniPositionsOm.add(lRw);
        lAlessandriniPositionsOm.add(lLw);



        List<CPositionEntity> lGomisPositionsOm = new ArrayList<CPositionEntity>();
        lGomisPositionsOm.add(lSt);


        List<CPositionEntity> lPorsanPositionsOm = new ArrayList<CPositionEntity>();
        lPorsanPositionsOm.add(lSt);


        List<CPositionEntity> lRabillardPositionsOm = new ArrayList<CPositionEntity>();
        lRabillardPositionsOm.add(lSt);

        List<CPositionEntity> lIsekaPositionsOm = new ArrayList<CPositionEntity>();
        lIsekaPositionsOm.add(lSt);


        List<CPositionEntity> lSarrPositionsOm = new ArrayList<CPositionEntity>();
        lSarrPositionsOm.add(lLw);
        lSarrPositionsOm.add(lRw);

        List<CPositionEntity> lMouhammadouPositionsOm = new ArrayList<CPositionEntity>();
        lMouhammadouPositionsOm.add(lSt);

        List<CPositionEntity> lFanniPositionsOm = new ArrayList<CPositionEntity>();
        lFanniPositionsOm.add(lCb);
        lFanniPositionsOm.add(lRb);

        List<CPositionEntity> lThauvinPositionsOm = new ArrayList<CPositionEntity>();
        lThauvinPositionsOm.add(lRm);
        lThauvinPositionsOm.add(lRw);

        List<CPositionEntity> lNjiePositionsOm = new ArrayList<CPositionEntity>();
        lNjiePositionsOm.add(lLw);

        List<CPositionEntity> lVainqueurPositionsOm = new ArrayList<CPositionEntity>();
        lVainqueurPositionsOm.add(lCdm);

        CPlayerEntity lPeleOm = new CPlayerEntity.CPlayerBuilder().firstName("yohan").lastName(CConstants.NAME_OM_PELE).team(lOmFromDb).dayOfBirth(4).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1982).country(CConstants.FRANCE).positions(lPelePositionsOm).picturePath(CConstants.PICTURE_OM_PELE).build();
        CPlayerEntity lSambaOm = new CPlayerEntity.CPlayerBuilder().firstName("brice").lastName(CConstants.NAME_OM_SAMBA).team(lOmFromDb).dayOfBirth(25).monthOfBirth(CConstants.APRIL).yearOfBirth(1994).country(CConstants.FRANCE).positions(lSambaPositionsOm).picturePath(CConstants.PICTURE_OM_SAMBA).build();
        CPlayerEntity lHubocanOm = new CPlayerEntity.CPlayerBuilder().firstName("tomas").lastName(CConstants.NAME_OM_HUBOCAN).team(lOmFromDb).dayOfBirth(17).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1985).country(CConstants.SLOVAKIA).positions(lHubocanPositionsOm).picturePath(CConstants.PICTURE_OM_HUBOCAN).build();
        CPlayerEntity lRolandoOm = new CPlayerEntity.CPlayerBuilder().firstName("jorge").lastName(CConstants.NAME_OM_ROLANDO).team(lOmFromDb).dayOfBirth(31).monthOfBirth(CConstants.AUGUST).yearOfBirth(1985).country(CConstants.PORTUGAL).positions(lRolandoPositionsOm).picturePath(CConstants.PICTURE_OM_ROLANDO).build();
        CPlayerEntity lRekikOm = new CPlayerEntity.CPlayerBuilder().firstName("karim").lastName(CConstants.NAME_OM_REKIK).team(lOmFromDb).dayOfBirth(2).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1994).country(CConstants.NETHERLANDS).positions(lRekikPositionsOm).picturePath(CConstants.PICTURE_OM_REKIK).build();
        CPlayerEntity lAloeOm = new CPlayerEntity.CPlayerBuilder().firstName("baptiste").lastName(CConstants.NAME_OM_ALOE).team(lOmFromDb).dayOfBirth(7).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lAloePositionsOm).picturePath(CConstants.PICTURE_OM_ALOE).build();
        CPlayerEntity lAndonianOm = new CPlayerEntity.CPlayerBuilder().firstName("gael").lastName(CConstants.NAME_OM_ANDONIAN).team(lOmFromDb).dayOfBirth(7).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lAndonianPositionsOm).picturePath(CConstants.PICTURE_OM_ANDONIAN).build();
        CPlayerEntity lDoriaOm = new CPlayerEntity.CPlayerBuilder().firstName("matheus").lastName(CConstants.NAME_OM_DORIA).team(lOmFromDb).dayOfBirth(8).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1994).country(CConstants.BRAZIL).positions(lDoriaPositionsOm).picturePath(CConstants.PICTURE_OM_DORIA).build();
        CPlayerEntity lBedimoOm = new CPlayerEntity.CPlayerBuilder().firstName("henri").lastName(CConstants.NAME_OM_BEDIMO).team(lOmFromDb).dayOfBirth(4).monthOfBirth(CConstants.JUNE).yearOfBirth(1984).country(CConstants.CAMEROUN).positions(lBedimoPositionsOm).picturePath(CConstants.PICTURE_OM_BEDIMO).build();
        CPlayerEntity lSakaiOm = new CPlayerEntity.CPlayerBuilder().firstName("hiroki").lastName(CConstants.NAME_OM_SAKAI).team(lOmFromDb).dayOfBirth(12).monthOfBirth(CConstants.APRIL).yearOfBirth(1990).country(CConstants.JAPAN).positions(lSakaiPositionsOm).picturePath(CConstants.PICTURE_OM_SAKAI).build();
        CPlayerEntity lSaneOm = new CPlayerEntity.CPlayerBuilder().firstName("alphousseyni").lastName(CConstants.NAME_CAEN_SANE).team(lOmFromDb).dayOfBirth(17).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lSanePositionsOm).picturePath(CConstants.PICTURE_OM_SANE).build();
        CPlayerEntity lDiabyOm = new CPlayerEntity.CPlayerBuilder().firstName("abou").lastName(CConstants.NAME_OM_DIABY).team(lOmFromDb).dayOfBirth(11).monthOfBirth(CConstants.MAY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lDiabyPositionsOm).picturePath(CConstants.PICTURE_OM_DIABY).build();
        CPlayerEntity lDiarraOm = new CPlayerEntity.CPlayerBuilder().firstName("lassana").lastName(CConstants.NAME_OM_DIARRA).team(lOmFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1985).country(CConstants.FRANCE).positions(lDiarraPositionsOm).picturePath(CConstants.PICTURE_OM_DIARRA).build();
        CPlayerEntity lMachachOm = new CPlayerEntity.CPlayerBuilder().firstName("zinedine").lastName(CConstants.NAME_OM_MACHACH).team(lOmFromDb).dayOfBirth(5).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMachachPositionsOm).picturePath(CConstants.PICTURE_OM_MACHACH).build();
        CPlayerEntity lCabellaOm = new CPlayerEntity.CPlayerBuilder().firstName("remy").lastName(CConstants.NAME_OM_CABELLA).team(lOmFromDb).dayOfBirth(8).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.FRANCE).positions(lCabellaPositionsOm).picturePath(CConstants.PICTURE_OM_CABELLA).build();
        CPlayerEntity lAlessandriniOm = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_OM_ALESSANDRINI).team(lOmFromDb).dayOfBirth(3).monthOfBirth(CConstants.APRIL).yearOfBirth(1989).country(CConstants.FRANCE).positions(lAlessandriniPositionsOm).picturePath(CConstants.PICTURE_OM_ALESSANDRINI).build();
        CPlayerEntity lSarrOm = new CPlayerEntity.CPlayerBuilder().firstName("bouna").lastName(CConstants.NAME_OM_SARR).team(lOmFromDb).dayOfBirth(31).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSarrPositionsOm).picturePath(CConstants.PICTURE_OM_SARR).build();
        CPlayerEntity lKhaouiOm = new CPlayerEntity.CPlayerBuilder().firstName("saif eddine").lastName(CConstants.NAME_OM_KHAOUI).team(lOmFromDb).dayOfBirth(27).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKhaouiPositionsOm).picturePath(CConstants.PICTURE_OM_KHAOUI).build();
        CPlayerEntity lZamboOm = new CPlayerEntity.CPlayerBuilder().firstName("franck").lastName(CConstants.NAME_OM_ZAMBO).team(lOmFromDb).dayOfBirth(16).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1995).country(CConstants.CAMEROUN).positions(lZamboPositionsOm).picturePath(CConstants.PICTURE_OM_ZAMBO).build();
        CPlayerEntity lTuilomaOm = new CPlayerEntity.CPlayerBuilder().firstName("bill").lastName(CConstants.NAME_OM_TUILOMA).team(lOmFromDb).dayOfBirth(27).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.NEW_ZEALAND).positions(lTuilomaPositionsOm).picturePath(CConstants.PICTURE_OM_TUILOMA).build();
        CPlayerEntity lLopezOm = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_OM_LOPEZ).team(lOmFromDb).dayOfBirth(4).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lLopezPositionsOm).picturePath(CConstants.PICTURE_OM_LOPEZ).build();
        CPlayerEntity lGomisOm = new CPlayerEntity.CPlayerBuilder().firstName("bafetimbi").lastName(CConstants.NAME_NICE_GOMIS).team(lOmFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1985).country(CConstants.FRANCE).positions(lGomisPositionsOm).picturePath(CConstants.PICTURE_OM_GOMIS).build();
        CPlayerEntity lIsekaOm = new CPlayerEntity.CPlayerBuilder().firstName("aaron").lastName(CConstants.NAME_OM_ISEKA).team(lOmFromDb).dayOfBirth(15).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1997).country(CConstants.BELGIUM).positions(lIsekaPositionsOm).picturePath(CConstants.PICTURE_OM_ISEKA).build();
        CPlayerEntity lPorsanOm = new CPlayerEntity.CPlayerBuilder().firstName("jeremie").lastName(CConstants.NAME_OM_PORSAN).team(lOmFromDb).dayOfBirth(16).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lPorsanPositionsOm).picturePath(CConstants.PICTURE_OM_PORSAN).build();
        CPlayerEntity lRabillardOm = new CPlayerEntity.CPlayerBuilder().firstName("antoine").lastName(CConstants.NAME_OM_RABILLARD).team(lOmFromDb).dayOfBirth(22).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lRabillardPositionsOm).picturePath(CConstants.PICTURE_OM_RABILLARD).build();
        CPlayerEntity lMouhammadouOm = new CPlayerEntity.CPlayerBuilder().firstName("samad").lastName(CConstants.NAME_OM_MOUHAMMADOU).team(lOmFromDb).dayOfBirth(13).monthOfBirth(CConstants.JANUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lMouhammadouPositionsOm).picturePath(CConstants.PICTURE_OM_MOUHAMMADOU).build();
        CPlayerEntity lHauganOm = new CPlayerEntity.CPlayerBuilder().firstName("eirik").lastName(CConstants.NAME_OM_HAUGAN).team(lOmFromDb).dayOfBirth(27).monthOfBirth(CConstants.AUGUST).yearOfBirth(1997).country(CConstants.NORWAY).positions(lHauganPositionsOm).picturePath(CConstants.PICTURE_OM_HAUGAN).build();
        CPlayerEntity lFanniOm = new CPlayerEntity.CPlayerBuilder().firstName("rod").lastName(CConstants.NAME_OM_FANNI).team(lOmFromDb).dayOfBirth(6).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lFanniPositionsOm).picturePath(CConstants.PICTURE_OM_FANNI).build();
        CPlayerEntity lThauvinOm = new CPlayerEntity.CPlayerBuilder().firstName("florian").lastName(CConstants.NAME_OM_THAUVIN).team(lOmFromDb).dayOfBirth(26).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lThauvinPositionsOm).picturePath(CConstants.PICTURE_OM_THAUVIN).build();
        CPlayerEntity lNjieOm = new CPlayerEntity.CPlayerBuilder().firstName("clinton").lastName(CConstants.NAME_OM_NJIE).team(lOmFromDb).dayOfBirth(15).monthOfBirth(CConstants.AUGUST).yearOfBirth(1993).country(CConstants.CAMEROUN).positions(lNjiePositionsOm).picturePath(CConstants.PICTURE_OM_NJIE).build();
        CPlayerEntity lVainqueurOm = new CPlayerEntity.CPlayerBuilder().firstName("william").lastName(CConstants.NAME_OM_VAINQUEUR).team(lOmFromDb).dayOfBirth(19).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lVainqueurPositionsOm).picturePath(CConstants.PICTURE_OM_VAINQUEUR).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPeleOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSambaOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDoriaOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAndonianOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRekikOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRolandoOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHubocanOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSakaiOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaneOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBedimoOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiarraOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiabyOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCabellaOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKhaouiOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAlessandriniOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTuilomaOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lZamboOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMachachOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGomisOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPorsanOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRabillardOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMouhammadouOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSarrOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLopezOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lIsekaOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHauganOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAloeOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFanniOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lThauvinOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVainqueurOm);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNjieOm);
            lCrudMethods.commitTransaction();
        }



    }
}
