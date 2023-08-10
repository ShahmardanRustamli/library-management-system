package helper;

import enums.ExceptionEnum;
import exception.InvalidOptionException;
import globalData.GlobalData;
import model.Library;

import static util.InputUtil.*;
import static util.MenuUtil.entryDetails;
import static util.MenuUtil.entrySearch;

public class LibraryServiceHelper {


    public static long id;
    public static int countIndex;

    public static Library fillBook() {
        try {
            String name = inputString("Enter the name");
            String author = inputString("Enter the author");
            String genre = inputString("Enter the genre");
            int pageCount = inputInt("Enter the pageCount");
            String language = inputString("Enter the language");
            double price = inputDouble("Enter the price");
            int count = inputInt("Enter the count");
            byte stockStatus = inputByte("Enter the stockStatus");
            return new Library(++id, name, author, genre, pageCount, language, price, count, stockStatus);

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public static void registerHelper() {
        Library book = fillBook();
        if (book != null) {
            GlobalData.libraries[countIndex] = book;
            countIndex++;
        }
    }

    public static void showHelper(byte option) {
        for (int i = 0; i < GlobalData.libraries.length; i++) {
            if (GlobalData.libraries[i].getStockStatus() == option) {
                GlobalData.libraries[i].getInfo();
            }
        }
        String name = entryDetails();
        for (int i = 0; i < GlobalData.libraries.length; i++) {
            if (GlobalData.libraries[i].getName().equals(name) && GlobalData.libraries[i].getStockStatus() == option) {
                System.out.println(GlobalData.libraries[i].toString());
            }
        }
    }

    public static void searchHelper(byte message) {
        byte searchOption = entrySearch();
        switch (searchOption) {
            case 1:
                nameSearch(message);
                break;
            case 2:
                authorSearch(message);
                break;
            case 3:
                genreSearch(message);
            default:
                throw new InvalidOptionException(ExceptionEnum.INVALID_OPTION_EXCEPTION);
        }
    }
    public static void nameSearch(byte message){
        String name = inputString("Enter the search by name:");
        for (int i = 0; i < GlobalData.libraries.length; i++) {
            if (GlobalData.libraries[i].getName().equals(name) && GlobalData.libraries[i].getStockStatus() == message) ;
            System.out.println(GlobalData.libraries[i].toString());
        }
    }
    public static void authorSearch(byte message){
        String author = inputString("Enter the search by author:");
        for (int i = 0; i < GlobalData.libraries.length; i++) {
            if (GlobalData.libraries[i].getName().equals(author) && GlobalData.libraries[i].getStockStatus() == message) ;
            System.out.println(GlobalData.libraries[i].toString());
        }
    }
    public static void genreSearch(byte message){
        String genre = inputString("Enter the search by genre:");
        for (int i = 0; i < GlobalData.libraries.length; i++) {
            if (GlobalData.libraries[i].getName().equals(genre) && GlobalData.libraries[i].getStockStatus() == message) ;
            System.out.println(GlobalData.libraries[i].toString());
        }
    }
}
