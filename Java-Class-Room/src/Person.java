public class Person {

    /* Do not remove the comments
    // 1. create a string reference to the name of the person with a private access modifier eg. private String name;

    // 2. create a string reference to the name of the person with a private access modifier eg. private String surname;

    // 3. Add a constructor to initialize both local variables;

    // 4. Add getters and setters with public access modifier for all local variables;

    -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    Add code below
    */

    //Add all student variables with private access modifiers
    private String name;
    private String surname;

    //Add all constructors
    
    // Default constructor
    Person()
    {
        this.name="";
        this.surname="";

    }

    // name and surname constructor
    Person(String name,String surname)
    {
        // initialize local variables;
        this.name=name;
        this.surname=surname;
    }

    //Add all getters and setters for local variables 
    //Getters
    public String getName()
    {
        return this.name;
    }

    public String getSurname()
    {
        return this.surname;
    }

    //Setters
    public void setSurname(String surname)
    {
        this.surname=surname;
    }

    public void setName(String name)
    {
        this.name=name;
    }



    
}
