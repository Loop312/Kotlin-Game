package characters

/*
Strengths: Strength, hp, defense
Weaknesses: Stealth, speed, resistance
Unique Skill: Regeneration
*/
class DragonKin : Character() {
    //Strengths
    override var str = 15
    override var maxHp = 15
    override var def = 15
    //weaknesses
    override var stealth = 5
    override var spd = 5
    override var res = 5
}