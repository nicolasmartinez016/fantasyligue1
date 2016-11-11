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
public class CCreateAsmPlayers {

    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lAsmFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.MONACO).parameters())).get(0);


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

        List<CPositionEntity> lSubasicPositionsMonaco = new ArrayList<CPositionEntity>();
        lSubasicPositionsMonaco.add(lGk);

        List<CPositionEntity> lDeSanctisPositionsMonaco = new ArrayList<CPositionEntity>();
        lDeSanctisPositionsMonaco.add(lGk);

        List<CPositionEntity> lGlikPositionsMonaco = new ArrayList<CPositionEntity>();
        lGlikPositionsMonaco.add(lCb);

        List<CPositionEntity> lTisserandPositionsMonaco = new ArrayList<CPositionEntity>();
        lTisserandPositionsMonaco.add(lCb);

        List<CPositionEntity> lSidibePositionsMonaco = new ArrayList<CPositionEntity>();
        lSidibePositionsMonaco.add(lRb);
        lSidibePositionsMonaco.add(lLb);

        List<CPositionEntity> lMendyPositionsMonaco = new ArrayList<CPositionEntity>();
        lMendyPositionsMonaco.add(lLb);

        List<CPositionEntity> lJemersonPositionsMonaco = new ArrayList<CPositionEntity>();
        lJemersonPositionsMonaco.add(lCb);

        List<CPositionEntity> lTourePositionsMonaco = new ArrayList<CPositionEntity>();
        lTourePositionsMonaco.add(lRb);

        List<CPositionEntity> lFabinhoPositionsMonaco = new ArrayList<CPositionEntity>();
        lFabinhoPositionsMonaco.add(lRb);
        lFabinhoPositionsMonaco.add(lCdm);

        List<CPositionEntity> lEchiejilePositionsMonaco = new ArrayList<CPositionEntity>();
        lEchiejilePositionsMonaco.add(lLb);

        List<CPositionEntity> lRaggiPositionsMonaco = new ArrayList<CPositionEntity>();
        lRaggiPositionsMonaco.add(lCb);
        lRaggiPositionsMonaco.add(lRb);

        List<CPositionEntity> lNdoramPositionsMonaco = new ArrayList<CPositionEntity>();
        lNdoramPositionsMonaco.add(lCb);

        List<CPositionEntity> lTavaresPositionsMonaco = new ArrayList<CPositionEntity>();
        lTavaresPositionsMonaco.add(lCb);

        List<CPositionEntity> lWallacePositionsMonaco = new ArrayList<CPositionEntity>();
        lWallacePositionsMonaco.add(lCb);

        List<CPositionEntity> lBakayokoPositionsMonaco = new ArrayList<CPositionEntity>();
        lBakayokoPositionsMonaco.add(lCdm);

        List<CPositionEntity> lDirarPositionsMonaco = new ArrayList<CPositionEntity>();
        lDirarPositionsMonaco.add(lRm);

        List<CPositionEntity> lLemarPositionsMonaco = new ArrayList<CPositionEntity>();
        lLemarPositionsMonaco.add(lRm);
        lLemarPositionsMonaco.add(lCam);

        List<CPositionEntity> lSilvaPositionsMonaco = new ArrayList<CPositionEntity>();
        lSilvaPositionsMonaco.add(lCam);
        lSilvaPositionsMonaco.add(lRw);

        List<CPositionEntity> lBahlouliPositionsMonaco = new ArrayList<CPositionEntity>();
        lBahlouliPositionsMonaco.add(lCam);

        List<CPositionEntity> lMbappePositionsMonaco = new ArrayList<CPositionEntity>();
        lMbappePositionsMonaco.add(lLw);

        List<CPositionEntity> lTraorePositionsMonaco = new ArrayList<CPositionEntity>();
        lTraorePositionsMonaco.add(lRm);

        List<CPositionEntity> lBoschiliaPositionsMonaco = new ArrayList<CPositionEntity>();
        lBoschiliaPositionsMonaco.add(lCm);

        List<CPositionEntity> lMexiquePositionsMonaco = new ArrayList<CPositionEntity>();
        lMexiquePositionsMonaco.add(lCm);

        List<CPositionEntity> lVinagrePositionsMonaco = new ArrayList<CPositionEntity>();
        lVinagrePositionsMonaco.add(lCm);

        List<CPositionEntity> lJeanPositionsMonaco = new ArrayList<CPositionEntity>();
        lJeanPositionsMonaco.add(lSt);

        List<CPositionEntity> lGermainPositionsMonaco = new ArrayList<CPositionEntity>();
        lGermainPositionsMonaco.add(lSt);

        List<CPositionEntity> lFalcaoPositionsMonaco = new ArrayList<CPositionEntity>();
        lFalcaoPositionsMonaco.add(lSt);

        List<CPositionEntity> lCavaleiroPositionsMonaco = new ArrayList<CPositionEntity>();
        lCavaleiroPositionsMonaco.add(lLw);

        List<CPositionEntity> lCarilloPositionsMonaco = new ArrayList<CPositionEntity>();
        lCarilloPositionsMonaco.add(lSt);

        List<CPositionEntity> lWagnerLovePositionsMonaco = new ArrayList<CPositionEntity>();
        lWagnerLovePositionsMonaco.add(lSt);

        List<CPositionEntity> lDialloPositionsMonaco = new ArrayList<CPositionEntity>();
        lDialloPositionsMonaco.add(lCb);

        List<CPositionEntity> lBongiovanniPositionsMonaco = new ArrayList<CPositionEntity>();
        lBongiovanniPositionsMonaco.add(lCb);

        List<CPositionEntity> lBennedinePositionsMonaco = new ArrayList<CPositionEntity>();
        lBennedinePositionsMonaco.add(lCb);

        List<CPositionEntity> lCarvalhoPositionsMonaco = new ArrayList<CPositionEntity>();
        lCarvalhoPositionsMonaco.add(lCb);



        CPlayerEntity lSubasicMonaco = new CPlayerEntity.CPlayerBuilder().firstName("danijel").lastName(CConstants.NAME_ASM_SUBASIC).team(lAsmFromDb).dayOfBirth(27).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1984).country(CConstants.CROATIA).positions(lSubasicPositionsMonaco).picturePath(CConstants.PICTURE_ASM_SUBASIC).build();
        CPlayerEntity lDeSanctisMonaco = new CPlayerEntity.CPlayerBuilder().firstName("morgan").lastName(CConstants.NAME_ASM_DESANCTIS).team(lAsmFromDb).dayOfBirth(26).monthOfBirth(CConstants.MARCH).yearOfBirth(1977).country(CConstants.ITALY).positions(lDeSanctisPositionsMonaco).picturePath(CConstants.PICTURE_ASM_DESANCTIS).build();
        CPlayerEntity lGlikMonaco = new CPlayerEntity.CPlayerBuilder().firstName("kamil").lastName(CConstants.NAME_ASM_GLIK).team(lAsmFromDb).dayOfBirth(3).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1988).country(CConstants.POLAND).positions(lGlikPositionsMonaco).picturePath(CConstants.PICTURE_ASM_GLIK).build();
        CPlayerEntity lMendyMonaco = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_ASM_MENDY).team(lAsmFromDb).dayOfBirth(17).monthOfBirth(CConstants.JULY).yearOfBirth(1994).country(CConstants.FRANCE).positions(lMendyPositionsMonaco).picturePath(CConstants.PICTURE_ASM_MENDY).build();
        CPlayerEntity lSidibeMonaco = new CPlayerEntity.CPlayerBuilder().firstName("djibril").lastName(CConstants.NAME_ASM_SIDIBE).team(lAsmFromDb).dayOfBirth(27).monthOfBirth(CConstants.JULY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lSidibePositionsMonaco).picturePath(CConstants.PICTURE_ASM_SIDIBE).build();
        CPlayerEntity lFabinhoMonaco = new CPlayerEntity.CPlayerBuilder().firstName("fabio henrique tavares").lastName(CConstants.NAME_ASM_FABINHO).team(lAsmFromDb).dayOfBirth(23).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1993).country(CConstants.BRAZIL).positions(lFabinhoPositionsMonaco).picturePath(CConstants.PICTURE_ASM_FABINHO).build();
        CPlayerEntity lCarvalhoMonaco = new CPlayerEntity.CPlayerBuilder().firstName("ricardo").lastName(CConstants.NAME_ASM_CARVALHO).team(lAsmFromDb).dayOfBirth(18).monthOfBirth(CConstants.MAY).yearOfBirth(1978).country(CConstants.PORTUGAL).positions(lCarvalhoPositionsMonaco).picturePath(CConstants.PICTURE_ASM_CARVALHO).build();
        CPlayerEntity lJemersonMonaco = new CPlayerEntity.CPlayerBuilder().firstName("jesus").lastName(CConstants.NAME_ASM_JEMERSON).team(lAsmFromDb).dayOfBirth(24).monthOfBirth(CConstants.AUGUST).yearOfBirth(1992).country(CConstants.BRAZIL).positions(lJemersonPositionsMonaco).picturePath(CConstants.PICTURE_ASM_JEMERSON).build();
        CPlayerEntity lToureMonaco = new CPlayerEntity.CPlayerBuilder().firstName("almany").lastName(CConstants.NAME_ASM_TOURE).team(lAsmFromDb).dayOfBirth(28).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.MALI).positions(lTourePositionsMonaco).picturePath(CConstants.PICTURE_ASM_TOURE).build();
        CPlayerEntity lRaggiMonaco = new CPlayerEntity.CPlayerBuilder().firstName("andrea").lastName(CConstants.NAME_ASM_RAGGI).team(lAsmFromDb).dayOfBirth(24).monthOfBirth(CConstants.JUNE).yearOfBirth(1984).country(CConstants.ITALY).positions(lRaggiPositionsMonaco).picturePath(CConstants.PICTURE_ASM_RAGGI).build();
        CPlayerEntity lEchiejileMonaco = new CPlayerEntity.CPlayerBuilder().firstName("uwa").lastName(CConstants.NAME_ASM_ECHIEJILE).team(lAsmFromDb).dayOfBirth(20).monthOfBirth(CConstants.JANUARY).yearOfBirth(1988).country(CConstants.NIGERIA).positions(lEchiejilePositionsMonaco).picturePath(CConstants.PICTURE_ASM_ECHIEJILE).build();
        CPlayerEntity lNdoramMonaco = new CPlayerEntity.CPlayerBuilder().firstName("kevin").lastName(CConstants.NAME_ASM_NDORAM).team(lAsmFromDb).dayOfBirth(22).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lNdoramPositionsMonaco).picturePath(CConstants.PICTURE_ASM_NDORAM).build();
        CPlayerEntity lTisserandMonaco = new CPlayerEntity.CPlayerBuilder().firstName("marcel").lastName(CConstants.NAME_ASM_TISSERAND).team(lAsmFromDb).dayOfBirth(10).monthOfBirth(CConstants.JANUARY).yearOfBirth(1993).country(CConstants.FRANCE).positions(lTisserandPositionsMonaco).picturePath(CConstants.PICTURE_ASM_TISSERAND).build();
        CPlayerEntity lDialloMonaco = new CPlayerEntity.CPlayerBuilder().firstName("abdou").lastName(CConstants.NAME_ASM_DIALLO).team(lAsmFromDb).dayOfBirth(4).monthOfBirth(CConstants.MAY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lDialloPositionsMonaco).picturePath(CConstants.PICTURE_ASM_DIALLO).build();
        CPlayerEntity lBennedineMonaco = new CPlayerEntity.CPlayerBuilder().firstName("medhi").lastName(CConstants.NAME_ASM_BENEDDINE).team(lAsmFromDb).dayOfBirth(26).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBennedinePositionsMonaco).picturePath(CConstants.PICTURE_ASM_BENEDDINE).build();
        CPlayerEntity lSilvaMonaco = new CPlayerEntity.CPlayerBuilder().firstName("bernardo").lastName(CConstants.NAME_ASM_BERNARDO).team(lAsmFromDb).dayOfBirth(10).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.PORTUGAL).positions(lSilvaPositionsMonaco).picturePath(CConstants.PICTURE_ASM_BERNARDO).build();
        CPlayerEntity lLemarMonaco = new CPlayerEntity.CPlayerBuilder().firstName("thomas").lastName(CConstants.NAME_ASM_LEMAR).team(lAsmFromDb).dayOfBirth(12).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1995).country(CConstants.FRANCE).positions(lLemarPositionsMonaco).picturePath(CConstants.PICTURE_ASM_LEMAR).build();
        CPlayerEntity lBakayokoMonaco = new CPlayerEntity.CPlayerBuilder().firstName("tiemoue").lastName(CConstants.NAME_ASM_BAKAYOKO).team(lAsmFromDb).dayOfBirth(17).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.FRANCE).positions(lBakayokoPositionsMonaco).picturePath(CConstants.PICTURE_ASM_BAKAYOKO).build();
        CPlayerEntity lMbappeMonaco = new CPlayerEntity.CPlayerBuilder().firstName("killian").lastName(CConstants.NAME_ASM_MBAPPE).team(lAsmFromDb).dayOfBirth(20).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1998).country(CConstants.FRANCE).positions(lMbappePositionsMonaco).picturePath(CConstants.PICTURE_ASM_MBAPPE).build();
        CPlayerEntity lBahlouliMonaco = new CPlayerEntity.CPlayerBuilder().firstName("fares").lastName(CConstants.NAME_ASM_BAHLOULI).team(lAsmFromDb).dayOfBirth(8).monthOfBirth(CConstants.APRIL).yearOfBirth(1995).country(CConstants.FRANCE).positions(lBahlouliPositionsMonaco).picturePath(CConstants.PICTURE_ASM_BAHLOULI).build();
        CPlayerEntity lDirarMonaco = new CPlayerEntity.CPlayerBuilder().firstName("nabil").lastName(CConstants.NAME_ASM_DIRAR).team(lAsmFromDb).dayOfBirth(25).monthOfBirth(CConstants.APRIL).yearOfBirth(1986).country(CConstants.MOROCCO).positions(lDirarPositionsMonaco).picturePath(CConstants.PICTURE_ASM_DIRAR).build();
        CPlayerEntity lTraoreMonaco = new CPlayerEntity.CPlayerBuilder().firstName("adama").lastName(CConstants.NAME_ASM_TRAORE).team(lAsmFromDb).dayOfBirth(28).monthOfBirth(CConstants.JUNE).yearOfBirth(1995).country(CConstants.MALI).positions(lTraorePositionsMonaco).picturePath(CConstants.PICTURE_ASM_TRAORE).build();
        CPlayerEntity lBoschiliaMonaco = new CPlayerEntity.CPlayerBuilder().firstName("gabriel").lastName(CConstants.NAME_ASM_BOSCHILIA).team(lAsmFromDb).dayOfBirth(5).monthOfBirth(CConstants.MARCH).yearOfBirth(1996).country(CConstants.BRAZIL).positions(lBoschiliaPositionsMonaco).picturePath(CConstants.PICTURE_ASM_BOSCHILIA).build();
        CPlayerEntity lMexiqueMonaco = new CPlayerEntity.CPlayerBuilder().firstName("jonathan").lastName(CConstants.NAME_ASM_MEXIQUE).team(lAsmFromDb).dayOfBirth(10).monthOfBirth(CConstants.MARCH).yearOfBirth(1995).country(CConstants.FRANCE).positions(lMexiquePositionsMonaco).picturePath(CConstants.PICTURE_ASM_MEXIQUE).build();
        CPlayerEntity lVinagreMonaco = new CPlayerEntity.CPlayerBuilder().firstName("ruben").lastName(CConstants.NAME_ASM_VINAGRE).team(lAsmFromDb).dayOfBirth(9).monthOfBirth(CConstants.APRIL).yearOfBirth(1999).country(CConstants.PORTUGAL).positions(lVinagrePositionsMonaco).picturePath(CConstants.PICTURE_ASM_VINAGRE).build();
        CPlayerEntity lJeanMonaco = new CPlayerEntity.CPlayerBuilder().firstName("corentin").lastName(CConstants.NAME_ASM_JEAN).team(lAsmFromDb).dayOfBirth(15).monthOfBirth(CConstants.JULY).yearOfBirth(1995).country(CConstants.FRANCE).positions(lJeanPositionsMonaco).picturePath(CConstants.PICTURE_ASM_JEAN).build();
        CPlayerEntity lGermainMonaco = new CPlayerEntity.CPlayerBuilder().firstName("valere").lastName(CConstants.NAME_ASM_GERMAIN).team(lAsmFromDb).dayOfBirth(17).monthOfBirth(CConstants.APRIL).yearOfBirth(1990).country(CConstants.FRANCE).positions(lGermainPositionsMonaco).picturePath(CConstants.PICTURE_ASM_GERMAIN).build();
        CPlayerEntity lFalcaoMonaco = new CPlayerEntity.CPlayerBuilder().firstName("radamael").lastName(CConstants.NAME_ASM_FALCAO).team(lAsmFromDb).dayOfBirth(10).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1986).country(CConstants.COLOMBIA).positions(lFalcaoPositionsMonaco).picturePath(CConstants.PICTURE_ASM_FALCAO).build();
        CPlayerEntity lCarilloMonaco = new CPlayerEntity.CPlayerBuilder().firstName("guido").lastName(CConstants.NAME_ASM_CARILLO).team(lAsmFromDb).dayOfBirth(25).monthOfBirth(CConstants.MAY).yearOfBirth(1991).country(CConstants.ARGENTINA).positions(lCarilloPositionsMonaco).picturePath(CConstants.PICTURE_ASM_CARILLO).build();
        CPlayerEntity lCavaleiroMonaco = new CPlayerEntity.CPlayerBuilder().firstName("ivan").lastName(CConstants.NAME_ASM_CAVALEIRO).team(lAsmFromDb).dayOfBirth(18).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1993).country(CConstants.PORTUGAL).positions(lCavaleiroPositionsMonaco).picturePath(CConstants.PICTURE_ASM_CAVALEIRO).build();
        CPlayerEntity lWagnerLoveMonaco = new CPlayerEntity.CPlayerBuilder().firstName("daniel").lastName(CConstants.NAME_ASM_VAGNERLOVE).team(lAsmFromDb).dayOfBirth(11).monthOfBirth(CConstants.JUNE).yearOfBirth(1984).country(CConstants.FRANCE).positions(lWagnerLovePositionsMonaco).picturePath(CConstants.PICTURE_ASM_VAGNERLOVE).build();
        CPlayerEntity lBongiovanniMonaco = new CPlayerEntity.CPlayerBuilder().firstName("adrien").lastName(CConstants.NAME_ASM_BONGIOVANNI).team(lAsmFromDb).dayOfBirth(20).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1999).country(CConstants.BELGIUM).positions(lBongiovanniPositionsMonaco).picturePath(CConstants.PICTURE_ASM_BONGIOVANNI).build();





        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSubasicMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDeSanctisMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGlikMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFabinhoMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCarvalhoMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTisserandMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDialloMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRaggiMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lEchiejileMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMendyMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSidibeMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJemersonMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToureMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdoramMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBennedineMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSilvaMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLemarMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBakayokoMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBahlouliMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDirarMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMbappeMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTraoreMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBoschiliaMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMexiqueMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lVinagreMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJeanMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGermainMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFalcaoMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lWagnerLoveMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCarilloMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBongiovanniMonaco);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCavaleiroMonaco);
            lCrudMethods.commitTransaction();
        }
    }
}
