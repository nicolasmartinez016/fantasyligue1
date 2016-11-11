CREATE TABLE fantasyfootball.CPLAYERENTITY (MID INTEGER NOT NULL, MCOUNTRY VARCHAR(255), MDAYOFBIRTH INTEGER, MFIRSTNAME VARCHAR(255), MLASTNAME VARCHAR(255), MMONTHOFBIRTH INTEGER, MPICTUREPATH VARCHAR(255), MTOTWAPPEARANCES INTEGER, MVALUE INTEGER, MYEAROFBIRTH INTEGER, MOWNER_MID VARCHAR(255), MTEAM_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CTEAMENTITY (MID INTEGER NOT NULL, MCONCEIDEDGOALS INTEGER, MDRAWS INTEGER, MJERSEYPATH VARCHAR(255), MLEAGUE VARCHAR(255), MLOGOPATH VARCHAR(255), MLOSSES INTEGER, MNAME VARCHAR(255), MPLAYEDGAMES INTEGER, MSCOREDGOALS INTEGER, MWINS INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CGAMEENTITY (MID INTEGER NOT NULL, MAWAYSCORE INTEGER, MHOMESCORE INTEGER, MWEEK INTEGER, MAWAYTEAM_MID INTEGER, MHOMETEAM_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CUSERENTITY (MID VARCHAR(255) NOT NULL, MCOINS INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CYOURPLAYERENTRY (MID INTEGER NOT NULL, MPLAYER_MID INTEGER, MPOSITION_MNAME VARCHAR(255), PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CFANTASYTEAMENTITY (MID INTEGER NOT NULL, MSELECTED BOOLEAN, MFANTASYLEAGUE_MNAME VARCHAR(255), MUSER_MID VARCHAR(255), PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CPOSITIONENTITY (MNAME VARCHAR(255) NOT NULL, MBOTTOMSQUARE FLOAT, MCAM INTEGER, MCB INTEGER, MCDM INTEGER, MCM INTEGER, MDEFENDER BOOLEAN, MFORWARD BOOLEAN, MGK INTEGER, MGOALKEEPER BOOLEAN, MHEIGHTCOEF FLOAT, MLAM INTEGER, MLB INTEGER, MLCB INTEGER, MLCM INTEGER, MLDM INTEGER, MLEFTSQUARE FLOAT, MLM INTEGER, MLST INTEGER, MLW INTEGER, MLWB INTEGER, MMIDFIELDER BOOLEAN, MRAM INTEGER, MRB INTEGER, MRCB INTEGER, MRCM INTEGER, MRDM INTEGER, MRIGHTSQUARE FLOAT, MRM INTEGER, MRST INTEGER, MRW INTEGER, MRWB INTEGER, MST INTEGER, MTOPSQUARE FLOAT, MWIDTHCOEF FLOAT, PRIMARY KEY (MNAME))
CREATE TABLE fantasyfootball.CGOALSBYGAME (MID INTEGER NOT NULL, MMINUTE INTEGER, MQUANTITY INTEGER, MPLAYER_MID INTEGER, MGAME_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CPLAYERBYGAME (MID INTEGER NOT NULL, MENDMINUTE INTEGER, MSTARTMINUTE INTEGER, MPLAYER_MID INTEGER, MGAME_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CASSISTBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MPLAYER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CYELLOWCARDBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MPLAYER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CREDCARDBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MPLAYER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CTOTWENTITY (MWEEK INTEGER NOT NULL, PRIMARY KEY (MWEEK))
CREATE TABLE fantasyfootball.CTOTWPLAYERENTITY (MID INTEGER NOT NULL, MPLAYER_MID INTEGER, MPOSITION_MNAME VARCHAR(255), PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CPOINTSBYWEEK (MID INTEGER NOT NULL, MPOINTS INTEGER, MWEEK INTEGER, MPLAYER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CPENALTYCONCEDEDBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MFOULER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CPENALTYPROVOKEDBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MPROVOKER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CPENALTYSCOREDBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MSHOOTER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CPENALTYMISSEDBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MSHOOTER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CSAVEBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MPLAYER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CPENALTYSAVEDBYGAME (MID INTEGER NOT NULL, MQUANTITY INTEGER, MPLAYER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.COWNGOALBYGAME (MID INTEGER NOT NULL, MMINUTE INTEGER, MQUANTITY INTEGER, MPLAYER_MID INTEGER, PRIMARY KEY (MID))
CREATE TABLE fantasyfootball.CFANTASYLEAGUEENTITY (MNAME VARCHAR(255) NOT NULL, PRIMARY KEY (MNAME))
CREATE TABLE fantasyfootball.CPLAYERENTITY_CGAMEENTITY (CPlayerEntity_MID INTEGER NOT NULL, mGames_MID INTEGER NOT NULL, PRIMARY KEY (CPlayerEntity_MID, mGames_MID))
CREATE TABLE fantasyfootball.CPLAYERENTITY_CPOSITIONENTITY (CPlayerEntity_MID INTEGER NOT NULL, mPositions_MNAME VARCHAR(255) NOT NULL, PRIMARY KEY (CPlayerEntity_MID, mPositions_MNAME))
CREATE TABLE fantasyfootball.CGAMEENTITY_CASSISTBYGAME (CGameEntity_MID INTEGER NOT NULL, mAssisters_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mAssisters_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_COWNGOALBYGAME (CGameEntity_MID INTEGER NOT NULL, mOwnGoals_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mOwnGoals_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CPENALTYCONCEDEDBYGAME (CGameEntity_MID INTEGER NOT NULL, mPenaltiesConceded_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mPenaltiesConceded_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CPENALTYMISSEDBYGAME (CGameEntity_MID INTEGER NOT NULL, mPenaltiesMissed_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mPenaltiesMissed_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CPENALTYPROVOKEDBYGAME (CGameEntity_MID INTEGER NOT NULL, mPenaltiesProvoked_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mPenaltiesProvoked_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CPENALTYSAVEDBYGAME (CGameEntity_MID INTEGER NOT NULL, mPenaltiesSaved_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mPenaltiesSaved_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CPENALTYSCOREDBYGAME (CGameEntity_MID INTEGER NOT NULL, mPenaltiesScored_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mPenaltiesScored_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CPLAYERBYGAME (CGameEntity_MID INTEGER NOT NULL, mPlayers_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mPlayers_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CPOINTSBYWEEK (CGameEntity_MID INTEGER NOT NULL, mPointsByWeek_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mPointsByWeek_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CREDCARDBYGAME (CGameEntity_MID INTEGER NOT NULL, mRedCards_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mRedCards_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CSAVEBYGAME (CGameEntity_MID INTEGER NOT NULL, mSaves_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mSaves_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CGOALSBYGAME (CGameEntity_MID INTEGER NOT NULL, mScorers_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mScorers_MID))
CREATE TABLE fantasyfootball.CGAMEENTITY_CYELLOWCARDBYGAME (CGameEntity_MID INTEGER NOT NULL, mYellowCards_MID INTEGER NOT NULL, PRIMARY KEY (CGameEntity_MID, mYellowCards_MID))
CREATE TABLE fantasyfootball.CUSERENTITY_CFANTASYLEAGUEENTITY (CUserEntity_MID VARCHAR(255) NOT NULL, mFantasyLeagues_MNAME VARCHAR(255) NOT NULL, PRIMARY KEY (CUserEntity_MID, mFantasyLeagues_MNAME))
CREATE TABLE fantasyfootball.CFANTASYTEAMENTITY_CYOURPLAYERENTRY (CFantasyTeamEntity_MID INTEGER NOT NULL, mYourPlayerEntries_MID INTEGER NOT NULL, PRIMARY KEY (CFantasyTeamEntity_MID, mYourPlayerEntries_MID))
CREATE TABLE fantasyfootball.CTOTWENTITY_CTOTWPLAYERENTITY (CTotwEntity_MWEEK INTEGER NOT NULL, mTotwPlayers_MID INTEGER NOT NULL, PRIMARY KEY (CTotwEntity_MWEEK, mTotwPlayers_MID))
ALTER TABLE fantasyfootball.CPLAYERENTITY ADD CONSTRAINT FK_CPLAYERENTITY_MOWNER_MID FOREIGN KEY (MOWNER_MID) REFERENCES fantasyfootball.CUSERENTITY (MID)
ALTER TABLE fantasyfootball.CPLAYERENTITY ADD CONSTRAINT FK_CPLAYERENTITY_MTEAM_MID FOREIGN KEY (MTEAM_MID) REFERENCES fantasyfootball.CTEAMENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY ADD CONSTRAINT FK_CGAMEENTITY_MAWAYTEAM_MID FOREIGN KEY (MAWAYTEAM_MID) REFERENCES fantasyfootball.CTEAMENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY ADD CONSTRAINT FK_CGAMEENTITY_MHOMETEAM_MID FOREIGN KEY (MHOMETEAM_MID) REFERENCES fantasyfootball.CTEAMENTITY (MID)
ALTER TABLE fantasyfootball.CYOURPLAYERENTRY ADD CONSTRAINT FK_CYOURPLAYERENTRY_MPOSITION_MNAME FOREIGN KEY (MPOSITION_MNAME) REFERENCES fantasyfootball.CPOSITIONENTITY (MNAME)
ALTER TABLE fantasyfootball.CYOURPLAYERENTRY ADD CONSTRAINT FK_CYOURPLAYERENTRY_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CFANTASYTEAMENTITY ADD CONSTRAINT FK_CFANTASYTEAMENTITY_MUSER_MID FOREIGN KEY (MUSER_MID) REFERENCES fantasyfootball.CUSERENTITY (MID)
ALTER TABLE fantasyfootball.CFANTASYTEAMENTITY ADD CONSTRAINT FK_CFANTASYTEAMENTITY_MFANTASYLEAGUE_MNAME FOREIGN KEY (MFANTASYLEAGUE_MNAME) REFERENCES fantasyfootball.CFANTASYLEAGUEENTITY (MNAME)
ALTER TABLE fantasyfootball.CGOALSBYGAME ADD CONSTRAINT FK_CGOALSBYGAME_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CGOALSBYGAME ADD CONSTRAINT FK_CGOALSBYGAME_MGAME_MID FOREIGN KEY (MGAME_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CPLAYERBYGAME ADD CONSTRAINT FK_CPLAYERBYGAME_MGAME_MID FOREIGN KEY (MGAME_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CPLAYERBYGAME ADD CONSTRAINT FK_CPLAYERBYGAME_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CASSISTBYGAME ADD CONSTRAINT FK_CASSISTBYGAME_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CYELLOWCARDBYGAME ADD CONSTRAINT FK_CYELLOWCARDBYGAME_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CREDCARDBYGAME ADD CONSTRAINT FK_CREDCARDBYGAME_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CTOTWPLAYERENTITY ADD CONSTRAINT FK_CTOTWPLAYERENTITY_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CTOTWPLAYERENTITY ADD CONSTRAINT FK_CTOTWPLAYERENTITY_MPOSITION_MNAME FOREIGN KEY (MPOSITION_MNAME) REFERENCES fantasyfootball.CPOSITIONENTITY (MNAME)
ALTER TABLE fantasyfootball.CPOINTSBYWEEK ADD CONSTRAINT FK_CPOINTSBYWEEK_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CPENALTYCONCEDEDBYGAME ADD CONSTRAINT FK_CPENALTYCONCEDEDBYGAME_MFOULER_MID FOREIGN KEY (MFOULER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CPENALTYPROVOKEDBYGAME ADD CONSTRAINT FK_CPENALTYPROVOKEDBYGAME_MPROVOKER_MID FOREIGN KEY (MPROVOKER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CPENALTYSCOREDBYGAME ADD CONSTRAINT FK_CPENALTYSCOREDBYGAME_MSHOOTER_MID FOREIGN KEY (MSHOOTER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CPENALTYMISSEDBYGAME ADD CONSTRAINT FK_CPENALTYMISSEDBYGAME_MSHOOTER_MID FOREIGN KEY (MSHOOTER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CSAVEBYGAME ADD CONSTRAINT FK_CSAVEBYGAME_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CPENALTYSAVEDBYGAME ADD CONSTRAINT FK_CPENALTYSAVEDBYGAME_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.COWNGOALBYGAME ADD CONSTRAINT FK_COWNGOALBYGAME_MPLAYER_MID FOREIGN KEY (MPLAYER_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CPLAYERENTITY_CGAMEENTITY ADD CONSTRAINT FK_CPLAYERENTITY_CGAMEENTITY_mGames_MID FOREIGN KEY (mGames_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CPLAYERENTITY_CGAMEENTITY ADD CONSTRAINT FK_CPLAYERENTITY_CGAMEENTITY_CPlayerEntity_MID FOREIGN KEY (CPlayerEntity_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CPLAYERENTITY_CPOSITIONENTITY ADD CONSTRAINT FK_CPLAYERENTITY_CPOSITIONENTITY_mPositions_MNAME FOREIGN KEY (mPositions_MNAME) REFERENCES fantasyfootball.CPOSITIONENTITY (MNAME)
ALTER TABLE fantasyfootball.CPLAYERENTITY_CPOSITIONENTITY ADD CONSTRAINT FK_CPLAYERENTITY_CPOSITIONENTITY_CPlayerEntity_MID FOREIGN KEY (CPlayerEntity_MID) REFERENCES fantasyfootball.CPLAYERENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CASSISTBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CASSISTBYGAME_mAssisters_MID FOREIGN KEY (mAssisters_MID) REFERENCES fantasyfootball.CASSISTBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CASSISTBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CASSISTBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_COWNGOALBYGAME ADD CONSTRAINT FK_CGAMEENTITY_COWNGOALBYGAME_mOwnGoals_MID FOREIGN KEY (mOwnGoals_MID) REFERENCES fantasyfootball.COWNGOALBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_COWNGOALBYGAME ADD CONSTRAINT FK_CGAMEENTITY_COWNGOALBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYCONCEDEDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYCONCEDEDBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYCONCEDEDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYCONCEDEDBYGAME_mPenaltiesConceded_MID FOREIGN KEY (mPenaltiesConceded_MID) REFERENCES fantasyfootball.CPENALTYCONCEDEDBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYMISSEDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYMISSEDBYGAME_mPenaltiesMissed_MID FOREIGN KEY (mPenaltiesMissed_MID) REFERENCES fantasyfootball.CPENALTYMISSEDBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYMISSEDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYMISSEDBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYPROVOKEDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYPROVOKEDBYGAME_mPenaltiesProvoked_MID FOREIGN KEY (mPenaltiesProvoked_MID) REFERENCES fantasyfootball.CPENALTYPROVOKEDBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYPROVOKEDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYPROVOKEDBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYSAVEDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYSAVEDBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYSAVEDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYSAVEDBYGAME_mPenaltiesSaved_MID FOREIGN KEY (mPenaltiesSaved_MID) REFERENCES fantasyfootball.CPENALTYSAVEDBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYSCOREDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYSCOREDBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPENALTYSCOREDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPENALTYSCOREDBYGAME_mPenaltiesScored_MID FOREIGN KEY (mPenaltiesScored_MID) REFERENCES fantasyfootball.CPENALTYSCOREDBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPLAYERBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPLAYERBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPLAYERBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CPLAYERBYGAME_mPlayers_MID FOREIGN KEY (mPlayers_MID) REFERENCES fantasyfootball.CPLAYERBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPOINTSBYWEEK ADD CONSTRAINT FK_CGAMEENTITY_CPOINTSBYWEEK_mPointsByWeek_MID FOREIGN KEY (mPointsByWeek_MID) REFERENCES fantasyfootball.CPOINTSBYWEEK (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CPOINTSBYWEEK ADD CONSTRAINT FK_CGAMEENTITY_CPOINTSBYWEEK_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CREDCARDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CREDCARDBYGAME_mRedCards_MID FOREIGN KEY (mRedCards_MID) REFERENCES fantasyfootball.CREDCARDBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CREDCARDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CREDCARDBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CSAVEBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CSAVEBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CSAVEBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CSAVEBYGAME_mSaves_MID FOREIGN KEY (mSaves_MID) REFERENCES fantasyfootball.CSAVEBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CGOALSBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CGOALSBYGAME_mScorers_MID FOREIGN KEY (mScorers_MID) REFERENCES fantasyfootball.CGOALSBYGAME (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CGOALSBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CGOALSBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CYELLOWCARDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CYELLOWCARDBYGAME_CGameEntity_MID FOREIGN KEY (CGameEntity_MID) REFERENCES fantasyfootball.CGAMEENTITY (MID)
ALTER TABLE fantasyfootball.CGAMEENTITY_CYELLOWCARDBYGAME ADD CONSTRAINT FK_CGAMEENTITY_CYELLOWCARDBYGAME_mYellowCards_MID FOREIGN KEY (mYellowCards_MID) REFERENCES fantasyfootball.CYELLOWCARDBYGAME (MID)
ALTER TABLE fantasyfootball.CUSERENTITY_CFANTASYLEAGUEENTITY ADD CONSTRAINT FK_CUSERENTITY_CFANTASYLEAGUEENTITY_mFantasyLeagues_MNAME FOREIGN KEY (mFantasyLeagues_MNAME) REFERENCES fantasyfootball.CFANTASYLEAGUEENTITY (MNAME)
ALTER TABLE fantasyfootball.CUSERENTITY_CFANTASYLEAGUEENTITY ADD CONSTRAINT FK_CUSERENTITY_CFANTASYLEAGUEENTITY_CUserEntity_MID FOREIGN KEY (CUserEntity_MID) REFERENCES fantasyfootball.CUSERENTITY (MID)
ALTER TABLE fantasyfootball.CFANTASYTEAMENTITY_CYOURPLAYERENTRY ADD CONSTRAINT FK_CFANTASYTEAMENTITY_CYOURPLAYERENTRY_mYourPlayerEntries_MID FOREIGN KEY (mYourPlayerEntries_MID) REFERENCES fantasyfootball.CYOURPLAYERENTRY (MID)
ALTER TABLE fantasyfootball.CFANTASYTEAMENTITY_CYOURPLAYERENTRY ADD CONSTRAINT FK_CFANTASYTEAMENTITY_CYOURPLAYERENTRY_CFantasyTeamEntity_MID FOREIGN KEY (CFantasyTeamEntity_MID) REFERENCES fantasyfootball.CFANTASYTEAMENTITY (MID)
ALTER TABLE fantasyfootball.CTOTWENTITY_CTOTWPLAYERENTITY ADD CONSTRAINT FK_CTOTWENTITY_CTOTWPLAYERENTITY_CTotwEntity_MWEEK FOREIGN KEY (CTotwEntity_MWEEK) REFERENCES fantasyfootball.CTOTWENTITY (MWEEK)
ALTER TABLE fantasyfootball.CTOTWENTITY_CTOTWPLAYERENTITY ADD CONSTRAINT FK_CTOTWENTITY_CTOTWPLAYERENTITY_mTotwPlayers_MID FOREIGN KEY (mTotwPlayers_MID) REFERENCES fantasyfootball.CTOTWPLAYERENTITY (MID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('penaltySavedByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('yourPlayerEntryTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('playerTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('goalsByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('gameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('saveByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('penaltyConcededByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('teamTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('ownGoalsByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('playerByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('penaltyProvokedByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('penaltyScoredByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('assistsByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('pointsByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('totwPlayerTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('penaltyMissedByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('fantasyTeamTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('yellowCardByGameTableGenerator', 0)
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('redCardByGameTableGenerator', 0)
