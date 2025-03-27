package lezione7;

public class EsempioAlVolo {
		
		private static void tuoMetodo() {
			
		}
		
		public static void main(String[] args) {
			mioMetodo();
			
		}
		
		protected static void mioMetodo(){
			tuoMetodo();
		}

}
