package pl.edu.ur.polab4;
import pl.edu.ur.polab4.wprowadzDane.student;    
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        
       Scanner imp = new Scanner(System.in);
       
       int sw,a,b;
       
       student[] student = new student[100];
       
       for (int i = 0; i < student.length; i++) 
       {
            student[i] = new student.setStudent();
        }
       
       System.out.println("Działania: \n 1. Wprowadzanie danych pod wybrany indeks \n 2. Modyfiakcja danych w okreslonym indeksie \n 3. Zerowanie danych studenta \n 4. Informacje o studencie \n 5. Lista wszystkic studentów \n 6. Wyświetlenie zakresu studentów");
       sw = imp.nextInt();
       
       switch(sw){
            case 1:
                
                break;
            case 2: 
                
                break;
            case 3: 
                
                break;
            case 4:
                
                break;
            case 5: 
                
                break;
            case 6:
                
                break;
            default:
                
        }
       
        /*
        
        ## Zadanie 2
        Na podstawie zadania utwórz klasę `Student`, która posiada następujące pola: `imię`, `nazwisko`, `nr_indeks`u, `nazwa specjalności`, `rok_studiow`. Dla pól dobierz odpowiedni typ danych. Utwórz cztery przeciążenia konstruktorów dla tej klasy (każda wersja konstruktora powinna przyjmować przynajmniej jeden parametr -  nie tworzyć konstruktora pustego). Utwórz metodę wyświetlającą dane o studencie. Utwórz cztery obiekty klasy student, każdy korzystający z innego przeciążenia konstruktora podczas tworzenia obiektu. Dla każdego obiektu uruchom metodę wyświetlającą dane.

        ## Zadanie 3
        Utwórz klasę (zawierającą metode `main`), która umożliwia wprowadzanie danych studenta z konsoli. Użyj do tego celu znanego już obiektu `Scanne`r oraz klasy `Student` z zadania 2.

        ## Zadanie 4
        W nowym pakiecie (np. `pl.edu.ur.polab4.obliczanieFigur`) utwórz klasy opisujące następujące figury geometryczne: `Koło`, `Kwadrat`, `Prostokąt`, `Sześcian`, `Prostopadłościan`, `Kula`, `Stożek`. Dla każdej klasy dobierz odpowiednie pola. Utwórz także metody obliczające pola figur, obwody (dla figur płaskich), oraz objętości (dla figur przestrzennych). Dla każdej klasy utwórz metodę wyświetlającą dane dotyczące figury tj. nazwa, parametry, wartość pola i obwodu lub objętości. Utwórz obiekty tych figur i pokaż wyniki obliczeń przy użyciu funkcji wyświetlającej dane.

        *Utwórz kalkulator dla figur geometrycznych tj. odpowiednie menu pozwalające na: wybór figury geometrycznej oraz wprowadzanie parametrów dla tej figury z konsoli. Następnie wyświetl wyniki przy użyciu metody wyświetlającej dane. 

        ## Zadanie 5
        W nowym pakiecie (np. `pl.edu.ur.polab4.wprowadzDane`) utwórz klasę zawierającą 100 elementową tablicę klasy `Student` (użyj klasy Student z zadania 2). Utwórz metodę tworzącą obiekt dla każdego elementu tablicy i ustawiającą domyślne wartości dla niego tj. dla typu liczbowego: `0`, dla typu łańcuchowego: łańcuch pusty `""`.

        Utwórz metody umożliwiające:

        *	wprowadzanie danych studenta pod wybrany index tablicy,
        *	edycję (nadpisanie danych studenta) spod wybranego indeksu,
        *	usunięcie danych studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi),
        *	wyświetlenie obiektu o danym indeksie.
        *	wyświetlenie wszystkich obiektów,
        *	wyświetlenie zakresu obiektów w podanym zakresie.   

        */
    }
    
}
