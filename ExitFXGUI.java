
primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>(){

    @Override
    public void handle(KeyEvent event) {
        if(event.getCode() == KeyCode.ESCAPE){
            primaryStage.close();
        }
    }
    
});