package com.patterns.creational.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		
		Color color=null;		
		ColorTypeEnum typeEnum = ColorTypeEnum.valueOf(colorType);
		
		switch (typeEnum ) {
		case Red:
			color = new Red();
			break;
		case Green:
			color = new Green();
			break;
		case Blue:
			color = new Blue();
			break;
		default:			
			break;
		}
		return color;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
