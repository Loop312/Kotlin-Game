package characters

/*
Strengths: None
Weaknesses: None
Unique Skill: Exp Multiplier
*/
class Human : Character() {

    var expMultiplier = 1.0
    
    override fun gainExp(num: Int){
        exp += (num*expMultiplier)
    }

    //every level up their multiplier gets stronger
    override fun lvlup(){
        exp = exp - explimit
        explimit *= 2
        skillPoints += 5
        expMultiplier += .05
    }
}
