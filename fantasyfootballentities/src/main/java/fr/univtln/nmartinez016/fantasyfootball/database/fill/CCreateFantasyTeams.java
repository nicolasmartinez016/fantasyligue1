package fr.univtln.nmartinez016.fantasyfootball.database.fill;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 30/07/2016.
 */
public class CCreateFantasyTeams {

    public static void main(String[] args) {
        CCrudMethods lCrud = new CCrudMethods();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name(CFantasyLeagueEntity.BASE_LEAGUE).build();
        if (lCrud.openTransaction()) {
            lCrud.create(lFantasyLeague);
            lCrud.commitTransaction();
        }/*
        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague2 = lCrud.find(CFantasyLeagueEntity.class, CFantasyLeagueEntity.BASE_LEAGUE);

        lFantasyLeagues.add(lFantasyLeague2);
        CUserEntity lUser = new CUserEntity.CUserBuilder().id("nico").coins(150).fantasyLeagues(lFantasyLeagues).build();
        if (lCrud.openTransaction()){
            lCrud.create(lUser);
            lCrud.commitTransaction();
        }
*//*
        CUserEntity lUser2 = lCrud.find(CUserEntity.class, "nico");
        System.out.println(lUser2.getCurrentFantasyTeam());

        List<CPlayerEntity> lPlayers = (List<CPlayerEntity>) lCrud.findWithNamedQuery(CPlayerEntity.GET_BY_NAME_WITH, CQueryParameter.with(CPlayerEntity.PARAMETER_LASTNAME, "%lac%").parameters());
        CPlayerEntity lPlayer = lPlayers.get(0);

        List<CPositionEntity> lPositions = (List<CPositionEntity>) lCrud.findWithNamedQuery(CPositionEntity.GET_ALL);
        CPositionEntity lStriker = null;
        for (CPositionEntity lPosition : lPositions){
            if (lPosition.getName().equals(CConstants.ST)){
                lStriker = lPosition;
            }
        }
        lUser2.buyPlayer(lPlayer);

        if (lCrud.openTransaction()){
            lCrud.update(lUser2);
            lCrud.commitTransaction();
        }

        CUserEntity lUser3 = lCrud.find(CUserEntity.class, "nico");


        lUser3.putPlayerOnField(lPlayer, lStriker);

        if (lCrud.openTransaction()){
            lCrud.update(lUser3);
            lCrud.commitTransaction();
        }*//*
        List<CPositionEntity> lPositions = (List<CPositionEntity>) lCrud.findWithNamedQuery(CPositionEntity.GET_ALL);
        CPositionEntity lInitialPos = null;
        CPositionEntity lFinalPos = null;
        for (CPositionEntity lPosition : lPositions){
            if (lPosition.getName().equals(CConstants.ST)){
                lInitialPos = lPosition;
            }
            else if (lPosition.getName().equals(CConstants.RW)){
                lFinalPos = lPosition;
            }
        }

        CUserEntity lUser4 = lCrud.find(CUserEntity.class, "nico");
        lUser4.movePlayer(lInitialPos, lFinalPos);
        if (lCrud.openTransaction()){
            lCrud.update(lUser4);
            lCrud.commitTransaction();
        }*/
    }
}
