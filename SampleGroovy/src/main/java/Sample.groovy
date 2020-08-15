import java.net.URLClassLoader;
import java.net.URL;
import java.nio.file.Paths;

URL[] urls = [new URL("file:////C://Users//mmani//My_Workspace//a2e//a2eGit//MySampleJava//out//artifacts//MySampleJava_jar//MySampleJava.jar")];
ClassLoader cl = System.getClass().getClassLoader()
String str1 = System.getProperty("java.class.path");
str1 = str1 + ";" + "C:\\Users\\mmani\\My_Workspace\\a2e\\a2eGit\\MySampleJava\\out\\artifacts\\MySampleJava_jar\\MySampleJava.jar";
def str2 = str1 + ";" + "C:\\Users\\mmani\\My_Workspace\\a2e\\a2eGit\\MySampleJava\\out\\artifacts\\MySampleJava_jar\\MySampleJava.jar";
System.setProperty("java.class.path", str1);
System.out.println("The class path of JVM is : " + System.getProperty("java.class.path"));

try{
    URLClassLoader urlclassloader = new URLClassLoader(urls);
    System.out.println("URL Class loder is : " + urlclassloader);
    //Class.forName("org.a2e.A", true, urlclassloader);
    def a = urlclassloader.loadClass("org.a2e.A").newInstance();
    a.doSomething()
} catch(Exception e){
    System.out.println("Could not find the class name provided");
    throw e;
}

