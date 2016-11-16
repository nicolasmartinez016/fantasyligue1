package nmartinez016.univtln.fr.fantasyfootball;

import android.util.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CYourPlayerEntry;

/**
 * Created by marti on 27/08/2016.
 */
public class CStaticVariables {

    private static CUserEntity mUser;

    private static CFantasyLeagueEntity mFantasyLeagueToShowDetails;

    private static List<CPositionEntity> mPositions;

    public static CUserEntity getUser(){
        return mUser;
    }

    public static void setUser(CUserEntity pUser){
        mUser = pUser;
    }

    public static List<CPositionEntity> getPositions(){
        return mPositions;
    }

    public static void setPositions(List<CPositionEntity> pPositions){
        mPositions = pPositions;
    }

    public static CPlayerEntity getPlayerByPosition(CPositionEntity pPosition){
        for (CYourPlayerEntry lPlayerEntry : mUser.getCurrentFantasyTeam().getYourPlayerEntries()){

            if (lPlayerEntry.getPosition() != null){
                if (lPlayerEntry.getPosition().equals(pPosition)){
                    return lPlayerEntry.getPlayer();
                }
            }

        }
        return null;
    }

    public static CPositionEntity findPosition(float pX, float pY, float pScreenWidth, float pScreenHeigth){
        float lTop = 0;
        float lBottom = 0;
        float lRight = 0;
        float lLeft = 0;
        float lCenterX = 0;
        float lCenterY = 0;
        float lXOffset = 0;
        float lYOffset = 0;
        float lCurrentMinOffset = 2000;
        CPositionEntity lCurrentPosition = null;
        for (CPositionEntity lPosition : mPositions){
            lTop = lPosition.getTopSquareHeigth(pScreenHeigth);
            lBottom = lPosition.getBottomSquareHeigth(pScreenHeigth);
            lRight = lPosition.getRightSquareWidth(pScreenWidth);
            lLeft = lPosition.getLeftSquareWidth(pScreenWidth);
            lCenterX = (lRight + lLeft) / 2;
            lCenterY = (lBottom + lTop) / 2;
            lXOffset = Math.abs(lCenterX - pX);
            lYOffset = Math.abs(lCenterY - pY);
            if (lXOffset + lYOffset < lCurrentMinOffset){
                lCurrentMinOffset = lXOffset + lYOffset;
                lCurrentPosition = lPosition;
            }
        }
        return lCurrentPosition;
    }

    public static CFantasyLeagueEntity getFantasyLeagueToShowDetails(){
        return mFantasyLeagueToShowDetails;
    }

    public static void setFantasyLeagueToShowDetails(CFantasyLeagueEntity pFantasyLeague){
        mFantasyLeagueToShowDetails = pFantasyLeague;
    }
}
