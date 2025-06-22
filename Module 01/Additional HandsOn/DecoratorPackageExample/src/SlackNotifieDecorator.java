class SlackNotifierDecorator extends NotifierDecorator {
    SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        notifier.send(message);
        System.out.println("Slack: " + message);
    }
}