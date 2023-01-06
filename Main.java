package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.geometry.Side;
import java.io.*;
import java.util.*;
import java.sql.SQLException;



public class Main extends Application {
	public String global_phone;
	public Float global_price;
    
    
	@Override
	public void start(Stage stage) throws Exception {
		
		try {
			stage.setTitle("Airline Reservation System");
			Pane rhome = new Pane();
			Pane rsignup = new Pane();
			Pane rclogin = new Pane();
			Pane ralogin = new Pane();
			Pane rMain_page = new Pane();
			Pane rbooking = new Pane();
			Pane radminview = new Pane();
			Pane raddplane = new Pane();
			ScrollPane sp0 = new ScrollPane();
			sp0.setContent(raddplane);
			Scene addplanes = new Scene(sp0, 725, 500);
			Pane rviewuser = new Pane();
			Pane rpayment = new Pane();
			Pane rCancel_Reservation = new Pane();
			Group rviewticket = new Group();
			Scene home = new Scene(rhome, 725, 500, Color.SKYBLUE);
			Scene signUp = new Scene(rsignup, 725, 500, Color.rgb(21, 20, 64));
			Scene CLogin = new Scene(rclogin, 725, 500, Color.SKYBLUE);
			Scene ALogin = new Scene(ralogin, 725, 500, Color.SKYBLUE);
			ScrollPane sp = new ScrollPane();
			sp.setContent(rMain_page);
			Scene Main_page = new Scene(sp, 725, 500);
			
			//Scene Main_page = new Scene(rMain_page, 725, 500);
			Pane rhomeFilter = new Pane();
			Scene homeFilter = new Scene(rhomeFilter, 725, 500);
			Scene booking = new Scene(rbooking, 725, 500);
			Scene adminview = new Scene(radminview, 725, 500);
			Scene viewusers = new Scene(rviewuser, 725, 500);
			Scene payment = new Scene(rpayment, 725, 500);
			Scene Cancel_Reservation = new Scene(rCancel_Reservation, 725, 500);
			Scene viewticket = new Scene(rviewticket, 725, 500);
			
			stage.setTitle("Airline Reservation System");
			stage.getIcons().add(new Image("C:\\Users\\joead\\eclipse-workspace\\AirportSystem\\src\\application\\imgs\\pngwing.com.png"));
            rhome.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\254381.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			rsignup.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			rclogin.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			ralogin.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			radminview.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			raddplane.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			rviewuser.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			rMain_page.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			rhomeFilter.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			rCancel_Reservation.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			
			rpayment.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			rbooking.setBackground(new Background(
					new BackgroundImage(
				new Image("C:\\Users\\joead\\Downloads\\850749.jpg"),
				BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
			
			
			
			
			rhome.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Admin admin = new Admin();
			BookProcess process = new BookProcess();
          
//------------------------------------------SCENE Home -----------------------------------------------------------------------
			
		    Image img2 = new Image(new FileInputStream("C:\\Users\\joead\\Downloads\\orrr2-removebg-preview.png"));
			ImageView imageView = new ImageView(img2);
		    imageView.setX(326); 
		    imageView.setY(356);  
		    imageView.setFitHeight(97); 
		    imageView.setFitWidth(97); 
		    imageView.setPreserveRatio(true);
		    
		    Image image2 = new Image(new FileInputStream("C:\\Users\\joead\\OneDrive\\Desktop\\HW submissions\\boarding.PNG"));
		    ImageView imageView2 = new ImageView(image2);
		    
			Text text = new Text("Airline Reservation System");
			text.setFont(Font.font("Copperplate Gothic Bold",32));
			text.setFill(Color.WHITESMOKE);
			text.setX(109);
			text.setY(105);
		    
		    Button bsignup = new Button("Signup");
		    Button blogin = new Button("Login");
		    bsignup.setLayoutX(286);
		    bsignup.setLayoutY(325);
		    bsignup.setTextFill(Color.rgb(243, 243, 243));
		    bsignup.setFont(Font.font("Copperplate Gothic Bold",23));
		    bsignup.setBackground(null);
		    bsignup.setOnAction(e -> stage.setScene(signUp));
		    
		    blogin.setLayoutX(292);
		    blogin.setLayoutY(440);
		    blogin.setTextFill(Color.rgb(243, 243, 243));
		    blogin.setFont(Font.font("Copperplate Gothic Bold",23));
		    blogin.setBackground(null);
		    blogin.setOnAction(e -> stage.setScene(CLogin));
		    
		    Menu more = new Menu("MORE");
		    more.setStyle("-fx-background-color: transparent; -fx-font-size: 18;");
		    MenuItem ladmin = new MenuItem("Admin Login");
		    MenuItem exit = new MenuItem("Exit");
		    more.getItems().addAll(ladmin, exit);
		    MenuBar Bmenu = new MenuBar();
		    Bmenu.getMenus().add(more);
		    Bmenu.setLayoutX(647);
		    Bmenu.setLayoutY(-5);
		    Bmenu.setStyle("-fx-background-color: transparent;");
		    ladmin.setOnAction(e -> stage.setScene(ALogin));
		    exit.setOnAction(e -> stage.close());
		    
		    
		    rhome.getChildren().addAll(text, imageView, bsignup, blogin, Bmenu);
		    
		    
//-------------------------------------------SCENE Signup ----------------------------------------------------------------------	    
		    
		    Text sign = new Text("Signup As Customer");
		    sign.setFont(Font.font("Copperplate Gothic Bold",30));
		    sign.setFill(Color.rgb(249, 165, 67));
		    sign.setX(195);
		    sign.setY(23);
		    
		    Text plz = new Text("Please Fill in the Data Required Below");
		    plz.setFont(Font.font("Copperplate Gothic Bold",17));
		    plz.setFill(Color.rgb(249, 165, 67));
		    plz.setX(0);
		    plz.setY(100);
		    
		    Text Email = new Text("Email");
		    Email.setFont(Font.font("",14));
		    Email.setX(0);
		    Email.setY(160);
		    Email.setFill(Color.rgb(249, 165, 67));
		    Email.setStyle("-fx-font-weight: bold;");
		    
		    Text Password = new Text("Password");
		    Password.setFont(Font.font("",14));
		    Password.setX(0);
		    Password.setY(210);
		    Password.setFill(Color.rgb(249, 165, 67));
		    Password.setStyle("-fx-font-weight: bold;");
		    
		    Text Name = new Text("Name");
		    Name.setFont(Font.font("",14));
		    Name.setX(0);
		    Name.setY(260);
		    Name.setFill(Color.rgb(249, 165, 67));
		    Name.setStyle("-fx-font-weight: bold;");
		    
		    Text Date = new Text("Date of Birth");
		    Date.setFont(Font.font("",14));
		    Date.setX(0);
		    Date.setY(310);
		    Date.setFill(Color.rgb(249, 165, 67));
		    Date.setStyle("-fx-font-weight: bold;");
		    
		    Text Phone_Number = new Text("Phone Number");
		    Phone_Number.setFont(Font.font("",14));
		    Phone_Number.setX(0);
		    Phone_Number.setY(360);
		    Phone_Number.setFill(Color.rgb(249, 165, 67));
		    Phone_Number.setStyle("-fx-font-weight: bold;");
		    
		    TextField email = new TextField();
		    email.setPromptText("Enter Your Email: ");
		    email.setLayoutX(120);
		    email.setLayoutY(142);
		   
		    PasswordField passw = new PasswordField();
		    passw.setPromptText("Enter Your Password: ");
		    passw.setLayoutX(120);
		    passw.setLayoutY(192);
		    Text hint = new Text("Minimum Requirments:\n- 8 charachters long\n- 1 Upper Case Letter\n- 1 Number ");
		    hint.setFont(Font.font("",12));
		    hint.setX(280);
		    hint.setY(190);
		    hint.setFill(Color.rgb(249, 165, 67));
		    
		    TextField name = new TextField();
		    name.setPromptText("Enter Your Name: ");
		    name.setLayoutX(120);
		    name.setLayoutY(242);
		    
		    TextField Birthday = new TextField();
		    Birthday.setPromptText("(DD/MM/YYYY): ");
		    Birthday.setLayoutX(120);
		    Birthday.setLayoutY(292);
		    
		    TextField Phone_number = new TextField();
		    Phone_number.setPromptText("Enter Phone Number: ");
		    Phone_number.setLayoutX(120);
		    Phone_number.setLayoutY(342);
		    
		    Button bcsign = new Button("Signup");
		    bcsign.setLayoutX(300);
		    bcsign.setLayoutY(412);
		    bcsign.setFont(Font.font("Copperplate Gothic Bold",30));
		    bcsign.setStyle("-fx-background-color: transparent; ");
		    bcsign.setTextFill(Color.rgb(249, 165, 67));
		    
		    Button Signup_back = new Button("←");
		    Signup_back.setLayoutX(2);
		    Signup_back.setLayoutY(-15);
		    Signup_back.setFont(Font.font("",42));
		    Signup_back.setStyle("-fx-background-color: transparent; ");
		    Signup_back.setTextFill(Color.rgb(249, 165, 67));
		    Signup_back.setOnAction(f -> stage.setScene(home));
		    
		    Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setContentText("Invalid Input , Try Again");
			
		    Alert alert_error = new Alert(Alert.AlertType.ERROR);
		    alert_error.setTitle("ERROR");
		    alert_error.setContentText("The Email/Phone Number Might be Taken, Try Again");
			
		    bcsign.setOnAction(f ->{ 
		    	Customer customer = new Customer();
		    	String cmail = email.getText();	
		    	String cpass = passw.getText();	
		    	String cname = name.getText();
		    	String cdate = Birthday.getText();
		    	String cpn = Phone_number.getText();
		 
		    		try {
					    String func = customer.Register(cmail, cpass, cname, cdate, cpn);
		    			if (func == "false") {
						  alert.showAndWait();
						  }
		    			else if(func=="The Email/Phone Number Might be Taken, Try Again") {
		    				alert_error.showAndWait();
		    			}
		    			else if(func=="true")  {
		                    global_phone=Phone_number.getText();
		    				stage.setScene(Main_page);
		    			}  
					} 
		    		catch (SQLException e1) {e1.printStackTrace();}

		    });
		    
	rsignup.getChildren().addAll(sign, plz, Email, Password, hint, Name, Date, Phone_Number, email, passw, name, Birthday, Phone_number, bcsign, Signup_back);
			
	//---------------------------------------SCENE CLogin ---------------------------------------------------------------------
	
		 Text login = new Text("Login As Customer");
		 login.setFont(Font.font("Copperplate Gothic Bold",30));
		 login.setFill(Color.rgb(249, 165, 67));
		 login.setX(200);
		 login.setY(23);
		
		 Image pp = new Image(new FileInputStream("C:\\Users\\joead\\Downloads\\kisspng-computer-icons-user-profile-clip-art-portable-netw-c-svg-png-icon-free-download-389-86-onlineweb-5c6f7efde29670.9426602115508108779281.png"));
			ImageView ppview = new ImageView(pp);
			ppview.setX(305); 
			ppview.setY(140);  
			ppview.setFitHeight(75); 
			ppview.setFitWidth(75); 
			ppview.setPreserveRatio(true);
			
			Text Phonenumber = new Text("Phone Number");
			Phonenumber.setFont(Font.font("",14));
			Phonenumber.setX(165);
			Phonenumber.setY(267);
			Phonenumber.setFill(Color.rgb(249, 165, 67));
			Phonenumber.setStyle("-fx-font-weight: bold;");
			
		    Text password = new Text("Password");
		    password.setFont(Font.font("",14));
		    password.setX(202);
		    password.setY(318);
		    password.setFill(Color.rgb(249, 165, 67));
		    password.setStyle("-fx-font-weight: bold;");
		    
			TextField lPhone_number = new TextField();
			lPhone_number.setPromptText("Enter Phone Number: ");
			lPhone_number.setLayoutX(270);
			lPhone_number.setLayoutY(250);
			
		    PasswordField lpassw = new PasswordField();
		    lpassw.setPromptText("Enter Your Password: ");
		    lpassw.setLayoutX(270);
		    lpassw.setLayoutY(300);
		    
		    Button bclogin = new Button("Login");
		    bclogin.setLayoutX(285);
		    bclogin.setLayoutY(350);
		    bclogin.setFont(Font.font("Copperplate Gothic Bold",24));
		    bclogin.setStyle("-fx-background-color: transparent; ");
		    bclogin.setTextFill(Color.rgb(249, 165, 67));
		    
		    Button clogin_back = new Button("←");
		    clogin_back.setLayoutX(2);
		    clogin_back.setLayoutY(-15);
		    clogin_back.setFont(Font.font("",42));
		    clogin_back.setStyle("-fx-background-color: transparent; ");
		    clogin_back.setTextFill(Color.rgb(249, 165, 67));
		    clogin_back.setOnAction(f -> stage.setScene(home));
		    
		    Alert alertt = new Alert(Alert.AlertType.ERROR);
			alertt.setTitle("ERROR");
			alertt.setContentText("The Data Have Been Entered Are Invalid, Try Again.");
		    
		    bclogin.setOnAction( u -> {
		    	Customer cust = new Customer();
		    	try {
					boolean bool = cust.login(lPhone_number.getText(), lpassw.getText());

					if (bool) {
						global_phone=lPhone_number.getText();
						stage.setScene(Main_page);
					}
					else {
						alertt.showAndWait();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		    			
		    });

		 rclogin.getChildren().addAll(login, ppview, Phonenumber, password, lPhone_number, lpassw, bclogin, clogin_back);
			
			 
		//----------------------------------------SCENE Admin Login---------------------------------------------------------------------
		 
		 Text alogin = new Text("Login As Admin");
		 alogin.setFont(Font.font("Copperplate Gothic Bold",30));
		 alogin.setFill(Color.rgb(249, 165, 67));
		 alogin.setX(230);
		 alogin.setY(23);
		
		 Image app = new Image(new FileInputStream("C:\\Users\\joead\\Downloads\\kisspng-computer-icons-user-profile-clip-art-portable-netw-c-svg-png-icon-free-download-389-86-onlineweb-5c6f7efde29670.9426602115508108779281.png"));
			ImageView appview = new ImageView(app);
			appview.setX(305); 
			appview.setY(140);  
			appview.setFitHeight(75); 
			appview.setFitWidth(75); 
			appview.setPreserveRatio(true);
			
			Text Admin_Email = new Text("Email");
			Admin_Email.setFont(Font.font("",14));
			Admin_Email.setX(230);
			Admin_Email.setY(267);
			Admin_Email.setFill(Color.rgb(249, 165, 67));
			Admin_Email.setStyle("-fx-font-weight: bold;");
			
		    Text Admin_password = new Text("Password");
		    Admin_password.setFont(Font.font("",14));
		    Admin_password.setX(205);
		    Admin_password.setY(318);
		    Admin_password.setFill(Color.rgb(249, 165, 67));
		    Admin_password.setStyle("-fx-font-weight: bold;");
		    
		    
			TextField admin_email = new TextField();
			admin_email.setPromptText("Enter Your Email: ");
			admin_email.setLayoutX(270);
			admin_email.setLayoutY(250);
			
		    PasswordField admin_password = new PasswordField();
		    admin_password.setPromptText("Enter Your Password: ");
		    admin_password.setLayoutX(270);
		    admin_password.setLayoutY(300);
		    
		    Button balogin = new Button("Login");
		    balogin.setLayoutX(285);
		    balogin.setLayoutY(350);
		    balogin.setFont(Font.font("Copperplate Gothic Bold",24));
		    balogin.setStyle("-fx-background-color: transparent; ");
		    balogin.setTextFill(Color.rgb(249, 165, 67));
		    balogin.setOnAction(h ->  stage.setScene(adminview));

		    Button Admin_back = new Button("←");
		    Admin_back.setLayoutX(2);
		    Admin_back.setLayoutY(-15);
		    Admin_back.setFont(Font.font("",42));
		    Admin_back.setStyle("-fx-background-color: transparent; ");
		    Admin_back.setTextFill(Color.rgb(249, 165, 67));
		    Admin_back.setOnAction(f -> stage.setScene(home));
		    
		    Alert admin_alert = new Alert(Alert.AlertType.ERROR);
		    admin_alert.setTitle("ERROR");
		    admin_alert.setContentText("The Data Have Been Entered Are Invalid, Try Again.");
		    
		    balogin.setOnAction(h ->  {
			    
			    try {
					boolean Bool = admin.login(admin_email.getText(), admin_password.getText());
					if (Bool) {
						stage.setScene(adminview);
					}
					else {
						admin_alert.showAndWait();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			    	
			    });
		    
		    ralogin.getChildren().addAll(alogin, appview, Admin_Email, Admin_password, admin_email, admin_password, balogin, Admin_back);
		    
		  //----------------------------------------ADMINVIEW---------------------------------------------------------------------   
		    
		    
		    Text Admin_View = new Text("Admin View");
		    Admin_View.setFont(Font.font("Copperplate Gothic Bold",30));
		    Admin_View.setStyle("-fx-font-weight: bold;");
		    Admin_View.setFill(Color.rgb(249, 165, 67));
		    Admin_View.setX(240);
		    Admin_View.setY(57);
		    
		    Text select = new Text("Please Select An Option");
		    select.setX(10);
		    select.setY(175);
		    select.setFill(Color.rgb(249, 165, 67));
		    select.setStyle("-fx-font-weight: bold;");
		    
		    Button addplane = new Button("Add/Remove Flight");
		    addplane.setLayoutX(15);
		    addplane.setLayoutY(200);
		    addplane.setStyle("-fx-background-color: transparent;");
		    addplane.setFont(Font.font("Copperplate Gothic Bold",14));
		    addplane.setTextFill(Color.rgb(249, 165, 67));
		    addplane.setBackground(null);
		   
		    addplane.setOnAction(m -> stage.setScene(addplanes));
		    
		    Button viewuser = new Button("Remove User");
		    viewuser.setLayoutX(15);
		    viewuser.setLayoutY(300);
		    viewuser.setTextFill(Color.rgb(249, 165, 67));
		    addplane.setStyle("-fx-background-color: transparent;");
		    viewuser.setFont(Font.font("Copperplate Gothic Bold",14));
		    viewuser.setBackground(null);
		    viewuser.setOnAction(m -> stage.setScene(viewusers));
		    
		    Button adminview_back = new Button("←");
		    adminview_back.setLayoutX(2);
		    adminview_back.setLayoutY(-15);
		    adminview_back.setFont(Font.font("",42));
		    adminview_back.setStyle("-fx-background-color: transparent; ");
		    adminview_back.setTextFill(Color.rgb(249, 165, 67));
		    adminview_back.setOnAction(f -> stage.setScene(home));
		    
		    radminview.getChildren().addAll(Admin_View, select, addplane, viewuser, adminview_back);
		    
		  //----------------------------------------SCENE add planes---------------------------------------------------------------------
		    
		    Rectangle Plane_rec = new Rectangle();
		    Plane_rec.setX(0);    
		    Plane_rec.setY(0);    
		    Plane_rec.setWidth(1000);    
		    Plane_rec.setHeight(100); 
		    Plane_rec.setFill(Color.rgb(249, 165, 67));
		    Plane_rec.setOpacity(0.93);
		    
		    Text Addplane = new Text("Add/Remove Flight");
		    Addplane.setFont(Font.font("Copperplate Gothic Bold",30));
		    Addplane.setFill(Color.WHITESMOKE);
		    Addplane.setX(180);
		    Addplane.setY(57);
		    
		    Text Add_Flight = new Text("Add Flight");
		    Add_Flight.setFill(Color.rgb(249, 165, 67));
		    Add_Flight.setStyle("-fx-font-weight: bold;");
		    Add_Flight.setFont(Font.font("Copperplate Gothic Bold", 16));
		    Add_Flight.setX(15);
		    Add_Flight.setY(125);
		    
		    Text ID = new Text("ID");
		    ID.setFont(Font.font("",14));
		    ID.setX(5);
		    ID.setY(160);
		    ID.setFill(Color.rgb(249, 165, 67));
		    ID.setStyle("-fx-font-weight: bold;");
		    
		    Text plane_name = new Text("Name");
		    plane_name.setFont(Font.font("",14));
		    plane_name.setX(5);
		    plane_name.setY(210);
		    plane_name.setFill(Color.rgb(249, 165, 67));
		    plane_name.setStyle("-fx-font-weight: bold;");
		    
		    Text From = new Text("From");
		    From.setFont(Font.font("",14));
		    From.setX(5);
		    From.setY(260);
		    From.setFill(Color.rgb(249, 165, 67));
		    From.setStyle("-fx-font-weight: bold;");
		    
		    Text To = new Text("To");
		    To.setFont(Font.font("",14));
		    To.setX(5);
		    To.setY(310);
		    To.setFill(Color.rgb(249, 165, 67));
		    To.setStyle("-fx-font-weight: bold;");
		    
		    Text date = new Text("Date");
		    date.setFont(Font.font("",14));
		    date.setX(5);
		    date.setY(360);
		    date.setFill(Color.rgb(249, 165, 67));
		    date.setStyle("-fx-font-weight: bold;");
		    
		    Text Time = new Text("Time");
		    Time.setFont(Font.font("",14));
		    Time.setX(5);
		    Time.setY(410);
		    Time.setFill(Color.rgb(249, 165, 67));
		    Time.setStyle("-fx-font-weight: bold;");
		    
		    Text Price = new Text("Price");
		    Price.setFont(Font.font("",14));
		    Price.setX(5);
		    Price.setY(460);
		    Price.setFill(Color.rgb(249, 165, 67));
		    Price.setStyle("-fx-font-weight: bold;");
		    
		    Text seat = new Text("Seats");
		    seat.setFont(Font.font("",14));
		    seat.setX(5);
		    seat.setY(510);
		    seat.setFill(Color.rgb(249, 165, 67));
		    seat.setStyle("-fx-font-weight: bold;");
		    
		    Text Gate = new Text("Gate");
		    Gate.setFont(Font.font("",14));
		    Gate.setX(5);
		    Gate.setY(560);
		    Gate.setFill(Color.rgb(249, 165, 67));
		    Gate.setStyle("-fx-font-weight: bold;");
		    
		    Text remove_Flight = new Text("Remove Flight");
		    remove_Flight.setX(525);
		    remove_Flight.setY(140);
		    remove_Flight.setFill(Color.rgb(249, 165, 67));
		    remove_Flight.setFont(Font.font("Copperplate Gothic Bold", 16));
		    remove_Flight.setStyle("-fx-font-weight: bold;");
		    
		    Text remove_ID = new Text("ID");
		    remove_ID.setFont(Font.font("", 14));
		    remove_ID.setX(502);
		    remove_ID.setY(162);
		    remove_ID.setFill(Color.rgb(249, 165, 67));
		    remove_ID.setStyle("-fx-font-weight: bold;");
		    
		    TextField id = new TextField();
		    id.setPromptText("Enter ID: ");
		    id.setLayoutX(120);
		    id.setLayoutY(142);
		    
		    TextField Plane_name = new TextField();
		    Plane_name.setPromptText("Enter Name: ");
		    Plane_name.setLayoutX(120);
		    Plane_name.setLayoutY(192);
		    
		    TextField from = new TextField();
		    from.setPromptText("Enter From Country: ");
		    from.setLayoutX(120);
		    from.setLayoutY(242);
		    
		    TextField to = new TextField();
		    to.setPromptText("Enter To Country");
		    to.setLayoutX(120);
		    to.setLayoutY(292);
		    
		    TextField Date_p = new TextField();
		    Date_p.setPromptText("Enter Date: ");
		    Date_p.setLayoutX(120);
		    Date_p.setLayoutY(342);
		    
		    TextField time = new TextField();
		    time.setPromptText("Enter Time: ");
		    time.setLayoutX(120);
		    time.setLayoutY(392);
		    
		    TextField price = new TextField();
		    price.setPromptText("Enter Price: ");
		    price.setLayoutX(120);
		    price.setLayoutY(442);
		    
		    TextField seats = new TextField();
		    seats.setPromptText("Enter Seats: ");
		    seats.setLayoutX(120);
		    seats.setLayoutY(492);
		    
		    TextField gate = new TextField();
		    gate.setPromptText("Enter Gate: ");
		    gate.setLayoutX(120);
		    gate.setLayoutY(542);   
		    
		    TextField remove_id = new TextField();
		    remove_id.setPromptText("Enter ID: ");
		    remove_id.setLayoutX(525);
		    remove_id.setLayoutY(145);
		    

		    
		    Button Add = new Button("ADD");
		    Add.setLayoutX(280);
		    Add.setLayoutY(340);
		    Add.setPrefHeight(170);
		    Add.setPrefWidth(220);
		    Add.setStyle("-fx-background-color: transparent;");
		    Add.setFont(Font.font("Copperplate Gothic Bold", 22));
		    Add.setTextFill(Color.rgb(249, 165, 67));
		    
		    Button REMOVE = new Button("REMOVE");
		    REMOVE.setLayoutX(490);
		    REMOVE.setLayoutY(170);
		    REMOVE.setPrefHeight(170);
		    REMOVE.setPrefWidth(220);
		    REMOVE.setStyle("-fx-background-color: transparent;");
		    REMOVE.setFont(Font.font("Copperplate Gothic Bold", 20));
		    REMOVE.setTextFill(Color.rgb(249, 165, 67));

			Button add_plane_back = new Button("←");
			add_plane_back.setLayoutX(2);
			add_plane_back.setLayoutY(-15);
			add_plane_back.setFont(Font.font("",42));
			add_plane_back.setStyle("-fx-background-color: transparent; ");
			add_plane_back.setTextFill(Color.rgb(249, 165, 67));
			add_plane_back.setOnAction(f -> stage.setScene(adminview));

		    Alert alert_confirm_removal = new Alert(Alert.AlertType.CONFIRMATION);
		    alert_confirm_removal.setTitle("DONE!");
		    alert_confirm_removal.setContentText("The Flight Has Been Removed Successfully, Go Back To View More Options.");
			
			Alert alert_error_remove = new Alert(Alert.AlertType.ERROR);
			alert_error_remove.setTitle("ERROR");
			alert_error_remove.setContentText("Cannot Remove a Nonexisting Flight.");
			
			Alert alert_confirm_addflight = new Alert(Alert.AlertType.CONFIRMATION);
			alert_confirm_addflight.setTitle("DONE!");
			alert_confirm_addflight.setContentText("The Flight Has Been Added Successfully, Go Back To View More Options.");

			Alert alert_error_alreadytaken = new Alert(Alert.AlertType.ERROR);
			alert_error_alreadytaken.setTitle("ERROR");
			alert_error_alreadytaken.setContentText("The ID That has Been Entered Might Be Taken, Try Again.");

			REMOVE.setOnAction(m -> { // Button That removes Plane by ID
				
		    	int id_to_remove = Integer.parseInt(remove_id.getText());
		    	try {
					if (admin.delete_plane(id_to_remove) == "") {
						alert_confirm_removal.showAndWait();
					}
					
					else {
						alert_error_remove.showAndWait();
					}
				}
		    	
		    catch (SQLException e1) {e1.printStackTrace();}
		    });

		    Add.setOnAction(m -> { //Button to add a new plane
		    	int int_ID = Integer.parseInt(id.getText());
			    float int_Price = Float.parseFloat(price.getText());
			    int int_seats = Integer.parseInt(seats.getText());
				
			    try {
					if (admin.add_plane(int_ID, Plane_name.getText(), from.getText(), to.getText(),Date_p.getText() ,time.getText(), int_Price, int_seats,gate.getText()) == "") {
						alert_confirm_addflight.showAndWait();
					}
					else {
						alert_error_alreadytaken.showAndWait();
					}
				} 
			  catch (SQLException e1) {e1.printStackTrace();}
		    });
		    
		    
		   raddplane.getChildren().addAll( date,Date_p,Addplane, Add_Flight, ID, From,plane_name,To, Time, id, Plane_name, from, to, time, Price, seat, price, seats, Gate,gate,Add, add_plane_back, remove_id, remove_Flight, remove_ID, REMOVE);
		   
		 //----------------------------------------SCENE ViewUsers---------------------------------------------------------------------
		      
//	        Rectangle user_rec = new Rectangle();
//	        user_rec.setX(0);    
//	        user_rec.setY(0);    
//	        user_rec.setWidth(1000);    
//	        user_rec.setHeight(100); 
//	        user_rec.setFill(Color.rgb(249, 165, 67));
	    
	        Text View_Remove_Customer = new Text("Remove Customer");
	        View_Remove_Customer.setFont(Font.font("Copperplate Gothic Bold",30));
	        View_Remove_Customer.setFill(Color.rgb(249, 165, 67));
	        View_Remove_Customer.setX(150);
	        View_Remove_Customer.setY(57);
	    
	    	Text Remove_Customer = new Text("Remove Customer");
	    	Remove_Customer.setX(525);
	    	Remove_Customer.setY(140);
	    	Remove_Customer.setFill(Color.rgb(249, 165, 67));
	    	Remove_Customer.setStyle("-fx-font-weight: bold;");
	    	
		    Text Number_for_removing = new Text("Phone Number");
		    Number_for_removing.setFont(Font.font("", 14));
		    Number_for_removing.setX(420);
		    Number_for_removing.setFill(Color.rgb(249, 165, 67));
		    Number_for_removing.setStyle("-fx-font-weight: bold;");
		    Number_for_removing.setY(162);
		    
			TextField Number_for_remove = new TextField();
			Number_for_remove.setPromptText("Enter Phone Number: ");
			Number_for_remove.setLayoutX(525);
			Number_for_remove.setLayoutY(145);
		    
		    Button REMOVEE = new Button("REMOVE");
		    REMOVEE.setLayoutX(466);
		    REMOVEE.setLayoutY(158);
		    REMOVEE.setPrefHeight(200);
		    REMOVEE.setPrefWidth(250);
		    REMOVEE.setBackground(null);
		    REMOVEE.setTextFill(Color.rgb(249, 165, 67));
		    Number_for_removing.setStyle("-fx-font-weight: bold;");
		    REMOVEE.setFont(Font.font("Copperplate Gothic Bold", 18));
		    
		    Button View_user_back = new Button("←");
		    View_user_back.setLayoutX(2);
		    View_user_back.setLayoutY(-15);
		    View_user_back.setFont(Font.font("",42));
		    View_user_back.setBackground(null);
		    View_user_back.setTextFill(Color.rgb(249, 165, 67));
		    View_user_back.setOnAction(f -> stage.setScene(adminview));
		    
		    
		    Alert alert_Confirm_removal = new Alert(Alert.AlertType.CONFIRMATION);
		    alert_Confirm_removal.setTitle("DONE!");
		    alert_Confirm_removal.setContentText("The Customer Has Been Removed Successfully, Go Back To View More Options.");
		    
			Alert alert_Error_removal = new Alert(Alert.AlertType.ERROR);
			alert_Error_removal.setTitle("ERROR");
			alert_Error_removal.setContentText("Cannot Remove a Nonexisting Customer.");
		    
		    REMOVEE.setOnAction(o -> {
		    	try {
					if (admin.delete_user(Number_for_remove.getText()) == "") {
						alert_Confirm_removal.showAndWait();
					}
					else {
						alert_Error_removal.showAndWait();
					}
				} 
		    	
		    	catch (SQLException e1) {e1.printStackTrace();}
		    });
		    
rviewuser.getChildren().addAll( View_Remove_Customer, Remove_Customer, Number_for_removing, View_user_back, Number_for_remove, REMOVEE);
			 
		 //------------------------------------------------SCENE Main page--------------------------------------------------------------
			
			Text Flights = new Text("Flights");
			Flights.setFont(Font.font("Copperplate Gothic Bold",30));
			Flights.setFill(Color.WHITESMOKE);
			Flights.setX(276);
			Flights.setY(31);

			Rectangle Mainpage_rec = new Rectangle();
			Mainpage_rec.setX(0);    
			Mainpage_rec.setY(0);    
			Mainpage_rec.setWidth(1000);    
			Mainpage_rec.setHeight(100); 
			Mainpage_rec.setFill(Color.rgb(249, 165, 67));
			Mainpage_rec.setOpacity(0.95);
		
		    String cities[] = {"Cairo", "Riyadh", "Florida", "Dubai", "Paris", "AL Kuwait", "Madrid", "Sydney", "Bali", "Rome", "Istanbul", "Jersualem", "Tokyo", "Maldives", "Amman", "Toronto", "Rosario"};
		 
		    ArrayList<String> from_cities = new ArrayList<String>();
		    from_cities = process.from_countries();
		    ChoiceBox<String> from_choices = new ChoiceBox<>();
		    from_choices.setLayoutX(50);
		    from_choices.setLayoutY(50);
		    from_choices.setStyle("-fx-background-color: whitesmoke;");
		    
		    ArrayList<String>to_cities = new ArrayList<String>();
		    to_cities = process.to_countries();
		    ChoiceBox<String> to_choices = new ChoiceBox<>();
		    to_choices.setLayoutX(170);
		    to_choices.setLayoutY(50);
		    to_choices.setStyle("-fx-background-color: whitesmoke;");
		    
		    ArrayList<String>plane_list=new ArrayList<String>();
		    plane_list = process.display_plane();
		 
		    for (int a=0 ; a < cities.length ; a++) {
		    	from_choices.getItems().add(cities[a]);
		    	to_choices.getItems().add(cities[a]);}
		 
		    Text from_ = new Text("From");
		    Text to_ = new Text("To");
		    from_.setX(16);
		    from_.setY(67);
		    from_.setStyle("-fx-font-weight: bold;");
		    from_.setFill(Color.WHITESMOKE);
		    to_.setX(150);
		    to_.setY(68);
		    to_.setStyle("-fx-font-weight: bold;");
		    to_.setFill(Color.WHITESMOKE);
		    
		    Button confirm_filter = new Button("Confirm");
		    confirm_filter.setLayoutX(300);
		    confirm_filter.setLayoutY(50);
		    confirm_filter.setStyle("-fx-background-color: whitesmoke;");
		    
		    Button book_now = new Button("BOOK NOW!");
		    book_now.setLayoutX(465);
		    book_now.setLayoutY(50);
		    book_now.setStyle("-fx-background-color: whitesmoke;");
		    book_now.setOnAction(e -> stage.setScene(booking));
		    
		    Menu mainpage_more = new Menu("MORE");
		    mainpage_more.setStyle("-fx-background-color: transparent;");
		    mainpage_more.setStyle("-fx-font-size: 15");
		    MenuItem visa_card = new MenuItem("Add/Remove Card");
		    MenuItem cancel = new MenuItem("Cancel Reservation");
		    MenuItem Logout = new MenuItem("Logout");
		    MenuItem Exit = new MenuItem("Exit");
		    mainpage_more.getItems().addAll(visa_card, Logout, cancel, Exit);
		 
		    MenuBar mainpage_more_editor = new MenuBar();
		    mainpage_more_editor.getMenus().add(mainpage_more);
		    mainpage_more_editor.setStyle("-fx-background-color: transparent;");
		    mainpage_more_editor.setLayoutX(650);
		    mainpage_more_editor.setLayoutY(0);
		    
		    Logout.setOnAction(g ->stage.setScene(home));
		    Exit.setOnAction(g -> stage.close());
		    cancel.setOnAction( u ->stage.setScene(Cancel_Reservation));
		    visa_card.setOnAction(g -> stage.setScene(payment));
		  
		    int x = 0;
		    int y = 75;
		
		    Text[] info = new Text[plane_list.size()];
		    for (int i=0 ; i < plane_list.size() ; i++) {
		    	x = 0;
		    	y = y + 60;
		    	info[i] = new Text();
		    	info[i].setText(plane_list.get(i));
		    	info[i].setX(x);
		    	info[i].setY(y);
		    	info[i].setFont(Font.font("", 12));
		    	info[i].setFill(Color.WHITESMOKE);
		    	info[i].setStyle("-fx-font-weight: bold;");
		    	rMain_page.getChildren().add(info[i]);

		    }

		 
		    rMain_page.getChildren().addAll(Mainpage_rec, Flights, from_choices, to_choices, from_, to_, confirm_filter, book_now, mainpage_more_editor);

		 //------------------------------------------------SCENE Filter--------------------------------------------------------------

		    Alert alert_filter = new Alert(Alert.AlertType.ERROR);
			alert_filter.setTitle("ERROR");
			alert_filter.setContentText("The Flight You Are Trying to Reach is Unavailable, Try Again Later.");
		    confirm_filter.setOnAction(e -> { 
		    String Ffrom = from_choices.getValue();
		    String FTo = to_choices.getValue();
		    ArrayList<String> filter = new ArrayList<String>();
		    
		    try {
				filter = process.filtered(Ffrom, FTo);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		    if (filter.size() == 0) {
		    	alert_filter.showAndWait();
		    }
		    else if (filter.size() > 0) {
		    Text filter_flights = new Text("Filtered Flights");
		    filter_flights.setFont(Font.font("Copperplate Gothic Bold",30));
		    filter_flights.setFill(Color.rgb(249, 165, 67));
		    filter_flights.setX(150);
		    filter_flights.setY(57);
		    
		    Button filter_back = new Button("←");
		    filter_back.setLayoutX(2);
		    filter_back.setLayoutY(-20);
		    filter_back.setFont(Font.font("",42));
		    filter_back.setStyle("-fx-background-color: transparent;");
		    filter_back.setTextFill(Color.rgb(249, 165, 67));
		    filter_back.setOnAction(h -> stage.setScene(Main_page));
			 
			Text[] filtered_info = new Text[50];
		    int x2 = 0;
		    int y2 = 0;
		    for (int s=0 ; s < filter.size() ; s++) {
		    	x2 = 0;
		    	y2 = y2 + 150;
		    	filtered_info[s] = new Text();
		    	filtered_info[s].setText(filter.get(s));
		    	filtered_info[s].setX(x2);
		    	filtered_info[s].setY(y2);
		    	filtered_info[s].setFont(Font.font("", 12));
		    	filtered_info[s].setFill(Color.WHITESMOKE);
		    	filtered_info[s].setStyle("-fx-font-weight: bold;");

		    	rhomeFilter.getChildren().add(filtered_info[s]);}
		    stage.setScene(homeFilter);
			 
			 rhomeFilter.getChildren().addAll(filter_back, filter_flights);
			 
			
		    }});
		    
		    
		//------------------------------------------------SCENE Cancel Reservation--------------------------------------------------------------


		    
		    Text Cancel_reservation_header = new Text("Cancel Reservation");
		    Cancel_reservation_header.setFont(Font.font("Copperplate Gothic Bold",30));
		    Cancel_reservation_header.setFill(Color.rgb(249, 165, 67));
		    Cancel_reservation_header.setX(180);
		    Cancel_reservation_header.setY(57);
		    
		    Text Cancel_reservation = new Text("Cancel Reservation");
		    Cancel_reservation.setX(280);
		    Cancel_reservation.setY(225);
		    Cancel_reservation.setFill(Color.rgb(249, 165, 67));
		    Cancel_reservation.setStyle("-fx-font-weight: bold;");
		    Cancel_reservation.setFont(Font.font("", 14));
		 
		    Text Passport_Number = new Text("Passport Number");
		    Passport_Number.setFont(Font.font("", 14));
		    Passport_Number.setX(150);
		    Passport_Number.setY(266);
		    Passport_Number.setStyle("-fx-font-weight: bold;");
		    Passport_Number.setFill(Color.rgb(249, 165, 67));
		 
		    Text Flight_ID = new Text("Flight ID");
		    Flight_ID.setFont(Font.font("", 14));
		    Flight_ID.setX(186);
		    Flight_ID.setY(319);
		    Flight_ID.setStyle("-fx-font-weight: bold;");
		    Flight_ID.setFill(Color.rgb(249, 165, 67));
		    
		    TextField Passport_number = new TextField();
		    Passport_number.setPromptText("Enter Passport Number: ");
		    Passport_number.setLayoutX(270);
		    Passport_number.setLayoutY(250);

		    TextField Flight_id = new TextField();
		    Flight_id.setPromptText("Enter Flight ID: ");
		    Flight_id.setLayoutX(270);
		    Flight_id.setLayoutY(300);
		    
		    Button remove = new Button("REMOVE");
		    remove.setLayoutX(233);
		    remove.setLayoutY(320);
		    remove.setPrefHeight(170);
		    remove.setPrefWidth(220);
		    remove.setBackground(null);
		    remove.setFont(Font.font("Copperplate Gothic Bold", 20));
		    remove.setTextFill(Color.rgb(249, 165, 67));
		 
		    Button Cancel_reservation_back = new Button("←");
		    Cancel_reservation_back.setLayoutX(2);
		    Cancel_reservation_back.setLayoutY(-15);
		    Cancel_reservation_back.setFont(Font.font("",42));
		    Cancel_reservation_back.setStyle("-fx-background-color: transparent; ");
		    Cancel_reservation_back.setTextFill(Color.rgb(249, 165, 67));
		    Cancel_reservation_back.setOnAction(g ->stage.setScene(Main_page));
		    
		    
		    Alert alert_Confirm_Removal = new Alert(Alert.AlertType.CONFIRMATION);
		    alert_Confirm_Removal.setTitle("DONE!");
		    alert_Confirm_Removal.setContentText("The Registration Has Been Removed Successfully, Go Back To View More Options.");
		    
			Alert alert_Error_Removal = new Alert(Alert.AlertType.ERROR);
			alert_Error_Removal.setTitle("ERROR");
			alert_Error_Removal.setContentText("Cannot Remove a Nonexisting Registration.");
		    
		    
		    
		    
		    remove.setOnAction(e-> {
		    	boolean key;
		    	try {
					key=process.Ticket_cancellation(Integer.parseInt(Flight_id.getText()),Passport_number.getText());
					
					if(key){
						alert_Confirm_Removal.showAndWait();
					}
					else {
						alert_Error_Removal.showAndWait();
					}
				} 
		    	catch ( SQLException e1) {

					e1.printStackTrace();
				}
		    	
		    });
			
		    rCancel_Reservation.getChildren().addAll(Cancel_reservation, Passport_Number, Passport_number, Flight_ID, Flight_id, Cancel_reservation_header, remove, Cancel_reservation_back);
		 	

		    
		  //------------------------------------------------SCENE Payment Card--------------------------------------------------------------

		    Text Add_Remove_Card = new Text("Add/Remove Card");
		    Add_Remove_Card.setFont(Font.font("Copperplate Gothic Bold",30));
		    Add_Remove_Card.setFill(Color.rgb(249, 165, 67));
		    Add_Remove_Card.setX(184);
		    Add_Remove_Card.setY(50);
		 	
		    Text plez = new Text("Please Fill in the Data Required Below");
		    plez.setFont(Font.font("Copperplate Gothic Light",17));
		    plez.setFill(Color.BLACK);
		    plez.setFill(Color.rgb(249, 165, 67));
		    plez.setX(0);
		    plez.setY(120);
		    
		    Text card_number = new Text("Card Number");
		    card_number.setFont(Font.font("",14));
		    card_number.setX(0);
		    card_number.setY(170);
		    card_number.setStyle("-fx-font-weight: bold;");
		    card_number.setFill(Color.rgb(249, 165, 67));
		    
		    Text Cardholder_Name = new Text("Cardholder Name");
		    Cardholder_Name.setFont(Font.font("",14));
		    Cardholder_Name.setX(0);
		    Cardholder_Name.setY(220);
		    Cardholder_Name.setStyle("-fx-font-weight: bold;");
		    Cardholder_Name.setFill(Color.rgb(249, 165, 67));
		    
		    Text phone_number = new Text("Phone Number");
		    phone_number.setFont(Font.font("",14));
		    phone_number.setX(0);
		    phone_number.setY(270);
		    phone_number.setStyle("-fx-font-weight: bold;");
		    phone_number.setFill(Color.rgb(249, 165, 67));
		    
		    Text Expiration_Date = new Text("Expiration Date");
		    Expiration_Date.setFont(Font.font("",14));
		    Expiration_Date.setX(0);
		    Expiration_Date.setY(320);
		    Expiration_Date.setStyle("-fx-font-weight: bold;");
		    Expiration_Date.setFill(Color.rgb(249, 165, 67));
		    
		    Text Security_Code = new Text("Security Code");
		    Security_Code.setFont(Font.font("",14));
		    Security_Code.setX(0);
		    Security_Code.setY(370);
		    Security_Code.setStyle("-fx-font-weight: bold;");
		    Security_Code.setFill(Color.rgb(249, 165, 67));
		    
		    Text Remove_Card = new Text("Remove Card");
		    Remove_Card.setX(500);
		    Remove_Card.setY(152);
		    Remove_Card.setStyle("-fx-font-weight: bold;");
		    Remove_Card.setFill(Color.rgb(249, 165, 67));
		    
		    Text last_4 = new Text("Last 4 Digits on Card");
		    last_4.setX(380);
		    last_4.setY(173);
		    last_4.setStyle("-fx-font-weight: bold;");
		    last_4.setFill(Color.rgb(249, 165, 67));
		    
		    TextField Card_Number = new TextField();
		    Card_Number.setPromptText("Enter Card Number: ");
		    Card_Number.setLayoutX(120);
		    Card_Number.setLayoutY(152);
		    

		    TextField Cardholder_name = new TextField();
		    Cardholder_name.setPromptText("Enter Cardholder Name: ");
		    Cardholder_name.setLayoutX(120);
		    Cardholder_name.setLayoutY(202);
		    
		    TextField Phone_Visa = new TextField();
		    Phone_Visa.setPromptText("Enter Phone Number: ");
		    Phone_Visa.setLayoutX(120);
		    Phone_Visa.setLayoutY(252);
		    
		    TextField MM_YY = new TextField();
		    MM_YY.setPromptText("MM/YY");
		    MM_YY.setLayoutX(120);
		    MM_YY.setLayoutY(302);
		    
		    TextField CVV = new TextField();
		    CVV.setPromptText("CVV/CVC");
		    CVV.setLayoutX(120);
		    CVV.setLayoutY(352);
		    
		    TextField digit4 = new TextField();
		    digit4.setPromptText("Enter Last 4 Digits: ");
		    digit4.setLayoutX(500);
		    digit4.setLayoutY(157);

		    Button add_visa = new Button("ADD");
		    add_visa.setLayoutX(135);
		    add_visa.setLayoutY(400);
		    add_visa.setFont(Font.font("Copperplate Gothic Bold",24));
		    add_visa.setTextFill(Color.rgb(249, 165, 67));
		    add_visa.setBackground(null);
		    
		    Button payment_back = new Button("←");
		    payment_back.setLayoutX(2);
		    payment_back.setLayoutY(-15);
		    payment_back.setFont(Font.font("",42));
		    payment_back.setStyle("-fx-background-color: transparent; ");
		    payment_back.setTextFill(Color.rgb(249, 165, 67));
		    payment_back.setOnAction(z -> stage.setScene(Main_page));
		    

		    Button remove_ = new Button("REMOVE");
		    remove_.setLayoutX(515);
		    remove_.setLayoutY(200);
		    remove_.setFont(Font.font("Copperplate Gothic Bold",18));
		    remove_.setPrefHeight(70);
		    remove_.setPrefWidth(125);
		    remove_.setTextFill(Color.rgb(249, 165, 67));
		    remove_.setBackground(null);
		 
		    Alert alert_confirm_card = new Alert(Alert.AlertType.CONFIRMATION);
		    alert_confirm_card.setTitle("DONE!");
			alert_confirm_card.setContentText("The Card Has Been Added Successfully, Click <- To Go Back.");
			
			Alert alert_error_invalid = new Alert(Alert.AlertType.ERROR);
			alert_error_invalid.setTitle("ERROR");
			alert_error_invalid.setContentText("The Data Are Invalid, Try Again.");
			
			Alert alert_error_already = new Alert(Alert.AlertType.ERROR);
			alert_error_already.setTitle("ERROR");
			alert_error_already.setContentText("The Card Is Already Added, Try Again.");
			
			Alert alert_confirm_deleted = new Alert(Alert.AlertType.CONFIRMATION);
			alert_confirm_deleted.setTitle("DONE!");
			alert_confirm_deleted.setContentText("The Card Has Been Deleted Successfully, Click <- To Go Back.");
			Alert alert_error_Invalid = new Alert(Alert.AlertType.ERROR);
			alert_error_Invalid.setTitle("ERROR");
			alert_error_Invalid.setContentText("The Data Are Invalid, Try Again.");
			
			
			add_visa.setOnAction(r -> {
				
				try {
					int cvv = Integer.parseInt(CVV.getText());
					String ff = process.add_visa(Card_Number.getText(), MM_YY.getText(), cvv, Cardholder_name.getText(), Phone_Visa.getText());
					if ( ff == "") {
						alert_confirm_card.showAndWait();
		            }
					else if (ff == "1") {
						alert_error_invalid.showAndWait();
					}
					else {
						alert_error_already.showAndWait();
					}
				} 
				catch (SQLException e1) {e1.printStackTrace();}
			});
			
			remove_.setOnAction(m -> {
				try {
					String como = process.delete_visa(digit4.getText());
					
					if (como == "") {
						alert_confirm_deleted.showAndWait();
					}
					else {
						alert_error_Invalid.showAndWait();
					}
				} 
				catch (SQLException e1) {e1.printStackTrace();}
				
			});
			
			rpayment.getChildren().addAll(plez, card_number, Cardholder_Name, phone_number, Expiration_Date, Card_Number, Cardholder_name, Phone_Visa, Security_Code, MM_YY, CVV, add_visa, payment_back, Remove_Card, last_4, digit4, remove_, Add_Remove_Card);
			
			//-----------------------------------------------SCENE BOOKING---------------------------------------------------------
			
			 ChoiceBox<String> PlanesBox = new ChoiceBox<>();
			 PlanesBox.setLayoutX(0);
			 PlanesBox.setLayoutY(35);
			 PlanesBox.setStyle("-fx-background-color: whitesmoke;");
			 ArrayList<String>planes_list = new ArrayList<String>();
			 planes_list = process.display_plane2();
			  for (int k=0 ; k < planes_list.size() ; k++) {
			    	PlanesBox.getItems().add(planes_list.get(k));}
			 
			 
			 ChoiceBox<String> visaBox = new ChoiceBox<>();
			 visaBox.setStyle("-fx-background-color: whitesmoke;");
			 
			 
			 
			 
			 
		     Rectangle booking_rec = new Rectangle();
		     booking_rec.setX(0);    
		     booking_rec.setY(0);    
		     booking_rec.setWidth(1000);    
		     booking_rec.setHeight(100); 
		     booking_rec.setFill(Color.rgb(249, 165, 67));
			 
			 Text booking_header = new Text("Payment");
			 booking_header.setFont(Font.font("Copperplate Gothic Bold",30));
			 booking_header.setFill(Color.WHITESMOKE);
			 booking_header.setX(365);
			 booking_header.setY(65);
				  
			 Text flight_box = new Text("Please Choose The Flight You Want To Book Below.");
			 flight_box.setX(0);
			 flight_box.setY(20);
			 flight_box.setFont(Font.font("", 13));	
			 flight_box.setStyle("-fx-font-weight: bold");
			 flight_box.setFill(Color.WHITESMOKE);
		     
			 Text Personal_Information = new Text("Personal Information");
			 Personal_Information.setStyle("-fx-font-weight: bold;");
			 Personal_Information.setX(315);
			 Personal_Information.setY(125);
			 Personal_Information.setFont(Font.font("", 14));
			 Personal_Information.setFill(Color.WHITESMOKE);

			 Text name_booking = new Text("Name");
			 name_booking.setX(315);
			 name_booking.setY(190);
			 name_booking.setStyle("-fx-font-weight: bold;");
			 name_booking.setFill(Color.WHITESMOKE);
		     Text booking_number = new Text("Phone Number");
		     booking_number.setX(315);
		     booking_number.setY(250);
		     booking_number.setStyle("-fx-font-weight: bold;");
		     booking_number.setFill(Color.WHITESMOKE);
			
		     Text booking_Passport_Number = new Text("Passport Number");
		     booking_Passport_Number.setX(315);
		     booking_Passport_Number.setY(310);
		     booking_Passport_Number.setStyle("-fx-font-weight: bold;");
		     booking_Passport_Number.setFill(Color.WHITESMOKE);
		     
		     Text Travel_Class = new Text("Travel Class");
			 Travel_Class.setX(315);
			 Travel_Class.setY(370);
			 Travel_Class.setStyle("-fx-font-weight: bold;");
			 Travel_Class.setFill(Color.WHITESMOKE);
			 Text pay = new Text("Credit Card Information");
			 pay.setStyle("-fx-font-weight: bold;");
			 pay.setX(525);
			 pay.setY(125);
			 pay.setFont(Font.font("", 14));
			 pay.setFill(Color.WHITESMOKE);
			 
			 Text pay_Cardholder_Name = new Text("Cardholder Name");
			 pay_Cardholder_Name.setStyle("-fx-font-weight: bold;");
			 pay_Cardholder_Name.setFill(Color.WHITESMOKE);
			 pay_Cardholder_Name.setVisible(false);
			 
			 Text pay_Card_Number = new Text("Card Number");
			 pay_Card_Number.setStyle("-fx-font-weight: bold;");
			 pay_Card_Number.setFill(Color.WHITESMOKE);
			 pay_Card_Number.setVisible(false);
			 
			 Text pay_Expiration_Date = new Text("Expiration Date");
			 pay_Expiration_Date.setStyle("-fx-font-weight: bold;");
			 pay_Expiration_Date.setFill(Color.WHITESMOKE);
			 pay_Expiration_Date.setVisible(false);
			 
			 Text pay_Security_Code = new Text("Security Code");
			 pay_Security_Code.setStyle("-fx-font-weight: bold;");
			 pay_Security_Code.setFill(Color.WHITESMOKE);
			 pay_Security_Code.setVisible(false);
			 
			 Text note = new Text("*First Class: Initial Amount + 3000EGP\n*Business Class: Initial Amount+ 2000EGP");
			 note.setFont(Font.font("", 10));
			 note.setX(410);
			 note.setY(475);
			 note.setFill(Color.WHITESMOKE);
			 
		     TextField Bname = new TextField();
		     Bname.setPromptText("Enter Your Name: ");
			 Bname.setLayoutX(315);
			 Bname.setLayoutY(195);
		    
			 TextField Bnumber = new TextField();
			 Bnumber.setPromptText("Enter Phone Number: ");
			 Bnumber.setLayoutX(315);
		     Bnumber.setLayoutY(255);
		     
			 TextField Bpassport = new TextField();
			 Bpassport.setPromptText("Enter Passport Number: ");
			 Bpassport.setLayoutX(315);
			 Bpassport.setLayoutY(315);
			 
			 TextField cardholder = new TextField();
			 cardholder.setVisible(false);
		    
			 TextField cardnumber = new TextField();
			 cardnumber.setVisible(false);
			 
			 TextField exp = new TextField();
			 exp.setVisible(false);
			 
			 TextField code = new TextField();
			 code.setVisible(false);
			 
			 visaBox.setVisible(false);
			 visaBox.setDisable(true);
			 
			 ChoiceBox<String> Bclass = new ChoiceBox<>();
			 Bclass.getItems().add("First Class");
			 Bclass.getItems().add("Business Class");
			 Bclass.getItems().add("Economy Class");
			 Bclass.setPrefWidth(140);
			 Bclass.setLayoutX(315);
			 Bclass.setLayoutY(373);

		     CheckBox evisa = new CheckBox("Existing Card");
			 evisa.setLayoutX(515);
			 evisa.setLayoutY(135);
		     
			 CheckBox ovisa = new CheckBox("New Card");
			 ovisa.setLayoutX(625);
			 ovisa.setLayoutY(135);    

			 Button BOOK = new Button("BOOK");
			 BOOK.setLayoutX(555);
			 BOOK.setLayoutY(410);
			 BOOK.setBackground(null);
			 BOOK.setFont(Font.font("Copperplate Gothic Bold", 20));
			 BOOK.setTextFill(Color.WHITESMOKE);
				    
			 Menu more3 = new Menu("MORE");
			 more3.setStyle("-fx-background-color: transparent;");
			 more3.setStyle("-fx-font-size: 15");
			 MenuItem Back = new MenuItem("Back");	    
			 MenuItem Logout2 = new MenuItem("Logout");
			 MenuItem Exit2 = new MenuItem("Exit");

			 more3.getItems().addAll(Back,Logout2, Exit2);
				   
			 MenuBar Bmenu3 = new MenuBar();
			 Bmenu3.getMenus().add(more3);
			 Bmenu3.setLayoutX(650);
			 Bmenu3.setLayoutY(0);
			 Bmenu3.setStyle("-fx-background-color: transparent;");
			 Back.setOnAction(g -> stage.setScene(Main_page));
			 Logout2.setOnAction(g -> stage.setScene(home));
			 Exit2.setOnAction(g -> stage.close());
			
			 evisa.setOnAction(w -> {
				 ArrayList<String>visa_list = new ArrayList<String>();
				 try {
					visa_list = process.Existing_visa(global_phone);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				 for (int l=0 ; l < visa_list.size() ; l++) {
					   visaBox.getItems().add(visa_list.get(l));}
				 ovisa.setSelected(false);
				 cardholder.setVisible(false);
				 pay_Cardholder_Name.setVisible(false);
				 cardnumber.setVisible(false);
				 pay_Card_Number.setVisible(false);
				 exp.setVisible(false);
				 pay_Expiration_Date.setVisible(false);
				 code.setVisible(false);
				 pay_Security_Code.setVisible(false);
				
				 visaBox.setPrefWidth(150);
				 visaBox.setLayoutX(520);  
				 visaBox.setLayoutY(155);
				 visaBox.setDisable(false);
				 visaBox.setVisible(true);
		         
			});
			 
			 ovisa.setOnAction(w -> { 
				evisa.setSelected(false);
				
			    cardholder.setVisible(true);
				cardholder.setPromptText("Name On Card: ");
				cardholder.setLayoutX(525);
				cardholder.setLayoutY(200);
				
				pay_Cardholder_Name.setVisible(true);
				pay_Cardholder_Name.setX(525);
				pay_Cardholder_Name.setY(195);

				cardnumber.setVisible(true);
				cardnumber.setPromptText("0000 0000 0000 0000");
				cardnumber.setLayoutX(525);
				cardnumber.setLayoutY(250);
				
				pay_Card_Number.setVisible(true);
				pay_Card_Number.setX(525);
				pay_Card_Number.setY(245);
				 
				exp.setVisible(true);
				exp.setPromptText("MM/YY");
				exp.setLayoutX(525);
				exp.setLayoutY(300);
				 
				pay_Expiration_Date.setVisible(true);
				pay_Expiration_Date.setX(525);
				pay_Expiration_Date.setY(295);
				  
				code.setVisible(true);
				code.setPromptText("CVV/CVC");
				code.setLayoutX(525);
				code.setLayoutY(355);
				
				pay_Security_Code.setVisible(true);
				pay_Security_Code.setX(525);
				pay_Security_Code.setY(350);
				
			    visaBox.setDisable(true);
			    visaBox.setVisible(false);
				    });
			 

				
				rbooking.getChildren().addAll(cardholder, cardnumber, exp, code, Personal_Information, booking_number, booking_Passport_Number, Travel_Class, PlanesBox, flight_box,name_booking ,Bname, Bnumber, Bpassport, Bclass, BOOK, pay, pay_Cardholder_Name, pay_Card_Number, pay_Expiration_Date, pay_Security_Code, booking_header, note, Bmenu3, evisa, ovisa, visaBox);    

//-----------------------------------------------SCENE viewTicket---------------------------------------------------------
				
				BOOK.setOnAction(k -> {stage.setScene(viewticket);
				String line = PlanesBox.getValue();
				int s= line.indexOf("Price:");
			    int e= line.indexOf(".");
			    
				global_price = Float.parseFloat(line.substring(s+7, e));
				String Class = Bclass.getValue();
				if (Class == "First Class") {
					global_price = global_price + 3000;
				}
				
				else if (Class == "Business Class") {
					global_price = global_price + 2000;
				}
		
				   

				    ArrayList<String>arrlist = new ArrayList<String>();
				    try {
						arrlist = process.Ticket_reservation(Bname.getText(), Bnumber.getText(), Bpassport.getText(), Bclass.getValue(), PlanesBox.getValue());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				    
					
					imageView2.setX(135); 
				    imageView2.setY(220);  
				    imageView2.setFitHeight(450); 
				    imageView2.setFitWidth(450); 
				    imageView2.setPreserveRatio(true);
				    
				    Text view_ticket = new Text("Ticket");
				    view_ticket.setFont(Font.font("Copperplate Gothic Bold",32));
				    view_ticket.setFill(Color.rgb(7, 34, 105));
				    view_ticket.setX(290);
				    view_ticket.setY(65);
				    
				    String tname = arrlist.get(0);
				    Text T_name = new Text(tname);
				    T_name.setStyle("-fx-font-weight: bold;");
				    T_name.setFont(Font.font("",14));
				    T_name.setX(300);
				    T_name.setY(308);
				    
				    String tid = arrlist.get(1);
				    Text T_id = new Text(tid);
				    T_id.setStyle("-fx-font-weight: bold;");
				    T_id.setFont(Font.font("",14));
				    T_id.setX(302);
				    T_id.setY(384);
				    
				    String ttake_off = arrlist.get(2);
				    Text T_take_off = new Text(ttake_off);
				    T_take_off.setStyle("-fx-font-weight: bold;");
				    T_take_off.setFont(Font.font("",14));
				    T_take_off.setX(461);
				    T_take_off.setY(419);
				    
				    String tgate = arrlist.get(3);
				    Text T_gate = new Text(tgate);
				    T_gate.setStyle("-fx-font-weight: bold;");
				    T_gate.setFont(Font.font("",14));
				    T_gate.setX(296);
				    T_gate.setY(418);
				    
				    String tseat = arrlist.get(4);
				    Text T_seat = new Text(tseat);
				    T_seat.setStyle("-fx-font-weight: bold;");
				    T_seat.setFont(Font.font("",14));
				    T_seat.setX(500);
				    T_seat.setY(383);
				    
				    String tfrom = arrlist.get(5);
				    Text T_from = new Text(tfrom);
				    T_from.setStyle("-fx-font-weight: bold;");
				    T_from.setFont(Font.font("",14));
				    T_from.setX(300);
				    T_from.setY(345);
				    
				    String tto = arrlist.get(6);
				    Text T_to = new Text(tto);
				    T_to.setStyle("-fx-font-weight: bold;");
				    T_to.setFont(Font.font("",14));
				    T_to.setX(397);
				    T_to.setY(344);
				    
				    String tdate = arrlist.get(7);
				    Text T_date = new Text(tdate);
				    T_date.setStyle("-fx-font-weight: bold;");
				    T_date.setFill(Color.BLACK);
				    T_date.setFont(Font.font("",13));
				    T_date.setX(390);
				    T_date.setY(383);
				    
				    
				    Text plzt = new Text("Here Is Your Flight Ticket! Thank You for Trusting Us\nHappy Flight, "+tname+"!"+"\nThe Cost You Paid for This Flight is: "+global_price+"EGP");
				    plzt.setFont(Font.font("Copperplate Gothic Light",17));
				    plzt.setFill(Color.BLACK);
				    plzt.setX(0);
				    plzt.setY(125);
			
				    Button ticket_exit = new Button("EXIT");
				    ticket_exit.setLayoutX(2);
				    ticket_exit.setLayoutY(-20);
				    ticket_exit.setFont(Font.font("",42));
				    ticket_exit.setStyle("-fx-background-color: transparent; ");
				    ticket_exit.setOnAction(h -> stage.setScene(Main_page));
				    

				    
				    
				    
				    
				   
				   
				    rviewticket.getChildren().addAll(view_ticket, imageView2, plzt, T_name,T_date, T_id, T_take_off,T_gate , T_seat, T_from, T_to);

				});
			 

			
			 
			stage.setScene(home);
			stage.setResizable(false);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}