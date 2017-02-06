import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HelloFx extends Application {

	public static void main(String args[]){
		Application.launch(args);



}

	@Override
	public void start(Stage stage) throws Exception {

		// stage este fereastra
		stage.setTitle("Hello JavaFx");

		// setare GRID
		GridPane grid = new GridPane();
		//grid.setGridLinesVisible(true);
		grid.setHgap(2);
		grid.setVgap(2);
//---------------------------------------------------------------
		// ELEMENTE

		//button
//		Button button=new Button("Abrogare");
//		button.setPrefSize(80,20);
//
//		Button button0=new Button("Anulare");
//
//		// label
//		Label label=new Label("Abrogare");
//		Label label0=new Label ("Anulare");

		// hboxul este tot un grid
//		HBox hbox = new HBox();
//
//		hbox.getChildren().addAll(label,button);


		// adaugare constrains pe grid pane - pt a nu se incaleca elementele
//		GridPane.setConstraints(label, 1, 1);
//		GridPane.setConstraints(button, 2, 1);
//		GridPane.setConstraints(label0, 1, 2);
//		GridPane.setConstraints(button0, 2, 2);


		//Adaugare Border Pane si adaugare butoane top si bottom
//		BorderPane borderPane = new BorderPane();
//		borderPane.setTop(new Button("Top"));
//		borderPane.setBottom(new Button("Bottom"));
//		//adaugare constain pt grid pane
//		GridPane.setConstraints(borderPane,1,3,2,1);

//		borderPane.setLeft(new Button("Left"));
//		borderPane.setRight(new Button("Right"));
//		borderPane.setCenter(new Button("Center"));

		// adaugare elemente in grid-ul GridPane, inclusiv border pane-ul
//		grid.getChildren().addAll(label,button, label0, button0, borderPane);


//		Group group=new Group();
//		group.getChildren().addAll(button, label);

// -----------------------------------------------------
        // ELEMENTE

		//adaugare table
		TableView table=new TableView();
		table.setMinHeight(350);
		table.setMinWidth(550);
		GridPane.setConstraints(table, 1, 1, 2,1);

		//adaugare 3 coloane la table
		TableColumn column1 = new TableColumn("Priority");
		TableColumn column2 = new TableColumn("Description");
		TableColumn column3 = new TableColumn("Progress");

		table.getColumns().addAll(column1, column2, column3);


		// adaugare label - OBSOLETE - aici s-a inlocuit cu table-ul
		Label tableArea = new Label ("This is where tasks table will come");

		//	agaugare label la 1 ,1 pe 3 coloane si 1 rand <------
		//GridPane.setConstraints(tableArea, 1, 1, 2,1);

//		// adaugare text field 1
//		TextField taskName = new TextField();
//		taskName.setPromptText("Adaugare text aici");
//		GridPane.setConstraints(taskName,1,2,3,1);
		// adaugare text field 1
		TextField taskName0 = new TextField();
		taskName0.setPromptText("Adaugare text0 aici");
		taskName0.setText("By default");
		taskName0.setMinWidth(150);
		GridPane.setConstraints(taskName0,2,2);

		// adaugare combo box
		ComboBox priority = new ComboBox();
		priority.getItems().addAll("High","Low","Medium");
		priority.setPromptText("Enter Priority");
		GridPane.setConstraints(priority,1,2);

		// adaugare button dupa combo box
		Button addbutton=new Button("Add");
		addbutton.setMinWidth(100);
		GridPane.setConstraints(addbutton,4,2);

		// adaugare button dupa combo box
		Button removebutton=new Button("Remove");
		removebutton.setMinWidth(100);
		GridPane.setConstraints(removebutton,4,3);

		// ! ELEMENTE

		// Adaugare Hbox
		HBox progressArea = new HBox();
		progressArea.getChildren().addAll(new Label("Progress Area"),
				new Spinner<Integer>(0,100,0),
				new CheckBox("Checkbox"));
		progressArea.setAlignment(Pos.CENTER_RIGHT);
		progressArea.setSpacing(2);
		GridPane.setConstraints(progressArea,1,4,2,1);


		// adaugare toate elementele in grid
		grid.getChildren().addAll(
				taskName0,priority,addbutton,removebutton,
				progressArea,table);

//----------------------------------------------------------
		//Scena este defapt containerul care contine celalate elemente
		Scene scene=new Scene (grid, 555, 500);


		stage.setScene(scene);
		stage.setTitle("Piata Victoriei");
		stage.setAlwaysOnTop(true);
		stage.setResizable(true);
		stage.show();

	}}


