package CPackage;

public class Demo {
	public int cost(String std,int area, boolean automated) {
	        if(!automated)
	        {
	            if(std.equalsIgnoreCase("Medium"))
	            {
	                return area*1200;
	            }
	            else if(std.equalsIgnoreCase("Above"))
	            {
	                return area*1500;
	            }
	            else if(std.equalsIgnoreCase("High"))
	            {
	                return area*1800;
	            }
	        }
	        else {
	            return area * 2500;
	        }
	        return 0;
	}
}