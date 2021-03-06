import java.io.*;
import java.util.*;

class File_IO {

	private static File f;
	private static ArrayList<String> lines;
	private static Map<Integer, Integer> linesSent;
	
    public static void main(String[] args) throws FileNotFoundException {
    	loadFile("C:/Users/popob/Desktop/image.txt.txt");
    
        for(int i = 0; i < 1000; ++i)
        {
            System.out.println(chooseLine());
        }
    }

    public static String chooseLine() {
        Random rand = new Random();
        int lineNumber;
		do {
			lineNumber = rand.nextInt(lines.size());
		} while (map.get(lineNumber) <= 0);
		map.put(lineNumber, map.get(lineNumber) + 1);
        return lines.get(lineNumber);
    }
    
    public static void loadFile(String addr) throws FileNotFoundException {
    	f = new File(addr);
    	lines = new ArrayList<String>();
    	map = new HashMap<String, Integer>();
    	
    	for(Scanner sc = new Scanner(f); sc.hasNext(); )
        {
            lines.add(sc.nextLine());
        }
    }
}
