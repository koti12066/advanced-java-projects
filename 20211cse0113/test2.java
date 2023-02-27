package classobjectDEMO;
	class sphere {
		private double r;
		public void vol_sphere() {
			System.out.println("volume of sphere is "+4.0/3*3.141*r*r*r);
		}
	}
	class cylinder {
		private double r=3.2,h=2.8;
		public void vol_cylinder() {
			System.out.println("volume of cylinder is "+3.141*r*r*h);
		}
	}
	public class test2 {
	public static void main(String[] args) {
		sphere s=new sphere();
		cylinder c=new cylinder();
		s.vol_sphere();
		c.vol_cylinder();
	}

}
