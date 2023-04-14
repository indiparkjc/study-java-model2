package factory;

import action.Action;
import action.user.ListAction;

public class CommandFactory {
    private CommandFactory() {
    }

    public static CommandFactory getInstance() {
        return new CommandFactory();
    }

//    public Action getAction(String command)
//            throws IllegalCommandException{
//        Action action = null;
//
//        if ( command.equals("list") ) {
//            action = new ListAction();
//        } else if ( command.equals("view") ) {
//            action = new ViewAction();
//        } else if ( command.equals("insert") ) {
//            action = new InsertAction();
//        } else if ( command.equals("update") ) {
//            action = new UpdateAction();
//        } else if ( command.equals("delete") ) {
//            action = new DeleteAction();
//        } else {
//            throw new IllegalCommandException(
//                    "잘못된 실행명령입니다. 다른 명령을 내려 주십시요");
//        }
//
//        return action;
//    }
}
