package heritage;

public class Capitale extends Ville {
	
		//  25/04/19 11:09 1er commit & push
		//  25/04/19 11:12 commit & push
		//  25/04/19 11:26 commit & push
		//  25/04/19 11:28 commit PUIS push
		
		private String monument;
		
		//Constructeur par défaut
		public Capitale() {
			super();
			monument = "aucun";
		}
		
		public String decrisToi() {
			String str = super.decrisToi() + "\n \t ==>>" + this.monument + 
					" en est un monument";
			return str;
		}
	

}
