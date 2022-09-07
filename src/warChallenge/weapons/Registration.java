package warChallenge.weapons;

import java.io.*;
import java.util.Scanner;

public class Registration {
    public void register() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name: ");
        String Uname = sc.nextLine();
        System.out.println(Uname);

        System.out.println("Enter Password: ");
        String Pass = sc.nextLine();
        System.out.println(Pass);

        System.out.println("Confirm Password: ");
        String ConPass = sc.nextLine();
        System.out.println(ConPass);
        Uname = Uname.trim();
        Pass = Pass.trim();
        ConPass = ConPass.trim();


        String x = Uname + " " + Pass;
        Scanner content;
        if (Pass.equals(ConPass)) {

            File f = new File("warGame.txt");
            content = new Scanner(f);
        }
        int flag = 0;
        if (flag == 0) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("warGame.txt", true));
                out.write(Uname + " " + Pass + "\n");
                out.close();
            } catch (IOException e) {
                System.out.println("Error" + e);
            }

            System.out.println("Successfully Registered");
            System.out.println();
            Thread.sleep(2000);


        }
    }
    public void getMembers() throws IOException {
        FileReader fr=new FileReader("warGame.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}
/*
        int flag = 0;
        while (content.hasNextLine()) {
            String data = content.nextLine();
            if (data.equals(x)) {
                System.out.println("Already Registered");
                flag = 1;
                System.out.println("1. Registration. ");
                // System.out.println("2. Login. ");

                System.out.println("Enter your Choice");
                int choice = sc.nextInt();
                if (choice == 1) {
                    this.register();
                } else if (choice == 2) {

                } else {
                    System.out.println("Choose Proper Option");
                }
                break;
            }
        }
        content.close();

        if (flag == 0) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("Registration.txt", true));
                out.write(Uname + " " + Pass + "\n");
                out.close();
            } catch (IOException e) {
                System.out.println("Error" + e);
            }

            System.out.println("Successfully Registered");
            System.out.println();
            Thread.sleep(2000);


        }
    }
}

/*
    } else {
            System.out.println("Recheck");
            System.out.println("1. Registration. ");
            System.out.println("2. Login. ");

            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            if (choice == 1) {
                try {
                    this.register();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (choice == 2) {
                System.out.println("register");
                try {
                    register();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Choose Proper Option");
            }
        }
        sc.close();
    }

/*
    public void login() throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name: ");
        String Uname = sc.nextLine();
        System.out.println(Uname);

        System.out.println("Enter Password: ");
        String Pass = sc.nextLine();
        System.out.println(Pass);
        Uname = Uname.trim();
        Pass = Pass.trim();
        String x = Uname + " " + Pass;


        try {

            File f = new File("Registration.txt");
            Scanner content = new Scanner(f);
            int flag = 0;
            while (content.hasNextLine()) {
                String data = content.nextLine();
                if (data.equals(x)) {
                    System.out.println("Login Successful!");
                    System.out.println();
                    Thread.sleep(2000);
                    System.out.println("====== **************** Welcome to the War Game Application.**************** ======");
                    System.out.println();
                    System.out.println();
                    flag = 1;
                    break;
                }
                Thread.sleep(3000);
            }
            if (flag == 0) {
                System.out.println("Login Failed");
                System.out.println("1. Registration. ");
                System.out.println("2. Login. ");

                System.out.println("Enter your Choice");
                int choice = sc.nextInt();
                if (choice == 1) {
                    this.register();
                } else if (choice == 2) {
                    this.login();
                } else {
                    System.out.println("Choose Proper Option");
                }
            }

            content.close();
        } catch (FileNotFoundException e) {


            System.out.println("Error.");
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }

 */



