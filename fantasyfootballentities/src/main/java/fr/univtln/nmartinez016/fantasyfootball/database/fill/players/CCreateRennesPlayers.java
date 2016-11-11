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
public class CCreateRennesPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();
        CTeamEntity lRennesFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.RENNES).parameters())).get(0);


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

        List<CPositionEntity> lCostilPositionsRennes = new ArrayList<CPositionEntity>();
        lCostilPositionsRennes.add(lGk);

        List<CPositionEntity> lDialloPositionsRennes = new ArrayList<CPositionEntity>();
        lDialloPositionsRennes.add(lGk);

        List<CPositionEntity> lNardiPositionsRennes = new ArrayList<CPositionEntity>();
        lNardiPositionsRennes.add(lGk);

        List<CPositionEntity> lGertmonasPositionsRennes = new ArrayList<CPositionEntity>();
        lGertmonasPositionsRennes.add(lGk);

        List<CPositionEntity> lArmandPositionsRennes = new ArrayList<CPositionEntity>();
        lArmandPositionsRennes.add(lCb);
        lArmandPositionsRennes.add(lLb);

        List<CPositionEntity> lMendesPositionsRennes = new ArrayList<CPositionEntity>();
        lMendesPositionsRennes.add(lCb);
        lMendesPositionsRennes.add(lRb);

        List<CPositionEntity> lMexerPositionsRennes = new ArrayList<CPositionEntity>();
        lMexerPositionsRennes.add(lCb);

        List<CPositionEntity> lBensebainiPositionsRennes = new ArrayList<CPositionEntity>();
        lBensebainiPositionsRennes.add(lCb);

        List<CPositionEntity> lBaalPositionsRennes = new ArrayList<CPositionEntity>();
        lBaalPositionsRennes.add(lLb);

        List<CPositionEntity> lZeffanePositionsRennes = new ArrayList<CPositionEntity>();
        lZeffanePositionsRennes.add(lRb);
        lZeffanePositionsRennes.add(lRw);

        List<CPositionEntity> lDanzePositionsRennes = new ArrayList<CPositionEntity>();
        lDanzePositionsRennes.add(lRb);

        List<CPositionEntity> lCavarePositionsRennes = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lFigueiredoPositionsRennes = new ArrayList<CPositionEntity>();
        lFigueiredoPositionsRennes.add(lLb);

        List<CPositionEntity> lGnagnonPositionsRennes = new ArrayList<CPositionEntity>();
        lGnagnonPositionsRennes.add(lCb);
        lGnagnonPositionsRennes.add(lCdm);



        List<CPositionEntity> lAndrePositionsRennes = new ArrayList<CPositionEntity>();
        lAndrePositionsRennes.add(lCdm);
        lAndrePositionsRennes.add(lCm);

        List<CPositionEntity> lGourcuffPositionsRennes = new ArrayList<CPositionEntity>();
        lGourcuffPositionsRennes.add(lCam);
        lGourcuffPositionsRennes.add(lCm);

        List<CPositionEntity> lJanvierPositionsRennes = new ArrayList<CPositionEntity>();
        lJanvierPositionsRennes.add(lCam);
        lJanvierPositionsRennes.add(lCm);

        List<CPositionEntity> lFernandesPositionsRennes = new ArrayList<CPositionEntity>();
        lFernandesPositionsRennes.add(lCdm);
        lFernandesPositionsRennes.add(lCm);

        List<CPositionEntity> lSyllaPositionsRennes = new ArrayList<CPositionEntity>();
        lSyllaPositionsRennes.add(lCdm);

        List<CPositionEntity> lChantomePositionsRennes = new ArrayList<CPositionEntity>();
        lChantomePositionsRennes.add(lCm);
        lChantomePositionsRennes.add(lCam);

        List<CPositionEntity> lHunouPositionsRennes = new ArrayList<CPositionEntity>();
        lHunouPositionsRennes.add(lCam);
        lHunouPositionsRennes.add(lRw);

        List<CPositionEntity> lPrcicPositionsRennes = new ArrayList<CPositionEntity>();
        lPrcicPositionsRennes.add(lCam);
        lPrcicPositionsRennes.add(lLw);

        List<CPositionEntity> lRibelinPositionsRennes = new ArrayList<CPositionEntity>();
        lRibelinPositionsRennes.add(lCam);

        List<CPositionEntity> lErasmusPositionsRennes = new ArrayList<CPositionEntity>();
        lErasmusPositionsRennes.add(lSt);

        List<CPositionEntity> lGrosickiPositionsRennes = new ArrayList<CPositionEntity>();
        lGrosickiPositionsRennes.add(lLw);
        lGrosickiPositionsRennes.add(lRw);

        List<CPositionEntity> lHabibouPositionsRennes = new ArrayList<CPositionEntity>();
        lHabibouPositionsRennes.add(lSt);

        List<CPositionEntity> lSaidPositionsRennes = new ArrayList<CPositionEntity>();
        lSaidPositionsRennes.add(lSt);
        lSaidPositionsRennes.add(lRw);
        lSaidPositionsRennes.add(lLw);

        List<CPositionEntity> lSioPositionsRennes = new ArrayList<CPositionEntity>();
        lSioPositionsRennes.add(lSt);

        List<CPositionEntity> lHenriquePositionsRennes = new ArrayList<CPositionEntity>();
        lHenriquePositionsRennes.add(lSt);
        lHenriquePositionsRennes.add(lRw);

        List<CPositionEntity> lNtepPositionsRennes = new ArrayList<CPositionEntity>();
        lNtepPositionsRennes.add(lLw);




        // players

        CPlayerEntity lCostilRennes = new CPlayerEntity.CPlayerBuilder().firstName("benoit").lastName(CConstants.NAME_RENNES_COSTIL).team(lRennesFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1987).country(CConstants.FRANCE).positions(lCostilPositionsRennes).picturePath(CConstants.PICTURE_RENNES_COSTIL).build();
        CPlayerEntity lDialloRennes = new CPlayerEntity.CPlayerBuilder().firstName("abdoulaye").lastName(CConstants.NAME_RENNES_DIALLO).team(lRennesFromDb).dayOfBirth(3).monthOfBirth(CConstants.MARCH).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDialloPositionsRennes).picturePath(CConstants.PICTURE_RENNES_DIALLO).build();
        CPlayerEntity lGertmonasRennes = new CPlayerEntity.CPlayerBuilder().firstName("edvinas").lastName(CConstants.NAME_RENNES_GERTMONAS).team(lRennesFromDb).dayOfBirth(1).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lGertmonasPositionsRennes).picturePath(CConstants.PICTURE_RENNES_GERTMONAS).build();
        CPlayerEntity lNardiRennes = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_RENNES_NARDI).team(lRennesFromDb).dayOfBirth(18).monthOfBirth(CConstants.MAY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lNardiPositionsRennes).picturePath(CConstants.PICTURE_RENNES_NARDI).build();

        CPlayerEntity lArmandRennes = new CPlayerEntity.CPlayerBuilder().firstName("sylvain").lastName(CConstants.NAME_RENNES_ARMAND).team(lRennesFromDb).dayOfBirth(1).monthOfBirth(CConstants.AUGUST).yearOfBirth(1980).country(CConstants.FRANCE).positions(lArmandPositionsRennes).picturePath(CConstants.PICTURE_RENNES_ARMAND).build();
        CPlayerEntity lBaalRennes = new CPlayerEntity.CPlayerBuilder().firstName("ludovic").lastName(CConstants.NAME_RENNES_BAAL).team(lRennesFromDb).dayOfBirth(24).monthOfBirth(CConstants.MAY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lBaalPositionsRennes).picturePath(CConstants.PICTURE_RENNES_BAAL).build();
        CPlayerEntity lBensebainiRennes = new CPlayerEntity.CPlayerBuilder().firstName("ramy").lastName(CConstants.NAME_RENNES_BENSEBAINI).team(lRennesFromDb).dayOfBirth(16).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.ALGERIA).positions(lBensebainiPositionsRennes).picturePath(CConstants.PICTURE_RENNES_BENSEBAINI).build();
        CPlayerEntity lCavareRennes = new CPlayerEntity.CPlayerBuilder().firstName("dimitri").lastName(CConstants.NAME_RENNES_CAVARE).team(lRennesFromDb).dayOfBirth(5).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lCavarePositionsRennes).picturePath(CConstants.PICTURE_RENNES_CAVARE).build();
        CPlayerEntity lDanzeRennes = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_RENNES_DANZE).team(lRennesFromDb).dayOfBirth(3).monthOfBirth(CConstants.JULY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lDanzePositionsRennes).picturePath(CConstants.PICTURE_RENNES_DANZE).build();
        CPlayerEntity lFigueiredoRennes = new CPlayerEntity.CPlayerBuilder().firstName("afonso").lastName(CConstants.NAME_RENNES_FIGUEIREDO).team(lRennesFromDb).dayOfBirth(6).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.PORTUGAL).positions(lFigueiredoPositionsRennes).picturePath(CConstants.PICTURE_RENNES_FIGUEIREDO).build();
        CPlayerEntity lGnagnonRennes = new CPlayerEntity.CPlayerBuilder().firstName("joris").lastName(CConstants.NAME_RENNES_GNAGNON).team(lRennesFromDb).dayOfBirth(13).monthOfBirth(CConstants.JANUARY).yearOfBirth(1997).country(CConstants.FRANCE).positions(lGnagnonPositionsRennes).picturePath(CConstants.PICTURE_RENNES_GNAGNON).build();
        CPlayerEntity lMendesRennes = new CPlayerEntity.CPlayerBuilder().firstName("pedro").lastName(CConstants.NAME_RENNES_MENDES).team(lRennesFromDb).dayOfBirth(1).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.PORTUGAL).positions(lMendesPositionsRennes).picturePath(CConstants.PICTURE_RENNES_MENDES).build();
        CPlayerEntity lMexerRennes = new CPlayerEntity.CPlayerBuilder().firstName("edson").lastName(CConstants.NAME_RENNES_MEXER).team(lRennesFromDb).dayOfBirth(8).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.MOZAMBIQUE).positions(lMexerPositionsRennes).picturePath(CConstants.PICTURE_RENNES_MEXER).build();
        CPlayerEntity lZeffaneRennes = new CPlayerEntity.CPlayerBuilder().firstName("mehdi").lastName(CConstants.NAME_RENNES_ZEFFANE).team(lRennesFromDb).dayOfBirth(19).monthOfBirth(CConstants.MAY).yearOfBirth(1992).country(CConstants.ALGERIA).positions(lZeffanePositionsRennes).picturePath(CConstants.PICTURE_RENNES_ZEFFANE).build();

        CPlayerEntity lAndreRennes = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_RENNES_ANDRE).team(lRennesFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.FRANCE).positions(lAndrePositionsRennes).picturePath(CConstants.PICTURE_RENNES_ANDRE).build();
        CPlayerEntity lChantomeRennes = new CPlayerEntity.CPlayerBuilder().firstName("clement").lastName(CConstants.NAME_RENNES_CHANTOME).team(lRennesFromDb).dayOfBirth(11).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1987).country(CConstants.FRANCE).positions(lChantomePositionsRennes).picturePath(CConstants.PICTURE_RENNES_CHANTOME).build();
        CPlayerEntity lFernandesRennes = new CPlayerEntity.CPlayerBuilder().firstName("gelson").lastName(CConstants.NAME_RENNES_FERNANDES).team(lRennesFromDb).dayOfBirth(2).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1986).country(CConstants.SWITZERLAND).positions(lFernandesPositionsRennes).picturePath(CConstants.PICTURE_RENNES_FERNANDES).build();
        CPlayerEntity lGourcuffRennes = new CPlayerEntity.CPlayerBuilder().firstName("yoann").lastName(CConstants.NAME_RENNES_GOURCUFF).team(lRennesFromDb).dayOfBirth(11).monthOfBirth(CConstants.JULY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lGourcuffPositionsRennes).picturePath(CConstants.PICTURE_RENNES_GOURCUFF).build();
        CPlayerEntity lHunouRennes = new CPlayerEntity.CPlayerBuilder().firstName("adrien").lastName(CConstants.NAME_RENNES_HUNOU).team(lRennesFromDb).dayOfBirth(19).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lHunouPositionsRennes).picturePath(CConstants.PICTURE_RENNES_HUNOU).build();
        CPlayerEntity lJanvierRennes = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_RENNES_JANVIER).team(lRennesFromDb).dayOfBirth(11).monthOfBirth(CConstants.AUGUST).yearOfBirth(1998).country(CConstants.FRANCE).positions(lJanvierPositionsRennes).picturePath(CConstants.PICTURE_RENNES_JANVIER).build();
        CPlayerEntity lPrcicRennes = new CPlayerEntity.CPlayerBuilder().firstName("sanjin").lastName(CConstants.NAME_RENNES_PRCIC).team(lRennesFromDb).dayOfBirth(20).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPrcicPositionsRennes).picturePath(CConstants.PICTURE_RENNES_PRCIC).build();
        CPlayerEntity lRibelinRennes = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_RENNES_RIBELIN).team(lRennesFromDb).dayOfBirth(8).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.FRANCE).positions(lRibelinPositionsRennes).picturePath(CConstants.PICTURE_RENNES_RIBELIN).build();

        CPlayerEntity lErasmusRennes = new CPlayerEntity.CPlayerBuilder().firstName("kermit").lastName(CConstants.NAME_RENNES_ERASMUS).team(lRennesFromDb).dayOfBirth(8).monthOfBirth(CConstants.JULY).yearOfBirth(1990).country(CConstants.SOUTHAFRICA).positions(lErasmusPositionsRennes).picturePath(CConstants.PICTURE_RENNES_ERASMUS).build();
        CPlayerEntity lGrosickiRennes = new CPlayerEntity.CPlayerBuilder().firstName("kamil").lastName(CConstants.NAME_RENNES_GROSICKI).team(lRennesFromDb).dayOfBirth(8).monthOfBirth(CConstants.JUNE).yearOfBirth(1988).country(CConstants.POLAND).positions(lGrosickiPositionsRennes).picturePath(CConstants.PICTURE_RENNES_GROSICKI).build();
        CPlayerEntity lHabibouRennes = new CPlayerEntity.CPlayerBuilder().firstName("habib").lastName(CConstants.NAME_RENNES_HABIBOU).team(lRennesFromDb).dayOfBirth(16).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lHabibouPositionsRennes).picturePath(CConstants.PICTURE_RENNES_HABIBOU).build();
        CPlayerEntity lPedroHenriqueRennes = new CPlayerEntity.CPlayerBuilder().firstName("pedro").lastName(CConstants.NAME_NICE_HENRIQUE).team(lRennesFromDb).dayOfBirth(16).monthOfBirth(CConstants.JUNE).yearOfBirth(1990).country(CConstants.BRAZIL).positions(lHenriquePositionsRennes).picturePath(CConstants.PICTURE_RENNES_HENRIQUE).build();
        CPlayerEntity lNtepRennes = new CPlayerEntity.CPlayerBuilder().firstName("paul georges").lastName(CConstants.NAME_RENNES_NTEP).team(lRennesFromDb).dayOfBirth(29).monthOfBirth(CConstants.JULY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lNtepPositionsRennes).picturePath(CConstants.PICTURE_RENNES_NTEP).build();
        CPlayerEntity lSaidRennes = new CPlayerEntity.CPlayerBuilder().firstName("wesley").lastName(CConstants.NAME_RENNES_SAID).team(lRennesFromDb).dayOfBirth(16).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lSaidPositionsRennes).picturePath(CConstants.PICTURE_RENNES_SAID).build();
        CPlayerEntity lSioRennes = new CPlayerEntity.CPlayerBuilder().firstName("giovanni").lastName(CConstants.NAME_RENNES_SIO).team(lRennesFromDb).dayOfBirth(31).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.IVORYCOAST).positions(lSioPositionsRennes).picturePath(CConstants.PICTURE_RENNES_SIO).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCostilRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNardiRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGertmonasRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lArmandRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendesRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMexerRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBensebainiRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDanzeRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lZeffaneRennes);
            lCrudMethods.commitTransaction();
        }



        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFigueiredoRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCavareRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGnagnonRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBaalRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAndreRennes);
            lCrudMethods.commitTransaction();
        }



        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lChantomeRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPrcicRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGourcuffRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJanvierRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHunouRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFernandesRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRibelinRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGrosickiRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lErasmusRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPedroHenriqueRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNtepRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaidRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSioRennes);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHabibouRennes);
            lCrudMethods.commitTransaction();
        }



    }
}
