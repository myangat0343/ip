package Exceptions;

import Exceptions.DukeException;

public class InvalidCommentException extends DukeException {

    @Override
    public String toString(){
        return " ☹ OOPS!!! I'm sorry, but I don't know what that means :-(";
    }
}
