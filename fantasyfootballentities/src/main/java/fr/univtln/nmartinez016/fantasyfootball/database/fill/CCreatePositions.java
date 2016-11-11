package fr.univtln.nmartinez016.fantasyfootball.database.fill;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;

import java.util.List;

/**
 * Created by marti on 30/07/2016.
 */
public class CCreatePositions {

    public static void main(String[] args) {

        CCrudMethods lCrudMethods = new CCrudMethods();

        CPositionEntity lGK = new CPositionEntity.CPositionBuilder().name(CConstants.GK).gk(100).widthCoef(CConstants.CENTER_WIDTH_COEF).heightCoef(CConstants.GOALKEEPER_HEIGTH_COEF).topSquare(CConstants.DEFENDERS_HEIGTH_COEF).bottomSquare((float)6/7).rightSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_CENTER_WIDTH_COEF).goalkeeper().build();

        CPositionEntity lRb = new CPositionEntity.CPositionBuilder().name(CConstants.RB).rb(100).rwb(90).lb(90).lwb(80).rm(80).lm(70).rw(70).lw(60).cb(50).rcb(60).lcb(50).widthCoef(CConstants.RIGHT_WIDTH_COEF).heightCoef(CConstants.DEFENDERS_HEIGTH_COEF).topSquare(CConstants.DMS_HEIGTH_COEF).bottomSquare(CConstants.GOALKEEPER_HEIGTH_COEF).rightSquare(1).leftSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).defender().build();

        CPositionEntity lLb = new CPositionEntity.CPositionBuilder().name(CConstants.LB).rb(90).rwb(80).lb(100).lwb(90).rm(70).lm(80).rw(60).lw(70).cb(50).rcb(50).lcb(60).widthCoef(CConstants.LEFT_WIDTH_COEF).heightCoef(CConstants.DEFENDERS_HEIGTH_COEF).topSquare(CConstants.DMS_HEIGTH_COEF).bottomSquare(CConstants.GOALKEEPER_HEIGTH_COEF).rightSquare(CConstants.LEFT_CENTER_WIDTH_COEF).defender().leftSquare(0).build();

        CPositionEntity lCb = new CPositionEntity.CPositionBuilder().name(CConstants.CB).cb(100).rcb(100).lcb(100).lb(70).rb(70).cdm(80).rwb(60).lwb(60).widthCoef(CConstants.CENTER_WIDTH_COEF).heightCoef(CConstants.DEFENDERS_HEIGTH_COEF).topSquare(CConstants.DMS_HEIGTH_COEF).bottomSquare(CConstants.GOALKEEPER_HEIGTH_COEF).rightSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_CENTER_WIDTH_COEF).defender().build();

        CPositionEntity lRcb = new CPositionEntity.CPositionBuilder().name(CConstants.RCB).cb(100).rcb(100).lcb(100).lb(70).rb(70).cdm(80).rwb(60).lwb(60).widthCoef(CConstants.RIGHT_CENTER_WIDTH_COEF).heightCoef(CConstants.DEFENDERS_HEIGTH_COEF).topSquare(CConstants.DMS_HEIGTH_COEF).bottomSquare(CConstants.GOALKEEPER_HEIGTH_COEF).rightSquare(CConstants.RIGHT_WIDTH_COEF).leftSquare(CConstants.CENTER_WIDTH_COEF).defender().build();

        CPositionEntity lLcb = new CPositionEntity.CPositionBuilder().name(CConstants.LCB).cb(100).rcb(100).lcb(100).lb(70).rb(70).cdm(80).rwb(60).lwb(60).widthCoef(CConstants.LEFT_CENTER_WIDTH_COEF).heightCoef(CConstants.DEFENDERS_HEIGTH_COEF).topSquare(CConstants.DMS_HEIGTH_COEF).bottomSquare(CConstants.GOALKEEPER_HEIGTH_COEF).rightSquare(CConstants.CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_WIDTH_COEF).defender().build();

        CPositionEntity lRwb = new CPositionEntity.CPositionBuilder().name(CConstants.RWB).rwb(100).rb(90).lb(80).rm(90).rw(80).lwb(90).lm(80).lw(70).widthCoef(CConstants.RIGHT_WIDTH_COEF).heightCoef(CConstants.DMS_HEIGTH_COEF).topSquare(CConstants.CMS_HEIGTH_COEF).bottomSquare(CConstants.DEFENDERS_HEIGTH_COEF).rightSquare(1).leftSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).defender().build();

        CPositionEntity lLwb = new CPositionEntity.CPositionBuilder().name(CConstants.LWB).lwb(100).lb(90).rb(80).lm(90).lw(80).rwb(90).rm(80).rw(70).widthCoef(CConstants.LEFT_WIDTH_COEF).heightCoef(CConstants.DMS_HEIGTH_COEF).topSquare(CConstants.CMS_HEIGTH_COEF).bottomSquare(CConstants.DEFENDERS_HEIGTH_COEF).rightSquare(CConstants.LEFT_CENTER_WIDTH_COEF).leftSquare(0).defender().build();

        CPositionEntity lCdm = new CPositionEntity.CPositionBuilder().name(CConstants.CDM).cdm(100).ldm(100).rdm(100).cm(90).cb(80).rcb(80).lcb(80).lcm(90).rcm(90).cam(80).widthCoef(CConstants.CENTER_WIDTH_COEF).heightCoef(CConstants.DMS_HEIGTH_COEF).topSquare(CConstants.CMS_HEIGTH_COEF).bottomSquare(CConstants.DEFENDERS_HEIGTH_COEF).rightSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_CENTER_WIDTH_COEF).midfielder().build();

        CPositionEntity lLdm = new CPositionEntity.CPositionBuilder().name(CConstants.LDM).ldm(100).cdm(100).rdm(100).cm(90).cb(80).rcb(80).lcb(80).lcm(90).rcm(90).cam(80).widthCoef(CConstants.LEFT_CENTER_WIDTH_COEF).heightCoef(CConstants.DMS_HEIGTH_COEF).topSquare(CConstants.CMS_HEIGTH_COEF).bottomSquare(CConstants.DEFENDERS_HEIGTH_COEF).rightSquare(CConstants.CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_WIDTH_COEF).midfielder().build();

        CPositionEntity lRdm = new CPositionEntity.CPositionBuilder().name(CConstants.RDM).ldm(100).cdm(100).rdm(100).cm(90).cb(80).rcb(80).lcb(80).lcm(90).rcm(90).cam(80).widthCoef(CConstants.RIGHT_CENTER_WIDTH_COEF).heightCoef(CConstants.DMS_HEIGTH_COEF).topSquare(CConstants.CMS_HEIGTH_COEF).bottomSquare(CConstants.DEFENDERS_HEIGTH_COEF).rightSquare(CConstants.RIGHT_WIDTH_COEF).leftSquare(CConstants.CENTER_WIDTH_COEF).midfielder().build();

        CPositionEntity lCm = new CPositionEntity.CPositionBuilder().name(CConstants.CM).ldm(90).cdm(90).rdm(90).cm(100).lcm(100).rcm(100).cam(90).lm(90).rm(90).lam(70).ram(70).widthCoef(CConstants.CENTER_WIDTH_COEF).heightCoef(CConstants.CMS_HEIGTH_COEF).topSquare(CConstants.AMS_HEIGTH_COEF).bottomSquare(CConstants.DMS_HEIGTH_COEF).rightSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_CENTER_WIDTH_COEF).midfielder().build();

        CPositionEntity lLcm = new CPositionEntity.CPositionBuilder().name(CConstants.LCM).ldm(90).cdm(90).rdm(90).cm(100).lcm(100).rcm(100).cam(90).lm(90).rm(90).lam(70).ram(70).widthCoef(CConstants.LEFT_CENTER_WIDTH_COEF).heightCoef(CConstants.CMS_HEIGTH_COEF).topSquare(CConstants.AMS_HEIGTH_COEF).bottomSquare(CConstants.DMS_HEIGTH_COEF).rightSquare(CConstants.CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_WIDTH_COEF).midfielder().build();

        CPositionEntity lRcm = new CPositionEntity.CPositionBuilder().name(CConstants.RCM).ldm(90).cdm(90).rdm(90).cm(100).lcm(100).rcm(100).cam(90).lm(90).rm(90).lam(70).ram(70).widthCoef(CConstants.RIGHT_CENTER_WIDTH_COEF).heightCoef(CConstants.CMS_HEIGTH_COEF).topSquare(CConstants.AMS_HEIGTH_COEF).bottomSquare(CConstants.DMS_HEIGTH_COEF).rightSquare(CConstants.RIGHT_WIDTH_COEF).leftSquare(CConstants.CENTER_WIDTH_COEF).midfielder().build();

        CPositionEntity lLm = new CPositionEntity.CPositionBuilder().name(CConstants.LM).lm(100).lwb(80).lb(70).lam(90).lw(80).rm(90).rwb(70).rb(60).ram(80).rw(70).widthCoef(CConstants.LEFT_WIDTH_COEF).heightCoef(CConstants.CMS_HEIGTH_COEF).topSquare(CConstants.AMS_HEIGTH_COEF).bottomSquare(CConstants.DMS_HEIGTH_COEF).rightSquare(CConstants.LEFT_CENTER_WIDTH_COEF).leftSquare(0).midfielder().build();

        CPositionEntity lRm = new CPositionEntity.CPositionBuilder().name(CConstants.RM).rm(100).rwb(80).rb(70).ram(90).rw(80).lm(90).lwb(70).lb(60).lam(80).lw(70).widthCoef(CConstants.RIGHT_WIDTH_COEF).heightCoef(CConstants.CMS_HEIGTH_COEF).topSquare(CConstants.AMS_HEIGTH_COEF).bottomSquare(CConstants.DMS_HEIGTH_COEF).rightSquare(1).leftSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).midfielder().build();

        CPositionEntity lCam = new CPositionEntity.CPositionBuilder().name(CConstants.CAM).cam(100).cm(90).rcm(90).lcm(90).ram(90).lam(90).lm(80).rm(80).widthCoef(CConstants.CENTER_WIDTH_COEF).heightCoef(CConstants.AMS_HEIGTH_COEF).topSquare(CConstants.FORWARDS_HEIGTH_COEF).bottomSquare(CConstants.CMS_HEIGTH_COEF).rightSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_CENTER_WIDTH_COEF).midfielder().build();

        CPositionEntity lLam = new CPositionEntity.CPositionBuilder().name(CConstants.LAM).lam(100).lw(90).lm(90).cam(90).ram(90).rw(80).rm(80).widthCoef(CConstants.LEFT_CENTER_WIDTH_COEF).heightCoef(CConstants.AMS_HEIGTH_COEF).topSquare(CConstants.FORWARDS_HEIGTH_COEF).bottomSquare(CConstants.CMS_HEIGTH_COEF).rightSquare(CConstants.CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_WIDTH_COEF).midfielder().build();

        CPositionEntity lRam = new CPositionEntity.CPositionBuilder().name(CConstants.RAM).ram(100).rw(90).rm(90).cam(90).lam(90).lw(80).lm(80).widthCoef(CConstants.RIGHT_CENTER_WIDTH_COEF).heightCoef(CConstants.AMS_HEIGTH_COEF).topSquare(CConstants.FORWARDS_HEIGTH_COEF).bottomSquare(CConstants.CMS_HEIGTH_COEF).rightSquare(CConstants.RIGHT_WIDTH_COEF).leftSquare(CConstants.CENTER_WIDTH_COEF).midfielder().build();

        CPositionEntity lRw = new CPositionEntity.CPositionBuilder().name(CConstants.RW).rw(100).lw(90).st(80).lst(80).rst(80).ram(90).lam(80).lm(70).rm(80).widthCoef(CConstants.RIGHT_WIDTH_COEF).heightCoef(CConstants.FORWARDS_HEIGTH_COEF).topSquare(0).bottomSquare(CConstants.AMS_HEIGTH_COEF).rightSquare(1).leftSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).forward().build();

        CPositionEntity lLw = new CPositionEntity.CPositionBuilder().name(CConstants.LW).lw(100).rw(90).st(80).lst(80).rst(80).lam(90).ram(80).rm(70).lm(80).widthCoef(CConstants.LEFT_WIDTH_COEF).heightCoef(CConstants.FORWARDS_HEIGTH_COEF).topSquare(0).bottomSquare(CConstants.AMS_HEIGTH_COEF).rightSquare(CConstants.LEFT_CENTER_WIDTH_COEF).leftSquare(0).forward().build();

        //CPositionEntity lF9 = new CPositionEntity.CPositionBuilder().name(CConstants.F9).f9(100).st(90).rst(90).lst(90).cam(90).lam(90).ram(90).lw(90).rw(90).widthCoef(2).heightCoef(9/10).build();

        CPositionEntity lRst = new CPositionEntity.CPositionBuilder().name(CConstants.RST).st(100).rst(100).lst(100).rw(80).lw(80).widthCoef(CConstants.RIGHT_CENTER_WIDTH_COEF).heightCoef(CConstants.FORWARDS_HEIGTH_COEF).topSquare(0).bottomSquare(CConstants.AMS_HEIGTH_COEF).rightSquare(CConstants.RIGHT_WIDTH_COEF).leftSquare(CConstants.CENTER_WIDTH_COEF).forward().build();

        CPositionEntity lLst = new CPositionEntity.CPositionBuilder().name(CConstants.LST).st(100).rst(100).lst(100).rw(80).lw(80).widthCoef(CConstants.LEFT_CENTER_WIDTH_COEF).heightCoef(CConstants.FORWARDS_HEIGTH_COEF).topSquare(0).bottomSquare(CConstants.AMS_HEIGTH_COEF).rightSquare(CConstants.CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_WIDTH_COEF).forward().build();

        CPositionEntity lSt = new CPositionEntity.CPositionBuilder().name(CConstants.ST).st(100).rst(100).lst(100).rw(80).lw(80).widthCoef(CConstants.CENTER_WIDTH_COEF).heightCoef(CConstants.FORWARDS_HEIGTH_COEF).topSquare(0).bottomSquare(CConstants.AMS_HEIGTH_COEF).rightSquare(CConstants.RIGHT_CENTER_WIDTH_COEF).leftSquare(CConstants.LEFT_CENTER_WIDTH_COEF).forward().build();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lGK);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLb);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRb);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lCb);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRcb);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLcb);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLwb);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRwb);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lCdm);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRdm);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLdm);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lCm);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLcm);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRcm);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLm);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRm);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lCam);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRam);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLam);
        lCrudMethods.commitTransaction();


        lCrudMethods.openTransaction();
        lCrudMethods.create(lLw);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRw);
        lCrudMethods.commitTransaction();
/*
        lCrudMethods.openTransaction();
        lCrudMethods.create(lF9);
        lCrudMethods.commitTransaction();
*/
        lCrudMethods.openTransaction();
        lCrudMethods.create(lLst);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRst);
        lCrudMethods.commitTransaction();

        lCrudMethods.openTransaction();
        lCrudMethods.create(lSt);
        lCrudMethods.commitTransaction();


        System.out.println(lCrudMethods.find(CPositionEntity.class, CConstants.ST).getName());



    }



}

