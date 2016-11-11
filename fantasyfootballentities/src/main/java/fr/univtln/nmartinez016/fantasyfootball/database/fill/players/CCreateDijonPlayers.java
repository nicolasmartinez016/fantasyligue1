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
public class CCreateDijonPlayers {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lDijonFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.DIJON).parameters())).get(0);

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

        List<CPositionEntity> lAllainPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeroyPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lReynetPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLotiesPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBernardPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRosierPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAbdelhamidPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRufliPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBoukaMoutouPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lChafikPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lVarraultPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBelmontePositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSarrabayrousePositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeesMelouPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBelaPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMartinPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMariePositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBalmontPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSammaritanoPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAmalfitanoPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lGastienPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBahamboulaPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRivierePositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDionyPositionsDijon = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTavaresPositionsDijon = new ArrayList<CPositionEntity>();




        // players

        // gk

        CPlayerEntity lAllainDijon = new CPlayerEntity.CPlayerBuilder().firstName("bobby").lastName(CConstants.NAME_DIJON_ALLAIN).team(lDijonFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lAllainPositionsDijon).picturePath(CConstants.PICTURE_DIJON_ALLAIN).build();
        CPlayerEntity lLeroyDijon = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_DIJON_LEROY).team(lDijonFromDb).dayOfBirth(7).monthOfBirth(CConstants.APRIL).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLeroyPositionsDijon).picturePath(CConstants.PICTURE_DIJON_LEROY).build();
        CPlayerEntity lReynetDijon = new CPlayerEntity.CPlayerBuilder().firstName("baptiste").lastName(CConstants.NAME_DIJON_REYNET).team(lDijonFromDb).dayOfBirth(28).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lReynetPositionsDijon).picturePath(CConstants.PICTURE_DIJON_REYNET).build();

        // defenders

        CPlayerEntity lLotiesDijon = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_DIJON_LOTIES).team(lDijonFromDb).dayOfBirth(5).monthOfBirth(CConstants.AUGUST).yearOfBirth(1984).country(CConstants.FRANCE).positions(lLotiesPositionsDijon).picturePath(CConstants.PICTURE_DIJON_LOTIES).build();
        CPlayerEntity lBernardDijon = new CPlayerEntity.CPlayerBuilder().firstName("quentin").lastName(CConstants.NAME_DIJON_BERNARD).team(lDijonFromDb).dayOfBirth(7).monthOfBirth(CConstants.JULY).yearOfBirth(1989).country(CConstants.FRANCE).positions(lBernardPositionsDijon).picturePath(CConstants.PICTURE_DIJON_BERNARD).build();
        CPlayerEntity lRosierDijon = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_DIJON_ROSIER).team(lDijonFromDb).dayOfBirth(19).monthOfBirth(CConstants.AUGUST).yearOfBirth(1996).country(CConstants.FRANCE).positions(lRosierPositionsDijon).picturePath(CConstants.PICTURE_DIJON_ROSIER).build();
        CPlayerEntity lAbdelhamidDijon = new CPlayerEntity.CPlayerBuilder().firstName("younis").lastName(CConstants.NAME_DIJON_ABDELHAMID).team(lDijonFromDb).dayOfBirth(28).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1987).country(CConstants.FRANCE).positions(lAbdelhamidPositionsDijon).picturePath(CConstants.PICTURE_DIJON_ABDELHAMID).build();
        CPlayerEntity lRufliDijon = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_DIJON_RUFLI).team(lDijonFromDb).dayOfBirth(22).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.SWITZERLAND).positions(lRufliPositionsDijon).picturePath(CConstants.PICTURE_DIJON_RUFLI).build();
        CPlayerEntity lBoukaMoutouDijon = new CPlayerEntity.CPlayerBuilder().firstName("arnold").lastName(CConstants.NAME_DIJON_BOUKAMOUTOU).team(lDijonFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lBoukaMoutouPositionsDijon).picturePath(CConstants.PICTURE_DIJON_BOUKAMOUTOU).build();
        CPlayerEntity lChafikDijon = new CPlayerEntity.CPlayerBuilder().firstName("fouad").lastName(CConstants.NAME_DIJON_CHAFIK).team(lDijonFromDb).dayOfBirth(16).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1986).country(CConstants.FRANCE).positions(lChafikPositionsDijon).picturePath(CConstants.PICTURE_DIJON_CHAFIK).build();
        CPlayerEntity lVarraultDijon = new CPlayerEntity.CPlayerBuilder().firstName("cedrid").lastName(CConstants.NAME_DIJON_VARRAULT).team(lDijonFromDb).dayOfBirth(30).monthOfBirth(CConstants.JANUARY).yearOfBirth(1980).country(CConstants.FRANCE).positions(lVarraultPositionsDijon).picturePath(CConstants.PICTURE_DIJON_VARRAULT).build();

        // midfielders

        CPlayerEntity lBelmonteDijon = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_DIJON_BELMONTE).team(lDijonFromDb).dayOfBirth(16).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lBelmontePositionsDijon).picturePath(CConstants.PICTURE_DIJON_BELMONTE).build();
        CPlayerEntity lSarrabayrouseDijon = new CPlayerEntity.CPlayerBuilder().firstName("guillaume").lastName(CConstants.NAME_DIJON_SARRABAYROUSE).team(lDijonFromDb).dayOfBirth(14).monthOfBirth(CConstants.JUNE).yearOfBirth(1997).country(CConstants.FRANCE).positions(lSarrabayrousePositionsDijon).picturePath(CConstants.PICTURE_DIJON_SARRABAYROUSE).build();
        CPlayerEntity lLeesMelouDijon = new CPlayerEntity.CPlayerBuilder().firstName("pierre").lastName(CConstants.NAME_DIJON_LEESMELOU).team(lDijonFromDb).dayOfBirth(25).monthOfBirth(CConstants.MAY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lLeesMelouPositionsDijon).picturePath(CConstants.PICTURE_DIJON_LEESMELOU).build();
        CPlayerEntity lBelaDijon = new CPlayerEntity.CPlayerBuilder().firstName("jeremie").lastName(CConstants.NAME_DIJON_BELA).team(lDijonFromDb).dayOfBirth(8).monthOfBirth(CConstants.APRIL).yearOfBirth(1993).country(CConstants.FRANCE).positions(lBelaPositionsDijon).picturePath(CConstants.PICTURE_DIJON_BELA).build();
        CPlayerEntity lMartinDijon = new CPlayerEntity.CPlayerBuilder().firstName("marvin").lastName(CConstants.NAME_DIJON_MARTIN).team(lDijonFromDb).dayOfBirth(10).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lMartinPositionsDijon).picturePath(CConstants.PICTURE_DIJON_MARTIN).build();
        CPlayerEntity lMarieDijon = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_DIJON_MARIE).team(lDijonFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lMariePositionsDijon).picturePath(CConstants.PICTURE_DIJON_MARIE).build();
        CPlayerEntity lBalmontDijon = new CPlayerEntity.CPlayerBuilder().firstName("florent").lastName(CConstants.NAME_DIJON_BALMONT).team(lDijonFromDb).dayOfBirth(2).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1980).country(CConstants.FRANCE).positions(lBalmontPositionsDijon).picturePath(CConstants.PICTURE_DIJON_BALMONT).build();
        CPlayerEntity lSammaritanoDijon = new CPlayerEntity.CPlayerBuilder().firstName("frederic").lastName(CConstants.NAME_DIJON_SAMMARITANO).team(lDijonFromDb).dayOfBirth(23).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.FRANCE).positions(lSammaritanoPositionsDijon).picturePath(CConstants.PICTURE_DIJON_SAMMARITANO).build();
        CPlayerEntity lAmalfitanoDijon = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_DIJON_AMALFITANO).team(lDijonFromDb).dayOfBirth(27).monthOfBirth(CConstants.AUGUST).yearOfBirth(1989).country(CConstants.FRANCE).positions(lAmalfitanoPositionsDijon).picturePath(CConstants.PICTURE_DIJON_AMALFITANO).build();
        CPlayerEntity lGastienDijon = new CPlayerEntity.CPlayerBuilder().firstName("johan").lastName(CConstants.NAME_DIJON_GASTIEN).team(lDijonFromDb).dayOfBirth(25).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lGastienPositionsDijon).picturePath(CConstants.PICTURE_DIJON_GASTIEN).build();
        CPlayerEntity lBahamboulaDijon = new CPlayerEntity.CPlayerBuilder().firstName("dylan").lastName(CConstants.NAME_DIJON_BAHAMBOULA).team(lDijonFromDb).dayOfBirth(22).monthOfBirth(CConstants.MAY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lBahamboulaPositionsDijon).picturePath(CConstants.PICTURE_DIJON_BAHAMBOULA).build();

        // forwards

        CPlayerEntity lRiviereDijon = new CPlayerEntity.CPlayerBuilder().firstName("yohann").lastName(CConstants.NAME_DIJON_RIVIERE).team(lDijonFromDb).dayOfBirth(18).monthOfBirth(CConstants.AUGUST).yearOfBirth(1984).country(CConstants.FRANCE).positions(lRivierePositionsDijon).picturePath(CConstants.PICTURE_DIJON_RIVIERE).build();
        CPlayerEntity lDionyDijon = new CPlayerEntity.CPlayerBuilder().firstName("lois").lastName(CConstants.NAME_DIJON_DIONY).team(lDijonFromDb).dayOfBirth(20).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lDionyPositionsDijon).picturePath(CConstants.PICTURE_DIJON_DIONY).build();
        CPlayerEntity lTavaresDijon = new CPlayerEntity.CPlayerBuilder().firstName("julio").lastName(CConstants.NAME_DIJON_TAVARES).team(lDijonFromDb).dayOfBirth(19).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1988).country(CConstants.CAPVERT).positions(lTavaresPositionsDijon).picturePath(CConstants.PICTURE_DIJON_TAVARES).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAllainDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeroyDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lReynetDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVarraultDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLotiesDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBernardDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRosierDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAbdelhamidDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRufliDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoukaMoutouDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lChafikDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBelmonteDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSarrabayrouseDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeesMelouDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBelaDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMartinDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarieDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBalmontDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAmalfitanoDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSammaritanoDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGastienDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBahamboulaDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTavaresDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRiviereDijon);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDionyDijon);
            lCrudMethods.commitTransaction();
        }


    }
}
