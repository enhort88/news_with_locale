package by.htp.ex.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.ex.controller.impl.DoSIgnIn;
import by.htp.ex.controller.impl.DoSignOut;
import by.htp.ex.controller.impl.DoAddNews;
import by.htp.ex.controller.impl.DoDeleteNews;
import by.htp.ex.controller.impl.DoEditNews;
import by.htp.ex.controller.impl.DoLocale;
import by.htp.ex.controller.impl.DoRegistration;
import by.htp.ex.controller.impl.GoToBasePage;
import by.htp.ex.controller.impl.GoToEditNews;
import by.htp.ex.controller.impl.GoToNewsList;
import by.htp.ex.controller.impl.GoToRegistrationPageCommand;
import by.htp.ex.controller.impl.GoToViewNews;
import by.htp.ex.controller.impl.GoToAddNews;

public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.GO_TO_BASE_PAGE, new GoToBasePage());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPageCommand());
		commands.put(CommandName.DO_SIGN_IN, new DoSIgnIn());
		commands.put(CommandName.DO_SIGN_OUT, new DoSignOut());
		commands.put(CommandName.GO_TO_NEWS_LIST, new GoToNewsList());
		commands.put(CommandName.GO_TO_VIEW_NEWS, new GoToViewNews());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
		commands.put(CommandName.GO_TO_ADD_NEWS, new GoToAddNews());
		commands.put(CommandName.GO_TO_EDIT_NEWS, new GoToEditNews());
		commands.put(CommandName.DO_ADD_NEWS,new DoAddNews());
		commands.put(CommandName.DO_EDIT_NEWS, new DoEditNews());
		commands.put(CommandName.DO_DELETE_NEWS, new DoDeleteNews());
		commands.put(CommandName.DO_LOCALE, new DoLocale());
	}
	
	
	public Command getCommand(String name) {
		CommandName  commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;
	}

}
