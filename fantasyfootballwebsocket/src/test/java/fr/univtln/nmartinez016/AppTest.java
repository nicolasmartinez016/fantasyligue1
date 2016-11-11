package fr.univtln.nmartinez016;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    private ObjectMapper mMapper = new ObjectMapper();
    private CCrudMethods mCrudMethods = new CCrudMethods();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testSerDeserPlayerWithTeam() throws Exception {

            System.out.println("");
            List<CPlayerEntity> lPlayers = (List<CPlayerEntity>) mCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_TEAM, CQueryParameter.with(CPlayerEntity.PARAMETER_TEAM, 49).parameters());
            String lJson = mMapper.writeValueAsString(lPlayers);
            List<CPlayerEntity> lPlayersFromJson = mMapper.readValue(lJson, mMapper.getTypeFactory().constructCollectionType(List.class, CPlayerEntity.class));
            for (CPlayerEntity lPlayer : lPlayersFromJson){
                System.out.println(lPlayer.getFirstName() + " " + lPlayer.getLastName());
            }

    }
}
