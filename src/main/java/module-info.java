module org.example.hangman1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens org.example.hangman1 to javafx.fxml;
    exports org.example.hangman1;
}