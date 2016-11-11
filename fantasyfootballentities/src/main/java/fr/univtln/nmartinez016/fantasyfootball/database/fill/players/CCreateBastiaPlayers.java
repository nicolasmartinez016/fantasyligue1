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
 * Created by marti on 18/08/2016.
 */
public class CCreateBastiaPlayers {
    public static void main(String[] args) {

        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lBastiaFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.BASTIA).parameters())).get(0);


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

        List<CPositionEntity> lCharruauPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLecaPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVincensiniPositionsBastia = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBenhaimPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCioniPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDialloPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDjikuPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lElKaoutariPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMarangePositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPeybernesPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSquillaciPositionsBastia = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAlexandrePositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDanicPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCahuzacPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSDialloPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lHouriPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lKeitaPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMostefaPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNgandoPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSidoPositionsBastia = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBifoumaPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCabralPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCoulibalyPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCrivelliPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLangisPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lRaspentinoPositionsBastia = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSaintMaximinPositionsBastia = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBengtssonPositionsBastia = new ArrayList<CPositionEntity>();
        lBengtssonPositionsBastia.add(lLb);





        CPlayerEntity lCharruauBastia = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_BASTIA_CHARRUAU).team(lBastiaFromDb).dayOfBirth(12).monthOfBirth(CConstants.JULY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lCharruauPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_CHARRUAU).build();
        CPlayerEntity lLecaBastia = new CPlayerEntity.CPlayerBuilder().firstName("jean louis").lastName(CConstants.NAME_BASTIA_LECA).team(lBastiaFromDb).dayOfBirth(21).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1985).country(CConstants.FRANCE).positions(lLecaPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_LECA).build();
        CPlayerEntity lVincensiniBastia = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_BASTIA_VINCENSINI).team(lBastiaFromDb).dayOfBirth(12).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lVincensiniPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_VINCENSINI).build();

        CPlayerEntity lBenhaimBastia = new CPlayerEntity.CPlayerBuilder().firstName("julien").lastName(CConstants.NAME_BASTIA_BENHAIM).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lBenhaimPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_BENHAIM).build();
        CPlayerEntity lCioniBastia = new CPlayerEntity.CPlayerBuilder().firstName("gilles").lastName(CConstants.NAME_BASTIA_CIONI).team(lBastiaFromDb).dayOfBirth(14).monthOfBirth(CConstants.JUNE).yearOfBirth(1984).country(CConstants.FRANCE).positions(lCioniPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_CIONI).build();
        CPlayerEntity lDialloBastia = new CPlayerEntity.CPlayerBuilder().firstName("ismael").lastName(CConstants.NAME_BASTIA_DIALLO).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.IVORYCOAST).positions(lDialloPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_DIALLO).build();
        CPlayerEntity lDjikuBastia = new CPlayerEntity.CPlayerBuilder().firstName("alexander").lastName(CConstants.NAME_BASTIA_DJIKU).team(lBastiaFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.FRANCE).positions(lDjikuPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_DJIKU).build();
        CPlayerEntity lElKaoutariBastia = new CPlayerEntity.CPlayerBuilder().firstName("abdelhamid").lastName(CConstants.NAME_BASTIA_ELKAOUTARI).team(lBastiaFromDb).dayOfBirth(17).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.FRANCE).positions(lElKaoutariPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_ELKAOUTARI).build();
        CPlayerEntity lMarangeBastia = new CPlayerEntity.CPlayerBuilder().firstName("florian").lastName(CConstants.NAME_BASTIA_MARANGE).team(lBastiaFromDb).dayOfBirth(3).monthOfBirth(CConstants.JUNE).yearOfBirth(1986).country(CConstants.FRANCE).positions(lMarangePositionsBastia).picturePath(CConstants.PICTURE_BASTIA_MARANGE).build();
        CPlayerEntity lPeybernesBastia = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_BASTIA_PEYBERNES).team(lBastiaFromDb).dayOfBirth(21).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lPeybernesPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_PEYBERNES).build();
        CPlayerEntity lSquillaciBastia = new CPlayerEntity.CPlayerBuilder().firstName("sebastien").lastName(CConstants.NAME_BASTIA_SQUILLACI).team(lBastiaFromDb).dayOfBirth(11).monthOfBirth(CConstants.AUGUST).yearOfBirth(1980).country(CConstants.FRANCE).positions(lSquillaciPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_SQUILLACI).build();
        CPlayerEntity lBengtssonBastia = new CPlayerEntity.CPlayerBuilder().firstName("alexander").lastName(CConstants.NAME_BASTIA_BENGTSSON).team(lBastiaFromDb).dayOfBirth(12).monthOfBirth(CConstants.APRIL).yearOfBirth(1988).country(CConstants.SWEDEN).positions(lBengtssonPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_BENGTSSON).build();


        CPlayerEntity lAlexandreBastia = new CPlayerEntity.CPlayerBuilder().firstName("edgar").lastName(CConstants.NAME_BASTIA_ALEXANDRE).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lAlexandrePositionsBastia).picturePath(CConstants.PICTURE_BASTIA_ALEXANDRE).build();
        CPlayerEntity lDanicBastia = new CPlayerEntity.CPlayerBuilder().firstName("gael").lastName(CConstants.NAME_BASTIA_DANIC).team(lBastiaFromDb).dayOfBirth(19).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lDanicPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_DANIC).build();
        CPlayerEntity lCahuzacBastia = new CPlayerEntity.CPlayerBuilder().firstName("yannick").lastName(CConstants.NAME_BASTIA_CAHUZAC).team(lBastiaFromDb).dayOfBirth(18).monthOfBirth(CConstants.JANUARY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lCahuzacPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_CAHUZAC).build();
        CPlayerEntity lSDialloBastia = new CPlayerEntity.CPlayerBuilder().firstName("sadio").lastName(CConstants.NAME_BASTIA_DIALLO).team(lBastiaFromDb).dayOfBirth(28).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lSDialloPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_SDIALLO).build();
        CPlayerEntity lHouriBastia = new CPlayerEntity.CPlayerBuilder().firstName("lyes").lastName(CConstants.NAME_BASTIA_HOURI).team(lBastiaFromDb).dayOfBirth(19).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lHouriPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_HOURI).build();
        CPlayerEntity lKeitaBastia = new CPlayerEntity.CPlayerBuilder().firstName("abdoulaye").lastName(CConstants.NAME_BASTIA_KEITA).team(lBastiaFromDb).dayOfBirth(5).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.MALI).positions(lKeitaPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_KEITA).build();
        CPlayerEntity lMostefaBastia = new CPlayerEntity.CPlayerBuilder().firstName("mehdi").lastName(CConstants.NAME_BASTIA_MOSTEFA).team(lBastiaFromDb).dayOfBirth(30).monthOfBirth(CConstants.AUGUST).yearOfBirth(1983).country(CConstants.ALGERIA).positions(lMostefaPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_MOSTEFA).build();
        CPlayerEntity lNgandoBastia = new CPlayerEntity.CPlayerBuilder().firstName("axel").lastName(CConstants.NAME_BASTIA_NGANDO).team(lBastiaFromDb).dayOfBirth(13).monthOfBirth(CConstants.JULY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lNgandoPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_NGANDO).build();
        CPlayerEntity lSidoBastia = new CPlayerEntity.CPlayerBuilder().firstName("rashade").lastName(CConstants.NAME_BASTIA_SIDO).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.BURKINAFASO).positions(lSidoPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_SIDO).build();

        CPlayerEntity lBifoumaBastia = new CPlayerEntity.CPlayerBuilder().firstName("thievy").lastName(CConstants.NAME_BASTIA_BIFOUMA).team(lBastiaFromDb).dayOfBirth(13).monthOfBirth(CConstants.MAY).yearOfBirth(1992).country(CConstants.CONGO).positions(lBifoumaPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_BIFOUMA).build();
        CPlayerEntity lCabralBastia = new CPlayerEntity.CPlayerBuilder().firstName("jerson").lastName(CConstants.NAME_BASTIA_CABRAL).team(lBastiaFromDb).dayOfBirth(3).monthOfBirth(CConstants.JANUARY).yearOfBirth(1991).country(CConstants.NETHERLANDS).positions(lCabralPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_CABRAL).build();
        CPlayerEntity lCoulibalyBastia = new CPlayerEntity.CPlayerBuilder().firstName("lassana").lastName(CConstants.NAME_BASTIA_COULIBALY).team(lBastiaFromDb).dayOfBirth(10).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.MALI).positions(lCoulibalyPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_COULIBALY).build();
        CPlayerEntity lCrivelliBastia = new CPlayerEntity.CPlayerBuilder().firstName("enzo").lastName(CConstants.NAME_BASTIA_CRIVELLI).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCrivelliPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_CRIVELLI).build();
        CPlayerEntity lLangisBastia = new CPlayerEntity.CPlayerBuilder().firstName("lenny").lastName(CConstants.NAME_BASTIA_NANGIS).team(lBastiaFromDb).dayOfBirth(24).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lLangisPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_NANGIS).build();
        CPlayerEntity lRaspentinoBastia = new CPlayerEntity.CPlayerBuilder().firstName("florian").lastName(CConstants.NAME_BASTIA_RASPENTINO).team(lBastiaFromDb).dayOfBirth(6).monthOfBirth(CConstants.JUNE).yearOfBirth(1989).country(CConstants.FRANCE).positions(lRaspentinoPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_RASPENTINO).build();
        CPlayerEntity lSaintMaximinBastia = new CPlayerEntity.CPlayerBuilder().firstName("allan").lastName(CConstants.NAME_BASTIA_STMAXIMIN).team(lBastiaFromDb).dayOfBirth(12).monthOfBirth(CConstants.MARCH).yearOfBirth(1997).country(CConstants.FRANCE).positions(lSaintMaximinPositionsBastia).picturePath(CConstants.PICTURE_BASTIA_STMAXIMIN).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLecaBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCharruauBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVincensiniBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenhaimBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCioniBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPeybernesBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCahuzacBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDjikuBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarangeBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSDialloBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSquillaciBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lElKaoutariBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDanicBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAlexandreBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHouriBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMostefaBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKeitaBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNgandoBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSidoBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaintMaximinBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCrivelliBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBifoumaBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCabralBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCoulibalyBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLangisBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRaspentinoBastia);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBengtssonBastia);
            lCrudMethods.commitTransaction();
        }

    }
}
