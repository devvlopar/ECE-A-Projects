class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        isBorrowed = false;
        System.out.println("Returned: " + title);
    }

    public boolean isAvailable() {
        return !isBorrowed;
    }
}

