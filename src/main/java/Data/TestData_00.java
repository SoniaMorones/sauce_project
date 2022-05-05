package Data;



    public enum TestData_00 {



        TEST_DATA ("https://www.saucedemo.com/",
                "standard_user",
                "secret_sauce",
                 "Maria",
                 "Lopéz",
                "45120");



    private final String url;
    private final String Username;
    private final String Password;
    private final String FirstName;
    private final String LastName;
    private final String ZipCode;


    //Constructor



        TestData_00 (String url,
                     String Username,
                     String Password,
                     String FirstName,
                     String LastName,
                     String ZipCode) {
            this.url = url;
            this.Username = Username;
            this.Password = Password;
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.ZipCode = ZipCode;
        }

    //Methods to access data

    public String GetURL () {
        return url;
    }
    public String UserData(){
            return Username;
    }

    public String PasswordData () {
            return Password;
    }

   public String FirstNameData () {
            return FirstName;
   }
   public String LastNameData () {
            return LastName;
   }

   public String ZipCodeData () {
            return ZipCode;
   }

}
