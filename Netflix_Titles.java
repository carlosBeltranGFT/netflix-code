Class Netflix_titles{
    private String type;
    private String title;
    private String date_added;
    private String release_year;
    private String rating;
    private String duration;
    private int num_ratings;
    private double user_rating;

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getDate_added(){
        return date_added;
    }

    public void setDate_added(String date_added){
        this.date_added=date_added;
    }

    public String getRelease_year(){
        return release_year;
    }

    public void setRelease_year(String release_year){
        this.release_year=release_year;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating=rating;
    }

    public String getDuration(){
        return duration;
    }

    public void setDuration(String duration){
        this.duration=duration;
    }

    public int getNum_ratings(){
        return num_ratings;
    }

    public void setNum_ratings(int num_ratings){
        this.num_ratings=num_ratings;
    }

    public double getUser_rating(){
        return user_rating;
    }

    public void setUser_rating(double user_rating){
        this.user_rating=user_rating;
    }
}