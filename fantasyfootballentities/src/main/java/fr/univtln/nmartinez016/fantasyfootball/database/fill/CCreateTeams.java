package fr.univtln.nmartinez016.fantasyfootball.database.fill;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;

/**
 * Created by marti on 30/07/2016.
 */
public class CCreateTeams {

    public static void main(String[] args) {

        CCrudMethods lCrudMethods = new CCrudMethods();

        CTeamEntity lNoTeam = new CTeamEntity.CTeamBuilder().name(CConstants.UNDEFINED).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_UNDEFINED).build();

        CTeamEntity lFcNantes = new CTeamEntity.CTeamBuilder().name(CConstants.NANTES).jerseyPath(CConstants.JERSEY_NANTES).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_NANTES).build();

        CTeamEntity lOm = new CTeamEntity.CTeamBuilder().name(CConstants.OM).jerseyPath(CConstants.JERSEY_OM).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_OM).build();

        CTeamEntity lPsg = new CTeamEntity.CTeamBuilder().name(CConstants.PSG).jerseyPath(CConstants.JERSEY_PSG).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_PSG).build();

        CTeamEntity lOl = new CTeamEntity.CTeamBuilder().name(CConstants.OL).jerseyPath(CConstants.JERSEY_OL).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_OL).build();

        CTeamEntity lBordeaux = new CTeamEntity.CTeamBuilder().name(CConstants.BORDEAUX).jerseyPath(CConstants.JERSEY_BDX).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_BORDEAUX).build();

        CTeamEntity lNice = new CTeamEntity.CTeamBuilder().name(CConstants.NICE).jerseyPath(CConstants.JERSEY_NICE).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_NICE).build();

        CTeamEntity lRennes = new CTeamEntity.CTeamBuilder().name(CConstants.RENNES).jerseyPath(CConstants.JERSEY_RENNES).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_RENNES).build();

        CTeamEntity lAsm = new CTeamEntity.CTeamBuilder().name(CConstants.MONACO).jerseyPath(CConstants.JERSEY_MONACO).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_MONACO).build();

        CTeamEntity lLosc = new CTeamEntity.CTeamBuilder().name(CConstants.LOSC).jerseyPath(CConstants.JERSEY_LOSC).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_LOSC).build();

        CTeamEntity lDijon = new CTeamEntity.CTeamBuilder().name(CConstants.DIJON).jerseyPath(CConstants.JERSEY_DIJON).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_DIJON).build();

        CTeamEntity lNancy = new CTeamEntity.CTeamBuilder().name(CConstants.NANCY).jerseyPath(CConstants.JERSEY_NANCY).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_NANCY).build();

        CTeamEntity lToulouse = new CTeamEntity.CTeamBuilder().name(CConstants.TOULOUSE).jerseyPath(CConstants.JERSEY_TOULOUSE).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_TOULOUSE).build();

        CTeamEntity lBastia = new CTeamEntity.CTeamBuilder().name(CConstants.BASTIA).jerseyPath(CConstants.JERSEY_BASTIA).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_BASTIA).build();

        CTeamEntity lMetz = new CTeamEntity.CTeamBuilder().name(CConstants.METZ).jerseyPath(CConstants.JERSEY_METZ).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_METZ).build();

        CTeamEntity lAngers = new CTeamEntity.CTeamBuilder().name(CConstants.ANGERS).jerseyPath(CConstants.JERSEY_ANGERS).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_ANGERS).build();

        CTeamEntity lCaen = new CTeamEntity.CTeamBuilder().name(CConstants.CAEN).jerseyPath(CConstants.JERSEY_CAEN).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_CAEN).build();

        CTeamEntity lGuingamp = new CTeamEntity.CTeamBuilder().name(CConstants.GUINGAMP).jerseyPath(CConstants.JERSEY_GUINGAMP).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_EAG).build();

        CTeamEntity lLorient = new CTeamEntity.CTeamBuilder().name(CConstants.LORIENT).jerseyPath(CConstants.JERSEY_LORIENT).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_LORIENT).build();

        CTeamEntity lAsse = new CTeamEntity.CTeamBuilder().name(CConstants.ASSE).jerseyPath(CConstants.JERSEY_ASSE).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_ASSE).build();

        CTeamEntity lMontpellier = new CTeamEntity.CTeamBuilder().name(CConstants.MHSC).jerseyPath(CConstants.JERSEY_MHSC).league(CConstants.LIGUE_1).logoPath(CConstants.LOGO_MHSC).build();


        lCrudMethods.openTransaction();
        lCrudMethods.create(lNoTeam);
        lCrudMethods.commitTransaction();
        System.out.println("undefined ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lFcNantes);
        lCrudMethods.commitTransaction();
        System.out.println("nantes ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lOm);
        lCrudMethods.commitTransaction();
        System.out.println("om ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lPsg);
        lCrudMethods.commitTransaction();
        System.out.println("psg ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lAsm);
        lCrudMethods.commitTransaction();
        System.out.println("asm ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLosc);
        lCrudMethods.commitTransaction();
        System.out.println("losc ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lBordeaux);
        lCrudMethods.commitTransaction();
        System.out.println("bdx ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lRennes);
        lCrudMethods.commitTransaction();
        System.out.println("rennes ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lLorient);
        lCrudMethods.commitTransaction();
        System.out.println("lorient ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lAsse);
        lCrudMethods.commitTransaction();
        System.out.println("sainté ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lGuingamp);
        lCrudMethods.commitTransaction();
        System.out.println("eag ok");

        lCrudMethods.openTransaction();
        lOm = lCrudMethods.create(lOl);
        lCrudMethods.commitTransaction();
        System.out.println("ol ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lToulouse);
        lCrudMethods.commitTransaction();
        System.out.println("tefece ok");


        lCrudMethods.openTransaction();
        lCrudMethods.create(lNice);
        lCrudMethods.commitTransaction();
        System.out.println("nice ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lMontpellier);
        lCrudMethods.commitTransaction();
        System.out.println("mhsc ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lDijon);
        lCrudMethods.commitTransaction();
        System.out.println("dijon ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lNancy);
        lCrudMethods.commitTransaction();
        System.out.println("nancy ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lBastia);
        lCrudMethods.commitTransaction();
        System.out.println("bastia ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lAngers);
        lCrudMethods.commitTransaction();
        System.out.println("angers ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lMetz);
        lCrudMethods.commitTransaction();
        System.out.println("metz ok");

        lCrudMethods.openTransaction();
        lCrudMethods.create(lCaen);
        lCrudMethods.commitTransaction();
        System.out.println("caen ok");
    }
}
