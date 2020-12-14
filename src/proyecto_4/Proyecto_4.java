package proyecto_4;
import Classes.Project;
import Frames.MainFrame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proyecto_4 implements Serializable {

    public static ArrayList<Project> projectList = new ArrayList<>();
    private static final String filename = "projects.tmp";

    public static void serializeProjects() { //Serialization method

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(projectList);
            out.close();
            file.close();

            System.out.println("Se ha serializado correctamente");
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Error serializando" + error);
        }
    }

    public static boolean deserializeProjects() { //Deserialization method

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            try { //Read try

                projectList = (ArrayList<Project>) in.readObject();
                in.close();
                file.close();

                return true;
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Nope" + e);
            }
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Error en la deserializacion: \n" + error);
        }
        return false;
    }

    public static void main(String[] args) {

        if ( deserializeProjects() ) {
            MainFrame main = new MainFrame();
            main.show();
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrió un error deserializando");
        }
        
       
        
        
        
    }
}
