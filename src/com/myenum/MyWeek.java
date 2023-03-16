class MyWeek{
    public static MyWeek mon=new MyWeek("monday");
    public static MyWeek tue=new MyWeek("tuesday");
    public static MyWeek wed=new MyWeek("wednesday");
    private String name;
    private MyWeek() {
    }
    private MyWeek(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }
}