package jp.ac.uryukyu.ie.e225722;

/**
 * ヒーロークラス。
 *  String name; //勇者の名前
 *  int hitPoint; //勇者のHP
 *  int attack; //勇者の攻撃力
 *  boolean dead; //勇者の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    
    /**
     * 勇者の名前を設定します。
     * @param name 勇者の名前
     */
    public void setName(String name) {
        if(name.length() <= 10){
            System.out.println(this.name + "を" + name + "に変更しました");
            this.name = name;
        }else{
            System.out.println("名前は10文字までにしてください");
        }
    }

    /**
     * 勇者のHPを取得します。
     * @return 勇者のHP
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * 勇者のHPを設定します。
     * @param hitPoint 勇者のHP
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * 勇者の攻撃力を取得します。
     * @return 勇者の攻撃力
     */
    public int getAttack() {
        return attack;
    }

    /**
     * 勇者の攻撃力を設定します。
     * @param attack 勇者の攻撃力
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    
    /**
     * 勇者の生死状態を設定します。
     * @param dead 勇者の生死状態
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }
}