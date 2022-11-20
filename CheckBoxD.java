import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
 
 
public class CheckBoxD extends Application {
    public static void main(String args[]){          
         launch(args);     
    } 
         
    @Override    
    public void start(Stage primaryStage) throws Exception {    
        VBox layout = new VBox();
        Scene scene = new Scene(layout, 250, 150);  
         
        CheckBox checkbox1 = new CheckBox("Opcion 1");
        CheckBox checkbox2 = new CheckBox("Opcion 2");
         
        layout.getChildren().addAll(checkbox1, checkbox2);
     
        primaryStage.setTitle("Elige una Opcion:");
        primaryStage.setScene(scene);   
        primaryStage.show();
    }
}