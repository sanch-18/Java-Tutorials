class Library{
    int total_books;
    String[] available_books;
    String[] issued_books;
    Library(int n){
        total_books = n;
        available_books = new String[total_books];
        issued_books = new String[total_books];
        for(int i=0;i<n;i++)
        {
            switch (i%5){
                case 0:
                    available_books[i] = "Harry Potter "+(i%5);
                    break;
                case 1:
                    available_books[i] = "Percy Jackson "+(i%5);
                    break;
                case 2:
                    available_books[i] = "Beauty and the Beast "+(i%5);
                    break;
                case 3:
                    available_books[i] = "Hardy Boys "+(i%5);
                    break;
                case 4:
                    available_books[i] = "Sex/Life Part : "+(i%5);
                    break;
                default:
                    available_books[i] = "Power of mind";
            }
        }
    }
    public void issueBook()
    {

    }
}

public class OnlineLibrary {
    public static void main(String[] args) {

    }
}
