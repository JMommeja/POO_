package Tableau;

class Agence {
String directeur;
String adresse;
Client[] lesClients ;
int nbClients = 0;
public Agence ( String directeur,String adresse)
{
// Constructeur
lesClients = new Client [500];
}
void changerDirecteur() {}
void ajouterUnClient(Client unClient) 
{
lesClients[nbClients] = unClient;	
nbClients++;
}
}

