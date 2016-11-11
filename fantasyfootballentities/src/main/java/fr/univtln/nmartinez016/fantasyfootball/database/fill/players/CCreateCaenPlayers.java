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
 * Created by marti on 16/08/2016.
 */
public class CCreateCaenPlayers {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lCaenFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.CAEN).parameters())).get(0);


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

        List<CPositionEntity> lVercoutrePositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDeschateauxPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lReuletPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDreyerPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lYahiaPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBenYoussefPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lImorouPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAlhadurPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDaboPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDaSilvaPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lGenevoisPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSeubePositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDiomandePositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDelaplacePositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNkololoPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMalbranquePositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBessatPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMakengoPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lAdeotiPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeborgnePositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lFeretPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lVoisinPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKaramohPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDelortPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRodelinPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLouisPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBazilePositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSanePositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKouakouPositionsCaen = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSantiniPositionsCaen = new ArrayList<CPositionEntity>();


        CPlayerEntity lVercoutreCaen = new CPlayerEntity.CPlayerBuilder().firstName("remy").lastName(CConstants.NAME_CAEN_VERCOUTRE).team(lCaenFromDb).dayOfBirth(26).monthOfBirth(CConstants.JUNE).yearOfBirth(1980).country(CConstants.FRANCE).positions(lVercoutrePositionsCaen).picturePath(CConstants.PICTURE_CAEN_VERCOUTRE).build();
        CPlayerEntity lDeschateauxCaen = new CPlayerEntity.CPlayerBuilder().firstName("louis").lastName(CConstants.NAME_CAEN_DESCHATEAUX).team(lCaenFromDb).dayOfBirth(16).monthOfBirth(CConstants.APRIL).yearOfBirth(1997).country(CConstants.FRANCE).positions(lDeschateauxPositionsCaen).picturePath(CConstants.PICTURE_CAEN_DESCHATEAUX).build();
        CPlayerEntity lReuletCaen = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_CAEN_REULET).team(lCaenFromDb).dayOfBirth(14).monthOfBirth(CConstants.JANUARY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lReuletPositionsCaen).picturePath(CConstants.PICTURE_CAEN_REULET).build();
        CPlayerEntity lDreyerCaen = new CPlayerEntity.CPlayerBuilder().firstName("matthieu").lastName(CConstants.NAME_CAEN_DREYER).team(lCaenFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.FRANCE).positions(lDreyerPositionsCaen).picturePath(CConstants.PICTURE_CAEN_DREYER).build();

        CPlayerEntity lYahiaCaen = new CPlayerEntity.CPlayerBuilder().firstName("alaeddine").lastName(CConstants.NAME_CAEN_YAHIA).team(lCaenFromDb).dayOfBirth(26).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1981).country(CConstants.FRANCE).positions(lYahiaPositionsCaen).picturePath(CConstants.PICTURE_CAEN_YAHIA).build();
        CPlayerEntity lBenYoussefCaen = new CPlayerEntity.CPlayerBuilder().firstName("syam").lastName(CConstants.NAME_CAEN_BENYOUSSEF).team(lCaenFromDb).dayOfBirth(31).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.FRANCE).positions(lBenYoussefPositionsCaen).picturePath(CConstants.PICTURE_CAEN_BENYOUSSEF).build();
        CPlayerEntity lImorouCaen = new CPlayerEntity.CPlayerBuilder().firstName("emmanuel").lastName(CConstants.NAME_CAEN_IMOROU).team(lCaenFromDb).dayOfBirth(16).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lImorouPositionsCaen).picturePath(CConstants.PICTURE_CAEN_IMOROU).build();
        CPlayerEntity lAlhadurCaen = new CPlayerEntity.CPlayerBuilder().firstName("chaker").lastName(CConstants.NAME_CAEN_ALHADUR).team(lCaenFromDb).dayOfBirth(4).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lAlhadurPositionsCaen).picturePath(CConstants.PICTURE_CAEN_ALHADUR).build();
        CPlayerEntity lDaboCaen = new CPlayerEntity.CPlayerBuilder().firstName("mouhamadou").lastName(CConstants.NAME_CAEN_DABO).team(lCaenFromDb).dayOfBirth(28).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1986).country(CConstants.SENEGAL).positions(lDaboPositionsCaen).picturePath(CConstants.PICTURE_CAEN_DABO).build();
        CPlayerEntity lDaSilvaCaen = new CPlayerEntity.CPlayerBuilder().firstName("damien").lastName(CConstants.NAME_CAEN_DASILVA).team(lCaenFromDb).dayOfBirth(17).monthOfBirth(CConstants.MAY).yearOfBirth(1988).country(CConstants.FRANCE).positions(lDaSilvaPositionsCaen).picturePath(CConstants.PICTURE_CAEN_DASILVA).build();
        CPlayerEntity lGenevoisCaen = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_CAEN_GENEVOIS).team(lCaenFromDb).dayOfBirth(28).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1987).country(CConstants.FRANCE).positions(lGenevoisPositionsCaen).picturePath(CConstants.PICTURE_CAEN_GENEVOIS).build();

        CPlayerEntity lSeubeCaen = new CPlayerEntity.CPlayerBuilder().firstName("nicolas").lastName(CConstants.NAME_CAEN_SEUBE).team(lCaenFromDb).dayOfBirth(11).monthOfBirth(CConstants.AUGUST).yearOfBirth(1979).country(CConstants.FRANCE).positions(lSeubePositionsCaen).picturePath(CConstants.PICTURE_CAEN_SEUBE).build();
        CPlayerEntity lDiomandeCaen = new CPlayerEntity.CPlayerBuilder().firstName("ismael").lastName(CConstants.NAME_CAEN_DIOMANDE).team(lCaenFromDb).dayOfBirth(28).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.IVORYCOAST).positions(lDiomandePositionsCaen).picturePath(CConstants.PICTURE_CAEN_DIOMANDE).build();
        CPlayerEntity lDelaplaceCaen = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_CAEN_DELAPLACE).team(lCaenFromDb).dayOfBirth(20).monthOfBirth(CConstants.MARCH).yearOfBirth(1986).country(CConstants.FRANCE).positions(lDelaplacePositionsCaen).picturePath(CConstants.PICTURE_CAEN_DELAPLACE).build();
        CPlayerEntity lNkololoCaen = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_CAEN_NKOLOLO).team(lCaenFromDb).dayOfBirth(9).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1992).country(CConstants.FRANCE).positions(lNkololoPositionsCaen).picturePath(CConstants.PICTURE_CAEN_NKOLOLO).build();
        CPlayerEntity lMalbranqueCaen = new CPlayerEntity.CPlayerBuilder().firstName("steed").lastName(CConstants.NAME_CAEN_MALBRANQUE).team(lCaenFromDb).dayOfBirth(6).monthOfBirth(CConstants.JANUARY).yearOfBirth(1980).country(CConstants.FRANCE).positions(lMalbranquePositionsCaen).picturePath(CConstants.PICTURE_CAEN_MALBRANQUE).build();
        CPlayerEntity lBessatCaen = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_CAEN_BESSAT).team(lCaenFromDb).dayOfBirth(8).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1985).country(CConstants.FRANCE).positions(lBessatPositionsCaen).picturePath(CConstants.PICTURE_CAEN_BESSAT).build();
        CPlayerEntity lMakengoCaen = new CPlayerEntity.CPlayerBuilder().firstName("jean victor").lastName(CConstants.NAME_CAEN_MAKENGO).team(lCaenFromDb).dayOfBirth(12).monthOfBirth(CConstants.JUNE).yearOfBirth(1998).country(CConstants.FRANCE).positions(lMakengoPositionsCaen).picturePath(CConstants.PICTURE_CAEN_MAKENGO).build();
        CPlayerEntity lAdeotiCaen = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_CAEN_ADEOTI).team(lCaenFromDb).dayOfBirth(12).monthOfBirth(CConstants.MARCH).yearOfBirth(1989).country(CConstants.FRANCE).positions(lAdeotiPositionsCaen).picturePath(CConstants.PICTURE_CAEN_ADEOTI).build();
        CPlayerEntity lLeborgneCaen = new CPlayerEntity.CPlayerBuilder().firstName("jordan").lastName(CConstants.NAME_CAEN_LEBORGNE).team(lCaenFromDb).dayOfBirth(29).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLeborgnePositionsCaen).picturePath(CConstants.PICTURE_CAEN_LEBORGNE).build();
        CPlayerEntity lFeretCaen = new CPlayerEntity.CPlayerBuilder().firstName("julien").lastName(CConstants.NAME_CAEN_FERET).team(lCaenFromDb).dayOfBirth(5).monthOfBirth(CConstants.JULY).yearOfBirth(1982).country(CConstants.FRANCE).positions(lFeretPositionsCaen).picturePath(CConstants.PICTURE_CAEN_FERET).build();
        CPlayerEntity lVoisinCaen = new CPlayerEntity.CPlayerBuilder().firstName("valentin").lastName(CConstants.NAME_CAEN_VOISIN).team(lCaenFromDb).dayOfBirth(19).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lVoisinPositionsCaen).picturePath(CConstants.PICTURE_CAEN_VOISIN).build();

        CPlayerEntity lKaramohCaen = new CPlayerEntity.CPlayerBuilder().firstName("yann").lastName(CConstants.NAME_CAEN_KARAMOH).team(lCaenFromDb).dayOfBirth(8).monthOfBirth(CConstants.JULY).yearOfBirth(1998).country(CConstants.FRANCE).positions(lKaramohPositionsCaen).picturePath(CConstants.PICTURE_CAEN_KARAMOH).build();
        CPlayerEntity lDelortCaen = new CPlayerEntity.CPlayerBuilder().firstName("andy").lastName(CConstants.NAME_CAEN_DELORT).team(lCaenFromDb).dayOfBirth(9).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1991).country(CConstants.FRANCE).positions(lDelortPositionsCaen).picturePath(CConstants.PICTURE_CAEN_DELORT).build();
        CPlayerEntity lRodelinCaen = new CPlayerEntity.CPlayerBuilder().firstName("rony").lastName(CConstants.NAME_CAEN_RODELIN).team(lCaenFromDb).dayOfBirth(18).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lRodelinPositionsCaen).picturePath(CConstants.PICTURE_CAEN_RODELIN).build();
        CPlayerEntity lLouisCaen = new CPlayerEntity.CPlayerBuilder().firstName("jeff").lastName(CConstants.NAME_CAEN_LOUIS).team(lCaenFromDb).dayOfBirth(8).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.HAITI).positions(lLouisPositionsCaen).picturePath(CConstants.PICTURE_CAEN_LOUIS).build();
        CPlayerEntity lBazileCaen = new CPlayerEntity.CPlayerBuilder().firstName("herve").lastName(CConstants.NAME_CAEN_BAZILE).team(lCaenFromDb).dayOfBirth(18).monthOfBirth(CConstants.MARCH).yearOfBirth(1990).country(CConstants.FRANCE).positions(lBazilePositionsCaen).picturePath(CConstants.PICTURE_CAEN_BAZILE).build();
        CPlayerEntity lSaneCaen = new CPlayerEntity.CPlayerBuilder().firstName("pape").lastName(CConstants.NAME_CAEN_SANE).team(lCaenFromDb).dayOfBirth(30).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1991).country(CConstants.SENEGAL).positions(lSanePositionsCaen).picturePath(CConstants.PICTURE_CAEN_SANE).build();
        CPlayerEntity lKouakouCaen = new CPlayerEntity.CPlayerBuilder().firstName("christian").lastName(CConstants.NAME_CAEN_KOUAKOU).team(lCaenFromDb).dayOfBirth(1).monthOfBirth(CConstants.MARCH).yearOfBirth(1991).country(CConstants.IVORYCOAST).positions(lKouakouPositionsCaen).picturePath(CConstants.PICTURE_CAEN_KOUAKOU).build();
        CPlayerEntity lSantiniCaen = new CPlayerEntity.CPlayerBuilder().firstName("ivan").lastName(CConstants.NAME_CAEN_SANTINI).team(lCaenFromDb).dayOfBirth(21).monthOfBirth(CConstants.MAY).yearOfBirth(1989).country(CConstants.CROATIA).positions(lSantiniPositionsCaen).picturePath(CConstants.PICTURE_CAEN_SANTINI).build();


        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVercoutreCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDeschateauxCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lReuletCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDreyerCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDaSilvaCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenYoussefCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lYahiaCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lImorouCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDaboCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAlhadurCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGenevoisCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSeubeCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFeretCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDiomandeCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDelaplaceCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNkololoCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMalbranqueCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMakengoCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBessatCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lAdeotiCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeborgneCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVoisinCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKaramohCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDelortCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRodelinCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLouisCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBazileCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSaneCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKouakouCaen);
            lCrudMethods.commitTransaction();
        }
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSantiniCaen);
            lCrudMethods.commitTransaction();
        }


    }
}
