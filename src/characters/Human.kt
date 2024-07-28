package characters

/*
Strengths: None
Weaknesses: None
Unique Skill: Exp Multiplier
*/
class Human : Character() {

    var expMultiplier = 1.0
    
    override fun gainExp(num: Double) {
        exp += (num*expMultiplier)
    }

    //every level up their multiplier gets stronger
    override fun lvlup(){
        level += 1
        exp = exp - explimit
        explimit *= 2
        skillPoints += 5
        expMultiplier += .05
    }
}
