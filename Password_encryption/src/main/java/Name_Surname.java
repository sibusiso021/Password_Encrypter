import java.util.Scanner;

public class Name_Surname {
    String name;
    String surname;

    public void  setName(){
        Scanner user_name = new Scanner(System.in);
        System.out.println("PLease enter your name: ");
        name = user_name.nextLine();

        while(true){
            if (!(name.matches("[a-zA-Z]+"))){
                System.out.println("Please enter a valid name as displayed on your ID");
                name = user_name.nextLine();

        }else {
                break;

            }

        }
    System.out.println("Thank you " + name + " you may proceed....");

    }

    public void setSurname(){
        Scanner user_surname = new Scanner(System.in);
        System.out.println("PLease enter your surname: ");
        surname = user_surname.nextLine();

        while(true){
            if (!(surname.matches("[a-zA-Z]+"))){
                System.out.println("Please enter a valid surname as displayed on your ID");
                surname = user_surname.nextLine();

            }else {
                break;

            }

        }
    System.out.println("Thank you " + surname);


    }


    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void LastMessage() {
        System.out.println("********************************************************************");
        System.out.println("\"Amateurs hack systems, Professionals hack people...\" Cyber Sophia");
        System.out.println("********************************************************************");
        System.out.println(name + " " + surname + " please wait while the magic happens, this might take a while....");
        System.out.println("____________________________________________________________________");
    }
}
