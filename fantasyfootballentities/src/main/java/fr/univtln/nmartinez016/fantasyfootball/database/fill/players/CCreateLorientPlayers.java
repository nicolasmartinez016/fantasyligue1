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
public class CCreateLorientPlayers {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lLorientFromDb = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.LORIENT).parameters())).get(0);


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

        List<CPositionEntity> lLecomtePositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lDelecroixPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCianiPositionsLorient = new ArrayList<CPositionEntity>();
        lCianiPositionsLorient.add(lCb);

        List<CPositionEntity> lLamongePositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBellugouPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMoreiraPositionsLorient = new ArrayList<CPositionEntity>();
        lMoreiraPositionsLorient.add(lRb);

        List<CPositionEntity> lContePositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLautoaPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lLeGoffPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMazikouPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPayePositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lRosePositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lKoffiPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lSelemaniPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lTourePositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBarthelmePositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lBenKhemisPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMvuembaPositionsLorient = new ArrayList<CPositionEntity>();
        lMvuembaPositionsLorient.add(lCm);

        List<CPositionEntity> lCabotPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lCafuPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMaraPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMarveauxPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMesloubPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lNdongPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lPhilippoteauxPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lFofanaPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lJeannotPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lMoukandjoPositionsLorient = new ArrayList<CPositionEntity>();

        List<CPositionEntity> lWarisPositionsLorient = new ArrayList<CPositionEntity>();


        CPlayerEntity lLecomteLorient = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_LORIENT_LECOMTE).team(lLorientFromDb).dayOfBirth(26).monthOfBirth(CConstants.APRIL).yearOfBirth(1991).country(CConstants.FRANCE).positions(lLecomtePositionsLorient).picturePath(CConstants.PICTURE_LORIENT_LECOMTE).build();
        CPlayerEntity lDelecroixLorient = new CPlayerEntity.CPlayerBuilder().firstName("paul").lastName(CConstants.NAME_LORIENT_DELECROIX).team(lLorientFromDb).dayOfBirth(14).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lDelecroixPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_DELECROIX).build();
        CPlayerEntity lLamongeLorient = new CPlayerEntity.CPlayerBuilder().firstName("anthony").lastName(CConstants.NAME_LORIENT_LAMONGE).team(lLorientFromDb).dayOfBirth(10).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1990).country(CConstants.FRANCE).positions(lLamongePositionsLorient).picturePath(CConstants.PICTURE_LORIENT_LAMONGE).build();

        CPlayerEntity lBellugouLorient = new CPlayerEntity.CPlayerBuilder().firstName("francois").lastName(CConstants.NAME_LORIENT_BELLUGOU).team(lLorientFromDb).dayOfBirth(25).monthOfBirth(CConstants.APRIL).yearOfBirth(1987).country(CConstants.FRANCE).positions(lBellugouPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_BELLUGOU).build();
        CPlayerEntity lConteLorient = new CPlayerEntity.CPlayerBuilder().firstName("ibrahima").lastName(CConstants.NAME_LORIENT_CONTE).team(lLorientFromDb).dayOfBirth(3).monthOfBirth(CConstants.APRIL).yearOfBirth(1996).country(CConstants.GUINEA).positions(lContePositionsLorient).picturePath(CConstants.PICTURE_LORIENT_CONTE).build();
        CPlayerEntity lLautoaLorient = new CPlayerEntity.CPlayerBuilder().firstName("wesley").lastName(CConstants.NAME_LORIENT_LAUTOA).team(lLorientFromDb).dayOfBirth(25).monthOfBirth(CConstants.AUGUST).yearOfBirth(1987).country(CConstants.FRANCE).positions(lLautoaPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_LAUTOA).build();
        CPlayerEntity lLeGoffLorient = new CPlayerEntity.CPlayerBuilder().firstName("vincent").lastName(CConstants.NAME_LORIENT_LEGOFF).team(lLorientFromDb).dayOfBirth(10).monthOfBirth(CConstants.OCTOBER).yearOfBirth(1989).country(CConstants.FRANCE).positions(lLeGoffPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_LEGOFF).build();
        CPlayerEntity lMazikouLorient = new CPlayerEntity.CPlayerBuilder().firstName("bradley").lastName(CConstants.NAME_LORIENT_MAZIKOU).team(lLorientFromDb).dayOfBirth(2).monthOfBirth(CConstants.JUNE).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMazikouPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_MAZIKOU).build();
        CPlayerEntity lPayeLorient = new CPlayerEntity.CPlayerBuilder().firstName("pape abdou").lastName(CConstants.NAME_LORIENT_PAYE).team(lLorientFromDb).dayOfBirth(31).monthOfBirth(CConstants.MAY).yearOfBirth(1990).country(CConstants.FRANCE).positions(lPayePositionsLorient).picturePath(CConstants.PICTURE_LORIENT_PAYE).build();
        CPlayerEntity lRoseLorient = new CPlayerEntity.CPlayerBuilder().firstName("lindsay").lastName(CConstants.NAME_LORIENT_ROSE).team(lLorientFromDb).dayOfBirth(8).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lRosePositionsLorient).picturePath(CConstants.PICTURE_LORIENT_ROSE).build();
        CPlayerEntity lSelemaniLorient = new CPlayerEntity.CPlayerBuilder().firstName("faiz").lastName(CConstants.NAME_LORIENT_SELEMANI).team(lLorientFromDb).dayOfBirth(14).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1993).country(CConstants.FRANCE).positions(lSelemaniPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_SELEMANI).build();
        CPlayerEntity lToureLorient = new CPlayerEntity.CPlayerBuilder().firstName("zargo").lastName(CConstants.NAME_LORIENT_TOURE).team(lLorientFromDb).dayOfBirth(11).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1989).country(CConstants.SENEGAL).positions(lTourePositionsLorient).picturePath(CConstants.PICTURE_LORIENT_TOURE).build();
        CPlayerEntity lKoffiLorient = new CPlayerEntity.CPlayerBuilder().firstName("").lastName(CConstants.NAME_LORIENT_KOFFI).team(lLorientFromDb).dayOfBirth(1).monthOfBirth(1).yearOfBirth(1980).picturePath(CConstants.PICTURE_LORIENT_KOFFI).country(CConstants.FRANCE).positions(lKoffiPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_KOFFI).build();
        CPlayerEntity lMoreiraLorient = new CPlayerEntity.CPlayerBuilder().firstName("steven").lastName(CConstants.NAME_LORIENT_MOREIRA).team(lLorientFromDb).dayOfBirth(13).monthOfBirth(CConstants.AUGUST).yearOfBirth(1994).country(CConstants.FRANCE).positions(lMoreiraPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_MOREIRA).build();
        CPlayerEntity lCianiLorient = new CPlayerEntity.CPlayerBuilder().firstName("michael").lastName(CConstants.NAME_LORIENT_CIANI).team(lLorientFromDb).dayOfBirth(6).monthOfBirth(CConstants.APRIL).yearOfBirth(1984).country(CConstants.FRANCE).positions(lCianiPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_CIANI).build();

        CPlayerEntity lBarthelmeLorient = new CPlayerEntity.CPlayerBuilder().firstName("maxime").lastName(CConstants.NAME_LORIENT_BARTHELME).team(lLorientFromDb).dayOfBirth(8).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.FRANCE).positions(lBarthelmePositionsLorient).picturePath(CConstants.PICTURE_LORIENT_BARTHELME).build();
        CPlayerEntity lBenKhemisLorient = new CPlayerEntity.CPlayerBuilder().firstName("issam").lastName(CConstants.NAME_LORIENT_BENKHEMIS).team(lLorientFromDb).dayOfBirth(10).monthOfBirth(CConstants.JANUARY).yearOfBirth(1996).country(CConstants.FRANCE).positions(lBenKhemisPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_BENKHEMIS).build();
        CPlayerEntity lCabotLorient = new CPlayerEntity.CPlayerBuilder().firstName("jimmy").lastName(CConstants.NAME_LORIENT_CABOT).team(lLorientFromDb).dayOfBirth(18).monthOfBirth(CConstants.APRIL).yearOfBirth(1994).country(CConstants.FRANCE).positions(lCabotPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_CABOT).build();
        CPlayerEntity lCafuLorient = new CPlayerEntity.CPlayerBuilder().firstName("carlos miguel").lastName(CConstants.NAME_LORIENT_CAFU).team(lLorientFromDb).dayOfBirth(26).monthOfBirth(CConstants.FEBRUARY).yearOfBirth(1993).country(CConstants.PORTUGAL).positions(lCafuPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_CAFU).build();
        CPlayerEntity lMaraLorient = new CPlayerEntity.CPlayerBuilder().firstName("mohamed").lastName(CConstants.NAME_LORIENT_MARA).team(lLorientFromDb).dayOfBirth(12).monthOfBirth(CConstants.DECEMBER).yearOfBirth(1996).country(CConstants.FRANCE).positions(lMaraPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_MARA).build();
        CPlayerEntity lMarveauxLorient = new CPlayerEntity.CPlayerBuilder().firstName("sylvain").lastName(CConstants.NAME_LORIENT_MARVEAUX).team(lLorientFromDb).dayOfBirth(15).monthOfBirth(CConstants.APRIL).yearOfBirth(1986).country(CConstants.FRANCE).positions(lMarveauxPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_MARVEAUX).build();
        CPlayerEntity lMesloubLorient = new CPlayerEntity.CPlayerBuilder().firstName("walid").lastName(CConstants.NAME_LORIENT_MESLOUB).team(lLorientFromDb).dayOfBirth(4).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1985).country(CConstants.FRANCE).positions(lMesloubPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_MESLOUB).build();
        CPlayerEntity lNdongLorient = new CPlayerEntity.CPlayerBuilder().firstName("didier").lastName(CConstants.NAME_LORIENT_NDONG).team(lLorientFromDb).dayOfBirth(17).monthOfBirth(CConstants.JUNE).yearOfBirth(1994).country(CConstants.GABON).positions(lNdongPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_NDONG).build();
        CPlayerEntity lPhilippoteauxLorient = new CPlayerEntity.CPlayerBuilder().firstName("romain").lastName(CConstants.NAME_LORIENT_PHILIPPOTEAUX).team(lLorientFromDb).dayOfBirth(2).monthOfBirth(CConstants.MARCH).yearOfBirth(1988).country(CConstants.FRANCE).positions(lPhilippoteauxPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_PHILIPPOTEAUX).build();
        CPlayerEntity lMvuembaLorient = new CPlayerEntity.CPlayerBuilder().firstName("arnold").lastName(CConstants.NAME_LORIENT_MVUEMBA).team(lLorientFromDb).dayOfBirth(28).monthOfBirth(CConstants.JANUARY).yearOfBirth(1985).country(CConstants.FRANCE).positions(lMvuembaPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_MVUEMBA).build();

        CPlayerEntity lFofanaLorient = new CPlayerEntity.CPlayerBuilder().firstName("moryke").lastName(CConstants.NAME_LORIENT_FOFANA).team(lLorientFromDb).dayOfBirth(23).monthOfBirth(CConstants.NOVEMBER).yearOfBirth(1991).country(CConstants.IVORYCOAST).positions(lFofanaPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_FOFANA).build();
        CPlayerEntity lJeannotLorient = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_LORIENT_JEANNOT).team(lLorientFromDb).dayOfBirth(22).monthOfBirth(CConstants.JANUARY).yearOfBirth(1992).country(CConstants.FRANCE).positions(lJeannotPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_JEANNOT).build();
        CPlayerEntity lMoukandjoLorient = new CPlayerEntity.CPlayerBuilder().firstName("benjamin").lastName(CConstants.NAME_LORIENT_MOUKANDJO).team(lLorientFromDb).dayOfBirth(12).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1988).country(CConstants.CAMEROUN).positions(lMoukandjoPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_MOUKANDJO).build();
        CPlayerEntity lWarisLorient = new CPlayerEntity.CPlayerBuilder().firstName("majeed").lastName(CConstants.NAME_LORIENT_WARIS).team(lLorientFromDb).dayOfBirth(19).monthOfBirth(CConstants.SEPTEMBER).yearOfBirth(1991).country(CConstants.GHANA).positions(lWarisPositionsLorient).picturePath(CConstants.PICTURE_LORIENT_WARIS).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLecomteLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDelecroixLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLamongeLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBellugouLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lConteLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLautoaLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lLeGoffLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMazikouLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPayeLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRoseLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lSelemaniLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lToureLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBarthelmeLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBenKhemisLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCabotLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCafuLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMaraLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMoreiraLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMarveauxLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMesloubLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNdongLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPhilippoteauxLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lFofanaLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lJeannotLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMoukandjoLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lWarisLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lKoffiLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMvuembaLorient);
            lCrudMethods.commitTransaction();
        }

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCianiLorient);
            lCrudMethods.commitTransaction();
        }




    }
}
