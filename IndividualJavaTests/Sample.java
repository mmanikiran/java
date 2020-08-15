import java.util.Properties;
import java.net.URLClassLoader;
import java.net.URL;
class Sample{

	public static void main(String[] args) throws Exception{
		URL[] urls = {new URL("file://C:/Users/mmani/My_Workspace/java/junit-4.12.jar")};
		Sample s1 = new Sample();
		System.out.println("Class loder is : " + s1.getClass().getClassLoader());
		URLClassLoader urlclassloader = new URLClassLoader(urls, s1.getClass().getClassLoader()) ;
		System.out.println("URL Class loder is : " + urlclassloader);
		Properties p = System.getProperties();
		p.setProperty("java.class.path", "./junit-4.12.jar");
		System.out.println("The class path of JVM is : " + System.getProperty("java.class.path"));

		try{
			urlclassloader.loadClass("junit.extensions.TestSetup");
		} catch(Exception e){
			System.out.println("Could not find the class name provided");
		}

	}

}
