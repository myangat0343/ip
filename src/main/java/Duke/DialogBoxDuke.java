package Duke;

import javafx.geometry.Pos;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.Node;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DialogBoxDuke extends HBox{
    private Label text;
    private ImageView displayPicture;

    public DialogBoxDuke(Label l, ImageView iv) {
        text = l;
        displayPicture = iv;

        text.setWrapText(true);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);

        this.setAlignment(Pos.TOP_RIGHT);
        this.getChildren().addAll(text, displayPicture);
    }

    /**
     * Flips the dialog box such that the ImageView is on the left and text on the right.
     */
    private void flip() {
        this.setAlignment(Pos.TOP_LEFT);
        ObservableList<Node> tmp = FXCollections.observableArrayList(this.getChildren());
        FXCollections.reverse(tmp);
        this.getChildren().setAll(tmp);
    }

    public static DialogBoxDuke getUserDialog(Label l, ImageView iv) {
        return new DialogBoxDuke(l, iv);
    }

    public static DialogBoxDuke getDukeDialog(Label l, ImageView iv) {
        var db = new DialogBoxDuke(l, iv);
        db.flip();
        return db;
    }
}