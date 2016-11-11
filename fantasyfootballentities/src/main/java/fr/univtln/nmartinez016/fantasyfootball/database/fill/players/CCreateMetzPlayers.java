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
public class CCreateMetzPlayers {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lMetzFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.LOSC).parameters())).get(0);


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

        List<CPositionEntity> lKawashimaPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDidillonPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lOberhauserPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lAssouEkotoPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lRivierezPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPhilippsPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMilanPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lFalettePositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lUdolPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSignorinoPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSelimovicPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBalliuPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lIkaunieksPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSaliuPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSidoPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lHeinPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lJouffrePositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDoukourePositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMandjeckPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMolletPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLarrierePositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLejeunePositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCohadePositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSarrPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lThillPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNsorPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVionPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lErdingPositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNguettePositionsMetz = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDialloPositionsMetz = new ArrayList<CPositionEntity>();


        // players

        CPlayerEntity lKawashimaMetz = new CPlayerEntity.CPlayerBuilder().firstName("eiji").lastName(CConstants.NAME_METZ_KAWASHIMA).team(lMetzFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1983).country(CConstants.JAPAN).positions(lKawashimaPositionsMetz).picturePath(CConstants.PICTURE_METZ_KAWASHIMA).build();
        CPlayerEntity lDidillonMetz = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_METZ_DIDILLON).team(lMetzFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lDidillonPositionsMetz).picturePath(CConstants.PICTURE_METZ_DIDILLON).build();
        CPlayerEntity lOberhauserMetz = new CPlayerEntity.CPlayerBuilder().firstName("david").lastName(CConstants.NAME_METZ_OBERHAUSER).team(lMetzFromDb).dayOfBirth(29).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lOberhauserPositionsMetz).picturePath(CConstants.PICTURE_METZ_OBERHAUSER).build();

        CPlayerEntity lAssouEkotoMetz = new CPlayerEntity.CPlayerBuilder().firstName("benoit").lastName(CConstants.NAME_METZ_ASSOUEKOTTO).team(lMetzFromDb).dayOfBirth(24).monthOfBirth(CConstants.MARCH).yearOfBirth(1984).country(CConstants.FRANCE).positions(lAssouEkotoPositionsMetz).picturePath(CConstants.PICTURE_METZ_ASSOUEKOTTO).build();
        CPlayerEntity lRivierezMetz = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_METZ_RIVIEREZ).team(lMetzFromDb).dayOfBirth(18).monthOfBirth(CConstants.MAY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lRivierezPositionsMetz).picturePath(CConstants.PICTURE_METZ_RIVIEREZ).build();
        CPlayerEntity lPhilippsMetz = new CPlayerEntity.CPlayerBuilder().firstName("chris").lastName(CConstants.NAME_METZ_PHILIPPS).team(lMetzFromDb).dayOfBirth(8).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.LUXEMBOURG).positions(lPhilippsPositionsMetz).picturePath(CConstants.PICTURE_METZ_PHILIPPS).build();
        CPlayerEntity lMilanMetz = new CPlayerEntity.CPlayerBuilder().firstName("guido").lastName(CConstants.NAME_METZ_MILAN).team(lMetzFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1987).country(CConstants.ARGENTINA).positions(lMilanPositionsMetz).picturePath(CConstants.PICTURE_METZ_MILAN).build();
        CPlayerEntity lFaletteMetz = new CPlayerEntity.CPlayerBuilder().firstName("simon").lastName(CConstants.NAME_METZ_FALETTE).team(lMetzFromDb).dayOfBirth(19).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lFalettePositionsMetz).picturePath(CConstants.PICTURE_METZ_FALETTE).build();
        CPlayerEntity lUdolMetz = new CPlayerEntity.CPlayerBuilder().firstName("matthieu").lastName(CConstants.NAME_METZ_UDOL).team(lMetzFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.FRANCE).positions(lUdolPositionsMetz).picturePath(CConstants.PICTURE_METZ_UDOL).build();
        CPlayerEntity lSignorinoMetz = new CPlayerEntity.CPlayerBuilder().firstName("franck").lastName(CConstants.NAME_METZ_SIGNORINO).team(lMetzFromDb).dayOfBirth(19).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lSignorinoPositionsMetz).picturePath(CConstants.PICTURE_METZ_SIGNORINO).build();
        CPlayerEntity lSelimovicMetz = new CPlayerEntity.CPlayerBuilder().firstName("vahid").lastName(CConstants.NAME_METZ_SELIMOVIC).team(lMetzFromDb).dayOfBirth(3).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.LUXEMBOURG).positions(lSelimovicPositionsMetz).picturePath(CConstants.PICTURE_METZ_SELIMOVIC).build();
        CPlayerEntity lBalliuMetz = new CPlayerEntity.CPlayerBuilder().firstName("ivan").lastName(CConstants.NAME_METZ_BALLIU).team(lMetzFromDb).dayOfBirth(1).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.SPAIN).positions(lBalliuPositionsMetz).picturePath(CConstants.PICTURE_METZ_BALLIU).build();
        CPlayerEntity lIkaunieksMetz = new CPlayerEntity.CPlayerBuilder().firstName("janis").lastName(CConstants.NAME_METZ_IKAUNIEKS).team(lMetzFromDb).dayOfBirth(16).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.LATVIA).positions(lIkaunieksPositionsMetz).picturePath(CConstants.PICTURE_METZ_IKAUNIEKS).build();
        CPlayerEntity lSaliuMetz = new CPlayerEntity.CPlayerBuilder().firstName("popoola").lastName(CConstants.NAME_METZ_SALIU).team(lMetzFromDb).dayOfBirth(7).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.NIGERIA).positions(lSaliuPositionsMetz).picturePath(CConstants.PICTURE_METZ_SALIU).build();
        CPlayerEntity lSidoMetz = new CPlayerEntity.CPlayerBuilder().firstName("fadil").lastName(CConstants.NAME_METZ_SIDO).team(lMetzFromDb).dayOfBirth(13).monthOfBirth(CConstants.APRIL).yearOfBirth(1993).country(CConstants.BURKINAFASO).positions(lSidoPositionsMetz).picturePath(CConstants.PICTURE_METZ_SIDO).build();
        CPlayerEntity lHeinMetz = new CPlayerEntity.CPlayerBuilder().firstName("gauthier").lastName(CConstants.NAME_METZ_HEIN).team(lMetzFromDb).dayOfBirth(7).monthOfBirth(CConstants.AUGUST).yearOfBirth(1996).country(CConstants.FRANCE).positions(lHeinPositionsMetz).picturePath(CConstants.PICTURE_METZ_HEIN).build();
        CPlayerEntity lJouffreMetz = new CPlayerEntity.CPlayerBuilder().firstName("yann").lastName(CConstants.NAME_METZ_JOUFFRE).team(lMetzFromDb).dayOfBirth(23).monthOfBirth(CConstants.JULY).yearOfBirth(1984).country(CConstants.FRANCE).positions(lJouffrePositionsMetz).picturePath(CConstants.PICTURE_METZ_JOUFFRE).build();
        CPlayerEntity lDoukoureMetz = new CPlayerEntity.CPlayerBuilder().firstName("cheick").lastName(CConstants.NAME_METZ_DOUKOURE).team(lMetzFromDb).dayOfBirth(11).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lDoukourePositionsMetz).picturePath(CConstants.PICTURE_METZ_DOUKOURE).build();
        CPlayerEntity lMandjeckMetz = new CPlayerEntity.CPlayerBuilder().firstName("georges").lastName(CConstants.NAME_METZ_MANDJECK).team(lMetzFromDb).dayOfBirth(9).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1988).country(CConstants.CAMEROUN).positions(lMandjeckPositionsMetz).picturePath(CConstants.PICTURE_METZ_MANDJECK).build();
        CPlayerEntity lMolletMetz = new CPlayerEntity.CPlayerBuilder().firstName("florent").lastName(CConstants.NAME_METZ_MOLLET).team(lMetzFromDb).dayOfBirth(19).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lMolletPositionsMetz).picturePath(CConstants.PICTURE_METZ_MOLLET).build();
        CPlayerEntity lLarriereMetz = new CPlayerEntity.CPlayerBuilder().firstName("alexis").lastName(CConstants.NAME_METZ_LARRIERE).team(lMetzFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1997).country(CConstants.FRANCE).positions(lLarrierePositionsMetz).picturePath(CConstants.PICTURE_METZ_LARRIERE).build();
        CPlayerEntity lLejeuneMetz = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_METZ_LEJEUNE).team(lMetzFromDb).dayOfBirth(22).monthOfBirth(CConstants.JANUARY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lLejeunePositionsMetz).picturePath(CConstants.PICTURE_METZ_LEJEUNE).build();
        CPlayerEntity lCohadeMetz = new CPlayerEntity.CPlayerBuilder().firstName("renaud").lastName(CConstants.NAME_METZ_COHADE).team(lMetzFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1984).country(CConstants.FRANCE).positions(lCohadePositionsMetz).picturePath(CConstants.PICTURE_METZ_COHADE).build();
        CPlayerEntity lSarrMetz = new CPlayerEntity.CPlayerBuilder().firstName("ismaila").lastName(CConstants.NAME_METZ_SARR).team(lMetzFromDb).dayOfBirth(25).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1998).country(CConstants.SENEGAL).positions(lSarrPositionsMetz).picturePath(CConstants.PICTURE_METZ_SARR).build();
        CPlayerEntity lThillMetz = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_METZ_THILL).team(lMetzFromDb).dayOfBirth(4).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(2000).country(CConstants.LUXEMBOURG).positions(lThillPositionsMetz).picturePath(CConstants.PICTURE_METZ_THILL).build();
        CPlayerEntity lNsorMetz = new CPlayerEntity.CPlayerBuilder().firstName("kwame").lastName(CConstants.NAME_METZ_NSOR).team(lMetzFromDb).dayOfBirth(1).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.GHANA).positions(lNsorPositionsMetz).picturePath(CConstants.PICTURE_METZ_NSOR).build();
        CPlayerEntity lVionMetz = new CPlayerEntity.CPlayerBuilder().firstName("thibaut").lastName(CConstants.NAME_METZ_VION).team(lMetzFromDb).dayOfBirth(11).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lVionPositionsMetz).picturePath(CConstants.PICTURE_METZ_VION).build();
        CPlayerEntity lErdingMetz = new CPlayerEntity.CPlayerBuilder().firstName("mevlut").lastName(CConstants.NAME_METZ_ERDING).team(lMetzFromDb).dayOfBirth(25).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1987).country(CConstants.TURKEY).positions(lErdingPositionsMetz).picturePath(CConstants.PICTURE_METZ_ERDING).build();
        CPlayerEntity lNguetteMetz = new CPlayerEntity.CPlayerBuilder().firstName("opa").lastName(CConstants.NAME_METZ_NGUETTE).team(lMetzFromDb).dayOfBirth(8).monthOfBirth(CConstants.JULY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lNguettePositionsMetz).picturePath(CConstants.PICTURE_METZ_NGUETTE).build();
        CPlayerEntity lDialloMetz = new CPlayerEntity.CPlayerBuilder().firstName("habib").lastName(CConstants.NAME_RENNES_DIALLO).team(lMetzFromDb).dayOfBirth(15).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.SENEGAL).positions(lDialloPositionsMetz).picturePath(CConstants.PICTURE_METZ_DIALLO).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDidillonMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKawashimaMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lOberhauserMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAssouEkotoMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRivierezMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBalliuMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaliuMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPhilippsMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMilanMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lUdolMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFaletteMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSignorinoMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSelimovicMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lIkaunieksMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSidoMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHeinMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDoukoureMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJouffreMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMandjeckMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCohadeMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMolletMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLarriereMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLejeuneMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSarrMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lThillMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNsorMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVionMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNguetteMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lErdingMetz);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloMetz);
            lCrudMethods.commitTransaction();
        }

    }
}
