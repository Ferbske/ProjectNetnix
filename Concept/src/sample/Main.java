package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    TableView<Accounts> table;
    TextField naam, adres, postcode, stad, telefoonNum, email;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("NetNix");

        // Naam
        TableColumn<Accounts, String> eersteNaam = new TableColumn<>("Name");
        eersteNaam.setMinWidth(200);
        eersteNaam.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        //  Adres
        TableColumn<Accounts, String> adress = new TableColumn<>("Adress");
        adress .setMinWidth(200);
        adress.setCellValueFactory(new PropertyValueFactory<>("adress"));

        // Postcode
        TableColumn<Accounts, String> postalCode = new TableColumn<>("Postal code");
        postalCode.setMinWidth(200);
        postalCode.setCellValueFactory(new PropertyValueFactory<>("postalCode"));

        // Stad
        TableColumn<Accounts, String> city = new TableColumn<>("City");
        city.setMinWidth(200);
        city.setCellValueFactory(new PropertyValueFactory<>("city"));

        // Telefoon
        TableColumn<Accounts, String> phoneNumber = new TableColumn<>("Phone number");
        phoneNumber.setMinWidth(200);
        phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        // Email
        TableColumn<Accounts, String> emailAdress = new TableColumn<>("Email");
        emailAdress.setMinWidth(200);
        emailAdress.setCellValueFactory(new PropertyValueFactory<>("emailAdress"));

        // Naam input
        naam = new TextField();
        naam.setPromptText("Name");
        naam.setMinWidth(100);

        // Adres input

        adres = new TextField();
        adres.setPromptText("Adres");
        adress.setMinWidth(100);

        // Postcode input
        postcode = new TextField();
        postcode.setPromptText("Postal code");
        postcode.setMinWidth(100);

        // Stad input
        stad = new TextField();
        stad.setPromptText("City");
        stad.setMinWidth(100);

        // Telefoon input
        telefoonNum = new TextField();
        telefoonNum.setPromptText("Telefoon nummer");
        telefoonNum.setMinWidth(100);

        // email input
        email = new TextField();
        email.setPromptText("Email");
        email.setMinWidth(100);

        // Knop
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClick());
        Button deleteButton = new Button ("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(naam,adres,postcode,stad,telefoonNum,email, addButton,deleteButton);

        //table
        table = new TableView<>();
        table.setItems(getAccounts());
        table.getColumns().addAll(eersteNaam,adress,postalCode,city,phoneNumber,emailAdress);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }

    // Toevoeg knop

    public void addButtonClick(){
        Accounts account = new Accounts();
        account.setFirstName(naam.getText());
        account.setAdress(adres.getText());
        account.setPostalCode(postcode.getText());
        account.setCity(stad.getText());
        account.setPhoneNumber(telefoonNum.getText());
        account.setEmailAdress(email.getText());
        table.getItems().addAll(account);
        naam.clear();
        adres.clear();
        postcode.clear();
        stad.clear();
        telefoonNum.clear();
        email.clear();
    }

    //Delete knop

    public void deleteButtonClicked(){
        ObservableList<Accounts> accountSelected, allProducts;
        allProducts = table.getItems();
        accountSelected = table.getSelectionModel().getSelectedItems();

        accountSelected.forEach(allProducts::remove);
    }


    //Lijst
    public ObservableList<Accounts> getAccounts(){
        ObservableList<Accounts> accounts = FXCollections.observableArrayList();
        accounts.add(new Accounts("Rick", "Default Adress", "Default Postalcode", "Etten-Leur", "06Default", "Rick@default.com"));
        return accounts;
    }

}
