import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    static Scanner in = new Scanner(System.in);

    static List<Work> myList = new ArrayList();

    public static void main(String[] args) {
        String optiune = "";


        Work w1 = new Work();
        w1.setZiSapt("Luni");
        w1.setGrMusc("Brate");
        w1.setTipEx("Tractiuni");
        w1.setNrRep("10");


        Work w3 = new Work();
        w3.setZiSapt("Miercuri");
        w3.setGrMusc("Piept");
        w3.setTipEx("Flotari");
        w3.setNrRep("20");

        myList.add(w1);

        myList.add(w3);


        do {
            System.out.println("Meniu:\n\t1. Adauga o sesiune de workout" +
                    "\n\t2. Listeaza sesiuni" +
                    "\n\t3. Sterge sesiune" +
                    "\n\t4. Cauta sesiune" +
                    "\n\t5. Editare sesiune " +
                    "\n\t0. Exit");
            //Scanner in = new Scanner(System.in);
            System.out.println("Optiune: ");
            optiune = in.nextLine();

            switch (optiune) {
                case "0":
                    System.out.println("Exiting...");
                    break;
                case "1":
                    Scanner a2 = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Ziua saptamanii ");
                    String ziSaptTemp = a2.nextLine();
                    System.out.println("Grupa musculara: ");
                    String grMuscTemp = a2.nextLine();
                    System.out.println("Tipul exercitiului: ");
                    String tipExTemp = a2.nextLine();
                    System.out.println("Numar repetari: ");
                    String nrRepTemp = a2.nextLine();


                    System.out.println("Ziua saptamanii: " + ziSaptTemp);  // Output user input
                    System.out.println("Grupa musculara: " + grMuscTemp);
                    System.out.println("Tipul de exercitiu: " + tipExTemp);
                    System.out.println("Numar repetari: " + nrRepTemp);

                    Work w2 = new Work();
//
                    w2.setZiSapt(ziSaptTemp);
                    w2.setGrMusc(grMuscTemp);
                    w2.setTipEx(tipExTemp);
                    w2.setNrRep(nrRepTemp);

                    myList.add(w2);

                    break;
                case "2":
                    System.out.println("Lista sesiunilor " + '\n' +myList);
                    break;
                case "3":
                    System.out.println("Sesiune care se va sterge - id.: ");
                    String idStr = in.nextLine();
                    int idInt = Integer.parseInt(idStr);

                    for (Work w : myList) {
                        if (w.getId() == idInt) {

                            myList.remove(w);
                            break;

                        }
                    }
                    break;
                case "4":
                    System.out.println("Sesiune care se va afisa - id.: ");
                    idStr = in.nextLine();
                    idInt = Integer.parseInt(idStr);

                    for (Work w : myList) {
                        if (w.getId() == idInt) {

                            System.out.println("Sesiunea cautata " + w);
                            break;

                        }
                    }
                    break;
                case "5":
                    System.out.println("Sesiune care se va edita - id.: ");
                     idStr = in.nextLine();
                    idInt = Integer.parseInt(idStr);

                    for (Work w : myList) {
                        if (w.getId() == idInt) {
                            System.out.println("Sesiunea de editat " + w);

                            Scanner b2 = new Scanner(System.in);  // Create a Scanner object
                            System.out.println("Ziua saptamanii ");
                            ziSaptTemp = b2.nextLine();
                            System.out.println("Grupa musculara: ");
                            grMuscTemp = b2.nextLine();
                            System.out.println("Tipul exercitiului: ");
                            tipExTemp = b2.nextLine();
                            System.out.println("Numar repetari: ");
                            nrRepTemp = b2.nextLine();


                            System.out.println("Ziua saptamanii: " + ziSaptTemp);  // Output user input
                            System.out.println("Grupa musculara: " + grMuscTemp);
                            System.out.println("Tipul de exercitiu: " + tipExTemp);
                            System.out.println("Numar repetari: " + nrRepTemp);


                            w.setZiSapt(ziSaptTemp);
                            w.setGrMusc(grMuscTemp);
                            w.setTipEx(tipExTemp);
                            w.setNrRep(nrRepTemp);

                            System.out.println("Sesiunea editata cu succes " + w);

                            break;
                        }
                    }
                    break;
                default:
                    System.err.println("Optiune incorecta");
            }

        } while (!optiune.equals("0"));


    }
}


