public class Letter {

    private String fromWho;
    private String toWho;

    public Letter(){
        return
    }

    public void writeLetter() {
        greeting();
        specialMessage();
        closing();
    }
        public void greeting ()
        {
            System.out.println("Hello, friend!");
        }

        public void specialMessage ()
        {
            System.out.println("Java is pretty cool, wouldn’t you say?");
        }

        public void closing ()
        {
            System.out.println("See you later!");
        }

    }
