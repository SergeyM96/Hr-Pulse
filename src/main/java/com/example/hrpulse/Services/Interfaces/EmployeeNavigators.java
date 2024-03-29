package com.example.hrpulse.Services.Interfaces;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public interface EmployeeNavigators {
//----------------------------------This interface is handling the navigation between the employee page -------------

    // --------- navigate to the main employee view page -------------------------------------
    default void navigateToManageEmployeePage(ActionEvent event) throws IOException {
        Parent ManageEmployeePageViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/hrpulse/EmployeeView/ManageEmployeeView/manageEmployee_view.fxml")));
        Scene ManageEmployeePageViewScene = new Scene(ManageEmployeePageViewParent);
        Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainStage.setScene(ManageEmployeePageViewScene);
        mainStage.setTitle("ניהול עובד");
        mainStage.centerOnScreen();
        mainStage.show();
    }

    //-----------------------------------------------------------------------------------------
    default void navigateToCreateEmployeePage(ActionEvent event) throws IOException {
        Parent createEmployeeViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/hrpulse/EmployeeView/CreateNewEmployeeView/createNewEmployee_view.fxml")));
        Scene createEmployeeViewScene = new Scene(createEmployeeViewParent);
        Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainStage.setScene(createEmployeeViewScene);
        mainStage.setTitle("יצירת עובד חדש");
        mainStage.centerOnScreen();
        mainStage.show();
    }

    default void navigateToEditEmployeePage(ActionEvent event) throws IOException {
        Parent removeEmployeeViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/hrpulse/EmployeeView/EditEmployeeView/editEmployee_view.fxml")));
        Scene removeEmployeeViewScene = new Scene(removeEmployeeViewParent);
        Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainStage.setScene(removeEmployeeViewScene);
        mainStage.setTitle("מחיקת עובד");
        mainStage.centerOnScreen();
        mainStage.show();
    }

    default void navigateToEditEmployeeShiftPage(ActionEvent event) throws IOException {
        Parent editEmployeeShiftViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/hrpulse/EmployeeView/EditEmployeeShiftView/editEmployeeShift_view.fxml")));
        Scene editEmployeeShiftViewScene = new Scene(editEmployeeShiftViewParent);
        Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainStage.setScene(editEmployeeShiftViewScene);
        mainStage.setTitle("עדכון שעות עובד");
        mainStage.centerOnScreen();
        mainStage.show();
    }

    default void navigateToFeedbackEmployeePage(ActionEvent event) throws IOException {
        Parent FeedbackEmployeeViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/hrpulse/EmployeeView/FeedbackEmployeeView/feedBackEmployee_view.fxml")));
        Scene FeedbackEmployeeViewScene = new Scene(FeedbackEmployeeViewParent);
        Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainStage.setScene(FeedbackEmployeeViewScene);
        mainStage.setTitle("דף משוב לעובד");
        mainStage.centerOnScreen();
        mainStage.show();

    }

}