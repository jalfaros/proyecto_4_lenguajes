package Classes;

import java.io.Serializable;


public class Sticker implements Serializable {
    
    private String imageName;
    private String imageUrl;

    public Sticker(String imageName, String imageUrl) {
        this.imageName = imageName;
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Image{" + "imageName=" + imageName + ", imageUrl=" + imageUrl + '}';
    }
    
    
        
}
