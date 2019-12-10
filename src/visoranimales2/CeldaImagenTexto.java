package visoranimales2;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CeldaImagenTexto extends ListCell<Animal>{
    VBox vbox; 
    ImageView imagen;
    Label etiqueta;
    
    public CeldaImagenTexto(){
        imagen = new ImageView();
        vbox = new VBox();
        imagen.setFitHeight(100);
        imagen.setFitWidth(100);
        etiqueta = new Label();
        vbox.getChildren().add(imagen);
        vbox.getChildren().add(etiqueta);
        vbox.setAlignment(Pos.CENTER);
    }
    
    protected void updateItem(Animal animal, boolean ok){
        super.updateItem(animal, ok);
        if(animal != null){
            etiqueta.setText(animal.getNombre());
            imagen.setImage(new Image(animal.getImagen()));
            setGraphic(vbox);
        }
    }
}
