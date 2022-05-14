//Move and rotate opperations
double size =40;
CSG cube = new Cube(size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
		
CSG movedCube = cube
			.movex(8)
			.movey(10)
			.movez(50)
//rotate
movedCube = movedCube
			.rotx(20)
			.roty(20)
			.rotz(20)
//set colors
cube.setColor(javafx.scene.paint.Color.CYAN);

return [cube,movedCube]