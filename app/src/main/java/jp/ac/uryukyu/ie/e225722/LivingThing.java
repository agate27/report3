package jp.ac.uryukyu.ie.e225722;
/**
 * 生命クラス。
 *  String name; //生命体の名前
 *  int hitPoint; //生命体のHP
 *  int attack; //生命体の攻撃力
 *  boolean dead; //生命体の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 生命体の名前
     * @param maximumHP 生命体のHP
     * @param attack 生命体の攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 生命体の生死状態を取得します。
     * @return 生命体の生死状態
     */
    public boolean isDead(){
        return this.dead;
    }

    /**
     * 生命体の名前を取得します。
     * @return 生命体の名前
     */
    public String getName(){
        return name;
    }

    /**
     * 対象に攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */ 
    public void attack(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    /**
     * 名前を設定します。
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
     * HPを取得します。
     * @return 敵のHP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * HPを設定します。
     * @param hitPoint 敵のHP
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * 攻撃力を取得します。
     * @return 敵の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * 攻撃力を設定します。
     * @param attack 敵の攻撃力
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * 攻撃力を設定します。
     * @param dead 敵の生死状態
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

    
}
