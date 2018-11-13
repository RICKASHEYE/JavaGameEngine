package com.rickasheye.main.SpaceInvadersExample;

public class Player_Bullet extends GameEntity{

    public Player_Bullet(GameThread param){
        super(param);
    }

    @Override
    public boolean update(){
    	setYpos(getYpos()-5);
        return false;
    }
}