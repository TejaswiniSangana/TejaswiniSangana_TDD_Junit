package tddtask;

public class deletion {
		public static String del(String string)
		{
			int n=string.length();
			String res="";
			if(n==0)
				return res;
			else if(n==1) {
				if (string.charAt(0)!='A')
					res=string;
				return res;
			}
			else{
				int x,y;
				x=(int) string.charAt(0);
				y=(int) string.charAt(1);
				if (x == 65 && y == 65) {
					res=string.substring(2);
				} else if (x == 65) {
					res=string.substring(1);
				} else if (y == 65) {
					res=string.substring(0,1)+string.substring(2);
				} else {
					res=string;
				}
			}
			return res;

		}
}
