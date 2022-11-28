package jp.ac.uryukyu.ie.e225722;
/**
 * 　　　ウォリアークラス。
 *  String name; //ウォリアーの名前
 *  int hitPoint; //ウォリアーのHP
 *  int attack; //ウォリアーの攻撃力
 *  boolean dead; //ウォリアーの生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Warrior extends Hero {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ウォリアーの名前
     * @param maximumHP ウォリアーのHP
     * @param attack ウォリアーの攻撃力
     */
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * 対象に攻撃するメソッド。
     *　　attackの150%を固定ダメージとして与える。
     * @param opponent 攻撃対象
     */ 
    public void attackWithWeponSkill(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
