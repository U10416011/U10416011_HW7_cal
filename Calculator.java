import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.WritableObjectValue;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;

public class Calculator extends Application {
	double r = 0;
	int op;
	int n;
	public void start(Stage primaryStage) {
	//create a pane
	Pane pane = new Pane();
	//set TextField
	TextField TF = new TextField();
	TF.setEditable(false);
    TF.setMinSize(200, 40);
    TF.setText("0");
	TF.setLayoutX(0);
	TF.setLayoutY(30);
        pane.getChildren().add(TF);
	
	//set Menu and MenuItems
	final MenuBar menuBar = new MenuBar();
	final Menu Menu1 = new Menu("檢視");
	final Menu Menu2 = new Menu("編輯");
	final Menu Menu3 = new Menu("說明");
	Menu1.getItems().add(new MenuItem("Exit"));
	Menu2.getItems().add(new MenuItem("編輯1"));
	Menu2.getItems().add(new MenuItem("編輯2"));
	Menu3.getItems().add(new MenuItem("說明"));
	menuBar.getMenus().add(Menu1);
	menuBar.getMenus().add(Menu2);
	menuBar.getMenus().add(Menu3);
	pane.getChildren().add(menuBar);

	//create all buttons 
	Button bt1 = new Button("1");
	Button bt2 = new Button("2");
	Button bt3 = new Button("3");
	Button bt4 = new Button("4");
	Button bt5 = new Button("5");
	Button bt6 = new Button("6");
	Button bt7 = new Button("7");
	Button bt8 = new Button("8");
	Button bt9 = new Button("9");
	Button bt0 = new Button("0");
	Button btPlus = new Button("+");
	Button btSub = new Button("-");
	Button btMul = new Button("*");
	Button btDiv = new Button("/");
	Button btCE = new Button("CE");
	Button btC = new Button("C");
	Button btP = new Button("DEL");
	Button btPS = new Button("+/-");
	Button btR = new Button("sqrt");
	Button btE = new Button("=");
	Button btINV = new Button("1/x");
	Button btPer = new Button(" % ");
	Button btD = new Button(".");
	//and set their X and Y
	pane.getChildren().add(btP);
	btP.setLayoutX(8);
	btP.setLayoutY(110);
	pane.getChildren().add(btCE);
	btCE.setLayoutX(50);
	btCE.setLayoutY(110);
	pane.getChildren().add(btC);
	btC.setLayoutX(90);
	btC.setLayoutY(110);
	pane.getChildren().add(btPS);
	btPS.setLayoutX(130);
	btPS.setLayoutY(110);
	pane.getChildren().add(btR);
	btR.setLayoutX(170);
	btR.setLayoutY(110);
	pane.getChildren().add(bt7);
	bt7.setLayoutX(10);
	bt7.setLayoutY(140);
	pane.getChildren().add(bt8);
	bt8.setLayoutX(50);
	bt8.setLayoutY(140);
	pane.getChildren().add(bt9);
	bt9.setLayoutX(90);
	bt9.setLayoutY(140);
	pane.getChildren().add(btDiv);
	btDiv.setLayoutX(130);
	btDiv.setLayoutY(140);
	pane.getChildren().add(btPer);
	btPer.setLayoutX(170);
	btPer.setLayoutY(140);
	pane.getChildren().add(bt4);
	bt4.setLayoutX(10);
	bt4.setLayoutY(170);
	pane.getChildren().add(bt5);
	bt5.setLayoutX(50);
	bt5.setLayoutY(170);
	pane.getChildren().add(bt6);
	bt6.setLayoutX(90);
	bt6.setLayoutY(170);
	pane.getChildren().add(btMul);
	btMul.setLayoutX(130);
	btMul.setLayoutY(170);
	pane.getChildren().add(btINV);
	btINV.setLayoutX(170);
	btINV.setLayoutY(170);
	pane.getChildren().add(bt1);
	bt1.setLayoutX(10);
	bt1.setLayoutY(200);
	pane.getChildren().add(bt2);
	bt2.setLayoutX(50);
	bt2.setLayoutY(200);
	pane.getChildren().add(bt3);
	bt3.setLayoutX(90);
	bt3.setLayoutY(200);
	pane.getChildren().add(btSub);
	btSub.setLayoutX(130);
	btSub.setLayoutY(200);
	pane.getChildren().add(btE);
	btE.setPrefSize(25,60);
	btE.setLayoutX(170);
	btE.setLayoutY(200);
	
	pane.getChildren().add(bt0);
	bt0.setLayoutX(10);
	bt0.setLayoutY(230);
	pane.getChildren().add(btD);
	btD.setLayoutX(90);
	btD.setLayoutY(230);
	pane.getChildren().add(btPlus);
	btPlus.setLayoutX(130);
	btPlus.setLayoutY(230);

	
	bt1.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("1");
		else
			TF.setText(TF.getText()+"1");
	});
	bt2.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("2");
		else
			TF.setText(TF.getText()+"2");
	});
	bt3.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("3");
		else
			TF.setText(TF.getText()+"3");
	});
	bt4.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("4");
		else
			TF.setText(TF.getText()+"4");
	});
	bt5.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("5");
		else
			TF.setText(TF.getText()+"5");
	});
	bt6.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("6");
		else
			TF.setText(TF.getText()+"6");
	});
	bt7.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("7");
		else
			TF.setText(TF.getText()+"7");
	});
	bt8.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("8");
		else
			TF.setText(TF.getText()+"8");
	});
	bt9.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("9");
		else
			TF.setText(TF.getText()+"9");
	});
	bt0.setOnAction(e ->{
		if(TF.getText().length() == 1 && TF.getText().charAt(0) == 48)//char 48 is int 0
			TF.setText("0");
		else
			TF.setText(TF.getText()+"0");
	});
	btCE.setOnAction(e ->{
		TF.setText("0");
		r = 0;
	});
	btC.setOnAction(e ->{
		TF.setText("0");
		r = 0;
	});
	
	btPlus.setOnAction(e ->{
		r = Double.parseDouble(TF.getText());
		TF.setText(Integer.toString(0));
		op = 1;
		
	});
	btSub.setOnAction(e ->{
			r = Double.parseDouble(TF.getText());
			TF.setText(Integer.toString(0));
		op = 2;
		
	});
	btMul.setOnAction(e ->{
		r = Double.parseDouble(TF.getText());
		TF.setText(Integer.toString(0));
	op = 3;
	});
	btDiv.setOnAction(e ->{
		r = Double.parseDouble(TF.getText());
		TF.setText(Integer.toString(0));
	op = 4;
	});
	btPer.setOnAction(e ->{
		r = Double.parseDouble(TF.getText())/100;
		TF.setText(String.valueOf(r));
	});
	btPS.setOnAction(e ->{
		r = -Double.parseDouble(TF.getText());
		TF.setText(String.valueOf(r));
	});
	btR.setOnAction(e ->{
		r = Math.sqrt(Double.parseDouble(TF.getText()));
		TF.setText(String.valueOf(r));
	});
	btINV.setOnAction(e ->{
		r = 1/Double.parseDouble(TF.getText());
		TF.setText(String.valueOf(r));
	});
	btP.setOnAction(e ->{
		TF.setText(TF.getText().substring(0,TF.getText().length() - 1));
		if(TF.getText().length() == 0){
			TF.setText(Integer.toString(0));
		}
	});
	btD.setOnAction(e ->{
		if (TF.getText().indexOf(".") < 0)
			TF.setText(new String(TF.getText() + "."));
	});
	btE.setOnAction(e ->{
		n = Integer.parseInt(TF.getText());;
		switch(op){
		case 1:
			r += n;
			break;
		case 2:
			r -= n;
			break;
		case 3:
			r *=n;
			break;
		case 4:
			r /=n;
			break;
		default :
			break;
		}
		
		TF.setText(String.valueOf(r));
	});
	
	//create a scene
	Scene scene = new Scene(pane);
	primaryStage.setTitle("U10416011");
	primaryStage.setScene(scene);
	primaryStage.show();
	}
public static void main (String[] args) {
    Application.launch(args);  

    }
}