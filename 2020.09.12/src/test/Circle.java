/**
 * 
 */
package test;


public class Circle {
		float x,y;
		float radius;
		double getArea()
		{
			return radius*radius*Math.PI;
		}
		double getCircumference()
		{
			return 2*radius*Math.PI;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle();
		circle.x=0;
		circle.y=0;
		circle.radius=3;
		System.out.println("���Ϊ:"+circle.getArea());
		System.out.println("�ܳ�Ϊ:"+circle.getCircumference());
	}

}