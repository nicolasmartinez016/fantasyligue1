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
public class CCreateLoscPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lLoscFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.LOSC).parameters())).get(0);


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

        List<CPositionEntity> lEneyamaPositionsLosc = new ArrayList<CPositionEntity>();
        lEneyamaPositionsLosc.add(lGk);

        List<CPositionEntity> lMaignanPositionsLosc = new ArrayList<CPositionEntity>();
        lMaignanPositionsLosc.add(lGk);

        List<CPositionEntity> lButezPositionsLosc = new ArrayList<CPositionEntity>();
        lButezPositionsLosc.add(lGk);


        List<CPositionEntity> lCorchiaPositionsLosc = new ArrayList<CPositionEntity>();
        lCorchiaPositionsLosc.add(lRb);
        lCorchiaPositionsLosc.add(lRm);

        List<CPositionEntity> lCivelliPositionsLosc = new ArrayList<CPositionEntity>();
        lCivelliPositionsLosc.add(lCb);

        List<CPositionEntity> lBasaPositionsLosc = new ArrayList<CPositionEntity>();
        lBasaPositionsLosc.add(lCb);

        List<CPositionEntity> lPavardPositionsLosc = new ArrayList<CPositionEntity>();
        lPavardPositionsLosc.add(lCb);
        lPavardPositionsLosc.add(lRb);

        List<CPositionEntity> lSoumaoroPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBeriaPositionsLosc = new ArrayList<CPositionEntity>();
        lBeriaPositionsLosc.add(lLb);

        List<CPositionEntity> lSunzuPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKonePositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPalmieriPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMendylPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lArcusPositionsLosc = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lSankharePositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lObbadiPositionsLosc = new ArrayList<CPositionEntity>();
        lObbadiPositionsLosc.add(lCdm);
        lObbadiPositionsLosc.add(lCm);

        List<CPositionEntity> lLopesPositionsLosc = new ArrayList<CPositionEntity>();
        lLopesPositionsLosc.add(lCam);
        lLopesPositionsLosc.add(lRw);

        List<CPositionEntity> lBoufalPositionsLosc = new ArrayList<CPositionEntity>();
        lBoufalPositionsLosc.add(lCam);
        lBoufalPositionsLosc.add(lLw);

        List<CPositionEntity> lAmadouPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAmalfitanoPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBautheacPositionsLosc = new ArrayList<CPositionEntity>();
        lBautheacPositionsLosc.add(lLm);
        lBautheacPositionsLosc.add(lLw);

        List<CPositionEntity> lMavubaPositionsLosc = new ArrayList<CPositionEntity>();
        lMavubaPositionsLosc.add(lCm);
        lMavubaPositionsLosc.add(lCdm);

        List<CPositionEntity> lBissoumaPositionsLosc = new ArrayList<CPositionEntity>();


        List<CPositionEntity> lBenziaPositionsLosc = new ArrayList<CPositionEntity>();
        lBenziaPositionsLosc.add(lSt);

        List<CPositionEntity> lTalloPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lEderPositionsLosc = new ArrayList<CPositionEntity>();
        lEderPositionsLosc.add(lSt);

        List<CPositionEntity> lMendesPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTerrierPositionsLosc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMothibaPositionsLosc = new ArrayList<CPositionEntity>();


        CPlayerEntity lEneyamaLosc = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_LOSC_ENEYAMA).team(lLoscFromDb).dayOfBirth(29).monthOfBirth(CConstants.AUGUST).yearOfBirth(1982).country(CConstants.NIGERIA).positions(lEneyamaPositionsLosc).picturePath(CConstants.PICTURE_LOSC_ENEYAMA).build();
        CPlayerEntity lMaignanLosc = new CPlayerEntity.CPlayerBuilder().firstName("mike").lastName(CConstants.NAME_LOSC_MAIGNAN).team(lLoscFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lMaignanPositionsLosc).picturePath(CConstants.PICTURE_LOSC_MAIGNAN).build();
        CPlayerEntity lButezLosc = new CPlayerEntity.CPlayerBuilder().firstName("jean").lastName(CConstants.NAME_LOSC_BUTEZ).team(lLoscFromDb).dayOfBirth(8).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.FRANCE).positions(lButezPositionsLosc).picturePath(CConstants.PICTURE_LOSC_BUTEZ).build();

        CPlayerEntity lCorchiaLosc = new CPlayerEntity.CPlayerBuilder().firstName("sebastian").lastName(CConstants.NAME_LOSC_CORCHIA).team(lLoscFromDb).dayOfBirth(1).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lCorchiaPositionsLosc).picturePath(CConstants.PICTURE_LOSC_CORCHIA).build();
        CPlayerEntity lKoneLosc = new CPlayerEntity.CPlayerBuilder().firstName("youssouf").lastName(CConstants.NAME_LOSC_KONE).team(lLoscFromDb).dayOfBirth(5).monthOfBirth(CConstants.JULY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lKonePositionsLosc).picturePath(CConstants.PICTURE_LOSC_KONE).build();
        CPlayerEntity lCivelliLosc = new CPlayerEntity.CPlayerBuilder().firstName("renato").lastName(CConstants.NAME_LOSC_CIVELLI).team(lLoscFromDb).dayOfBirth(14).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1983).country(CConstants.FRANCE).positions(lCivelliPositionsLosc).picturePath(CConstants.PICTURE_LOSC_CIVELLI).build();
        CPlayerEntity lSunzuLosc = new CPlayerEntity.CPlayerBuilder().firstName("stoppila").lastName(CConstants.NAME_LOSC_SUNZU).team(lLoscFromDb).dayOfBirth(22).monthOfBirth(CConstants.JUNE).yearOfBirth(1989).country(CConstants.ZAMBIE).positions(lSunzuPositionsLosc).picturePath(CConstants.PICTURE_LOSC_SUNZU).build();
        CPlayerEntity lPalmieriLosc = new CPlayerEntity.CPlayerBuilder().firstName("julian").lastName(CConstants.NAME_LOSC_PALMIERI).team(lLoscFromDb).dayOfBirth(7).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1986).country(CConstants.FRANCE).positions(lPalmieriPositionsLosc).picturePath(CConstants.PICTURE_LOSC_PALMIERI).build();
        CPlayerEntity lBeriaLosc = new CPlayerEntity.CPlayerBuilder().firstName("franck").lastName(CConstants.NAME_LOSC_BERIA).team(lLoscFromDb).dayOfBirth(23).monthOfBirth(CConstants.MAY).yearOfBirth(1983).country(CConstants.FRANCE).positions(lBeriaPositionsLosc).picturePath(CConstants.PICTURE_LOSC_BERIA).build();
        CPlayerEntity lSoumaoroLosc = new CPlayerEntity.CPlayerBuilder().firstName("adama").lastName(CConstants.NAME_LOSC_SOUMAORO).team(lLoscFromDb).dayOfBirth(18).monthOfBirth(CConstants.JUNE).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSoumaoroPositionsLosc).picturePath(CConstants.PICTURE_LOSC_SOUMAORO).build();
        CPlayerEntity lBasaLosc = new CPlayerEntity.CPlayerBuilder().firstName("marko").lastName(CConstants.NAME_LOSC_BASA).team(lLoscFromDb).dayOfBirth(29).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1982).country(CConstants.MONTENEGRO).positions(lBasaPositionsLosc).picturePath(CConstants.PICTURE_LOSC_BASA).build();
        CPlayerEntity lPavardLosc = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_LOSC_PAVARD).team(lLoscFromDb).dayOfBirth(28).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.FRANCE).positions(lPavardPositionsLosc).picturePath(CConstants.PICTURE_LOSC_PAVARD).build();
        CPlayerEntity lMendylLosc = new CPlayerEntity.CPlayerBuilder().firstName("hamza").lastName(CConstants.NAME_LOSC_MENDYL).team(lLoscFromDb).dayOfBirth(21).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1997).country(CConstants.MOROCCO).positions(lMendylPositionsLosc).picturePath(CConstants.PICTURE_LOSC_MENDYL).build();
        CPlayerEntity lArcusLosc = new CPlayerEntity.CPlayerBuilder().firstName("carlens").lastName(CConstants.NAME_LOSC_ARCUS).team(lLoscFromDb).dayOfBirth(20).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.HAITI).positions(lArcusPositionsLosc).picturePath(CConstants.PICTURE_LOSC_ARCUS).build();

        CPlayerEntity lSankhareLosc = new CPlayerEntity.CPlayerBuilder().firstName("younousse").lastName(CConstants.NAME_LOSC_SANKHARE).team(lLoscFromDb).dayOfBirth(10).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lSankharePositionsLosc).picturePath(CConstants.PICTURE_LOSC_SANKHARE).build();
        CPlayerEntity lAmadouLosc = new CPlayerEntity.CPlayerBuilder().firstName("ibrahim").lastName(CConstants.NAME_LOSC_AMADOU).team(lLoscFromDb).dayOfBirth(6).monthOfBirth(CConstants.APRIL).yearOfBirth(1993).country(CConstants.CAMEROUN).positions(lAmadouPositionsLosc).picturePath(CConstants.PICTURE_LOSC_AMADOU).build();
        CPlayerEntity lBoufalLosc = new CPlayerEntity.CPlayerBuilder().firstName("sofiane").lastName(CConstants.NAME_LOSC_BOUFAL).team(lLoscFromDb).dayOfBirth(17).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lBoufalPositionsLosc).picturePath(CConstants.PICTURE_LOSC_BOUFAL).build();
        CPlayerEntity lObbadiLosc = new CPlayerEntity.CPlayerBuilder().firstName("mounir").lastName(CConstants.NAME_LOSC_OBBADI).team(lLoscFromDb).dayOfBirth(4).monthOfBirth(CConstants.APRIL).yearOfBirth(1983).country(CConstants.MOROCCO).positions(lObbadiPositionsLosc).picturePath(CConstants.PICTURE_LOSC_OBBADI).build();
        CPlayerEntity lAmalfitanoLosc = new CPlayerEntity.CPlayerBuilder().firstName("morgan").lastName(CConstants.NAME_LOSC_AMALFITANO).team(lLoscFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1985).country(CConstants.FRANCE).positions(lAmalfitanoPositionsLosc).picturePath(CConstants.PICTURE_LOSC_AMALFITANO).build();
        CPlayerEntity lBautheacLosc = new CPlayerEntity.CPlayerBuilder().firstName("eric").lastName(CConstants.NAME_LOSC_BAUTHEAC).team(lLoscFromDb).dayOfBirth(24).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lBautheacPositionsLosc).picturePath(CConstants.PICTURE_LOSC_BAUTHEAC).build();
        CPlayerEntity lLopesLosc = new CPlayerEntity.CPlayerBuilder().firstName("rony").lastName(CConstants.NAME_LOSC_LOPES).team(lLoscFromDb).dayOfBirth(28).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1995).country(CConstants.PORTUGAL).positions(lLopesPositionsLosc).picturePath(CConstants.PICTURE_LOSC_LOPES).build();
        CPlayerEntity lMavubaLosc = new CPlayerEntity.CPlayerBuilder().firstName("rio").lastName(CConstants.NAME_LOSC_MAVUBA).team(lLoscFromDb).dayOfBirth(8).monthOfBirth(CConstants.MARCH).yearOfBirth(1984).country(CConstants.FRANCE).positions(lMavubaPositionsLosc).picturePath(CConstants.PICTURE_LOSC_MAVUBA).build();
        CPlayerEntity lBissoumaLosc = new CPlayerEntity.CPlayerBuilder().firstName("yves").lastName(CConstants.NAME_LOSC_BISSOUMA).team(lLoscFromDb).dayOfBirth(30).monthOfBirth(CConstants.AUGUST).yearOfBirth(1996).country(CConstants.MALI).positions(lBissoumaPositionsLosc).picturePath(CConstants.PICTURE_LOSC_BISSOUMA).build();

        CPlayerEntity lBenziaLosc = new CPlayerEntity.CPlayerBuilder().firstName("yassine").lastName(CConstants.NAME_LOSC_BENZIA).team(lLoscFromDb).dayOfBirth(8).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lBenziaPositionsLosc).picturePath(CConstants.PICTURE_LOSC_BENZIA).build();
        CPlayerEntity lTalloLosc = new CPlayerEntity.CPlayerBuilder().firstName("junior").lastName(CConstants.NAME_LOSC_TALLO).team(lLoscFromDb).dayOfBirth(21).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lTalloPositionsLosc).picturePath(CConstants.PICTURE_LOSC_TALLO).build();
        CPlayerEntity lEderLosc = new CPlayerEntity.CPlayerBuilder().firstName("eder").lastName(CConstants.NAME_LOSC_EDER).team(lLoscFromDb).dayOfBirth(22).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1987).country(CConstants.PORTUGAL).positions(lEderPositionsLosc).picturePath(CConstants.PICTURE_LOSC_EDER).build();
        CPlayerEntity lMendesLosc = new CPlayerEntity.CPlayerBuilder().firstName("ryan").lastName(CConstants.NAME_LOSC_MENDES).team(lLoscFromDb).dayOfBirth(8).monthOfBirth(CConstants.JANUARY).yearOfBirth(1990).country(CConstants.CAPVERT).positions(lMendesPositionsLosc).picturePath(CConstants.PICTURE_LOSC_MENDES).build();
        CPlayerEntity lTerrierLosc = new CPlayerEntity.CPlayerBuilder().firstName("martin").lastName(CConstants.NAME_LOSC_TERRIER).team(lLoscFromDb).dayOfBirth(4).monthOfBirth(CConstants.MARCH).yearOfBirth(1997).country(CConstants.FRANCE).positions(lTerrierPositionsLosc).picturePath(CConstants.PICTURE_LOSC_TERRIER).build();
        CPlayerEntity lMothibaLosc = new CPlayerEntity.CPlayerBuilder().firstName("lebo").lastName(CConstants.NAME_LOSC_MOTHIBA).team(lLoscFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.SOUTHAFRICA).positions(lMothibaPositionsLosc).picturePath(CConstants.PICTURE_LOSC_MOTHIBA).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEneyamaLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaignanLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lButezLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCivelliLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCorchiaLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBeriaLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBasaLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPavardLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSoumaoroLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAmadouLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSunzuLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoufalLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLopesLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBautheacLosc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMavubaLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lObbadiLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEderLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendesLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenziaLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPalmieriLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendylLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lArcusLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKoneLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSankhareLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBissoumaLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAmalfitanoLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTalloLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMothibaLosc);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTerrierLosc);
            lCrudMethods.commitTransaction();
        }

    }
}
