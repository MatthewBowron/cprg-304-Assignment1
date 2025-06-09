package appDomain;

import shapes.Cylinder;
import shapes.*;
import utilities.*;


public class AppDriver
{

	public static void main( String[] args )
	{


		Shape[] shapes = new Shape[5];
		shapes[0] = new Cylinder(1, 2);
		shapes[1] = new Cylinder(5, 7);
		shapes[2] = new OctagonalPrism(1.5, 1);
		shapes[3] = new OctagonalPrism(3, 0.5);
		shapes[4] = new Cylinder(2, 2);

		Sort method = new Cycle('h');
		method.sort(shapes);

		System.out.println("After sort : ");
		for (int i = 0; i < 5; i++)
			System.out.print(shapes[i].getHeight() + " ");
		// TODO Auto-generated method stub

		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

	}

	public Shape[] readFile(String fileName){
		return null;
	}

	public void display(Shape[] shapes){ //desplay first, last and every 1000th element between

	}

}
