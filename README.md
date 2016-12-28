Skype bot 2.0
===================


Hey!
This is a very simple skype bot that allow you to do multiple cool things

----------

Commands
-------------

To register a command, make a new class that extends **Command**, and implement the onCommand,
after that, make a constructor for that class with the command name.  

    public creditCommand() {
        super("credit");
    }
    
    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        Utils.sendMessage("The best man ever, Erezbiox1!");
    }

> The **Sender** is the user who did the command.
> The **Command** is the registerd command.
> The **Label** is the name of the command, the first word.
> The **Args** is the arguments of the command, not including the command itself. 

After that, you want to register the command, add the command class to the list in the commands class:

    static List<Command> commands = new ArrayList<>(
            Arrays.asList(
                    new helpCommand(),
                    new creditCommand(),
                    new stopCommand(),
                    new pingCommand(),
                    new bananaCommand(),
                    new loginCommand(),
                    new pizzaCommand
            )
    );


That's it! your command is registered.

Config
-------------

    public static final String name = "BioBot";
    public static final String chatID =         "19:d48567e4caa94de488ed0913e7313d28@thread.skype";
    public static final String commandMark = "!";
    public static final String password = "Pizza123";

> The **Name** is the name of the skype guest.       

> The **ChatID** is the ID of the chat, [You will have to get it manually using a custom bot.](https://github.com/Erezbiox1/SkypeChatID)  

> The **CommandMark** is the mark that makes a message a command.    

> The **Password** is the password that the user have to enter to perform special commands, like !stop    

Admins
-------------

The bot have an internal list of temporary admins, Those admins can perform special commands, like stopping the bot with !stop

To check if a players is an admin, **Admin.isAdmin(sender)** as follows:

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        if(Admin.isAdmin(sender))
            Utils.logout();
        else Utils.sendMessage("Insufficient permission.");
    }


The list resets every time the bot is activated, for security reasons.

To become an admin, type !login password
 
