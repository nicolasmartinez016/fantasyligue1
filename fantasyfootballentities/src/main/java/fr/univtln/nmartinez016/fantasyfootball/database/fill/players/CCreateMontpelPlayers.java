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
public class CCreateMontpelPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lMhscFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.MHSC).parameters())).get(0);


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

        // players position

        List<CPositionEntity> lPionnierPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lJourdrenPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLigaliPositionsMhsc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNdiayePositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCongrePositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lHiltonPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSaintRufPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lVandenBorrePositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lRemyPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lRoussillonPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDeplagnePositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lGissiPositionsMhsc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMarveauxPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLasnePositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSansonPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBoudebouzPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSkhiriPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lFitoPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lKSansonPositionsMhsc = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBerigaudPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMouniePositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCamaraPositionsMhsc = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lNingaPositionsMhsc = new ArrayList<CPositionEntity>();

        // players

        // gk
        CPlayerEntity lPionnierMhsc = new CPlayerEntity.CPlayerBuilder().firstName("laurent").lastName(CConstants.NAME_MHSC_PIONNIER).team(lMhscFromDb).dayOfBirth(24).monthOfBirth(CConstants.MAY).yearOfBirth(1982).country(CConstants.FRANCE).positions(lPionnierPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_PIONNIER).build();
        CPlayerEntity lJourdrenMhsc = new CPlayerEntity.CPlayerBuilder().firstName("geoffrey").lastName(CConstants.NAME_MHSC_JOURDREN).team(lMhscFromDb).dayOfBirth(4).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lJourdrenPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_JOURDREN).build();
        CPlayerEntity lLigaliMhsc = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_MHSC_LIGALI).team(lMhscFromDb).dayOfBirth(28).monthOfBirth(CConstants.MAY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lLigaliPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_LIGALI).build();

        // defenders

        CPlayerEntity lNdiayeMhsc = new CPlayerEntity.CPlayerBuilder().firstName("mamadou").lastName(CConstants.NAME_MHSC_NDIAYE).team(lMhscFromDb).dayOfBirth(28).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.SENEGAL).positions(lNdiayePositionsMhsc).picturePath(CConstants.PICTURE_MHSC_NDIAYE).build();
        CPlayerEntity lCongreMhsc = new CPlayerEntity.CPlayerBuilder().firstName("daniel").lastName(CConstants.NAME_MHSC_CONGRE).team(lMhscFromDb).dayOfBirth(5).monthOfBirth(CConstants.APRIL).yearOfBirth(1985).country(CConstants.FRANCE).positions(lCongrePositionsMhsc).picturePath(CConstants.PICTURE_MHSC_CONGRE).build();
        CPlayerEntity lHiltonMhsc = new CPlayerEntity.CPlayerBuilder().firstName("vitorino").lastName(CConstants.NAME_MHSC_HILTON).team(lMhscFromDb).dayOfBirth(13).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1977).country(CConstants.BRAZIL).positions(lHiltonPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_HILTON).build();
        CPlayerEntity lSaintRufMhsc = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_MHSC_SAINTRUF).team(lMhscFromDb).dayOfBirth(24).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSaintRufPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_SAINTRUF).build();
        CPlayerEntity lVandenBorreMhsc = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_MHSC_VANDENBORRE).team(lMhscFromDb).dayOfBirth(24).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1987).country(CConstants.BELGIUM).positions(lVandenBorrePositionsMhsc).picturePath(CConstants.PICTURE_MHSC_VANDENBORRE).build();
        CPlayerEntity lRemyMhsc = new CPlayerEntity.CPlayerBuilder().firstName("william").lastName(CConstants.NAME_MHSC_REMY).team(lMhscFromDb).dayOfBirth(4).monthOfBirth(CConstants.APRIL).yearOfBirth(1991).country(CConstants.FRANCE).positions(lRemyPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_REMY).build();
        CPlayerEntity lRoussillonMhsc = new CPlayerEntity.CPlayerBuilder().firstName("jerome").lastName(CConstants.NAME_MHSC_ROUSSILLON).team(lMhscFromDb).dayOfBirth(6).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lRoussillonPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_ROUSSILLON).build();
        CPlayerEntity lDeplagneMhsc = new CPlayerEntity.CPlayerBuilder().firstName("mathieu").lastName(CConstants.NAME_MHSC_DEPLAGNE).team(lMhscFromDb).dayOfBirth(1).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lDeplagnePositionsMhsc).picturePath(CConstants.PICTURE_MHSC_DEPLAGNE).build();
        CPlayerEntity lGissiMhsc = new CPlayerEntity.CPlayerBuilder().firstName("dylan").lastName(CConstants.NAME_MHSC_GISSI).team(lMhscFromDb).dayOfBirth(27).monthOfBirth(CConstants.APRIL).yearOfBirth(1991).country(CConstants.ARGENTINA).positions(lGissiPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_GISSI).build();

        // midfielders

        CPlayerEntity lMarveauxMhsc = new CPlayerEntity.CPlayerBuilder().firstName("joris").lastName(CConstants.NAME_MHSC_MARVEAUX).team(lMhscFromDb).dayOfBirth(15).monthOfBirth(CConstants.AUGUST).yearOfBirth(1982).country(CConstants.FRANCE).positions(lMarveauxPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_MARVEAUX).build();
        CPlayerEntity lLasneMhsc = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAMEE_MHSC_LASNE).team(lMhscFromDb).dayOfBirth(16).monthOfBirth(CConstants.JANUARY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLasnePositionsMhsc).picturePath(CConstants.PICTURE_MHSC_LASNE).build();
        CPlayerEntity lSansonMhsc = new CPlayerEntity.CPlayerBuilder().firstName("morgan").lastName(CConstants.NAME_MHSC_SANSON).team(lMhscFromDb).dayOfBirth(18).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.FRANCE).positions(lSansonPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_SANSON).build();
        CPlayerEntity lBoudebouzMhsc = new CPlayerEntity.CPlayerBuilder().firstName("ryad").lastName(CConstants.NAME_MHSC_BOUDEBOUZ).team(lMhscFromDb).dayOfBirth(19).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lBoudebouzPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_BOUDEBOUZ).build();
        CPlayerEntity lSkhiriMhsc = new CPlayerEntity.CPlayerBuilder().firstName("ellyes").lastName(CConstants.NAME_MHSC_SKHIRI).team(lMhscFromDb).dayOfBirth(10).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lSkhiriPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_SKHIRI).build();
        CPlayerEntity lFitoMhsc = new CPlayerEntity.CPlayerBuilder().firstName("pierrick").lastName(CConstants.NAME_MHSC_FITO).team(lMhscFromDb).dayOfBirth(1).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lFitoPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_FITO).build();
        CPlayerEntity lKSansonMhsc = new CPlayerEntity.CPlayerBuilder().firstName("killian").lastName(CConstants.NAME_MHSC_SANSON).team(lMhscFromDb).dayOfBirth(7).monthOfBirth(CConstants.JUNE).yearOfBirth(1997).country(CConstants.FRANCE).positions(lKSansonPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_KSANSON).build();

        // forwards

        CPlayerEntity lBerigaudMhsc = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_MHSC_BERIGAUD).team(lMhscFromDb).dayOfBirth(9).monthOfBirth(CConstants.MAY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lBerigaudPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_BERIGAUD).build();
        CPlayerEntity lMounieMhsc = new CPlayerEntity.CPlayerBuilder().firstName("steve").lastName(CConstants.NAME_MHSC_MOUNIE).team(lMhscFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1994).country(CConstants.FRANCE).positions(lMouniePositionsMhsc).picturePath(CConstants.PICTURE_MHSC_MOUNIE).build();
        CPlayerEntity lCamaraMhsc = new CPlayerEntity.CPlayerBuilder().firstName("souleymane").lastName(CConstants.NAME_MHSC_CAMARA).team(lMhscFromDb).dayOfBirth(22).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1982).country(CConstants.SENEGAL).positions(lCamaraPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_CAMARA).build();
        CPlayerEntity lNingaMhsc = new CPlayerEntity.CPlayerBuilder().firstName("casimir").lastName(CConstants.NAME_MHSC_NINGA).team(lMhscFromDb).dayOfBirth(17).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.TCHAD).positions(lNingaPositionsMhsc).picturePath(CConstants.PICTURE_MHSC_NINGA).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJourdrenMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPionnierMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLigaliMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdiayeMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCongreMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lHiltonMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaintRufMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVandenBorreMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRemyMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRoussillonMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDeplagneMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGissiMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarveauxMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLasneMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSansonMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoudebouzMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSkhiriMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKSansonMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFitoMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBerigaudMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMounieMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCamaraMhsc);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNingaMhsc);
            lCrudMethods.commitTransaction();
        }
    }
}
