package org.example._2023_12_11;

public class Handler {
    /** 1. Вывести все адреса библиотек*/
    public static void printAllAddresses(Library[] libraries) {
        for (Library library : libraries) {
            System.out.println(library.getAddress());
        }
    }

     /** 2. Подсчитать общее количество книг во всех библиотеках*/
     public static void printTotalBookCount(Library[] libraries) {
         int bookCount = 0;
         for (Library library : libraries) {
             int count = library.getBooks().length;
             bookCount = bookCount + count;
         }
         System.out.println("ALL BOOKS NUMBER IS: " + bookCount);
     }

     /** 3. Вывести названия всех книг в библиотеке
     *      public static void printAllBookNames(Library library) {
     * 4. Найти библиотеки, где есть электронные книги
     *      public static void printLibrariesWithEBooks(Library[] libraries) {
     * 5. Вывести книги в заданном состоянии
     *      public static void printBooksByCondition(Library[] libraries, Condition condition) {
     * 6. Вывести список библиотек с количеством книг больше заданного
     *      public static void printLibrariesWithMoreThanXBooks(Library[] libraries, long count) {
     * 7. Вывести книги, изданные до заданного года
     *     public static void printBooksIssuedBeforeYear(Library[] libraries, int year) {
     * 8. Вывести авторов книг в алфавитном порядке
     *     public static void printAuthorsAlphabetically(Library[] libraries) {
     * 9. Вывести библиотеки, которые не имеют книг
     *     public static void printLibrariesWithoutBooks(Library[] libraries) {
     * 10. Вывести книги, названия которых начинаются на заданную букву
     *     public static void printBooksStartingWithLetter(Library[] libraries, char letter) {
     * 11. Вывести библиотеки по убыванию количества книг
     *     public static void printLibrariesByDescendingBookCount(Library[] libraries) {
     * 12. Вывести авторов и количество их книг в каждой библиотеке
     *     public static void printAuthorsAndTheirBookCounts(Library[] libraries) {
     * 13. Вывести наиболее часто встречающееся состояние книг
     *     public static void printMostCommonBookCondition(Library[] libraries) {
     * 14. Вывести библиотеки, где нет поврежденных книг
     *     public static void printLibrariesWithoutDamagedBooks(Library[] libraries) {
     * 15. Вывести все уникальные года издания книг
     *     public static void printUniqueIssueYears(Library[] libraries) {
     * 16. Вывести книги сортированные по году издания в каждой библиотеке
     *     public static void printBooksSortedByIssueYear(Library[] libraries) {
     * 17. Вывести количество библиотек, где есть хотя бы одна электронная книга
     *     public static void printCountOfLibrariesWithAtLeastOneEBook(Library[] libraries) {
     * 18. Вывести книги, чьё название содержит определённое слово
     *     public static void printBooksContainingWord(Library[] libraries, String word) {
     * 19. Вывести пары "Автор - Самая старая книга"
     *     public static void printAuthorsWithOldestBooks(Library[] libraries) {
     * 20. Вывести библиотеки, в которых каждая книга - электронная
     *     public static void printLibrariesWithAllEBooks(Library[] libraries) {
     */
}