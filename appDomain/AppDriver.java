package appDomain;

import shapes.Cylinder;
import shapes.*;
import utilities.*;

import java.io.File;
import java.util.Comparator;
import java.util.Scanner;


public class AppDriver
{
	static String file;
	static Comparator<Shape> compare;
	static String sortBy;
	static Sort sortMethod;
	static String sort;

	public static void main( String[] args )
	{
		long start, stop;
		AppDriver driver = new AppDriver();
		driver.parseArgs( args );
		Shape[] shapes = driver.readFile();

		start = System.nanoTime();
		sortMethod.sort(shapes, compare);
		stop = System.nanoTime();

		driver.display(shapes);
		System.out.printf("%s Sort run time was: %d milliseconds", sort, stop - start);
	}

	public Shape[] readFile() {
		try {
			Scanner scanner = new Scanner(new File(file));
			int count = Integer.parseInt(scanner.nextLine());
			Shape[] shapes = new Shape[count];

			for (int i = 0; i < count; i++) {
				String[] values = scanner.nextLine().split(" ");
				String type = values[0];
				double height = Double.parseDouble(values[1]);
				double param2 = Double.parseDouble(values[2]);

				switch (type) {
					case "Cylinder":
						shapes[i] = new Cylinder(height, param2);
						break;
					case "Cone":
						shapes[i] = new Cone(height, param2);
						break;
					case "Pyramid":
						shapes[i] = new Pyramid(height, param2);
						break;
					case "SquarePrism":
						shapes[i] = new SquarePrism(height, param2);
						break;
					case "TriangularPrism":
						shapes[i] = new TriangularPrism(height, param2);
						break;
					case "PentagonalPrism":
						shapes[i] = new PentagonalPrism(height, param2);
						break;
					case "OctagonalPrism":
						shapes[i] = new OctagonalPrism(height, param2);
						break;
					default:
						throw new IllegalArgumentException(String.format("Unknown shape type %s on line %d of %s\n%s", type, (i + 1), file, values[i]));
				}
			}

			scanner.close();
			return shapes;
		} catch (Exception e) {
			throw new IllegalArgumentException("Error reading file: " + file + "\n" + e.getMessage());
		}
	}

	public void display(Shape[] shapes){ //display first, last and every 1000th element between
		// must exactly match example output
		
	}

	private void parseArgs( String[] args )
	{
		for (String arg : args) {
			if (arg.charAt(0) == '-') {
				char c = Character.toLowerCase(arg.charAt(1));
				if (c == 'f') {
					file = arg.substring(2).replaceAll("\"", "");
				} else if (c == 't') {
					switch (arg.charAt(2)) {
						case 'V':
						case 'v':
							compare = new VolumeCompare();
							sortBy = "Volume";
							break;
						case 'H':
						case 'h':
							compare = null;
							sortBy = "Height";
							break;
						case 'B':
						case 'b':
							compare = new BaseAreaCompare();
							sortBy = "Area";
							break;
						default:
							throw new IllegalArgumentException("compare type -t should bave value v(volume), h(height), or b(base area) ");
					}
				} else if (c == 's') {
					switch (arg.charAt(2)) {
						case 'B':
						case 'b':
							sortMethod = new Bubble();
							sort = "Bubble";
							break;
						case 'S':
						case 's':
							sortMethod = new Selection();
							sort = "Selection";
							break;
						case 'I':
						case 'i':
							sortMethod = new Insertion();
							sort = "Insertion";
							break;
						case 'M':
						case 'm':
							sortMethod = new Merge();
							sort = "Merge";
							break;
						case 'Q':
						case 'q':
							sortMethod = new Quick();
							sort = "Quick";
							break;
						case 'C':
						case 'c':
							sortMethod = new Cycle();
							sort = "Cycle";
							break;
						default:
							throw new IllegalArgumentException("sort type -s should bave value b(bubble), s(selection), i(insertion), m(merge), q(quick), or c(cycle) ");
					}
				}
			}
		}
	}
}
