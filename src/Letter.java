public class Letter {

    private String fromWho;
    private String toWho;

public Letter(String from){fromWho = from; }

    public void writeLetter(String to) {
        toWho = to;
        greeting();
        specialMessage();
        closing();
    }
        public void greeting ()
        {
            System.out.println("Hello, " + toWho);
        }

        public void specialMessage ()
        {
            System.out.println("Java is pretty cool, wouldn’t you say?");
        }

        public void closing ()
        {
            System.out.println("From, "+ fromWho);
        }

    }
