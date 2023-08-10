package service.impl;

import enums.ExceptionEnum;
import exception.EmptyListException;
import exception.InvalidOptionException;
import globalData.GlobalData;
import model.Library;

import static helper.LibraryServiceHelper.*;
import static util.InputUtil.inputInt;
import static util.InputUtil.inputString;
import static util.MenuUtil.*;

public class ILibraryService implements LibraryService{


    @Override
    public void register() {
        int count = inputInt("Enter the register count:");
        if (GlobalData.libraries == null){
            GlobalData.libraries = new Library[count];
            for (int i = 0; i < GlobalData.libraries.length; i++) {
                registerHelper();
            }
        }else {
            Library[] tempLibrary = GlobalData.libraries;
            GlobalData.libraries = new Library[GlobalData.libraries.length+count];
            for (int i = 0; i < tempLibrary.length; i++) {
                if (i<tempLibrary.length){
                    GlobalData.libraries[i]= tempLibrary[i];

                }else {
                    registerHelper();
                    }
                }

            }
        }
    @Override
    public void show() {
        if (GlobalData.libraries ==null ){
            throw new EmptyListException(ExceptionEnum.EMPTY_LIST_EXCEPTION);
            }
            byte option = entryShow();
            switch (option){
                case 0:
                    showHelper((byte) 0);
                    break;
                case 1:
                    showHelper((byte) 1);
                    break;
                default:
                    throw new InvalidOptionException(ExceptionEnum.INVALID_OPTION_EXCEPTION);
            }
    }

    @Override
    public void search() {
        if (GlobalData.libraries ==null ){
            throw new EmptyListException(ExceptionEnum.EMPTY_LIST_EXCEPTION);
        }
        byte option = entryShow();
        switch (option){
            case 1:
                searchHelper((byte) 0);
                break;
            case 2:
                searchHelper((byte) 1);
                break;
            default:
                throw new InvalidOptionException(ExceptionEnum.INVALID_OPTION_EXCEPTION);
        }
    }


    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public void storageToStock() {

    }
}
