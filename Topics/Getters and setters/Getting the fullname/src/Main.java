class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        // write your code here
        this.lastName = lastName;
    }

    public String getFullName() {
        if (firstName != null && lastName != null) {
            return firstName + " " + lastName;
        }
        if (firstName != null) {
            return firstName;
        }
        if (lastName != null) {
            return lastName;
        }

        return "Unknown";
    }
}