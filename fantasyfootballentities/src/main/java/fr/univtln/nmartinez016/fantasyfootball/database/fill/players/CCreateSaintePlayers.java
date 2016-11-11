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
public class CCreateSaintePlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();
        CTeamEntity lSainteFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.ASSE).parameters())).get(0);


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

        List<CPositionEntity> lMaisonnialPositionsAsse = new ArrayList<CPositionEntity>();
        lMaisonnialPositionsAsse.add(lGk);

        List<CPositionEntity> lRuffierPositionsAsse = new ArrayList<CPositionEntity>();
        lRuffierPositionsAsse.add(lGk);

        List<CPositionEntity> lMoulinPositionsAsse = new ArrayList<CPositionEntity>();
        lMoulinPositionsAsse.add(lGk);

        List<CPositionEntity> lPogbaPositionsAsse = new ArrayList<CPositionEntity>();
        lPogbaPositionsAsse.add(lCb);

        List<CPositionEntity> lKtcPositionsAsse = new ArrayList<CPositionEntity>();
        lKtcPositionsAsse.add(lRb);

        List<CPositionEntity> lPolomatPositionsAsse = new ArrayList<CPositionEntity>();
        lPolomatPositionsAsse.add(lLb);

        List<CPositionEntity> lPerrinPositionsAsse = new ArrayList<CPositionEntity>();
        lPerrinPositionsAsse.add(lCb);

        List<CPositionEntity> lMbenguePositionsAsse = new ArrayList<CPositionEntity>();
        lMbenguePositionsAsse.add(lLb);

        List<CPositionEntity> lMalcuitPositionsAsse = new ArrayList<CPositionEntity>();
        lMalcuitPositionsAsse.add(lRb);


        List<CPositionEntity> lDaboPositionsAsse = new ArrayList<CPositionEntity>();
        lDaboPositionsAsse.add(lCdm);

        List<CPositionEntity> lPajotPositionsAsse = new ArrayList<CPositionEntity>();
        lPajotPositionsAsse.add(lCm);

        List<CPositionEntity> lClementPositionsAsse = new ArrayList<CPositionEntity>();
        lClementPositionsAsse.add(lCm);

        List<CPositionEntity> lCorgnetPositionsAsse = new ArrayList<CPositionEntity>();
        lCorgnetPositionsAsse.add(lCam);

        List<CPositionEntity> lSelnaesPositionsAsse = new ArrayList<CPositionEntity>();
        lSelnaesPositionsAsse.add(lCm);

        List<CPositionEntity> lLemoinePositionsAsse = new ArrayList<CPositionEntity>();
        lLemoinePositionsAsse.add(lCm);


        List<CPositionEntity> lBambaPositionsAsse = new ArrayList<CPositionEntity>();
        lBambaPositionsAsse.add(lRw);

        List<CPositionEntity> lBericPositionsAsse = new ArrayList<CPositionEntity>();
        lBericPositionsAsse.add(lSt);

        List<CPositionEntity> lRouxPositionsAsse = new ArrayList<CPositionEntity>();
        lRouxPositionsAsse.add(lSt);
        lRouxPositionsAsse.add(lRw);

        List<CPositionEntity> lTannanePositionsAsse = new ArrayList<CPositionEntity>();
        lTannanePositionsAsse.add(lLw);

        List<CPositionEntity> lMolloPositionsAsse = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lHamoumaPositionsAsse = new ArrayList<CPositionEntity>();
        lHamoumaPositionsAsse.add(lRw);

        List<CPositionEntity> lSoderlundPositionsAsse = new ArrayList<CPositionEntity>();
        lSoderlundPositionsAsse.add(lSt);

        List<CPositionEntity> lMonnetPaquetPositionsAsse = new ArrayList<CPositionEntity>();
        lMonnetPaquetPositionsAsse.add(lLw);

        List<CPositionEntity> lSaivetPositionsAsse = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lVeretoutPositionsAsse = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLacroixPositionsAsse = new ArrayList<CPositionEntity>();





        // players

        CPlayerEntity lMaisonnialAsse = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_ASSE_MAISONNIAL).team(lSainteFromDb).dayOfBirth(23).monthOfBirth(CConstants.MARCH).yearOfBirth(1998).country(CConstants.FRANCE).positions(lMaisonnialPositionsAsse).picturePath(CConstants.PICTURE_ASSE_MAISONNIAL).build();
        CPlayerEntity lRuffierAsse = new CPlayerEntity.CPlayerBuilder().firstName("stephane").lastName(CConstants.NAME_ASSE_RUFFIER).team(lSainteFromDb).dayOfBirth(27).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1986).country(CConstants.FRANCE).positions(lRuffierPositionsAsse).picturePath(CConstants.PICTURE_ASSE_RUFFIER).build();
        CPlayerEntity lMoulinAsse = new CPlayerEntity.CPlayerBuilder().firstName("jessy").lastName(CConstants.NAME_ASSE_MOULIN).team(lSainteFromDb).dayOfBirth(13).monthOfBirth(CConstants.JANUARY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lMoulinPositionsAsse).picturePath(CConstants.PICTURE_ASSE_MOULIN).build();

        CPlayerEntity lKtcAsse = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_ASSE_KTC).team(lSainteFromDb).dayOfBirth(28).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lKtcPositionsAsse).picturePath(CConstants.PICTURE_ASSE_KTC).build();
        CPlayerEntity lPolomatAsse = new CPlayerEntity.CPlayerBuilder().firstName("pierre yves").lastName(CConstants.NAME_ASSE_POLOMAT).team(lSainteFromDb).dayOfBirth(27).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lPolomatPositionsAsse).picturePath(CConstants.PICTURE_ASSE_POLOMAT).build();
        CPlayerEntity lMbengueAsse = new CPlayerEntity.CPlayerBuilder().firstName("cheick").lastName(CConstants.NAME_ASSE_MBENGUE).team(lSainteFromDb).dayOfBirth(23).monthOfBirth(CConstants.JULY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lMbenguePositionsAsse).picturePath(CConstants.PICTURE_ASSE_MBENGUE).build();
        CPlayerEntity lPogbaAsse = new CPlayerEntity.CPlayerBuilder().firstName("florentin").lastName(CConstants.NAME_ASSE_POGBA).team(lSainteFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1990).country(CConstants.FRANCE).positions(lPogbaPositionsAsse).picturePath(CConstants.PICTURE_ASSE_POGBA).build();
        CPlayerEntity lPerrinAsse = new CPlayerEntity.CPlayerBuilder().firstName("loic").lastName(CConstants.NAME_ASSE_PERRIN).team(lSainteFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1985).country(CConstants.FRANCE).positions(lPerrinPositionsAsse).picturePath(CConstants.PICTURE_ASSE_PERRIN).build();
        CPlayerEntity lMalcuitAsse = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_ASSE_MALCUIT).team(lSainteFromDb).dayOfBirth(31).monthOfBirth(CConstants.JULY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lMalcuitPositionsAsse).picturePath(CConstants.PICTURE_ASSE_MALCUIT).build();
        CPlayerEntity lLacroixAsse = new CPlayerEntity.CPlayerBuilder().firstName("fabien").lastName(CConstants.NAME_ASSE_LEMOINE).team(lSainteFromDb).dayOfBirth(16).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLemoinePositionsAsse).picturePath(CConstants.PICTURE_ASSE_LEMOINE).build();


        CPlayerEntity lDaboAsse = new CPlayerEntity.CPlayerBuilder().firstName("bryan").lastName(CConstants.NAME_ASSE_DABO).team(lSainteFromDb).dayOfBirth(18).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDaboPositionsAsse).picturePath(CConstants.PICTURE_ASSE_DABO).build();
        CPlayerEntity lPajotAsse = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_ASSE_PAJOT).team(lSainteFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1995).country(CConstants.FRANCE).positions(lPajotPositionsAsse).picturePath(CConstants.PICTURE_ASSE_PAJOT).build();
        CPlayerEntity lClementAsse = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_ASSE_CLEMENT).team(lSainteFromDb).dayOfBirth(26).monthOfBirth(CConstants.AUGUST).yearOfBirth(1984).country(CConstants.FRANCE).positions(lClementPositionsAsse).picturePath(CConstants.PICTURE_ASSE_CLEMENT).build();
        CPlayerEntity lCorgnetAsse = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_ASSE_CORGNET).team(lSainteFromDb).dayOfBirth(6).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lCorgnetPositionsAsse).picturePath(CConstants.PICTURE_ASSE_CORGNET).build();
        CPlayerEntity lSelnaesAsse = new CPlayerEntity.CPlayerBuilder().firstName("ole").lastName(CConstants.NAME_ASSE_SELNAES).team(lSainteFromDb).dayOfBirth(7).monthOfBirth(CConstants.JULY).yearOfBirth(1994).country(CConstants.NORWAY).positions(lSelnaesPositionsAsse).picturePath(CConstants.PICTURE_ASSE_SELNAES).build();
        CPlayerEntity lLemoineAsse = new CPlayerEntity.CPlayerBuilder().firstName("fabien").lastName(CConstants.NAME_ASSE_LEMOINE).team(lSainteFromDb).dayOfBirth(16).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLemoinePositionsAsse).picturePath(CConstants.PICTURE_ASSE_LEMOINE).build();
        CPlayerEntity lVeretoutAsse = new CPlayerEntity.CPlayerBuilder().firstName("fabien").lastName(CConstants.NAME_ASSE_LEMOINE).team(lSainteFromDb).dayOfBirth(16).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLemoinePositionsAsse).picturePath(CConstants.PICTURE_ASSE_LEMOINE).build();
        CPlayerEntity lSaivetAsse = new CPlayerEntity.CPlayerBuilder().firstName("fabien").lastName(CConstants.NAME_ASSE_LEMOINE).team(lSainteFromDb).dayOfBirth(16).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLemoinePositionsAsse).picturePath(CConstants.PICTURE_ASSE_LEMOINE).build();


        CPlayerEntity lRouxAsse = new CPlayerEntity.CPlayerBuilder().firstName("nolan").lastName(CConstants.NAME_ASSE_ROUX).team(lSainteFromDb).dayOfBirth(1).monthOfBirth(CConstants.MARCH).yearOfBirth(1988).country(CConstants.FRANCE).positions(lRouxPositionsAsse).picturePath(CConstants.PICTURE_ASSE_ROUX).build();
        CPlayerEntity lTannaneAsse = new CPlayerEntity.CPlayerBuilder().firstName("oussama").lastName(CConstants.NAME_ASSE_TANNANE).team(lSainteFromDb).dayOfBirth(23).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.TUNISIA).positions(lTannanePositionsAsse).picturePath(CConstants.PICTURE_ASSE_TANNANE).build();
        CPlayerEntity lMolloAsse = new CPlayerEntity.CPlayerBuilder().firstName("yohan").lastName(CConstants.NAME_ASSE_MOLLO).team(lSainteFromDb).dayOfBirth(18).monthOfBirth(CConstants.JULY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lMolloPositionsAsse).picturePath(CConstants.PICTURE_ASSE_MOLLO).build();
        CPlayerEntity lHamoumaAsse = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_ASSE_HAMOUMA).team(lSainteFromDb).dayOfBirth(27).monthOfBirth(CConstants.MARCH).yearOfBirth(1987).country(CConstants.FRANCE).positions(lHamoumaPositionsAsse).picturePath(CConstants.PICTURE_ASSE_HAMOUMA).build();
        CPlayerEntity lKmpAsse = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_ASSE_KMP).team(lSainteFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1988).country(CConstants.NORWAY).positions(lMonnetPaquetPositionsAsse).picturePath(CConstants.PICTURE_ASSE_KMP).build();
        CPlayerEntity lSoderlundAsse = new CPlayerEntity.CPlayerBuilder().firstName("alexander").lastName(CConstants.NAME_ASSE_SODERLUND).team(lSainteFromDb).dayOfBirth(3).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lSoderlundPositionsAsse).picturePath(CConstants.PICTURE_ASSE_SODERLUND).build();
        CPlayerEntity lBericAsse = new CPlayerEntity.CPlayerBuilder().firstName("robert").lastName(CConstants.NAME_ASSE_BERIC).team(lSainteFromDb).dayOfBirth(17).monthOfBirth(CConstants.JUNE).yearOfBirth(1991).country(CConstants.SLOVENIA).positions(lBericPositionsAsse).picturePath(CConstants.PICTURE_ASSE_BERIC).build();
        CPlayerEntity lBambaAsse = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_ASSE_BAMBA).team(lSainteFromDb).dayOfBirth(26).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBambaPositionsAsse).picturePath(CConstants.PICTURE_ASSE_BAMBA).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaisonnialAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRuffierAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMoulinAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMalcuitAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKtcAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMbengueAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPerrinAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPogbaAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPolomatAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDaboAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLemoineAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCorgnetAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPajotAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSelnaesAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lClementAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRouxAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBambaAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBericAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSoderlundAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTannaneAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKmpAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHamoumaAsse);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMolloAsse);
            lCrudMethods.commitTransaction();
        }




    }
}
