package Application.Control;

import Application.DataTypes.Customer;
import Application.DataTypes.Plane;
import Presentation.*;
import javafx.stage.Stage;

/**
 * Created by Administrator on 5/19/2016.
 */

public class MainControl {

    //fields
    public static Stage window = new Stage();


    //show-scene methods
    public static void showMenuScene(){
        //initialization of scene
        MenuScene.initialize();

        //initialization of controller
        MenuSceneControl.initialize();

        //set scene
        window.setScene(MenuScene.getScene());
        window.centerOnScreen();

    }


    public static void showLoginScene() {
        //initialization of scene
        LoginScene.initialize();

        //initialization of actions
        LoginSceneControl.initialize();


        //set scene
        window.setScene(LoginScene.getScene());

        window.show();
        window.centerOnScreen();
    }


    //viewBookingScene
    public static void showViewBookingScene(){
        //initialization of scene
        ViewBookingScene.initialize();

        //initialization of actions
        //ViewBookingSceneControl.initialize();

        //set scene
        window.setScene(ViewCustomersScene.getScene());
    }


    public static void showViewCustomerScene(){
        //initialization of scene
        ViewCustomersScene.initialize();

        //initialization of controller
        ViewCustomerSceneControl.initialize();

        //set scene
        window.setScene(ViewCustomersScene.getScene());
    }


    public static void showFlightsScene(){
        //initialization of scene
        FlightsScene.initialize();

        //initialization of controller
        //FlightsSceneControl.initialize();

        //set scene
        window.setScene(FlightsScene.getScene());
    }


    public static void showPlaneScene(){
        //initialization of scene
        PlaneScene.initialize();

        //initialization of controller
        PlaneSceneControl.initialize();

        //set scene
        window.setScene(PlaneScene.getScene());
    }


    public static boolean showPlaneEditStage(Plane plane){
        //initialization of scene
        PlaneEditScene.initialize();

        //initialization of control
        PlaneEditSceneControl.initialize();

        PlaneEditSceneControl.setPlane(plane);
        PlaneEditScene.getDialogStage().initOwner(window);
        PlaneEditScene.getDialogStage().showAndWait();

        return PlaneEditSceneControl.isOkPressed();
    }


    public static boolean showCustomerEditScene(Customer customer){
        //initialization of scene
        CustomerEditScene.initialize();

        //initialization of control
        CustomerEditSceneControl.initialize();
        CustomerEditSceneControl.setCustomer(customer);
        CustomerEditScene.getDialogStage().initOwner(window);
        CustomerEditScene.getDialogStage().showAndWait();

        return CustomerEditSceneControl.isOkPressed();
    }



    //getters
    public static Stage getWindow() {
        return window;
    }

}
