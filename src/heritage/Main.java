package heritage;

public class Main {
	  public static void main(String[] args){

		  //  25/04/19 10:32 1er commit & push
		  //  25/04/19 11:09 commit & push
		  //  25/04/19 11:12 commit & push
	
		  
		   // Avant polymorphisme
		  
		  
	Ville v = new Ville();
	Ville v1 = new Ville("Marseille", 123456, "France");       
	Ville v2 = new Ville("Rio", 321654, "Brésil");

	System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+ 
			" habitants se situant en "+v.getNomPays());
	System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ 
			" habitants se situant en "+v1.getNomPays());
	System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ 
			" habitants se situant en "+v2.getNomPays()+"\n\n");
	        
	/*
	  Nous allons interchanger les Villes v1 et v2
	  tout ça par l'intermédiaire d'un autre objet Ville.        
	*/       
	Ville temp = new Ville();
	temp = v1;
	v1 = v2;
	v2 = temp;
	       
	System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
	System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

	/*       
	  Nous allons maintenant interchanger leurs noms
	  cette fois par le biais de leurs mutateurs.
	*/   
	v1.setNom("Hong Kong");
	v2.setNom("Djibouti");
	      
	System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
	System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
	  
	  // Essai pour héritage
	Capitale cap = new Capitale();
	System.out.println("D'une capitale par défaut, cap.decrisToi()" + cap.decrisToi());
	  
	// Essai 2 pour héritage https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/21424-gerez-les-heritages#/id/r-2181190
//	Capitale cap2 = new Capitale("Paris", 654987, "France", "Tour Eiffel");
//	System.out.println("\n"+cap2.decrisToi());
	  

		  
		  
		  
		    Ville[] tableau = new Ville[6];
		    String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		    int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};

		    for(int i = 0; i < 6; i++){
		      if (i <3){
		    	  //3 premiers elements de tableau devrait contenir: Marseille, Lille , Caen instanciés selon Ville (3 critères)
		    	  //3 derniers elements de tableau devrait contenir: Lyon, Paris, Lille instanciés selon Capitale (4 critères)
		        Ville V = new Ville(tab[i], tab2[i], "france");
		        tableau[i] = V;
		      }
		                
		      else{
		        Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
		        tableau[i] = C;
		      }
		    }
		                 
		    //Il ne nous reste plus qu'à décrire tout notre tableau !
		    for(Object V : tableau){
		      System.out.println(V.decrisToi()+"\n");
		    }	  
		  
		  
		  
	  }
}

