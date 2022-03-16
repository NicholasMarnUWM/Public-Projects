import java.awt.*;


public class CredentialCheck {
  CredentialCheck() {
    Frame mainFrame = new Frame();
    Label prompt = new Label("User Credentials:");
    Label username = new Label("User:");
    Label password = new Label("Password:");
    Button submission = new Button("Submit");
    TextField nameIn = new TextField();
    TextField passIn = new TextField();
    mainFrame.setSize(600, 400);
    mainFrame.setTitle("Marn vague application");
    mainFrame.setVisible(true);
    
  }
  public static void main(String[] args) {
    CredentialCheck start = new CredentialCheck();

  }

}
