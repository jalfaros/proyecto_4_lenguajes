package Classes;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class JavaClassLoader extends ClassLoader {
    
    public JavaClassLoader(){
        
    }

    public void invokeClassMethod(String classBinName, String methodName, String pathImage) {

        try {

         
            ClassLoader classLoader = this.getClass().getClassLoader();
            
            Class<?> loadedMyClass = classLoader.loadClass(classBinName);

            System.out.println("Loaded class name: " + loadedMyClass.getName());
            
            Constructor<?> constructor = loadedMyClass.getConstructor();
            Object myClassObject =  constructor.newInstance();

            Method method = loadedMyClass.getMethod(methodName, String.class);
            System.out.println("Invoked method name: " + method.getName());
            method.invoke(myClassObject, pathImage);
            

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
