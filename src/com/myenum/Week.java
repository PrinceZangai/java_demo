enum Week{
    MON("monday"){
        public void show(){

        }
    },
    TUE("tuesday"){
        public void show(){

        }
    },
    WED("wednesday"){
        public void show(){

        }
    };
    private String name;
    private Week(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void show();
}
