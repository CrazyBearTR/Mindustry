package io.anuke.mindustry.type;

import com.badlogic.gdx.utils.Array;
import io.anuke.mindustry.game.Content;

//TODO implement this class
public class WeatherEvent implements Content{
    private static final Array<WeatherEvent> all = new Array<>();
    private static int lastid;

    public final int id;
    public final String name;

    public WeatherEvent(String name){
        this.id = lastid++;
        this.name = name;

        all.add(this);
    }

    public static Array<WeatherEvent> all(){
        return all;
    }

    public static WeatherEvent getByID(int id){
        return all.get(id);
    }

    @Override
    public String getContentTypeName(){
        return "weatherevent";
    }

    @Override
    public Array<? extends Content> getAll(){
        return all();
    }
}
