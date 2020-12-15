package Classes;

import java.io.Serializable;


public class Project implements Serializable {
    
    private final String projectName;
    private Sticker  originalImage;
    private Sticker  editedImage;

    public Project(String projectName, Sticker originalImage, Sticker editedImage) {
        this.projectName = projectName;
        this.originalImage = originalImage;
        this.editedImage  = editedImage;
    }

    public String getProjectName() {
        return projectName;
    }

    public Sticker getOriginalImage() {
        return originalImage;
    }

    public void setOriginalImage(Sticker originalImage) {
        this.originalImage = originalImage;
    }

    public Sticker getEditedImage() {
        return editedImage;
    }

    public void setEditedImage(Sticker editedImage) {
        this.editedImage = editedImage;
    }

    @Override
    public String toString() {
        return "Project{" + "projectName=" + projectName + ", originalImage=" + originalImage + ", editedImage=" + editedImage + '}';
    }
    
    
    

 
}
