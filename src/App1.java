import java.nio.file.Path;
import java.nio.file.Paths;

public class App1 {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Frexdel\\git\\learnit_java_core\\src");
		System.out.println(path.getRoot());
		System.out.println(path.getNameCount());
		System.out.println(path.getParent());


	}

}
