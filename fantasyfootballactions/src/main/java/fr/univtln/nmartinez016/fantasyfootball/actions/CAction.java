package fr.univtln.nmartinez016.fantasyfootball.actions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.*;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.*;

import java.io.Serializable;

/**
 * Created by marti on 13/10/2016.
 *
 * This is the superclass Action I use for the websocket messages.
 * Every object I send from the client to the server or from the
 * server to the client will be an Action.
 * My CustomEncoder and CustomDecoder implement an encoder/decoder <Action>
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CLoadPlayersAction.class, name = "CLoadPlayersAction"),
        @JsonSubTypes.Type(value = CLoadTeamsAction.class, name = "CLoadTeamsAction"),
        @JsonSubTypes.Type(value = CLoadPlayersByAssists.class, name = "CLoadPlayersByAssists"),
        @JsonSubTypes.Type(value = CLoadPlayersByMinutesPlayed.class, name = "CLoadPlayersByMinutesPlayed"),
        @JsonSubTypes.Type(value = CLoadPlayersByPenaltiesConceded.class, name = "CLoadPlayersByPenaltiesConceded"),
        @JsonSubTypes.Type(value = CLoadPlayersByPenaltiesMissed.class, name = "CLoadPlayersByPenaltiesMissed"),
        @JsonSubTypes.Type(value = CLoadPlayersByPenaltiesProvoked.class, name = "CLoadPlayersByPenaltiesProvoked"),
        @JsonSubTypes.Type(value = CLoadPlayersByPenaltiesSaved.class, name = "CLoadPlayersByPenaltiesSaved"),
        @JsonSubTypes.Type(value = CLoadPlayersBySaves.class, name = "CLoadPlayersBySaves"),
        @JsonSubTypes.Type(value = CLoadPositionsAction.class, name = "CLoadPositionsAction"),
        @JsonSubTypes.Type(value = CPlayersLoadedAction.class, name = "CPlayersLoadedAction"),
        @JsonSubTypes.Type(value = CPlayersLoadedByAssists.class, name = "CPlayersLoadedByAssists"),
        @JsonSubTypes.Type(value = CPlayersLoadedByGoals.class, name = "CPlayersLoadedByGoals"),
        @JsonSubTypes.Type(value = CPlayersLoadedByMinutesPlayed.class, name = "CPlayersLoadedByMinutesPlayed"),
        @JsonSubTypes.Type(value = CPlayersLoadedByPenaltiesConceded.class, name = "CPlayersLoadedByPenaltiesConceded"),
        @JsonSubTypes.Type(value = CPlayersLoadedByPenaltiesMissed.class, name = "CPlayersLoadedByPenaltiesMissed"),
        @JsonSubTypes.Type(value = CPlayersLoadedByPenaltiesProvoked.class, name = "CPlayersLoadedByPenaltiesProvoked"),
        @JsonSubTypes.Type(value = CPlayersLoadedByPenaltiesSaved.class, name = "CPlayersLoadedByPenaltiesSaved"),
        @JsonSubTypes.Type(value = CPlayersLoadedByPenaltiesScored.class, name = "CPlayersLoadedByPenaltiesScored"),
        @JsonSubTypes.Type(value = CPlayersLoadedBySaved.class, name = "CPlayersLoadedBySaved"),
        @JsonSubTypes.Type(value = CPlayersLoadedByPenaltiesSaved.class, name = "CPlayersLoadedByPenaltiesSaved"),
        @JsonSubTypes.Type(value = CPositionsLoadedAction.class, name = "CPositionsLoadedAction"),
        @JsonSubTypes.Type(value = CTeamsLoadedAction.class, name = "CTeamsLoadedAction"),
        @JsonSubTypes.Type(value = CBuyingErrorPlayerTooExpensive.class, name = "CBuyingErrorPlayerTooExpensive"),
        @JsonSubTypes.Type(value = CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive.class, name = "CBuyingErrorTooMuchPlayersAndPlayerTooExpensive"),
        @JsonSubTypes.Type(value = CBuyingErrorTooMuchPlayers.class, name = "CBuyingErrorTooMuchPlayers"),
        @JsonSubTypes.Type(value = CPlayerBoughtAction.class, name = "CPlayerBoughtAction"),
        @JsonSubTypes.Type(value = CPlayerMovedAction.class, name = "CPlayerMovedAction"),
        @JsonSubTypes.Type(value = CPlayerPutOnFieldAction.class, name = "CPlayerPutOnFieldAction"),
        @JsonSubTypes.Type(value = CPutPlayerOnField.class, name = "CPutPlayerOnField"),
        @JsonSubTypes.Type(value = CMovePlayerAction.class, name = "CMovePlayerAction"),
        @JsonSubTypes.Type(value = CConnectionAction.class, name = "CConnectionAction"),
        @JsonSubTypes.Type(value = CConnectedAction.class, name = "CConnectedAction"),
        @JsonSubTypes.Type(value = CBuyPlayerAction.class, name = "CBuyPlayerAction"),
        @JsonSubTypes.Type(value = CPublicFantasyLeaguesLoadedAction.class, name = "CPublicFantasyLeaguesLoadedAction"),
        @JsonSubTypes.Type(value = CLoadPublicFantasyLeaguesAction.class, name = "CLoadPublicFantasyLeaguesAction"),
        @JsonSubTypes.Type(value = CReturnLeagueNameAvailable.class, name = "CReturnLeagueNameAvailable"),
        @JsonSubTypes.Type(value = CCheckLeagueNameAvailability.class, name = "CCheckLeagueNameAvailability"),
        @JsonSubTypes.Type(value = CInvitePlayerInFantasyLeagueAction.class, name = "CInvitePlayerInFantasyLeagueAction"),
        @JsonSubTypes.Type(value = CPlayerInvitedInFantasyLeagueAction.class, name = "CPlayerInvitedInFantasyLeagueAction"),
        @JsonSubTypes.Type(value = CJoinFantasyLeagueAction.class, name = "CJoinFantasyLeagueAction"),
        @JsonSubTypes.Type(value = CFantasyLeagueJoinedAction.class, name = "CFantasyLeagueJoinedAction"),
        @JsonSubTypes.Type(value = CCreateLeagueAction.class, name = "CCreateLeagueAction"),
        @JsonSubTypes.Type(value = CLeagueCreatedAction.class, name = "CLeagueCreatedAction"),
        @JsonSubTypes.Type(value = CSelectFantasyLeagueAction.class, name = "CSelectFantasyLeagueAction"),
        @JsonSubTypes.Type(value = CFantasyLeagueSelectedAction.class, name = "CFantasyLeagueSelectedAction")
}
)
public abstract class CAction implements Serializable {

    public CAction(){}

}
