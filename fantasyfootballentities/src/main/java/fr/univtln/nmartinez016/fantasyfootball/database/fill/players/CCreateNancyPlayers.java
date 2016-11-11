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
 * Created by marti on 03/09/2016.
 */
public class CCreateNancyPlayers {
    public static void main(String[] args) {

        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lNancyFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NANCY).parameters())).get(0);


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

        List<CPositionEntity> lNdyAssembePositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lChernikPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMenayPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lLengletPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lBadilaPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lDiagnePositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lCuffautPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMaouassaPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lChretienPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lCabacoPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMuratoriPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lCetoutPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lDiarraPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lAitBennasserPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lRobicPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMarchettiPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lCoulibalyPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lNguessanPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lGuidileyePositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lPuyoPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lPedrettiPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lDalePositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lDiaPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMandannePositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lHadjiPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lMabellaPositionsNancy = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lKouraPositionsNancy = new ArrayList<CPositionEntity>();



        CPlayerEntity lNdyAssembeNancy = new CPlayerEntity.CPlayerBuilder().firstName("guy").lastName(CConstants.NAME_NANCY_NDYASSEMBE).team(lNancyFromDb).dayOfBirth(28).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lNdyAssembePositionsNancy).picturePath(CConstants.PICTURE_NANCY_NDYASSEMBE).build();
        CPlayerEntity lChernikNancy = new CPlayerEntity.CPlayerBuilder().firstName("sergey").lastName(CConstants.NAME_NANCY_CHERNIK).team(lNancyFromDb).dayOfBirth(20).monthOfBirth(CConstants.JULY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lChernikPositionsNancy).picturePath(CConstants.PICTURE_NANCY_CHERNIK).build();
        CPlayerEntity lMenayNancy = new CPlayerEntity.CPlayerBuilder().firstName("alexandre").lastName(CConstants.NAME_NANCY_MENAY).team(lNancyFromDb).dayOfBirth(5).monthOfBirth(CConstants.JULY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMenayPositionsNancy).picturePath(CConstants.PICTURE_NANCY_MENAY).build();

        CPlayerEntity lLengletNancy = new CPlayerEntity.CPlayerBuilder().firstName("clement").lastName(CConstants.NAME_NANCY_LENGLET).team(lNancyFromDb).dayOfBirth(17).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLengletPositionsNancy).picturePath(CConstants.PICTURE_NANCY_LENGLET).build();
        CPlayerEntity lBadilaNancy = new CPlayerEntity.CPlayerBuilder().firstName("tobias").lastName(CConstants.NAME_NANCY_BADILA).team(lNancyFromDb).dayOfBirth(12).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lBadilaPositionsNancy).picturePath(CConstants.PICTURE_NANCY_BADILA).build();
        CPlayerEntity lDiagneNancy = new CPlayerEntity.CPlayerBuilder().firstName("modou").lastName(CConstants.NAME_NANCY_DIAGNE).team(lNancyFromDb).dayOfBirth(3).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lDiagnePositionsNancy).picturePath(CConstants.PICTURE_NANCY_DIAGNE).build();
        CPlayerEntity lCuffautNancy = new CPlayerEntity.CPlayerBuilder().firstName("joffrey").lastName(CConstants.NAME_NANCY_CUFFAUT).team(lNancyFromDb).dayOfBirth(15).monthOfBirth(CConstants.MARCH).yearOfBirth(1988).country(CConstants.FRANCE).positions(lCuffautPositionsNancy).picturePath(CConstants.PICTURE_NANCY_CUFFAUT).build();
        CPlayerEntity lMaouassaNancy = new CPlayerEntity.CPlayerBuilder().firstName("faitout").lastName(CConstants.NAME_NANCY_MAOUASSA).team(lNancyFromDb).dayOfBirth(6).monthOfBirth(CConstants.JULY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lMaouassaPositionsNancy).picturePath(CConstants.PICTURE_NANCY_MAOUASSA).build();
        CPlayerEntity lChretienNancy = new CPlayerEntity.CPlayerBuilder().firstName("michael").lastName(CConstants.NAME_NANCY_CHRETIEN).team(lNancyFromDb).dayOfBirth(10).monthOfBirth(CConstants.JULY).yearOfBirth(1984).country(CConstants.FRANCE).positions(lChretienPositionsNancy).picturePath(CConstants.PICTURE_NANCY_CHRETIEN).build();
        CPlayerEntity lCabacoNancy = new CPlayerEntity.CPlayerBuilder().firstName("erick").lastName(CConstants.NAME_NANCY_CABACO).team(lNancyFromDb).dayOfBirth(19).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCabacoPositionsNancy).picturePath(CConstants.PICTURE_NANCY_CABACO).build();
        CPlayerEntity lMuratoriNancy = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_NANCY_MURATORI).team(lNancyFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lMuratoriPositionsNancy).picturePath(CConstants.PICTURE_NANCY_MURATORI).build();
        CPlayerEntity lCetoutNancy = new CPlayerEntity.CPlayerBuilder().firstName("julien").lastName(CConstants.NAME_NANCY_CETOUT).team(lNancyFromDb).dayOfBirth(2).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lCetoutPositionsNancy).picturePath(CConstants.PICTURE_NANCY_CETOUT).build();

        CPlayerEntity lDiarraNancy = new CPlayerEntity.CPlayerBuilder().firstName("alou").lastName(CConstants.NAME_NANCY_DIARRA).team(lNancyFromDb).dayOfBirth(15).monthOfBirth(CConstants.JULY).yearOfBirth(1981).country(CConstants.FRANCE).positions(lDiarraPositionsNancy).picturePath(CConstants.PICTURE_NANCY_DIARRA).build();
        CPlayerEntity lAitBennasserNancy = new CPlayerEntity.CPlayerBuilder().firstName("youssef").lastName(CConstants.NAME_NANCY_AITBENNASSER).team(lNancyFromDb).dayOfBirth(7).monthOfBirth(CConstants.JULY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lAitBennasserPositionsNancy).picturePath(CConstants.PICTURE_NANCY_AITBENNASSER).build();
        CPlayerEntity lRobicNancy = new CPlayerEntity.CPlayerBuilder().firstName("antony").lastName(CConstants.NAME_NANCY_ROBIC).team(lNancyFromDb).dayOfBirth(5).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.FRANCE).positions(lRobicPositionsNancy).picturePath(CConstants.PICTURE_NANCY_ROBIC).build();
        CPlayerEntity lMarchettiNancy = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_NANCY_MARCHETTI).team(lNancyFromDb).dayOfBirth(4).monthOfBirth(CConstants.JULY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lMarchettiPositionsNancy).picturePath(CConstants.PICTURE_NANCY_MARCHETTI).build();
        CPlayerEntity lCoulibalyNancy = new CPlayerEntity.CPlayerBuilder().firstName("karim").lastName(CConstants.NAME_NANCY_COULIBALY).team(lNancyFromDb).dayOfBirth(3).monthOfBirth(CConstants.JUNE).yearOfBirth(1993).country(CConstants.FRANCE).positions(lCoulibalyPositionsNancy).picturePath(CConstants.PICTURE_NANCY_COULIBALY).build();
        CPlayerEntity lNguessanNancy = new CPlayerEntity.CPlayerBuilder().firstName("serge").lastName(CConstants.NAME_NANCY_NGUESSAN).team(lNancyFromDb).dayOfBirth(31).monthOfBirth(CConstants.JULY).yearOfBirth(1994).country(CConstants.IVORYCOAST).positions(lNguessanPositionsNancy).picturePath(CConstants.PICTURE_NANCY_NGUESSAN).build();
        CPlayerEntity lGuidileyeNancy = new CPlayerEntity.CPlayerBuilder().firstName("dialo").lastName(CConstants.NAME_NANCY_GUIDILEYE).team(lNancyFromDb).dayOfBirth(30).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lGuidileyePositionsNancy).picturePath(CConstants.PICTURE_NANCY_GUIDILEYE).build();
        CPlayerEntity lPuyoNancy = new CPlayerEntity.CPlayerBuilder().firstName("loic").lastName(CConstants.NAME_NANCY_PUYO).team(lNancyFromDb).dayOfBirth(19).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lPuyoPositionsNancy).picturePath(CConstants.PICTURE_NANCY_PUYO).build();
        CPlayerEntity lPedrettiNancy = new CPlayerEntity.CPlayerBuilder().firstName("benoit").lastName(CConstants.NAME_NANCY_PEDRETTI).team(lNancyFromDb).dayOfBirth(12).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1980).country(CConstants.FRANCE).positions(lPedrettiPositionsNancy).picturePath(CConstants.PICTURE_NANCY_PEDRETTI).build();

        CPlayerEntity lDaleNancy = new CPlayerEntity.CPlayerBuilder().firstName("junior").lastName(CConstants.NAME_NANCY_DALE).team(lNancyFromDb).dayOfBirth(12).monthOfBirth(CConstants.JULY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lDalePositionsNancy).picturePath(CConstants.PICTURE_NANCY_DALE).build();
        CPlayerEntity lDiaNancy = new CPlayerEntity.CPlayerBuilder().firstName("issiar").lastName(CConstants.NAME_NANCY_DIA).team(lNancyFromDb).dayOfBirth(8).monthOfBirth(CConstants.JUNE).yearOfBirth(1987).country(CConstants.FRANCE).positions(lDiaPositionsNancy).picturePath(CConstants.PICTURE_NANCY_DIA).build();
        CPlayerEntity lMandanneNancy = new CPlayerEntity.CPlayerBuilder().firstName("christophe").lastName(CConstants.NAME_NANCY_MANDANNE).team(lNancyFromDb).dayOfBirth(7).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lMandannePositionsNancy).picturePath(CConstants.PICTURE_NANCY_MANDANNE).build();
        CPlayerEntity lHadjiNancy = new CPlayerEntity.CPlayerBuilder().firstName("youssouf").lastName(CConstants.NAME_NANCY_HADJI).team(lNancyFromDb).dayOfBirth(25).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1980).country(CConstants.MOROCCO).positions(lHadjiPositionsNancy).picturePath(CConstants.PICTURE_NANCY_HADJI).build();
        CPlayerEntity lMabellaNancy = new CPlayerEntity.CPlayerBuilder().firstName("yann").lastName(CConstants.NAME_NANCY_MABELLA).team(lNancyFromDb).dayOfBirth(22).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMabellaPositionsNancy).picturePath(CConstants.PICTURE_NANCY_MABELLA).build();
        CPlayerEntity lKouraNancy = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_NANCY_KOURA).team(lNancyFromDb).dayOfBirth(6).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lKouraPositionsNancy).picturePath(CConstants.PICTURE_NANCY_KOURA).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdyAssembeNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lChernikNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMenayNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLengletNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMuratoriNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaouassaNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCabacoNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBadilaNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiagneNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCuffautNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lChretienNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCetoutNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiarraNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPuyoNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHadjiNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPedrettiNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAitBennasserNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRobicNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarchettiNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCoulibalyNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNguessanNancy);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGuidileyeNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDaleNancy);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiaNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMandanneNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKouraNancy);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMabellaNancy);
            lCrudMethods.commitTransaction();
        }
    }
}
