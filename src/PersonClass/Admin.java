package PersonClass;

/**
 *
 * @author Ali Hamidy
 */
public abstract class Admin extends Person {

    private String AdminID, Username, Password;

    public String getAdminID() {
        return AdminID;
    }

    public void setAdminID(String value) {
        AdminID = value;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String value) {
        Username = value;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String value) {
        Password = value;
    }

    //public abstract void generateID();
}
