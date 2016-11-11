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
 * Created by marti on 17/08/2016.
 */
public class CCreateToulousePlayers {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();
        CTeamEntity lToulouseFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.TOULOUSE).parameters())).get(0);


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

        List<CPositionEntity> lLafontPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVidalPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lGoicoecheaPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMoubandjePositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNinkovPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSpajicPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVeskovacPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lYagoPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSyllaPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lJullienPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDiopPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lAkpaAkproPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDoumbiaPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBodigerPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lTrejoPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSirieixPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBlinPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSomaliaPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPiPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSangarePositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBraithwaitePositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPesicPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lToivonenPositionsTfc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lEdouardPositionsTfc = new ArrayList<CPositionEntity>();


        // players

        CPlayerEntity lLafontTfc = new CPlayerEntity.CPlayerBuilder().firstName("alban").lastName(CConstants.NAME_TOULOUSE_LAFONT).team(lToulouseFromDb).dayOfBirth(23).monthOfBirth(CConstants.JANUARY).yearOfBirth(1999).country(CConstants.FRANCE).positions(lLafontPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_LAFONT).build();
        CPlayerEntity lVidalTfc = new CPlayerEntity.CPlayerBuilder().firstName("marc").lastName(CConstants.NAME_TOULOUSE_VIDAL).team(lToulouseFromDb).dayOfBirth(3).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lVidalPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_VIDAL).build();
        CPlayerEntity lGoicoecheaTfc = new CPlayerEntity.CPlayerBuilder().firstName("mauro").lastName(CConstants.NAME_TOULOUSE_GOIGOECHEA).team(lToulouseFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1988).country(CConstants.URUGUAY).positions(lGoicoecheaPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_GOIGOECHEA).build();

        CPlayerEntity lMoubandjeTfc = new CPlayerEntity.CPlayerBuilder().firstName("francois").lastName(CConstants.NAME_TOULOUSE_MOUBANDJE).team(lToulouseFromDb).dayOfBirth(21).monthOfBirth(CConstants.JUNE).yearOfBirth(1990).country(CConstants.SWITZERLAND).positions(lMoubandjePositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_MOUBANDJE).build();
        CPlayerEntity lNinkovTfc = new CPlayerEntity.CPlayerBuilder().firstName("pavle").lastName(CConstants.NAME_TOULOUSE_NINKOV).team(lToulouseFromDb).dayOfBirth(20).monthOfBirth(CConstants.APRIL).yearOfBirth(1985).country(CConstants.SERBIA).positions(lNinkovPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_NINKOV).build();
        CPlayerEntity lSpajicTfc = new CPlayerEntity.CPlayerBuilder().firstName("uros").lastName(CConstants.NAME_TOULOUSE_SPAJIC).team(lToulouseFromDb).dayOfBirth(13).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1993).country(CConstants.SERBIA).positions(lSpajicPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_SPAJIC).build();
        CPlayerEntity lVeskovacTfc = new CPlayerEntity.CPlayerBuilder().firstName("dusan").lastName(CConstants.NAME_TOULOUSE_VESKOVAC).team(lToulouseFromDb).dayOfBirth(13).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.SERBIA).positions(lVeskovacPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_VESKOVAC).build();
        CPlayerEntity lYagoTfc = new CPlayerEntity.CPlayerBuilder().firstName("steeve").lastName(CConstants.NAME_TOULOUSE_YAGO).team(lToulouseFromDb).dayOfBirth(16).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lYagoPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_YAGO).build();
        CPlayerEntity lSyllaTfc = new CPlayerEntity.CPlayerBuilder().firstName("issiaga").lastName(CConstants.NAME_RENNES_SYLLA).team(lToulouseFromDb).dayOfBirth(1).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lSyllaPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_SYLLA).build();
        CPlayerEntity lJullienTfc = new CPlayerEntity.CPlayerBuilder().firstName("christopher").lastName(CConstants.NAME_TOULOUSE_JULLIEN).team(lToulouseFromDb).dayOfBirth(22).monthOfBirth(CConstants.MARCH).yearOfBirth(1993).country(CConstants.FRANCE).positions(lJullienPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_JULLIEN).build();
        CPlayerEntity lDiopTfc = new CPlayerEntity.CPlayerBuilder().firstName("issa").lastName(CConstants.NAME_TOULOUSE_DIOP).team(lToulouseFromDb).dayOfBirth(9).monthOfBirth(CConstants.JANUARY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lDiopPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_DIOP).build();

        CPlayerEntity lAkpaAkproTfc = new CPlayerEntity.CPlayerBuilder().firstName("jean daniel").lastName(CConstants.NAME_TOULOUSE_AKPAAKPRO).team(lToulouseFromDb).dayOfBirth(11).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lAkpaAkproPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_AKPAAKPRO).build();
        CPlayerEntity lDoumbiaTfc = new CPlayerEntity.CPlayerBuilder().firstName("tongo").lastName(CConstants.NAME_TOULOUSE_DOUMBIA).team(lToulouseFromDb).dayOfBirth(6).monthOfBirth(CConstants.AUGUST).yearOfBirth(1989).country(CConstants.MALI).positions(lDoumbiaPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_DOUMBIA).build();
        CPlayerEntity lBodigerTfc = new CPlayerEntity.CPlayerBuilder().firstName("yann").lastName(CConstants.NAME_TOULOUSE_BODIGER).team(lToulouseFromDb).dayOfBirth(9).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lBodigerPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_BODIGER).build();
        CPlayerEntity lTrejoTfc = new CPlayerEntity.CPlayerBuilder().firstName("oscar").lastName(CConstants.NAME_TOULOUSE_TREJO).team(lToulouseFromDb).dayOfBirth(26).monthOfBirth(CConstants.APRIL).yearOfBirth(1988).country(CConstants.FRANCE).positions(lTrejoPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_TREJO).build();
        CPlayerEntity lSirieixTfc = new CPlayerEntity.CPlayerBuilder().firstName("pantxi").lastName(CConstants.NAME_TOULOUSE_SIRIEIX).team(lToulouseFromDb).dayOfBirth(7).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1980).country(CConstants.FRANCE).positions(lSirieixPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_SIRIEIX).build();
        CPlayerEntity lBlinTfc = new CPlayerEntity.CPlayerBuilder().firstName("alexis").lastName(CConstants.NAME_TOULOUSE_BLIN).team(lToulouseFromDb).dayOfBirth(16).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBlinPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_BLIN).build();
        CPlayerEntity lSomaliaTfc = new CPlayerEntity.CPlayerBuilder().firstName("wergiton").lastName(CConstants.NAME_TOULOUSE_SOMALIA).team(lToulouseFromDb).dayOfBirth(28).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.BRAZIL).positions(lSomaliaPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_SOMALIA).build();
        CPlayerEntity lPiTfc = new CPlayerEntity.CPlayerBuilder().firstName("jessy").lastName(CConstants.NAME_TOULOUSE_PI).team(lToulouseFromDb).dayOfBirth(24).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPiPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_PI).build();
        CPlayerEntity lSangareTfc = new CPlayerEntity.CPlayerBuilder().firstName("ibrahim").lastName(CConstants.NAME_TOULOUSE_SANGARE).team(lToulouseFromDb).dayOfBirth(2).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1997).country(CConstants.IVORYCOAST).positions(lSangarePositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_SANGARE).build();

        CPlayerEntity lBraithwaiteTfc = new CPlayerEntity.CPlayerBuilder().firstName("martin").lastName(CConstants.NAME_TOULOUSE_BRAITHWAITE).team(lToulouseFromDb).dayOfBirth(5).monthOfBirth(CConstants.JUNE).yearOfBirth(1991).country(CConstants.DENMARK).positions(lBraithwaitePositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_BRAITHWAITE).build();
        CPlayerEntity lPesicTfc = new CPlayerEntity.CPlayerBuilder().firstName("aleksandar").lastName(CConstants.NAME_TOULOUSE_PESIC).team(lToulouseFromDb).dayOfBirth(21).monthOfBirth(CConstants.MAY).yearOfBirth(1992).country(CConstants.SERBIA).positions(lPesicPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_PESIC).build();
        CPlayerEntity lToivonenTfc = new CPlayerEntity.CPlayerBuilder().firstName("ola").lastName(CConstants.NAME_TOULOUSE_TOIVONEN).team(lToulouseFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1987).country(CConstants.SWEDEN).positions(lToivonenPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_TOIVONEN).build();
        CPlayerEntity lEdouardTfc = new CPlayerEntity.CPlayerBuilder().firstName("odsonne").lastName(CConstants.NAME_TOULOUSE_EDOUARD).team(lToulouseFromDb).dayOfBirth(16).monthOfBirth(CConstants.JANUARY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lEdouardPositionsTfc).picturePath(CConstants.PICTURE_TOULOUSE_EDOUARD).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEdouardTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToivonenTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPesicTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBraithwaiteTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSangareTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPiTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSomaliaTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBlinTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSirieixTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTrejoTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBodigerTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDoumbiaTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAkpaAkproTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiopTfc);
            lCrudMethods.commitTransaction();
        }


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSyllaTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJullienTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lYagoTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVeskovacTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSpajicTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNinkovTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMoubandjeTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGoicoecheaTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLafontTfc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVidalTfc);
            lCrudMethods.commitTransaction();
        }


    }
}
