package visoranimales2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class VisorAnimalesController implements Initializable {

    ObservableList<Animal> animales;
    @FXML
    private ListView<Animal> lista;
    Animal a;
    @FXML
    private ImageView vimagen;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        lista.setCellFactory(new Callback<ListView<Animal>, ListCell<Animal>>() {
            @Override
            public ListCell<Animal> call(ListView<Animal> param) {
                return new CeldaImagenTexto();
            }
        });
        
        animales = FXCollections.observableArrayList();
        
        animales.add(new Animal("Perro", "", "Imagenes/perro.jpg"));
        animales.add(new Animal("Cerdo", "", "Imagenes/cerdo.jpg"));
        animales.add(new Animal("Ardilla", "", "Imagenes/ardilla.jpg"));
        //animales.add(new Animal("Vaquita", "", ""));
        
        lista.setItems(animales);
        
        lista.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Animal>(){
            @Override
            public void changed(ObservableValue<? extends Animal> observable, Animal oldValue, Animal newValue) {
                a = newValue;
                //System.out.println(a.getImagen());
                vimagen.setImage(new Image(a.getImagen()));
            }
            
        });
    }    
    
}
