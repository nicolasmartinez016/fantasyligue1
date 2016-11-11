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
public class CCreateOlPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lOlFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.OL).parameters())).get(0);


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


        List<CPositionEntity> lLopesPositionsOl = new ArrayList<CPositionEntity>();
        lLopesPositionsOl.add(lGk);

        List<CPositionEntity> lGorgelinPositionsOl = new ArrayList<CPositionEntity>();
        lGorgelinPositionsOl.add(lGk);


        List<CPositionEntity> lMapouPositionsOl = new ArrayList<CPositionEntity>();
        lMapouPositionsOl.add(lCb);


        List<CPositionEntity> lRafaelPositionsOl = new ArrayList<CPositionEntity>();
        lRafaelPositionsOl.add(lRb);


        List<CPositionEntity> lJalletPositionsOl = new ArrayList<CPositionEntity>();
        lJalletPositionsOl.add(lRb);

        List<CPositionEntity> lNkoulouPositionsOl = new ArrayList<CPositionEntity>();
        lNkoulouPositionsOl.add(lCb);


        List<CPositionEntity> lMorelPositionsOl = new ArrayList<CPositionEntity>();
        lMorelPositionsOl.add(lLb);
        lMorelPositionsOl.add(lCb);


        List<CPositionEntity> lMammanaPositionsOl = new ArrayList<CPositionEntity>();
        lMammanaPositionsOl.add(lCb);


        List<CPositionEntity> lRybusPositionsOl = new ArrayList<CPositionEntity>();
        lRybusPositionsOl.add(lLb);

        List<CPositionEntity> lKemenPositionsOl = new ArrayList<CPositionEntity>();
        lKemenPositionsOl.add(lCdm);

        List<CPositionEntity> lFofanaPositionsOl = new ArrayList<CPositionEntity>();
        lFofanaPositionsOl.add(lCdm);
        lFofanaPositionsOl.add(lCm);

        List<CPositionEntity> lGrenierPositionsOl = new ArrayList<CPositionEntity>();
        lGrenierPositionsOl.add(lCam);

        List<CPositionEntity> lTousardPositionsOl = new ArrayList<CPositionEntity>();
        lTousardPositionsOl.add(lCdm);

        List<CPositionEntity> lFerriPositionsOl = new ArrayList<CPositionEntity>();
        lFerriPositionsOl.add(lCm);

        List<CPositionEntity> lTolissoPositionsOl = new ArrayList<CPositionEntity>();
        lTolissoPositionsOl.add(lCm);

        List<CPositionEntity> lDarderPositionsOl = new ArrayList<CPositionEntity>();
        lDarderPositionsOl.add(lCdm);
        lDarderPositionsOl.add(lCm);


        List<CPositionEntity> lGonalonsPositionsOl = new ArrayList<CPositionEntity>();
        lGonalonsPositionsOl.add(lCdm);


        List<CPositionEntity> lValbuenaPositionsOl = new ArrayList<CPositionEntity>();
        lValbuenaPositionsOl.add(lCam);


        List<CPositionEntity> lKaluluPositionsOl = new ArrayList<CPositionEntity>();
        lKaluluPositionsOl.add(lSt);


        List<CPositionEntity> lLacazettePositionsOl = new ArrayList<CPositionEntity>();
        lLacazettePositionsOl.add(lSt);


        List<CPositionEntity> lGhezzalPositionsOl = new ArrayList<CPositionEntity>();
        lGhezzalPositionsOl.add(lRw);


        List<CPositionEntity> lFekirPositionsOl = new ArrayList<CPositionEntity>();
        lFekirPositionsOl.add(lF9);
        lFekirPositionsOl.add(lRw);
        lFekirPositionsOl.add(lCam);


        List<CPositionEntity> lCornetPositionsOl = new ArrayList<CPositionEntity>();
        lCornetPositionsOl.add(lLw);
        lCornetPositionsOl.add(lSt);


        List<CPositionEntity> lPerrinPositionsOl = new ArrayList<CPositionEntity>();
        lPerrinPositionsOl.add(lSt);

        List<CPositionEntity> lLabidiPositionsOl = new ArrayList<CPositionEntity>();
        lLabidiPositionsOl.add(lSt);

        List<CPositionEntity> lDiakhabyPositionsOl = new ArrayList<CPositionEntity>();
        lDiakhabyPositionsOl.add(lCb);


        CPlayerEntity lLopesOl = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_OL_LOPES).team(lOlFromDb).dayOfBirth(1).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.PORTUGAL).positions(lLopesPositionsOl).picturePath(CConstants.PICTURE_OL_LOPES).build();
        CPlayerEntity lGorgelinOl = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_OL_GORGELIN).team(lOlFromDb).dayOfBirth(5).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.FRANCE).positions(lGorgelinPositionsOl).picturePath(CConstants.PICTURE_OL_GORGELIN).build();
        CPlayerEntity lJalletOl = new CPlayerEntity.CPlayerBuilder().firstName("christophe").lastName(CConstants.NAME_OL_JALLET).team(lOlFromDb).dayOfBirth(31).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1983).country(CConstants.FRANCE).positions(lJalletPositionsOl).picturePath(CConstants.PICTURE_OL_JALLET).build();
        CPlayerEntity lMapouOl = new CPlayerEntity.CPlayerBuilder().firstName("mapou").lastName(CConstants.NAME_OL_MAPOU).team(lOlFromDb).dayOfBirth(25).monthOfBirth(CConstants.MAY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lMapouPositionsOl).picturePath(CConstants.PICTURE_OL_MAPOU).build();
        CPlayerEntity lNkoulouOl = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_OL_NKOULOU).team(lOlFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.CAMEROUN).positions(lNkoulouPositionsOl).picturePath(CConstants.PICTURE_OL_NKOULOU).build();
        CPlayerEntity lMorelOl = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_OL_MOREL).team(lOlFromDb).dayOfBirth(2).monthOfBirth(CConstants.APRIL).yearOfBirth(1984).country(CConstants.BRAZIL).positions(lMorelPositionsOl).picturePath(CConstants.PICTURE_OL_MOREL).build();
        CPlayerEntity lRafaelOl = new CPlayerEntity.CPlayerBuilder().firstName("rafael").lastName(CConstants.NAME_OL_RAFAEL).team(lOlFromDb).dayOfBirth(9).monthOfBirth(CConstants.JULY).yearOfBirth(1990).country(CConstants.BRAZIL).positions(lRafaelPositionsOl).picturePath(CConstants.PICTURE_OL_RAFAEL).build();
        CPlayerEntity lMammanaOl = new CPlayerEntity.CPlayerBuilder().firstName("emmanuel").lastName(CConstants.NAME_OL_MAMMANA).team(lOlFromDb).dayOfBirth(10).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1996).country(CConstants.ARGENTINA).positions(lMammanaPositionsOl).picturePath(CConstants.PICTURE_OL_MAMMANA).build();
        CPlayerEntity lRybusOl = new CPlayerEntity.CPlayerBuilder().firstName("maciej").lastName(CConstants.NAME_OL_RYBUS).team(lOlFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1989).country(CConstants.POLAND).positions(lRybusPositionsOl).picturePath(CConstants.PICTURE_OL_RYBUS).build();
        CPlayerEntity lFerriOl = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_OL_FERRI).team(lOlFromDb).dayOfBirth(12).monthOfBirth(CConstants.MARCH).yearOfBirth(1992).country(CConstants.FRANCE).positions(lFerriPositionsOl).picturePath(CConstants.PICTURE_OL_FERRI).build();
        CPlayerEntity lTousardOl = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_OL_TOUSARD).team(lOlFromDb).dayOfBirth(29).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lTousardPositionsOl).picturePath(CConstants.PICTURE_OL_TOUSARD).build();
        CPlayerEntity lTolissoOl = new CPlayerEntity.CPlayerBuilder().firstName("corentin").lastName(CConstants.NAME_OL_TOLISSO).team(lOlFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.ITALY).positions(lTolissoPositionsOl).picturePath(CConstants.PICTURE_OL_TOLISSO).build();
        CPlayerEntity lDarderOl = new CPlayerEntity.CPlayerBuilder().firstName("sergi").lastName(CConstants.NAME_OL_DARDER).team(lOlFromDb).dayOfBirth(22).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.SPAIN).positions(lDarderPositionsOl).picturePath(CConstants.PICTURE_OL_DARDER).build();
        CPlayerEntity lGrenierOl = new CPlayerEntity.CPlayerBuilder().firstName("clement").lastName(CConstants.NAME_OL_GRENIER).team(lOlFromDb).dayOfBirth(7).monthOfBirth(CConstants.JANUARY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lGrenierPositionsOl).picturePath(CConstants.PICTURE_OL_GRENIER).build();
        CPlayerEntity lGonalonsOl = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_OL_GONALONS).team(lOlFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.FRANCE).positions(lGonalonsPositionsOl).picturePath(CConstants.PICTURE_OL_GONALONS).build();
        CPlayerEntity lFofanaOl = new CPlayerEntity.CPlayerBuilder().firstName("gueida").lastName(CConstants.NAME_OL_FOFANA).team(lOlFromDb).dayOfBirth(16).monthOfBirth(CConstants.MAY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lFofanaPositionsOl).picturePath(CConstants.PICTURE_OL_FOFANA).build();
        CPlayerEntity lKemenOl = new CPlayerEntity.CPlayerBuilder().firstName("olivier").lastName(CConstants.NAME_OL_KEMEN).team(lOlFromDb).dayOfBirth(20).monthOfBirth(CConstants.JULY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lKemenPositionsOl).picturePath(CConstants.PICTURE_OL_KEMEN).build();
        CPlayerEntity lValbuenaOl = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_OL_VALBUENA).team(lOlFromDb).dayOfBirth(28).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1984).country(CConstants.FRANCE).positions(lValbuenaPositionsOl).picturePath(CConstants.PICTURE_OL_VALBUENA).build();
        CPlayerEntity lLacazetteOl = new CPlayerEntity.CPlayerBuilder().firstName("alexandre").lastName(CConstants.NAME_OL_LACAZETTE).team(lOlFromDb).dayOfBirth(28).monthOfBirth(CConstants.MAY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lLacazettePositionsOl).picturePath(CConstants.PICTURE_OL_LACAZETTE).build();
        CPlayerEntity lGhezzalOl = new CPlayerEntity.CPlayerBuilder().firstName("rachid").lastName(CConstants.NAME_OL_GHEZZAL).team(lOlFromDb).dayOfBirth(9).monthOfBirth(CConstants.MAY).yearOfBirth(1992).country(CConstants.ALGERIA).positions(lGhezzalPositionsOl).picturePath(CConstants.PICTURE_OL_GHEZZAL).build();
        CPlayerEntity lFekirOl = new CPlayerEntity.CPlayerBuilder().firstName("nabil").lastName(CConstants.NAME_OL_FEKIR).team(lOlFromDb).dayOfBirth(18).monthOfBirth(CConstants.JULY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lFekirPositionsOl).picturePath(CConstants.PICTURE_OL_FEKIR).build();
        CPlayerEntity lKaluluOl = new CPlayerEntity.CPlayerBuilder().firstName("aldo").lastName(CConstants.NAME_OL_KALULU).team(lOlFromDb).dayOfBirth(21).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lKaluluPositionsOl).picturePath(CConstants.PICTURE_OL_KALULU).build();
        CPlayerEntity lPerrinOl = new CPlayerEntity.CPlayerBuilder().firstName("gaetan").lastName(CConstants.NAME_OL_PERRIN).team(lOlFromDb).dayOfBirth(7).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lPerrinPositionsOl).picturePath(CConstants.PICTURE_OL_PERRIN).build();
        CPlayerEntity lCornetOl = new CPlayerEntity.CPlayerBuilder().firstName("maxwell").lastName(CConstants.NAME_OL_CORNET).team(lOlFromDb).dayOfBirth(27).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lCornetPositionsOl).picturePath(CConstants.PICTURE_OL_CORNET).build();
        CPlayerEntity lLabidiOl = new CPlayerEntity.CPlayerBuilder().firstName("zakarie").lastName(CConstants.NAME_OL_LABIDI).team(lOlFromDb).dayOfBirth(8).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLabidiPositionsOl).picturePath(CConstants.PICTURE_OL_LABIDI).build();
        CPlayerEntity lDiakhabyOl = new CPlayerEntity.CPlayerBuilder().firstName("mouctar").lastName(CConstants.NAME_OL_DIAKHABY).team(lOlFromDb).dayOfBirth(19).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lDiakhabyPositionsOl).picturePath(CConstants.PICTURE_OL_DIAKHABY).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLopesOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGorgelinOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMapouOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMammanaOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRybusOl);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNkoulouOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMorelOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJalletOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRafaelOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTousardOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFofanaOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGrenierOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGonalonsOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFerriOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTolissoOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lValbuenaOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDarderOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKemenOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLacazetteOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFekirOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPerrinOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGhezzalOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCornetOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLabidiOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKaluluOl);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiakhabyOl);
            lCrudMethods.commitTransaction();
        }



    }
}
