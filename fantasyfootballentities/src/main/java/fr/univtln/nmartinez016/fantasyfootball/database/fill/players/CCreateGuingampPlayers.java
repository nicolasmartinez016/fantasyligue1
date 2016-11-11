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
public class CCreateGuingampPlayers {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lEagFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.GUINGAMP).parameters())).get(0);


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

        List<CPositionEntity> lJohnssonPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSalinPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lGuivarchPositionsEag = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSorbonPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMartinsPereiraPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLemaitrePositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lAngouaPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLevequePositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lKerbratPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lIkokoPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lSankohPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lManePositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMarcalPositionsEag = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lGiressePositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lCocoPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDePauwPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBlasPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDialloPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBenezetPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lLivolantPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDeauxPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lDidotPositionsEag = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSaliburPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lPrivatPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lBriandPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMartinetPositionsEag = new ArrayList<CPositionEntity>();
        List<CPositionEntity> lMendyPositionsEag = new ArrayList<CPositionEntity>();

        // players

        // gks
        CPlayerEntity lJohnssonEag = new CPlayerEntity.CPlayerBuilder().firstName("karl johan").lastName("johnsson").team(lEagFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lJohnssonPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_JOHNSSON).build();
        CPlayerEntity lSalinEag = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName("salin").team(lEagFromDb).dayOfBirth(29).monthOfBirth(CConstants.JULY).yearOfBirth(1984).country(CConstants.FRANCE).positions(lSalinPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_SALIN).build();
        CPlayerEntity lGuivarchEag = new CPlayerEntity.CPlayerBuilder().firstName("theo").lastName("guivarch").team(lEagFromDb).dayOfBirth(17).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lGuivarchPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_GUIVARCH).build();

        // defenders

        CPlayerEntity lSorbonEag = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_GUINGAMP_SORBON).team(lEagFromDb).dayOfBirth(5).monthOfBirth(CConstants.AUGUST).yearOfBirth(1983).country(CConstants.FRANCE).positions(lSorbonPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_SORBON).build();
        CPlayerEntity lMartinsPereiraEag = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_GUINGAMP_MARTINSPEREIRA).team(lEagFromDb).dayOfBirth(30).monthOfBirth(CConstants.JANUARY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lMartinsPereiraPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_MARTINSPEREIRA).build();
        CPlayerEntity lLemaitreEag = new CPlayerEntity.CPlayerBuilder().firstName("reynald").lastName(CConstants.NAME_GUINGAMP_LEMAITRE).team(lEagFromDb).dayOfBirth(28).monthOfBirth(CConstants.JUNE).yearOfBirth(1983).country(CConstants.FRANCE).positions(lLemaitrePositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_LEMAITRE).build();
        CPlayerEntity lAngouaEag = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_GUINGAMP_ANGOUA).team(lEagFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1986).country(CConstants.FRANCE).positions(lAngouaPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_ANGOUA).build();
        CPlayerEntity lLevequeEag = new CPlayerEntity.CPlayerBuilder().firstName("dorian").lastName(CConstants.NAME_GUINGAMP_LEVEQUE).team(lEagFromDb).dayOfBirth(22).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLevequePositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_LEVEQUE).build();
        CPlayerEntity lKerbratEag = new CPlayerEntity.CPlayerBuilder().firstName("christophe").lastName(CConstants.NAME_GUINGAMP_KERBRAT).team(lEagFromDb).dayOfBirth(2).monthOfBirth(CConstants.AUGUST).yearOfBirth(1986).country(CConstants.FRANCE).positions(lKerbratPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_KERBRAT).build();
        CPlayerEntity lIkokoEag = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_GUINGAMP_IKOKO).team(lEagFromDb).dayOfBirth(3).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lIkokoPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_IKOKO).build();
        CPlayerEntity lSankohEag = new CPlayerEntity.CPlayerBuilder().firstName("baissama").lastName(CConstants.NAME_GUINGAMP_SANKOH).team(lEagFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSankohPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_SANKOH).build();
        CPlayerEntity lManeEag = new CPlayerEntity.CPlayerBuilder().firstName("alexis").lastName(CConstants.NAME_GUINGAMP_MANE).team(lEagFromDb).dayOfBirth(30).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lManePositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_MANE).build();
        CPlayerEntity lMarcalEag = new CPlayerEntity.CPlayerBuilder().firstName("fernando").lastName(CConstants.NAME_GUINGAMP_MARCAL).team(lEagFromDb).dayOfBirth(9).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lMarcalPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_MARCAL).build();

        // midfielders

        CPlayerEntity lGiresseEag = new CPlayerEntity.CPlayerBuilder().firstName("thibault").lastName(CConstants.NAME_GUINGAMP_GIRESSE).team(lEagFromDb).dayOfBirth(25).monthOfBirth(CConstants.MAY).yearOfBirth(1981).country(CConstants.FRANCE).positions(lGiressePositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_GIRESSE).build();
        CPlayerEntity lCocoEag = new CPlayerEntity.CPlayerBuilder().firstName("marcus").lastName(CConstants.NAME_GUINGAMP_COCO).team(lEagFromDb).dayOfBirth(24).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lCocoPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_COCO).build();
        CPlayerEntity lDePauwEag = new CPlayerEntity.CPlayerBuilder().firstName("nill").lastName(CConstants.NAME_GUINGAMP_DEPAUW).team(lEagFromDb).dayOfBirth(6).monthOfBirth(CConstants.JANUARY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lDePauwPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_DEPAUW).build();
        CPlayerEntity lBlasEag = new CPlayerEntity.CPlayerBuilder().firstName("ludovic").lastName(CConstants.NAME_GUINGAMP_BLAS).team(lEagFromDb).dayOfBirth(31).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1997).country(CConstants.FRANCE).positions(lBlasPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_BLAS).build();
        CPlayerEntity lDialloEag = new CPlayerEntity.CPlayerBuilder().firstName("moustapha").lastName(CConstants.NAME_RENNES_DIALLO).team(lEagFromDb).dayOfBirth(14).monthOfBirth(CConstants.MAY).yearOfBirth(1986).country(CConstants.FRANCE).positions(lDialloPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_DIALLO).build();
        CPlayerEntity lBenezetEag = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_GUINGAMP_BENEZET).team(lEagFromDb).dayOfBirth(24).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lBenezetPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_BENEZET).build();
        CPlayerEntity lLivolantEag = new CPlayerEntity.CPlayerBuilder().firstName("jeremy").lastName(CConstants.NAME_GUINGAMP_LIVOLANT).team(lEagFromDb).dayOfBirth(9).monthOfBirth(CConstants.JANUARY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lLivolantPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_LIVOLANT).build();
        CPlayerEntity lDeauxEag = new CPlayerEntity.CPlayerBuilder().firstName("lucas").lastName(CConstants.NAME_GUINGAMP_DEAUX).team(lEagFromDb).dayOfBirth(26).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lDeauxPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_DEAUX).build();
        CPlayerEntity lDidotEag = new CPlayerEntity.CPlayerBuilder().firstName("etienne").lastName(CConstants.NAME_GUINGAMP_DIDOT).team(lEagFromDb).dayOfBirth(24).monthOfBirth(CConstants.JULY).yearOfBirth(1983).country(CConstants.FRANCE).positions(lDidotPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_DIDOT).build();

        // forwards

        CPlayerEntity lSaliburEag = new CPlayerEntity.CPlayerBuilder().firstName("yannis").lastName(CConstants.NAME_GUINGAMP_SALIBUR).team(lEagFromDb).dayOfBirth(25).monthOfBirth(CConstants.JANUARY).yearOfBirth(1991).country(CConstants.FRANCE).positions(lSaliburPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_SALIBUR).build();
        CPlayerEntity lPrivatEag = new CPlayerEntity.CPlayerBuilder().firstName("sloan").lastName(CConstants.NAME_GUINGAMP_PRIVAT).team(lEagFromDb).dayOfBirth(24).monthOfBirth(CConstants.JULY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lPrivatPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_PRIVAT).build();
        CPlayerEntity lBriandEag = new CPlayerEntity.CPlayerBuilder().firstName("jimmy").lastName(CConstants.NAME_GUINGAMP_BRIAND).team(lEagFromDb).dayOfBirth(2).monthOfBirth(CConstants.AUGUST).yearOfBirth(1985).country(CConstants.FRANCE).positions(lBriandPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_BRIAND).build();
        CPlayerEntity lMartinetEag = new CPlayerEntity.CPlayerBuilder().firstName("sullivan").lastName(CConstants.NAME_GUINGAMP_MARTINET).team(lEagFromDb).dayOfBirth(1).monthOfBirth(CConstants.JULY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMartinetPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_MARTINET).build();
        CPlayerEntity lMendyEag = new CPlayerEntity.CPlayerBuilder().firstName("alexandre").lastName(CConstants.NAME_GUINGAMP_MENDY).team(lEagFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1994).country(CConstants.FRANCE).positions(lMendyPositionsEag).picturePath(CConstants.PICTURE_GUINGAMP_MENDY).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJohnssonEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSalinEag);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGuivarchEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarcalEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lManeEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKerbratEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSorbonEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMartinsPereiraEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAngouaEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLevequeEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLemaitreEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lIkokoEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSankohEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaliburEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDeauxEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGiresseEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenezetEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCocoEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDePauwEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLivolantEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBlasEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBriandEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPrivatEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendyEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMartinetEag);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDidotEag);
            lCrudMethods.commitTransaction();
        }
    }
}
