/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constantes;

/**
 *
 * @author fkissoum
 */
public class Constantes {
    public static final String OCCUPATION = "Programmeur";
    public static final String URL = "jdbc:derby://localhost:1527/LSI_L3_JAVA";
    public static final String USER = "adm";
    public static final String MDP = "adm";
    public static final String REQUETE_TOUS = "SELECT * from PROGRAMMEUR";
    public static final String REQUETE_UNIQUE = "SELECT * from PROGRAMMEUR WHERE MATRICULE = ";
    public static final String REQUETE_DELETE = "DELETE FROM PROGRAMMEUR WHERE MATRICULE = ";
    public static final String REQUETE_INSERT="INSERT INTO PROGRAMMEUR (MATRICULE,NOM,PRENOM,ADRESSE,PSEUDO,RESPONSABLE,HOBBY,DATE_NAISS,DATE_EMB) VALUES (";
    public static final String GET_MAX = "SELECT MAX (MATRICULE) FROM PROGRAMMEUR";
    
}
