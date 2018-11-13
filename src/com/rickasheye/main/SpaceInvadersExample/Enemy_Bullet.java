package com.rickasheye.main.SpaceInvadersExample;

public class Enemy_Bullet extends GameEntity{

    public Enemy_Bullet(GameThread param){
        super(param);
    }

    @Override
    public boolean update(){
    	setYpos(getYpos()+5);
    	return false;
    }
}