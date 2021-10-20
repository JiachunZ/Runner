import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Heros {
    private double x;
    private double y;
    private Image spritSheet;
    private ImageView sprit;
    private static final Image HEROS= new Image("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heros.png",600,636,true,true);


    public Heros (double x, double y){
        this.x=x;
        this.y=y;
        this.sprit = new ImageView (HEROS);


    }

}

/* GMP pour photo*/
