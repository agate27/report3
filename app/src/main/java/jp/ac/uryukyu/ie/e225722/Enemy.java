package jp.ac.uryukyu.ie.e225722;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{

    
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }


    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }


    /**
     * 敵の名前を設定します。
     * @param name 敵の名前
     */
    public void setName (String name){
        if(name.length() <= 10){
            System.out.println(this.name + "を" + name + "に変更しました");
            this.name = name;
        }else{
            System.out.println("名前は10文字までにしてください");
        }
    }

    /**
     * 敵のHPを取得します。
     * @return 敵のHP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * 敵のHPを設定します。
     * @param hitPoint 敵のHP
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * 敵の攻撃力を取得します。
     * @return 敵の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * 敵の攻撃力を設定します。
     * @param attack 敵の攻撃力
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * 敵の攻撃力を設定します。
     * @param dead 敵の生死状態
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

}