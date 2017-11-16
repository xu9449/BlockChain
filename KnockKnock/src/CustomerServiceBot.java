

public class CustomerServiceBot {
	
    private static final int WAITING = 0;
    private static final int STARTING = 1;
 
    private int state = WAITING;

    private String[] answers = { "Hi, my name is Jiahe and I am a robot. How can I help you?",
                                 "The car costs $10,000.",
                                 "The pizza costs $10",
                                 "Sorry I don't understand."};
 
    public String processInput(String theInput) {
        String theOutput = null;
 
        if (state == WAITING) {
            theOutput = answers[0];
            state = STARTING;
        } else if (state == STARTING) {
            if (theInput.equalsIgnoreCase("How much is the car?")) {
                theOutput = answers[1];
                state = STARTING;
            } else if(state == STARTING){
                if(theInput.equalsIgnoreCase("How much is the pizza?")){
                	theOutput=answers[2];
                	state = STARTING;
                }
                else if(state == STARTING){if(theInput.equalsIgnoreCase("Bye")){
                	theOutput = "Bye.";
                    state = WAITING;}
                }
                else{
                	theOutput = answers[3];
                	state = STARTING;
                }
                }
            }
		return theOutput;
        } 
}
