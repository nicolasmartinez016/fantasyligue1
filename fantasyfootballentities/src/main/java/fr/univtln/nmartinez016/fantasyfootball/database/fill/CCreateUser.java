package fr.univtln.nmartinez016.fantasyfootball.database.fill;

import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

/**
 * Created by marti on 26/08/2016.
 */
public class CCreateUser {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();
        CUserEntity lUser = new CUserEntity.CUserBuilder().id("martinez1nicolas@gmail.com").build();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lUser);
            lCrudMethods.commitTransaction();
        }

    }
}
